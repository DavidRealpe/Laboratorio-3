package model;

public class MiniRoom{

	//Atributes
	private boolean availability;

	//Relations
	private Pet petInRoom;
	private MedicalRecord medicalRecordFromPet;

	//Methods

		//Constructor
		public MiniRoom(boolean availability){
			this.availability = availability;
			this.petInRoom = petInRoom;
		}

		//Getters & Setters
		public boolean getAvailability(){
		
		boolean	availability = false;
		
			if(petInRoom==null){
			availability = true;
			}

		return availability;
		}

		public void setAvailability(boolean availability){
			this.availability = availability;
		}

		public MedicalRecord getMedicalRecordFromPet(){
			return medicalRecordFromPet;
		}

		//Needed to #4 (Hospitalization)
		public void createMedicalRecord(String symptom, String diagnosis, Person petOwner, Pet hospitalizedData, Date admissionDate, Date leaveDate, Medicine medicine){
			medicalRecordFromPet = new MedicalRecord(symptom, diagnosis, petOwner, hospitalizedData, admissionDate, leaveDate, medicine);
		}
}
