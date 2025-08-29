# HL7 FHIR Data Generator

## How it works

+ User can send a query through the Avatar Query UI. 

+ The query should have at least one `from` (`Patient`, `Observation`, `Condition`, `Encounter`).

+ The `where` can be a `DateComparator` on the `Patient#birthDate` or an `EnumComparator` on the `Patient#gender`, or both;

+ Supported `Observation#code` values are:

  + `85354-9`: systolic and diastolic blood pressure
  + `8867-4` heart rate
  + `8310-5`: body temperature
  + `29463-7`: body weight
  + `9279-1`: respiratory rate
  + `HP:0000494`: orbital hypotelorism
  + `HP:0000545`: macular dystrophy
  + `HP:0001007`: acne
  + `HP:0001508`: growth abnormality
  + `HP:0001878`: anemia
  + `HP:0002119`: seizure

+ `Condition#code` are instead taken randomly from this correspondence map which links the `Observation#code` with some reasonable `Condition#code`. Please, note that there is no `Observation#value` check made before assigning a `Condition#code` (e.g. if body weight is 30 Kg it might happen that the condition is obesity, even if it does not make sense)

  ```java
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
  ```
