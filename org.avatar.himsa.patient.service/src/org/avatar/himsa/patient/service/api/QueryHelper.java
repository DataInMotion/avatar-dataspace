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
package org.avatar.himsa.patient.service.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EAttribute;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.IQueryBuilder;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.ComponentServiceObjects;

import de.avatar.query.And;
import de.avatar.query.Comparator;
import de.avatar.query.DateComparator;
import de.avatar.query.Gt;
import de.avatar.query.Gte;
import de.avatar.query.IsAfter;
import de.avatar.query.IsAfterOrEqual;
import de.avatar.query.IsBefore;
import de.avatar.query.IsBeforeOrEqual;
import de.avatar.query.IsInRange;
import de.avatar.query.Lt;
import de.avatar.query.Lte;
import de.avatar.query.NumberComparator;
import de.avatar.query.Operation;
import de.avatar.query.Or;
import de.avatar.query.QWhere;
import de.avatar.query.Query;
import de.avatar.query.SimpleValueComparator;
import de.avatar.query.SuitableType;

/**
 * 
 * @author ilenia
 * @since Jan 22, 2025
 */
public class QueryHelper {
	
	private static final Logger LOGGER = Logger.getLogger(QueryHelper.class.getName());
	private final static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	
	public static IQuery buildQuery(Query query, ComponentServiceObjects<EMFRepository> repoSO) throws ParseException{
		QueryRepository repo = (QueryRepository) repoSO.getService();
		try {
			IQueryBuilder queryBuilder = repo.createQueryBuilder();
			List<IQuery> andQueries = new LinkedList<>();
			List<IQuery> orQueries = new LinkedList<>();
			for(QWhere w : query.getWhere()) {
				IQueryBuilder qb = getQueryBuilderByComparatorName(w.getComparator().eClass().getName(), repo);
				qb = qb.column((EAttribute)w.getFeaturePath().getFeature().get(w.getFeaturePath().getFeature().size()-1));
				qb = setQueryValueByComparator(w.getComparator(), qb);
				if(w instanceof And) andQueries.add(qb.build());
				else if(w instanceof Or) orQueries.add(qb.build());
				else {
					LOGGER.severe(String.format("Query Type %s currently not supported. Supported types are And and Or.", w.eClass().getName()));
					throw new IllegalArgumentException(String.format("Query Type %s currently not supported. Supported types are And and Or.", w.eClass().getName()));
				}
			}
			if(!andQueries.isEmpty()) queryBuilder = queryBuilder.and(andQueries.toArray(s -> new IQuery[] {}));
			if(!orQueries.isEmpty()) queryBuilder = queryBuilder.or(orQueries.toArray(s -> new IQuery[] {}));
			return queryBuilder.build();
		} 
		finally {
			repoSO.ungetService(repo);
		}
	}

	
	private static IQueryBuilder getQueryBuilderByComparatorName(String comparatorName, QueryRepository repo) {
		switch(comparatorName) {
		case "IsBefore": case "IsAfter": case "IsBeforeOrEqual": case "IsAfterOrEqual": 
			case "Lt": case "Lte": case "Gt": case "Gte": case "IsInRange":
				return repo.createQueryBuilder().rangeQuery();
		default:
			return repo.createQueryBuilder().allQuery();
		}
	}
	

	private static IQueryBuilder setQueryValueByComparator(Comparator comparator, IQueryBuilder builder) throws ParseException{
		if(comparator instanceof IsInRange rangeComp) {
			if(SuitableType.NUMERIC.equals(comparator.getSuitableForType())) {
				builder.startValue(Float.valueOf(rangeComp.getStartValue()), rangeComp.isStartIncluded());
				builder.endValue(Float.valueOf(rangeComp.getEndValue()), rangeComp.isEndIncluded());
			} else if(SuitableType.DATE.equals(comparator.getSuitableForType())) {
				builder.startValue(DATE_FORMAT.parse(rangeComp.getStartValue()), rangeComp.isStartIncluded());
				builder.endValue(DATE_FORMAT.parse(rangeComp.getEndValue()), rangeComp.isEndIncluded());
			} else {
				LOGGER.severe(String.format("Incompatible comparator class %s and suitable type %s. Cannot continue!", comparator.eClass().getName(), comparator.getSuitableForType()));
				throw new IllegalArgumentException(String.format("Incompatible comparator class %s and suitable type %s. Cannot continue!", comparator.eClass().getName(), comparator.getSuitableForType()));
			}
		} else if(comparator instanceof DateComparator dateComp) {
			if(dateComp instanceof IsBefore isBef) {
				builder.endValue(DATE_FORMAT.parse(isBef.getValue()), false);
			} else if(dateComp instanceof IsBeforeOrEqual isBefOrEq) {
				builder.endValue(DATE_FORMAT.parse(isBefOrEq.getValue()), true);
			} else if(dateComp instanceof IsAfter isAft) {
				builder.startValue(DATE_FORMAT.parse(isAft.getValue()), false);
			} else if(dateComp instanceof IsAfterOrEqual isAftOrEq) {
				builder.startValue(DATE_FORMAT.parse(isAftOrEq.getValue()), true);
			}
		} else if(comparator instanceof NumberComparator numComp) {
			if(numComp instanceof Lt lt) {
				builder.endValue(Float.valueOf(lt.getValue()), false);
			} else if (numComp instanceof Lte lte) {
				builder.endValue(Float.valueOf(lte.getValue()), true);
			} else if(numComp instanceof Gt gt) {
				builder.startValue(Float.valueOf(gt.getValue()), false);
			} else if(numComp instanceof Gte gte) {
				builder.startValue(Float.valueOf(gte.getValue()), true);
			}
		}
		else if(comparator instanceof SimpleValueComparator simpleComp) {
			builder.simpleValue(doApplyPreQueryOperation(simpleComp.getWhere().getOperation(), simpleComp.getValue()));
		}
		return builder;
	}
	
	private static String doApplyPreQueryOperation(Operation operation, String value) {
		if(operation == null) return value;
		switch(operation.eClass().getName()) {
		case "ToLowerCase":
			return value.toLowerCase();
		case "ToUpperCase":
			return value.toUpperCase();
		default:
			LOGGER.warning(String.format("Pre Query Operation %s currently not supported. Ignoring it.", operation.eClass().getName()));
			return value;
		}
	}
}
