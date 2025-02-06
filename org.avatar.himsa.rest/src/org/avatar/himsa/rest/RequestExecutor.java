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
package org.avatar.himsa.rest;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportPackage;
import org.avatar.himsa.service.example.api.PatientService;
import org.avatar.himsa.service.example.api.QueryHelperService;
import org.avatar.himsa.service.example.api.QueryWhere;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gecko.emf.repository.query.IQuery;

/**
 * 
 * @author ilenia
 * @since Feb 6, 2025
 */
public class RequestExecutor implements Callable<List<Patient>> {

	private String[] where;
	private String[] projections;
	private PatientService patientService;
	private QueryHelperService queryHelperService;

	public RequestExecutor(String[] where, String[] projections, PatientService patientService, QueryHelperService queryHelperService) {
		this.where = where;
		this.projections = projections;
		this.patientService = patientService;
		this.queryHelperService = queryHelperService;

	}

	/* 
	 * (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public List<Patient> call()  {
		List<QueryWhere> qwhere = new ArrayList<>(where.length);
		for(String w : where) {
			qwhere.add(extractQWhereFromRequest(w));
		}
		EStructuralFeature[][] projectionsFeatures = new EStructuralFeature[projections.length][];
		int i = 0, j = 0;
		for(String proj : projections) {
			String[] projSplit = proj.split("-");
			j = 0;
			for(String projName : projSplit) {
				projectionsFeatures[i] = new EStructuralFeature[projSplit.length];
				EStructuralFeature f = PatientExportPackage.Literals.PATIENT.getEStructuralFeature(projName);
				if(f != null) {
					projectionsFeatures[i][j] = f;
					j++;
				}
			}
			i++;				
		}
		try {
			IQuery query = queryHelperService.buildQuery(qwhere);
			List<Patient> patients = patientService.getPatientsByQuery(query, projectionsFeatures);
			return patients;
		} catch(ParseException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}			
	}

	private QueryWhere extractQWhereFromRequest(String where) {

		String[] wSplit = where.split(",");
		String queryType = null, featureName = null, comparatorName = null, start = null, end = null, comparatorType = null;
		boolean includeStart = false, includeEnd = false;

		for(String w : wSplit) {
			if(w.startsWith("queryType=")) {
				queryType = w.replaceFirst("queryType=", "");
			}
			if(w.startsWith("feature=")) {
				featureName = w.replaceFirst("feature=", "");
			}
			if(w.startsWith("comparatorName=")) {
				comparatorName = w.replaceFirst("comparatorName=", "");
			}
			if(w.startsWith("start=")) {
				start = w.replaceFirst("start=", "");
			}
			if(w.startsWith("end=")) {
				end = w.replaceFirst("end=", "");
			}
			if(w.startsWith("comparatorType=")) {
				comparatorType = w.replaceFirst("comparatorType=", "");
			}
			if(w.startsWith("includeStart=")) {
				includeStart = Boolean.valueOf(w.replaceFirst("includeStart=", ""));
			}
			if(w.startsWith("includeEnd=")) {
				includeEnd = Boolean.valueOf(w.replaceFirst("includeEnd=", ""));
			}
		}
		return new QueryWhere(queryType, featureName, comparatorName, comparatorType, start, end, includeStart, includeEnd);
	}

}
