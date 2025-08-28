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
package org.avatar.hl7.dummy.data.component;

import java.security.SecureRandom;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdministrativeGenderEnum;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Condition;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.EncounterStatusEnum;
import org.hl7.fhir.FHIRFactory;
import org.hl7.fhir.Id;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.Patient;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * 
 * @author ilenia
 * @since Aug 27, 2025
 */
public class FHIRHelper {

	// Use SecureRandom for better randomness, especially in security-sensitive contexts
	private static final SecureRandom RANDOM = new SecureRandom();

	public static final Map<String, String[]> OBSERVATION_TO_CONDITION_MAP;

	static {
		Map<String, String[]> codeMap = new HashMap<>();

		// LOINC Observation Codes
		codeMap.put("85354-9", new String[]{"I10"}); // Blood pressure panel -> Hypertension
		codeMap.put("8867-4", new String[]{"I47.9", "I49.9"}); // Heart rate -> Tachycardia, Arrhythmia
		codeMap.put("8310-5", new String[]{"R50.9", "J11.1"}); // Body temperature -> Fever, Influenza
		codeMap.put("29463-7", new String[]{"E66.9", "R63.4"}); // Body weight -> Obesity, Abnormal weight loss
		codeMap.put("9279-1", new String[]{"R06.00", "J45.909"}); // Respiratory rate -> Dyspnea, Asthma

		// HPO Observation Codes
		codeMap.put("HP:0000494", new String[]{"Q75.8"}); // Orbital hypotelorism -> Malformations of skull
		codeMap.put("HP:0000545", new String[]{"H35.30"}); // Macular dystrophy -> Macular degeneration
		codeMap.put("HP:0001007", new String[]{"L70.0"}); // Acne -> Acne vulgaris
		codeMap.put("HP:0001508", new String[]{"R62.8", "Q87.1"}); // Growth abnormality -> Developmental disorder, Congenital malformation
		codeMap.put("HP:0001878", new String[]{"D64.9"}); // Anemia -> Anemia, unspecified
		codeMap.put("HP:0002119", new String[]{"G40.909"}); // Seizure -> Epilepsy

		OBSERVATION_TO_CONDITION_MAP = codeMap;
	}

	public static Patient generatePatient(String gender, Date minBirthDate, Date maxBirthDate) throws Exception {

		Patient patient = FHIRFactory.eINSTANCE.createPatient();
		
		patient.setId(generateId());
		org.hl7.fhir.Date birthDate = FHIRFactory.eINSTANCE.createDate();
		birthDate.setValue(generateRandomBirthDate(minBirthDate, maxBirthDate));
		patient.setBirthDate(birthDate);
		AdministrativeGender administrativeGender = FHIRFactory.eINSTANCE.createAdministrativeGender();
		administrativeGender.setValue(gender != null ? AdministrativeGenderEnum.valueOf(gender) : (AdministrativeGenderEnum) selectRandomElement(AdministrativeGenderEnum.values()));
		patient.setGender(administrativeGender);
		org.hl7.fhir.Boolean bool = FHIRFactory.eINSTANCE.createBoolean();
		bool.setValue(true);
		patient.setActive(bool);		
		return patient;

	}

	public static Observation generateObservation(String patientId, String encounterId, String code) {

		Observation observation = FHIRFactory.eINSTANCE.createObservation();
		observation.setId(generateId());
		

		observation.setSubject(createReference("Patient/"+patientId));
		observation.setEncounter(createReference("Encounter/"+encounterId));		

		if(code == null) code = "85354-9"; 
		switch(code) {
		case "85354-9": //systolic and distolic blood pressure 
			observation.setCode(generateCodeableConcept("http://loinc.org", "", code, "systolic and distolic blood pressure"));
			ObservationComponent component1 = FHIRFactory.eINSTANCE.createObservationComponent();
			component1.setCode(generateCodeableConcept("http://loinc.org", "", "8480-6", "systolic blood pressure"));
			Quantity q1 = FHIRFactory.eINSTANCE.createQuantity();
			q1.setUnit(createString("mmHg"));
			q1.setSystem(generateUri("http://unitsofmeasure.org"));
			Decimal v1 = FHIRFactory.eINSTANCE.createDecimal();
			v1.setValue(generateRandomNumber(30, 200));
			q1.setValue(v1);
			component1.setValueQuantity(q1);

			ObservationComponent component2 = FHIRFactory.eINSTANCE.createObservationComponent();
			component2.setCode(generateCodeableConcept("http://loinc.org", "", "8462-4", "distolic blood pressure"));
			Quantity q2 = FHIRFactory.eINSTANCE.createQuantity();
			q2.setUnit(createString("mmHg"));
			q2.setSystem(generateUri("http://unitsofmeasure.org"));
			Decimal v2 = FHIRFactory.eINSTANCE.createDecimal();
			v2.setValue(generateRandomNumber(30, 200));
			q2.setValue(v2);
			component2.setValueQuantity(q2);

			observation.getComponent().add(component1);
			observation.getComponent().add(component2);
			break;
		case "8867-4": //heart rate
			observation.setCode(generateCodeableConcept("http://loinc.org", "", code, "heart rate"));
			Quantity q = FHIRFactory.eINSTANCE.createQuantity();
			q.setUnit(createString("/min"));
			q.setSystem(generateUri("http://unitsofmeasure.org"));
			Decimal v = FHIRFactory.eINSTANCE.createDecimal();
			v.setValue(generateRandomNumber(30, 200));
			q.setValue(v);
			observation.setValueQuantity(q);
			break;
		case "8310-5": //body temperature
			observation.setCode(generateCodeableConcept("http://loinc.org", "", code, "body temperature"));
			q = FHIRFactory.eINSTANCE.createQuantity();
			q.setUnit(createString("°C"));
			q.setSystem(generateUri("http://unitsofmeasure.org"));
			v = FHIRFactory.eINSTANCE.createDecimal();
			v.setValue(generateRandomNumber(36, 41));
			q.setValue(v);
			observation.setValueQuantity(q);
			break;
		case "29463-7": //body weight
			observation.setCode(generateCodeableConcept("http://loinc.org", "", code, "body weight"));
			q = FHIRFactory.eINSTANCE.createQuantity();
			q.setUnit(createString("Kg"));
			q.setSystem(generateUri("http://unitsofmeasure.org"));
			v = FHIRFactory.eINSTANCE.createDecimal();
			v.setValue(generateRandomNumber(20, 350));
			q.setValue(v);
			observation.setValueQuantity(q);
			break;
		case "9279-1": //respiratory rate
			observation.setCode(generateCodeableConcept("http://loinc.org", "", code, "respiratory rate"));
			q = FHIRFactory.eINSTANCE.createQuantity();
			q.setUnit(createString("/min"));
			q.setSystem(generateUri("http://unitsofmeasure.org"));
			v = FHIRFactory.eINSTANCE.createDecimal();
			v.setValue(generateRandomNumber(5, 70));
			q.setValue(v);
			observation.setValueQuantity(q);
			break;
		case "HP:0000494": //Orbital hypotelorism
			observation.setCode(generateCodeableConcept("http://github.com/phenopackets/core-ig/CodeSystem/hpo", "", code, "Orbital hypotelorism"));
			double r = generateRandomNumber(0, 1);
			observation.setValueCodeableConcept(generateCodeableConcept("http://loinc.org", "", r < 0.5 ? "LA9633-4" : "LA4648-4", r < 0.5 ? "Present" : "Absent"));
			break;
		case "HP:0000545": //Macular dystrophy
			observation.setCode(generateCodeableConcept("http://github.com/phenopackets/core-ig/CodeSystem/hpog", "", code, "Macular dystrophy"));
			r = generateRandomNumber(0, 1);
			observation.setValueCodeableConcept(generateCodeableConcept("http://loinc.org", "", r < 0.5 ? "LA9633-4" : "LA4648-4", r < 0.5 ? "Present" : "Absent"));
			break;
		case "HP:0001007": //Acne
			observation.setCode(generateCodeableConcept("http://github.com/phenopackets/core-ig/CodeSystem/hpo", "", code, "Acne"));
			r = generateRandomNumber(0, 1);
			observation.setValueCodeableConcept(generateCodeableConcept("http://loinc.org", "", r < 0.5 ? "LA9633-4" : "LA4648-4", r < 0.5 ? "Present" : "Absent"));
			break;
		case "HP:0001508": //Growth abnormality
			observation.setCode(generateCodeableConcept("http://github.com/phenopackets/core-ig/CodeSystem/hpo", "", code, "Growth abnormality"));
			r = generateRandomNumber(0, 1);
			observation.setValueCodeableConcept(generateCodeableConcept("http://loinc.org", "", r < 0.5 ? "LA9633-4" : "LA4648-4", r < 0.5 ? "Present" : "Absent"));
			break;
		case "HP:0001878": //Anemia
			observation.setCode(generateCodeableConcept("http://github.com/phenopackets/core-ig/CodeSystem/hpo", "", code, "Anemia"));
			r = generateRandomNumber(0, 1);
			observation.setValueCodeableConcept(generateCodeableConcept("http://loinc.org", "", r < 0.5 ? "LA9633-4" : "LA4648-4", r < 0.5 ? "Present" : "Absent"));
			break;
		case "HP:0002119": //Seizure
			observation.setCode(generateCodeableConcept("http://github.com/phenopackets/core-ig/CodeSystem/hpo", "", code, "Seizure"));
			r = generateRandomNumber(0, 1);
			observation.setValueCodeableConcept(generateCodeableConcept("http://loinc.org", "", r < 0.5 ? "LA9633-4" : "LA4648-4", r < 0.5 ? "Present" : "Absent"));
			break;
		default:
			throw new UnsupportedOperationException(String.format("Observation code %s not implemented yet", code));
		}

		return observation;
	}
	
	public static Encounter generateEncounter(String patientId, String conditionId) {
		Encounter encounter = FHIRFactory.eINSTANCE.createEncounter();
		encounter.setId(generateId());
		EncounterStatus status = FHIRFactory.eINSTANCE.createEncounterStatus();
		status.setValue((EncounterStatusEnum) selectRandomElement(EncounterStatusEnum.values()));

		encounter.setSubject(createReference("Patient/"+patientId));
		encounter.getDiagnosis().add(generateDiagnosis(patientId, conditionId));

		return encounter;
	}


	public static EncounterDiagnosis generateDiagnosis(String patientId, String conditionId) {
		EncounterDiagnosis diagnosis = FHIRFactory.eINSTANCE.createEncounterDiagnosis();
		diagnosis.setId(UUID.randomUUID().toString());
		diagnosis.getCondition().add(generateCodeableReference(conditionId));		
		return diagnosis;
	}
	
	public static Condition generateCondition(String patientId, String observationCode) {

		Condition condition = FHIRFactory.eINSTANCE.createCondition();
		condition.setId(generateId());

		condition.setSubject(createReference("Patient/"+patientId));
		condition.setCode(generateCodeableConcept("http://fhir.de/CodeSystem/dimdi/icd-10-gm", "2019", observationCode == null ? "I10" : (String) selectRandomElement(OBSERVATION_TO_CONDITION_MAP.get(observationCode))));

		Meta meta = FHIRFactory.eINSTANCE.createMeta();
		Canonical profile = FHIRFactory.eINSTANCE.createCanonical();
		profile.setValue("http://fhir.de/StructureDefinition/condition-de-icd10");
		meta.getProfile().add(profile);
		condition.setMeta(meta);

		return condition;
	}

	public static <T extends Object> Object selectRandomElement(T[] elements)  {
		Random rndm = new Random();
		int rndmIndx = rndm.nextInt(elements.length);
		Object rndmElem = elements[rndmIndx];
		return rndmElem;
	}

	private static org.hl7.fhir.String createString(String text) {
		org.hl7.fhir.String str = FHIRFactory.eINSTANCE.createString();
		str.setValue(text);
		return str;
	}

	private static Id generateId() {
		Id id = FHIRFactory.eINSTANCE.createId();
		id.setValue(UUID.randomUUID().toString());
		return id;
	}

	private static Reference createReference(String refValue) {
		Reference ref = FHIRFactory.eINSTANCE.createReference();
		org.hl7.fhir.String str = FHIRFactory.eINSTANCE.createString();
		str.setValue(refValue);
		ref.setReference(str);
		return ref;
	}

	private static Uri generateUri(String uriValue) {
		Uri  uri = FHIRFactory.eINSTANCE.createUri();
		uri.setValue(uriValue);
		return uri;
	}

	private static CodeableConcept generateCodeableConcept(String system, String version, String codeValue, String display) {
		CodeableConcept code = FHIRFactory.eINSTANCE.createCodeableConcept();
		Coding coding = FHIRFactory.eINSTANCE.createCoding();

		coding.setSystem(generateUri(system));		
		coding.setVersion(createString(version));
		coding.setDisplay(createString(display));
		Code c = FHIRFactory.eINSTANCE.createCode();
		c.setValue(codeValue);
		coding.setCode(c);

		code.getCoding().add(coding);
		return code;
	}

	private static double generateRandomNumber(int rangeMin, int rangeMax) {
		Random r = new Random();
		return rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	}



	

	private static CodeableReference generateCodeableReference(String conditionId) {
		CodeableReference codRef = FHIRFactory.eINSTANCE.createCodeableReference();
		codRef.setReference(createReference("Condition/"+conditionId));
		return codRef;
	}

	

	private static CodeableConcept generateCodeableConcept(String system, String version, String codeValue) {
		CodeableConcept code = FHIRFactory.eINSTANCE.createCodeableConcept();
		Coding coding = FHIRFactory.eINSTANCE.createCoding();
		Uri  uri = FHIRFactory.eINSTANCE.createUri();
		uri.setValue(system);		
		coding.setSystem(uri);

		org.hl7.fhir.String str = FHIRFactory.eINSTANCE.createString();
		str.setValue(version);
		coding.setVersion(str);
		Code c = FHIRFactory.eINSTANCE.createCode();
		c.setValue(codeValue);
		coding.setCode(c);

		code.getCoding().add(coding);
		return code;
	}







	/**
	 * Generates a random XMLGregorianCalendar object between two given dates.
	 * The generated date will be inclusive of the start and end dates.
	 *
	 * @param startDate The start date of the range (inclusive).
	 * @param endDate   The end date of the range (inclusive).
	 * @return A randomly generated XMLGregorianCalendar within the specified range.
	 * @throws DatatypeConfigurationException if a DatatypeFactory instance cannot be created.
	 */
	private static XMLGregorianCalendar generateRandomBirthDate(java.util.Date startDate, java.util.Date endDate) throws DatatypeConfigurationException {
		if (startDate == null && endDate == null) {
			startDate = new Date(0); // Epoch, January 1, 1970
			endDate = new Date(); // Current date and time
		} else if (startDate == null) {
			startDate = new Date(0); // Epoch, January 1, 1970
		} else if (endDate == null) {
			endDate = new Date(); // Current date and time
		}

		// Ensure the start date is not after the end date.
		if (startDate.after(endDate)) {
			throw new IllegalArgumentException("Start date cannot be after end date.");
		}

		// Get the time in milliseconds for both dates.
		long startMillis = startDate.getTime();
		long endMillis = endDate.getTime();

		// Calculate the range of time in milliseconds.
		long rangeMillis = endMillis - startMillis;

		// Generate a random number of milliseconds within the calculated range.
		long randomMillis = (long) (RANDOM.nextDouble() * rangeMillis);

		// Add the random milliseconds to the start date's timestamp to get a new random timestamp.
		long newDateMillis = startMillis + randomMillis;

		// Create a new Date object from the random timestamp.
		Date randomDate = new Date(newDateMillis);

		// Convert the java.util.Date to a java.util.GregorianCalendar.
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(randomDate);

		// Convert the GregorianCalendar to an XMLGregorianCalendar using DatatypeFactory.
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
	}

	
}
