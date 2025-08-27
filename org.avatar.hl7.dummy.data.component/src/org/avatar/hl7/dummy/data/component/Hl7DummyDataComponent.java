package org.avatar.hl7.dummy.data.component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.avatar.gics.service.api.GICSService;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Factory;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType;
import org.emau.icmvc.ganimed.ttp.cm2.EntryType1;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType;
import org.emau.icmvc.ganimed.ttp.cm2.Qcdto;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;
import org.hl7.fhir.Condition;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.Observation;
import org.hl7.fhir.Patient;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import net.datafaker.Faker;

@Component(immediate = true, name = "Hl7DummyDataComponent", service = Hl7DummyDataComponent.class)
public class Hl7DummyDataComponent {
	
	@Reference
	GICSService gicsService;
	
	private Faker faker = new Faker(new Locale("de"));
	
	public List<DomainResource> generateDomainResources(int totNumber, String gender, Date minBirthDate, Date maxBirthDate, String observationCode) throws Exception {
		List<DomainResource> resources = new ArrayList<>(totNumber*4);
		for(int i = 0; i < totNumber; i++) {
			Patient patient = FHIRHelper.generatePatient(gender, minBirthDate, maxBirthDate);
			Condition condition = FHIRHelper.generateCondition(patient.getId().getValue(), observationCode);
			Encounter encounter = FHIRHelper.generateEncounter(patient.getId().getValue(), condition.getId().getValue());
			Observation observation = FHIRHelper.generateObservation(patient.getId().getValue(), encounter.getId().getValue(), observationCode);			
			
			ConsentStatus consentStatus = doCreateDummyConsent(patient);
			if(ConsentStatus.ACCEPTED.equals(consentStatus)) {
				resources.add(patient);
				resources.add(condition);
				resources.add(encounter);
				resources.add(observation);
			}
			
		}
		return resources;		
	}
	
	private ConsentStatus doCreateDummyConsent(Patient patient) {
		ConsentDTO consent = Cm2Factory.eINSTANCE.createConsentDTO();
		consent.setTemplateType(ConsentTemplateType.CONSENT);
		ConsentKeyDTO consentKey = Cm2Factory.eINSTANCE.createConsentKeyDTO();
		ConsentTemplateKeyDTO consentTemplateKey = Cm2Factory.eINSTANCE.createConsentTemplateKeyDTO();
		consentTemplateKey.setDomainName("avatar");
		consentTemplateKey.setName("test_avatar_consent");
		consentTemplateKey.setVersion("1.0");
		consentKey.setConsentTemplateKey(consentTemplateKey);
		SignerIdDTO sid = Cm2Factory.eINSTANCE.createSignerIdDTO();
		sid.setIdType("Patient ID");
		sid.setId(patient.getId().getValue());
		consentKey.getSignerIds().add(sid);
		consent.setKey(consentKey);
		ModuleStatesType mst1 = Cm2Factory.eINSTANCE.createModuleStatesType();
		EntryType1 et1 = Cm2Factory.eINSTANCE.createEntryType1();
		ModuleKeyDTO mk = Cm2Factory.eINSTANCE.createModuleKeyDTO();
		mk.setDomainName("avatar");
		mk.setName("hearing_module");
		mk.setVersion("1.0");
		et1.setKey(mk);
		ModuleStateDTO ms = Cm2Factory.eINSTANCE.createModuleStateDTO();
		ms.setConsentState((ConsentStatus) FHIRHelper.selectRandomElement(new ConsentStatus[] {ConsentStatus.ACCEPTED, ConsentStatus.DECLINED}));
		et1.setValue(ms);
		
		EntryType1 et2 = Cm2Factory.eINSTANCE.createEntryType1();
		ModuleKeyDTO mk2 = Cm2Factory.eINSTANCE.createModuleKeyDTO();
		mk2.setDomainName("avatar");
		mk2.setName("medical_history_module");
		mk2.setVersion("1.0");
		et2.setKey(mk2);
		ModuleStateDTO ms2 = Cm2Factory.eINSTANCE.createModuleStateDTO();
		ms2.setConsentState((ConsentStatus) FHIRHelper.selectRandomElement(new ConsentStatus[] {ConsentStatus.ACCEPTED, ConsentStatus.DECLINED}));
		et2.setValue(ms2);
		
		mst1.getEntry().add(et1);
		mst1.getEntry().add(et2);
		consent.setModuleStates(mst1);
				
		consent.setPatientSignatureIsFromGuardian(false);
		consent.setPatientSigningPlace(faker.address().city());
		consent.setPatientSignatureBase64(Base64.getEncoder().encodeToString(faker.name().fullName().getBytes()));
		
		consent.setPhysicianId(UUID.randomUUID().toString());
		consent.setPhysicianSigningPlace(faker.address().city());
		consent.setPhysicianSignatureBase64(Base64.getEncoder().encodeToString(faker.name().fullName().getBytes()));
		Qcdto qualityControl = Cm2Factory.eINSTANCE.createQcdto();
		try {
			GregorianCalendar c = new GregorianCalendar();
			Instant d1 = faker.timeAndDate().past(100, 7, TimeUnit.DAYS);			
			Instant d2 = faker.timeAndDate().past(100, 7, TimeUnit.DAYS);
			Instant d3 = faker.timeAndDate().past(100, 7, TimeUnit.DAYS);
			
			Instant creation = d1.isBefore(d2) ? d1 : d2;
			creation = creation.isBefore(d3) ? creation : d3;
			Instant patientSig = creation.isBefore(d3) ? d3 : creation;
			Instant physicianSig = faker.timeAndDate().between(patientSig, faker.timeAndDate().past(6, TimeUnit.DAYS));
			
			
			c.setTime(creation.equals(d1) ? new Date(d2.toEpochMilli()) : new Date(d1.toEpochMilli()));
			XMLGregorianCalendar xmlCalendar;
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			consent.setCreationDate(xmlCalendar); 
			consentKey.setConsentDate(xmlCalendar);
			
			c = new GregorianCalendar();
			c.setTime(new Date(patientSig.toEpochMilli()));
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			consent.setPatientSigningDate(xmlCalendar);
			
			c = new GregorianCalendar();
			c.setTime(new Date(physicianSig.toEpochMilli()));
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			consent.setPhysicianSigningDate(xmlCalendar);
			
			Instant d4 = faker.timeAndDate().past(7, TimeUnit.DAYS);
			c = new GregorianCalendar();
			c.setTime(new Date(d4.toEpochMilli()));
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			qualityControl.setDate(xmlCalendar);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		
		qualityControl.setInspector(faker.name().fullName());
		qualityControl.setType((String) FHIRHelper.selectRandomElement(new String[] {"checked_minor_faults", "checked_no_faults"}));
		consent.setQualityControl(qualityControl);
		gicsService.addConsent(consent);
		return ms2.getConsentState();
	}

}
