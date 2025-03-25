package org.avatar.himsa.dummy.data.component;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.avatar.gics.service.api.GICSService;
import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportFactory;
import org.avatar.himsa.export.PatientExportPackage;
import org.eclipse.emf.ecore.EObject;
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
import org.gecko.emf.mongo.Options;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.PromiseFactory;

import net.datafaker.Faker;

@Component(immediate=true, name="DummyDataComponent", configurationPid = "DummyDataComponent", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class DummyDataComponent {

	@Reference(target="(repo_id=avatar.avatar)")
	ComponentServiceObjects<EMFRepository> repoSO;
	
	@Reference
	GICSService gicsService;
	
	private static final Logger LOGGER = Logger.getLogger(DummyDataComponent.class.getName());
	
	private static final int NUM_OF_DUMMY_INSTANCES = 100;
	private static final List<String> HEALTH_INSURANCE_COMPANIES_GERMANY = List.of("AOK", "BARMER", "HKK", "hkk health insurance", "KNIGHTSHAFT",
			"DAK health", "KKH", "Techniker Krankenkasse", "TK", "HEK", "Hanseatic Health Insurance", "BKK", "IKK"); 
	
	private Faker faker = new Faker(new Locale("de"));
	private PromiseFactory factory = new PromiseFactory(Executors.newFixedThreadPool(4));

	private Map<String, Object> properties;
	
	@Activate
	public void activate(Map<String, Object> properties) {		
		this.properties = properties;
		factory.submit(() -> {
			doCreateDummyData();
			return true;
		}).onSuccess(t -> LOGGER.info("Finished creating dummy data!"))
		.onFailure(t -> LOGGER.log(Level.SEVERE, String.format("Something went wrong when creating dummy data!"), t));		
	}

	
	private void doCreateDummyData() {
		EMFRepository repo = repoSO.getService();
		try {
			Map<String, Object> loadOptions = new HashMap<>();
			if(properties.containsKey("collection.name")) loadOptions.put(Options.OPTION_COLLECTION_NAME, (String) properties.get("collection.name"));
			List<Patient> existingPatients = repo.getAllEObjects(PatientExportPackage.eINSTANCE.getPatient(), loadOptions);
			boolean createPatients = existingPatients.isEmpty();
			if(createPatients) {
				Collection<Patient> patients = createDummyPatients(NUM_OF_DUMMY_INSTANCES);				
				repo.save(patients.stream().map(mr -> (EObject) mr).toList(), loadOptions);
				for(Patient patient : patients) {
					ConsentDTO consent = doCreateDummyConsent(patient);
					gicsService.addConsent(consent);
				}
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
		patient.setFirstName(getRandomDouble() < 0.7 ? faker.name().firstName() : null);
		patient.setLastName(getRandomDouble() < 0.7 ? faker.name().lastName() : null);
		patient.setMiddleName(getRandomDouble() < 0.7 ? faker.name().firstName() : null);
//		patient.setGender((GenderType) selectRandomElement(GenderType.values()));
		patient.setTitle(getRandomDouble() < 0.7 ? faker.name().title() : null);
		
		patient.setCity(getRandomDouble() < 0.7 ? faker.address().city() : null);
		patient.setZip(getRandomDouble() < 0.7 ? faker.address().zipCode() : null);
		patient.setProvince(getRandomDouble() < 0.7 ? faker.address().state() : null);
		patient.setCountry(getRandomDouble() < 0.7 ? "Germany" : null);
		StringBuilder sb = new StringBuilder(patient.getCity() != null ? patient.getCity() : "");
		sb.append(","+ (patient.getZip() != null ? patient.getZip() : ""));
		sb.append(","+ (patient.getProvince() != null ? patient.getProvince() : ""));
		sb.append(","+ (patient.getCountry() != null ? patient.getCountry() : ""));
		patient.setAddress1(getRandomDouble() < 0.7 ? sb.toString() : null);
		
		patient.setEMail(getRandomDouble() < 0.7 ? faker.internet().emailAddress() : null);
		patient.setHomeTelephone(getRandomDouble() < 0.7 ? faker.phoneNumber().phoneNumber() : null);
		patient.setWorkTelephone(getRandomDouble() < 0.7 ? faker.phoneNumber().phoneNumber() : null);
		
		patient.setInsurance1(getRandomDouble() < 0.7 ? (String) selectRandomElement(HEALTH_INSURANCE_COMPANIES_GERMANY.toArray(new String[] {})) : null);
		patient.setSSNumber(getRandomDouble() < 0.7 ? faker.idNumber().ssnValid() : null);
		
		patient.setPhysician(getRandomDouble() < 0.7 ? "Dr ".concat(faker.name().firstName().concat(" " + faker.name().lastName())) : null);
		patient.setReferral(getRandomDouble() < 0.7 ? faker.name().fullName() : null);
		
		patient.setPatientNo(getRandomDouble() < 0.7 ? faker.number().digits(6) : null);
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
	
	private ConsentDTO doCreateDummyConsent(Patient patient) {
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
		sid.setId(patient.getPatientGUID());
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
		ms.setConsentState((ConsentStatus) selectRandomElement(new ConsentStatus[] {ConsentStatus.ACCEPTED, ConsentStatus.DECLINED}));
		et1.setValue(ms);
		
		EntryType1 et2 = Cm2Factory.eINSTANCE.createEntryType1();
		ModuleKeyDTO mk2 = Cm2Factory.eINSTANCE.createModuleKeyDTO();
		mk2.setDomainName("avatar");
		mk2.setName("medical_history_module");
		mk2.setVersion("1.0");
		et2.setKey(mk2);
		ModuleStateDTO ms2 = Cm2Factory.eINSTANCE.createModuleStateDTO();
		ms2.setConsentState((ConsentStatus) selectRandomElement(new ConsentStatus[] {ConsentStatus.ACCEPTED, ConsentStatus.DECLINED}));
		et2.setValue(ms2);
		
		mst1.getEntry().add(et1);
		mst1.getEntry().add(et2);
		consent.setModuleStates(mst1);
				
		consent.setPatientSignatureIsFromGuardian(false);
		consent.setPatientSigningPlace(faker.address().city());
		consent.setPatientSignatureBase64(Base64.getEncoder().encodeToString(faker.name().fullName().getBytes()));
		
		consent.setPhysicianId(patient.getPhysician());
		consent.setPhysicianSigningPlace(faker.address().city());
		consent.setPhysicianSignatureBase64(Base64.getEncoder().encodeToString(faker.name().fullName().getBytes()));
		Qcdto qualityControl = Cm2Factory.eINSTANCE.createQcdto();
		try {
			GregorianCalendar c = new GregorianCalendar();
			Timestamp d1 = faker.date().past(100, 7, TimeUnit.DAYS);
			Timestamp d2 = faker.date().past(100, 7, TimeUnit.DAYS);
			Timestamp d3 = faker.date().past(100, 7, TimeUnit.DAYS);
			
			Timestamp creation = d1.before(d2) ? d1 : d2;
			creation = creation.before(d3) ? creation : d3;
			Timestamp patientSig = creation.before(d3) ? d3 : creation;
			Timestamp physicianSig = faker.date().between(patientSig, faker.date().past(6, TimeUnit.DAYS));
			
			c.setTime(creation.equals(d1) ? d2 : d1);
			XMLGregorianCalendar xmlCalendar;
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			consent.setCreationDate(xmlCalendar); 
			consentKey.setConsentDate(xmlCalendar);
			
			c = new GregorianCalendar();
			c.setTime(patientSig);
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			consent.setPatientSigningDate(xmlCalendar);
			
			c = new GregorianCalendar();
			c.setTime(physicianSig);
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			consent.setPhysicianSigningDate(xmlCalendar);
			
			Timestamp d4 = faker.date().past(7, TimeUnit.DAYS);
			c = new GregorianCalendar();
			c.setTime(d4);
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			qualityControl.setDate(xmlCalendar);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		
		qualityControl.setInspector(faker.name().fullName());
		qualityControl.setType((String) selectRandomElement(new String[] {"checked_minor_faults", "checked_no_faults"}));
		consent.setQualityControl(qualityControl);
		return consent;
	}
	
	private <T extends Object> Object selectRandomElement(T[] elements)  {
		Random rndm = new Random();
		int rndmIndx = rndm.nextInt(elements.length);
		Object rndmElem = elements[rndmIndx];
		return rndmElem;
	}
	
	private double getRandomDouble() {
		Random rand = new Random();
		return (double)Math.abs(rand.nextInt())/Integer.MAX_VALUE;
	}

}
