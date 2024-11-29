package org.avatar.himsa.dummy.data.component;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportFactory;
import org.avatar.himsa.export.PatientExportPackage;
import org.eclipse.emf.ecore.EObject;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Factory;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.EntryType1;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.PromiseFactory;

import net.datafaker.Faker;

@Component(immediate=true, name="DummyDataComponent")
public class DummyDataComponent {

	@Reference(target="(repo_id=test1.test)")
	ComponentServiceObjects<EMFRepository> repoSO;
	
	private static final Logger LOGGER = Logger.getLogger(DummyDataComponent.class.getName());
	private static final List<String> HEALTH_INSURANCE_COMPANIES_GERMANY = List.of("AOK", "BARMER", "HKK", "hkk health insurance", "KNIGHTSHAFT",
			"DAK health", "KKH", "Techniker Krankenkasse", "TK", "HEK", "Hanseatic Health Insurance", "BKK", "IKK"); 
	
	private Faker faker = new Faker(new Locale("de"));
	private PromiseFactory factory = new PromiseFactory(Executors.newFixedThreadPool(4));
	
	@Activate
	public void activate() {		
		factory.submit(() -> {
			doCreateDummyData();
			return true;
		}).onSuccess(t -> LOGGER.info("Finished creating dummy data!"))
		.onFailure(t -> LOGGER.log(Level.SEVERE, String.format("Something went wrong when creating dummy data!"), t));		
	}

	
	private void doCreateDummyData() {
		EMFRepository repo = repoSO.getService();
		try {
			List<EObject> existingPatients = repo.getAllEObjects(PatientExportPackage.eINSTANCE.getPatient());
			boolean createPatients = existingPatients.isEmpty();

			if(createPatients) {
				repo.save(createDummyPatients(10).stream().map(mr -> (EObject) mr).toList());
			}
		} finally {
			repoSO.ungetService(repo);
		}
		
	}



	private Collection<Patient> createDummyPatients(int numberOfInstances) {
		List<Patient> patients = new ArrayList<>(numberOfInstances);
		for(int i = 0; i < numberOfInstances; i++) {
			patients.add(doCreateDummyPatient());
		}	
		return patients;
	}

	
	private Patient doCreateDummyPatient() {
		Patient patient = PatientExportFactory.eINSTANCE.createPatient();
		patient.setFirstName(faker.name().firstName());
		patient.setLastName(faker.name().lastName());
		patient.setMiddleName(faker.name().firstName());
//		patient.setGender((GenderType) selectRandomElement(GenderType.values()));
		patient.setTitle(faker.name().title());
		
		patient.setCity(faker.address().city());
		patient.setZip(faker.address().zipCode());
		patient.setProvince(faker.address().state());
		patient.setCountry("Germany");
		StringBuilder sb = new StringBuilder(patient.getCity());
		sb.append(","+patient.getZip());
		sb.append(","+patient.getProvince());
		sb.append(","+patient.getCountry());
		patient.setAddress1(sb.toString());
		
		patient.setEMail(faker.internet().emailAddress());
		patient.setHomeTelephone(faker.phoneNumber().phoneNumber());
		patient.setWorkTelephone(faker.phoneNumber().phoneNumber());
		
		patient.setInsurance1((String) selectRandomElement(HEALTH_INSURANCE_COMPANIES_GERMANY.toArray(new String[] {})));
		patient.setSSNumber(faker.idNumber().ssnValid());
		
		patient.setPhysician(faker.name().fullName());
		patient.setReferral(faker.name().fullName());
		
		patient.setPatientNo(faker.number().digits(6));
		patient.setPatientGUID(UUID.randomUUID().toString());
		patient.setUserId(UUID.randomUUID().toString());
		patient.setActivePatient((Boolean) selectRandomElement(new Boolean[] {Boolean.TRUE, Boolean.FALSE}));
		
		try {
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(faker.date().birthday());
			XMLGregorianCalendar xmlCalendar;
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			patient.setBirthDate(xmlCalendar);

			c.setTime(faker.date().past(7, TimeUnit.DAYS));
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			patient.setCreateDate(xmlCalendar);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		
		return patient;
	}
	
	private ConsentDTO doCreateDummyConsent(String patientId) {
		ConsentDTO consent = Cm2Factory.eINSTANCE.createConsentDTO();
		ConsentKeyDTO consentKey = Cm2Factory.eINSTANCE.createConsentKeyDTO();
		ConsentTemplateKeyDTO consentTemplateKey = Cm2Factory.eINSTANCE.createConsentTemplateKeyDTO();
		consentTemplateKey.setDomainName("avatar");
		consentTemplateKey.setName("test_avatar_consent");
		consentTemplateKey.setVersion("1.0");
		consentKey.setConsentTemplateKey(consentTemplateKey);
		SignerIdDTO sid = Cm2Factory.eINSTANCE.createSignerIdDTO();
		sid.setIdType("Patient ID");
		sid.setId(patientId);
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
		ms.setConsentState((ConsentStatus) selectRandomElement(ConsentStatus.values()));
		et1.setValue(ms);
		
		EntryType1 et2 = Cm2Factory.eINSTANCE.createEntryType1();
		ModuleKeyDTO mk2 = Cm2Factory.eINSTANCE.createModuleKeyDTO();
		mk2.setDomainName("avatar");
		mk2.setName("medical_history_module");
		mk2.setVersion("1.0");
		et2.setKey(mk2);
		ModuleStateDTO ms2 = Cm2Factory.eINSTANCE.createModuleStateDTO();
		ms2.setConsentState((ConsentStatus) selectRandomElement(ConsentStatus.values()));
		et2.setValue(ms2);
		
		mst1.getEntry().add(et1);
		mst1.getEntry().add(et2);
		consent.setModuleStates(mst1);
				
		consent.setPatientSignatureIsFromGuardian(false);
		consent.setPatientSigningPlace(faker.address().city());
		
		consent.setPhysicianId("Dr " + faker.name().firstName() + " " + faker.name().lastName());
		consent.setPhysicianSigningPlace(faker.address().city());
		consent.setPatientSignatureBase64(Base64.getEncoder().encodeToString(faker.name().fullName().getBytes()));
		
		try {
			GregorianCalendar c = new GregorianCalendar();
			Timestamp d1 = faker.date().past(1, TimeUnit.DAYS);
			Timestamp d2 = faker.date().past(1, TimeUnit.DAYS);
			Timestamp d3 = faker.date().past(1, TimeUnit.DAYS);
			c.setTime(d1.before(d2) ? d2 : d1);
			XMLGregorianCalendar xmlCalendar;
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			consent.setCreationDate(xmlCalendar); 
			consentKey.setConsentDate(xmlCalendar);
			
			c = new GregorianCalendar();
			c.setTime(d1.before(d2) ? d1 : d2);
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			consent.setPatientSigningDate(xmlCalendar);
			
			c = new GregorianCalendar();
			c.setTime(d1.before(d3) ? d1 : d3);
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			consent.setPhysicianSigningDate(xmlCalendar);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		
		return consent;
	}
	
	private <T extends Object> Object selectRandomElement(T[] elements)  {
		Random rndm = new Random();
		int rndmIndx = rndm.nextInt(elements.length);
		Object rndmElem = elements[rndmIndx];
		return rndmElem;
	}

}
