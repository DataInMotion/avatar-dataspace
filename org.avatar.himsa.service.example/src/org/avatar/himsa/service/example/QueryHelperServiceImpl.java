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
import java.util.List;

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
	
	private final static DateFormat DATE_FORMAT = new SimpleDateFormat("dd-mm-yyyy");


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.service.example.api.QueryHelperService#buildQuery(java.util.List)
	 */
	@Override
	public IQuery buildQuery(List<QueryWhere> where) throws ParseException{
		QueryRepository repo = (QueryRepository) repoSO.getService();
		try {
			IQueryBuilder queryBuilder = repo.createQueryBuilder();
			for(QueryWhere w : where) {
				IQueryBuilder qb = getQueryBuilderByComparator(w.getComparator(), queryBuilder);
				qb = qb.column(w.getFeatureName());
				qb = setQueryValueByComparator(w.getComparator(), w.getValue(), queryBuilder);
				
				if("AND".equals(w.getType())) queryBuilder.and(qb.build());
				else if("OR".equals(w.getType())) queryBuilder.or(qb.build());
			}
			return queryBuilder.build();
		} finally {
			repoSO.ungetService(repo);
		}
	}
	
	private IQueryBuilder getQueryBuilderByComparator(String comparator, IQueryBuilder builder) {
		switch(comparator) {
		case "isBefore": case "isAfter": case "isBeforeOrEqual": case "isAfterOrEqual": 
			case "lt": case "lte": case "gt": case "gte":
				return builder.rangeQuery();
		default:
			return builder.allQuery();
		}
	}
	
	private IQueryBuilder setQueryValueByComparator(String comparator, String value, IQueryBuilder builder) throws ParseException{
		switch(comparator) {
		case "isBefore": case "lt":
			return builder.endValue(comparator.equals("lt") ? Float.valueOf(value) : DATE_FORMAT.parse(value));
		case "isBeforeOrEqual": case "lte": 
			return builder.endValue(comparator.equals("lte") ? Float.valueOf(value) : DATE_FORMAT.parse(value));
		case "isAfter": case "gt":
				return builder.startValue(comparator.equals("gt") ? Float.valueOf(value) : DATE_FORMAT.parse(value));
		case "isAfterOrEqual": case "gte":
			return builder.startValue(comparator.equals("gte") ? Float.valueOf(value) : DATE_FORMAT.parse(value));
		default:
			return builder.simpleValue(value);
		}
	}

}
