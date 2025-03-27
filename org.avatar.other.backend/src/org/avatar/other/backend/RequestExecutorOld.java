///**
// * Copyright (c) 2012 - 2025 Data In Motion and others.
// * All rights reserved. 
// * 
// * This program and the accompanying materials are made
// * available under the terms of the Eclipse Public License 2.0
// * which is available at https://www.eclipse.org/legal/epl-2.0/
// *
// * SPDX-License-Identifier: EPL-2.0
// * 
// * Contributors:
// *     Data In Motion - initial API and implementation
// */
//package org.avatar.other.backend;
//
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.Callable;
//
//import org.avatar.himsa.export.Patient;
//import org.avatar.himsa.export.PatientExportPackage;
//import org.avatar.himsa.patient.service.api.PatientService;
//import org.avatar.himsa.patient.service.api.PatientService.PatientResponse;
//import org.avatar.himsa.patient.service.api.Query;
//import org.avatar.himsa.patient.service.api.QueryHelperService;
//import org.avatar.himsa.patient.service.api.QuerySubject;
//import org.avatar.himsa.patient.service.api.QueryWhere;
//import org.eclipse.emf.ecore.EAttribute;
//import org.eclipse.emf.ecore.EStructuralFeature;
//import org.gecko.emf.mongo.Options;
//import org.gecko.emf.repository.query.IQuery;
//
///**
// * 
// * @author ilenia
// * @since Feb 6, 2025
// */
//public class RequestExecutorOld implements Callable<PatientResponse> {
//
//	private String[] where;
//	private String[] subjects;
//	private PatientService patientService;
//	private QueryHelperService queryHelperService;
//	private String[] sort;
//	private int limit;
//	private int skip;
//	
//	Map<Object, Object> loadOptions = new HashMap<>();
//	
//
//	public RequestExecutor(String[] where, String[] subjects, String[] sort, int limit, int skip, PatientService patientService, QueryHelperService queryHelperService) {
//		this.where = where;
//		this.subjects = subjects;
//		this.sort = sort;
//		this.limit = limit;
//		this.skip = skip;
//		this.patientService = patientService;
//		this.queryHelperService = queryHelperService;
//		loadOptions.put(Options.OPTION_COLLECTION_NAME, "PatientOther");
//	}
//
//	/* 
//	 * (non-Javadoc)
//	 * @see java.util.concurrent.Callable#call()
//	 */
//	@Override
//	public PatientResponse call()  {
//		List<QueryWhere> qwhere = new ArrayList<>(where.length);
//		for(String w : where) {
//			qwhere.add(extractQWhereFromRequest(w));
//		}
//		List<QuerySubject> qsubj = new ArrayList<>(subjects.length);
//		for(String s : subjects) {
//			qsubj.add(extractQSubjectFromRequest(s));
//		}
//		Query q = extractQueryParamFromRequest();
//		
////		Patient.address-Address.street
//		EStructuralFeature[][] projectionsFeatures = new EStructuralFeature[subjects.length][];
//		int i = 0, j = 0;
//		for(QuerySubject subj : qsubj) {
//			String[] projections = subj.projections();
//			j = 0;
//			for(String projName : projections) {
//				
//				projectionsFeatures[i] = new EStructuralFeature[projections.length];
//				EStructuralFeature f = PatientExportPackage.Literals.PATIENT.getEStructuralFeature(projName);
//				if(f != null) {
//					projectionsFeatures[i][j] = f;
//					j++;
//				}
//			}
//			i++;				
//		}
//		
//		try {
//			IQuery query = queryHelperService.buildQuery(qwhere);
//			
//			PatientResponse response = patientService.getPatientsByQuery(query, q.limit(), q.skip(), q.sort(), loadOptions, projectionsFeatures);
//			response.setProjections(projectionsFeatures);
//			applyPostOperations(response.getPatients(), projectionsFeatures, qsubj);
//			return response;
//		} catch(ParseException e) {
//			e.printStackTrace();
//			return null;
//		}			
//	}
//
//	
//	/**
//	 * @param sort2
//	 * @param limit2
//	 * @param skip2
//	 * @return
//	 */
//	private Query extractQueryParamFromRequest() {
//		List<Query.Sort> qSort = new ArrayList<>(sort.length);
//		for(String s : sort) {
//			String[] sSplit = s.split(",");
//			EAttribute sortFeature = null;
//			String sortOrder = null;
//			for(String split : sSplit) {
//				if(split.contains("sortFeature=")) {
//					sortFeature = (EAttribute) PatientExportPackage.Literals.PATIENT.getEStructuralFeature(split.replaceFirst("sortFeature=", ""));
//				} else if(split.contains("sortOrder=")) {
//					sortOrder = split.replaceFirst("sortOrder=", "");
//				}
//			}
//			qSort.add(new Query.Sort(sortFeature, sortOrder));
//		}
//		
//		return new Query(limit, skip, qSort);
//	}
//
//	/**
//	 * @param patients
//	 * @param projectionsFeatures
//	 * @param qsubj
//	 */
//	private void applyPostOperations(List<Patient> patients, EStructuralFeature[][] projectionsFeatures,
//			List<QuerySubject> qsubj) {
//		
//		for(Patient patient : patients) {
//			int i = 0;
//			for(QuerySubject subj : qsubj) {
//				String[] projections = subj.projections();
//				for(int j = 0; j < projections.length; j++) {
//					EStructuralFeature f = projectionsFeatures[i][j];
//					if(subj.operation() != null) {
//						patient.eSet(f, doApplyPostOperation(patient.eGet(f), subj.operation()));
//					}
//				}
//				i++;				
//			}
//		}		
//	}
//
//	/**
//	 * @param eGet
//	 * @param operation
//	 * @return
//	 */
//	private Object doApplyPostOperation(Object featureValue, String operation) {
//		switch(operation) {
//		case "ToLowerCase":
//			return ((String) featureValue).toLowerCase();
//		case "ToUpperCase":
//			return ((String) featureValue).toUpperCase();		
//		}
//		return featureValue;
//	}
//
//	/**
//	 * @param s
//	 * @return
//	 */
//	private QuerySubject extractQSubjectFromRequest(String subject) {
//		String[] sSplit = subject.split(",");
//		String[] projections = null;
//		String operation = null;
//		
//		for(String s : sSplit) {
//			if(s.startsWith("projections=")) {
//				projections = s.replaceFirst("projections=", "").split("-");
//			} 
//			if(s.startsWith("operation=")) {
//				operation = s.replaceFirst("operation=", "");
//			}
//		}
//		return new QuerySubject(projections, operation);
//	}
//
//	private QueryWhere extractQWhereFromRequest(String where) {
//
//		String[] wSplit = where.split(",");
//		String queryType = null, featureName = null, comparatorName = null, start = null, end = null, 
//				comparatorType = null, operation = null;
//		boolean includeStart = false, includeEnd = false;
//
//		for(String w : wSplit) {
//			if(w.startsWith("queryType=")) {
//				queryType = w.replaceFirst("queryType=", "");
//			}
//			if(w.startsWith("operation=")) {
//				operation = w.replaceFirst("operation=", "");
//			}
//			if(w.startsWith("feature=")) {
//				featureName = w.replaceFirst("feature=", "");
//			}
//			if(w.startsWith("comparatorName=")) {
//				comparatorName = w.replaceFirst("comparatorName=", "");
//			}
//			if(w.startsWith("start=")) {
//				start = w.replaceFirst("start=", "");
//			}
//			if(w.startsWith("end=")) {
//				end = w.replaceFirst("end=", "");
//			}
//			if(w.startsWith("comparatorType=")) {
//				comparatorType = w.replaceFirst("comparatorType=", "");
//			}
//			if(w.startsWith("includeStart=")) {
//				includeStart = Boolean.valueOf(w.replaceFirst("includeStart=", ""));
//			}
//			if(w.startsWith("includeEnd=")) {
//				includeEnd = Boolean.valueOf(w.replaceFirst("includeEnd=", ""));
//			}
//		}
//		return new QueryWhere(queryType, featureName, comparatorName, comparatorType, start, end, 
//				includeStart, includeEnd, operation);
//	}
//
//}
