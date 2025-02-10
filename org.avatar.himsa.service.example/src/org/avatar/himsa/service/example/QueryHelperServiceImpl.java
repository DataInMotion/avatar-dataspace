/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.avatar.himsa.service.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.avatar.himsa.service.example.api.QueryHelperService;
import org.avatar.himsa.service.example.api.QueryWhere;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.IQueryBuilder;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * 
 * @author ilenia
 * @since Jan 22, 2025
 */
@Component(name = "QueryHelperService")
public class QueryHelperServiceImpl implements QueryHelperService {
	
	@Reference(target="(repo_id=test1.test)")
	ComponentServiceObjects<EMFRepository> repoSO;
	
	private static final Logger LOGGER = Logger.getLogger(QueryHelperServiceImpl.class.getName());
	private final static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.service.example.api.QueryHelperService#buildQuery(java.util.List)
	 */
	@Override
	public IQuery buildQuery(List<QueryWhere> where) throws ParseException{
		QueryRepository repo = (QueryRepository) repoSO.getService();
		try {
			IQueryBuilder queryBuilder = repo.createQueryBuilder();
			List<IQuery> andQueries = new LinkedList<>();
			List<IQuery> orQueries = new LinkedList<>();
			for(QueryWhere w : where) {
				IQueryBuilder qb = getQueryBuilderByComparatorName(w.comparatorName(), repo);
				qb = qb.column(w.featureName());
				qb = setQueryValueByComparatorType(w.comparatorType(), w.operation(), w.startValue(), w.endValue(), w.includeStartValue(), w.includeEndValue(), qb);
				
				if("AND".equals(w.queryType())) andQueries.add(qb.build());
				else if("OR".equals(w.queryType())) orQueries.add(qb.build());
				else LOGGER.warning(String.format("Query Type %s currently not supported. Adding an AND query.", w.queryType()));
//				TODO: what if we have NOT as query Type????
				
			}
			
			if(!andQueries.isEmpty()) queryBuilder = queryBuilder.and(andQueries.toArray(s -> new IQuery[] {}));
			if(!orQueries.isEmpty()) queryBuilder = queryBuilder.or(orQueries.toArray(s -> new IQuery[] {}));
			return queryBuilder.build();
		} finally {
			repoSO.ungetService(repo);
		}
	}
	
	
	private IQueryBuilder getQueryBuilderByComparatorName(String comparatorName, QueryRepository repo) {
		switch(comparatorName) {
		case "IsBefore": case "IsAfter": case "IsBeforeOrEqual": case "IsAfterOrEqual": 
			case "Lt": case "Lte": case "Gt": case "Gte": case "IsInRange":
				return repo.createQueryBuilder().rangeQuery();
		default:
			return repo.createQueryBuilder().allQuery();
		}
	}
	
	
	
	private IQueryBuilder setQueryValueByComparatorType(String comparatorType, String operation,
			String start, String end, boolean includeStart, boolean includeEnd, 
			IQueryBuilder builder) throws ParseException{
		switch(comparatorType) {
		case "NUMERIC": 
			if(start != null) builder.startValue(Float.valueOf(start), includeStart ? true : false);
			if(end != null) builder.endValue(Float.valueOf(end), includeEnd ? true : false);		
			break;
		case "DATE":
			if(start != null) builder.startValue(DATE_FORMAT.parse(start), includeStart ? true : false);
			if(end != null) builder.endValue(DATE_FORMAT.parse(end), includeEnd ? true : false);
			break;
		default:
			builder.simpleValue(start != null ? doApplyPreQueryOperation(operation, start) :doApplyPreQueryOperation(operation, end));
			break;
		}
		return builder;
	}
	
	private String doApplyPreQueryOperation(String operation, String value) {
		if(operation == null) return value;
		switch(operation) {
		case "ToLowerCase":
			return value.toLowerCase();
		case "ToUpperCase":
			return value.toUpperCase();
		default:
			return value;
		}
	}

	

}
