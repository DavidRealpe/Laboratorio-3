package model;

import java.util.ArrayList;

public class MiniRoom{

	//Atributes
	private boolean availability;

	//Relations
	private Pet petInRoom;
	private ArrayList<MedicalRecord> medicalRecordFromPet;

	//Methods

		//Constructor
		public MiniRoom(boolean availability){
			this.availability = availability;
			this.petInRoom = petInRoom;
			medicalRecordFromPet = new ArrayList<MedicalRecord>();
		}

		//Getters & Setters

		/**
		* This method returns the availability of a mini room.
		* pre: the availability is already inicializated
		* post: returns the availability of a mini room
		*/
		public boolean getAvailability(){
		
		boolean	availability = false;
		
			if(petInRoom==null){
			availability = true;
			}

		return availability;
		}

		//Needed to #4 (Hospitalization)
		/**
		* This method creates a medical record
		* pre: The medical record can be null
		* post: 
		*/
		public void createMedicalRecord(String symptom, String diagnosis, Person petOwner, Pet hospitalizedData, Date admissionDate, Date leaveDate, Medicine medicine){
			medicalRecordFromPet.add( new MedicalRecord(symptom, diagnosis, petOwner, hospitalizedData, admissionDate, leaveDate, medicine));
		}

}
