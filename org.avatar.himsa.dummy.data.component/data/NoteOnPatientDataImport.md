### Things that had to be changed to be able to load the `two_patients_data.xml` into our `PatientExport` model

+ The overall structure

  ```xml
  <pt:NOAH_Patients_Export xmlns:pt="http://www.himsa.com/Measurement/PatientExport.xsd" xmlns:aud="http://www.himsa.com/Measurement/Audiogram" xmlns:his="http://www.himsa.com/Instrument/Selection" xmlns:rem="http://www.himsa.com/Measurement/RealEar" xmlns:imp="http://www.himsa.com/Measurement/Impedance" xmlns:hif="http://www.himsa.com/Instrument/Fitting" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" noNamespaceSchemaLocation="PatientExport.xsd">
  	<pt:Patient>
  		<pt:Patient>
      
      	</pt:Patient>    
  	</pt:Patient>
  </pt:NOAH_Patients_Export>
  ```

  had to be changed in

  ```xml
  <pt:Patients_._type xmlns:pt="http://www.himsa.com/PatientExport/PatientExport" xmlns:aud="http://www.himsa.com/Measurement/Audiogram" xmlns:his="http://www.himsa.com/Instrument/Selection" xmlns:rem="http://www.himsa.com/Measurement/RealEar" xmlns:imp="http://www.himsa.com/Measurement/Impedance" xmlns:hif="http://www.himsa.com/Instrument/Fitting" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">  
      <pt:Patient_._type>
      
      </pt:Patient_._type>
  </pt:Patients_._type>  
  ```

  

+ In our EMF model, the `ExtendedMetadata` of the `DocumentRoot#patients` had to be changed from 

  ```xml
  <eAnnotations source="http:///org/eclipse/emf/ecore/util/ExtendedMetaData">
     <details key="kind" value="element"/>
     <details key="name" value="Patients"/>
     <details key="namespace" value="##targetNamespace"/>
  </eAnnotations>
  ```

  to 

  ```xml
  <eAnnotations source="http:///org/eclipse/emf/ecore/util/ExtendedMetaData">
     <details key="kind" value="element"/>
     <details key="name" value="Patients_._type"/>
     <details key="namespace" value="##targetNamespace"/>
  </eAnnotations>
  ```

  to match the definition in the `PatientsType` class metadata.
  
+ Same features in the `xml` document had to be removed because unrecognized from our model. These were:

  + `NOAHPatientId`
  + `NOAHPatienGUID`
  + `NOAHPatientNumber`
  + `CreatedBy`
  + `AgePeriod`

+ Same feature names in the `xml` had to be adjusted to match the definition of the extended meta data we have in our EMF model. These were:

  + `DateofBirth` -> `BirthDate`
  + `HomePhone` -> `HomeTelephone`
  + `WorkPhone` -> `WorkTelephone`
  + `MobilePhone` -> `MobileTelephone`