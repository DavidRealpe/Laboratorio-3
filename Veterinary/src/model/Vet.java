package model;

import java.util.ArrayList;

public class Vet{

	public final static int MAX = 9;

	//Atributes
	private String name;

	//Relations
	private ArrayList<Person> client;

	private ArrayList<MedicalRecord> medicalH;

	private MiniRoom[] room;

	private ArrayList<Service> service;

	//Methods

		//Constructor
		public Vet(String name){
			this.name = name;
			client = new ArrayList<>();		
			medicalH = new ArrayList<>();
			room = new MiniRoom[MAX];
			service = new ArrayList<>();
		}

		//Getters & Setters

		public MiniRoom[] getRoom(){
			return room;
		}
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}

		//Create person #1
		/**
		* This method creates a new person.
		* pre: ????
		* post: A person has been created
		* @param name Is the name of the new person. name != null, name != " "
		* @param id Is the id of the new person. id != null, id != " "
		* @param address Is the address of the new person. address != null, address != " "
		* @param phone Is the phone of the new person. phone != null, phone != " "
		*/
		public void createPerson(String name, String id, String address, String phone){
			client.add(new Person(name, id, address, phone));
		}

		//Hospitalization #2
		/**
		* This method hospitalizate a pet, setting it in a miniroom and making a new medical record to it.
		* pre: The availability of the miniroom is inicializated
		* post: A pet has been hospitalizated 
		*/

		public boolean hospitalizationPet(){

		boolean hospitalizated = false;

		/*String msg = "";

			for(int i=0; i<MAX && !hospitalizated; i++){

			boolean availy = room[i].getAvailability();

				if(availy==true){
					
					room[i].createMedicalRecord(symptom, diagnosis, petOwner, hospitalizedData, admissionDate, leaveDate, medicine);
					hospitalizated = true;

				}else{
					msg = "The mini room is already occupied.";
				}
			}*/
		return hospitalizated;
		}		

		//Contact information of the owner #4
		/**
		* This method shows the contact info of the owner
		* pre: The person is inicializated
		* post: Shows the contact information of the owner
		* @param ownerName The name of the person from whom the contact information will be taken.
		*/
		public String infoContact(String ownerName){

		boolean finded = true;

		String msg = "";

		String ownerN = "";
		String ownerId = "";
		String ownerAddress = "";
		String ownerPhone = "";

			for(int i=0; i<client.size(); i++){

				if(client.get(i).getName().equals(ownerName)){
					
					for(int j=0; j<client.size() && !finded; j++){
						ownerN = client.get(i).getName();
						ownerId = client.get(i).getId();
						ownerAddress = client.get(i).getAddress();
						ownerPhone = client.get(i).getPhone();
						finded = true;
					}	
				}				
				else{
					msg = "Please type an valid name.";
				}
			}
		return ownerN+", "+ownerId+", "+ownerAddress+", "+ownerPhone;
		}

		//Pet discharged #6   &   Medical records history #7
		/**
		* This method allows to discharge a pet from a mini room through the id of the owner.

		* post: The pet linked to the id of its owner has been discharged from the miniroom
		* @param idOwner Is the id of the owner of the pet that will be discharged. idOwner != null, idOwner != " ".
		*/
		public boolean dischargePet(String idOwner){

		boolean discharged = false;

		/*String msg = "";

		for(int k=0; k<client.size(); k++){

			String id = client.get(k).getId();

			if(id.equals(idOwner)){

				for(int i=0; i<MAX && !discharged; i++){

				char tempMRecord = room[i].getMedicalRecordFromPet().getStatus();

					if(room[i]!=null){
						room[i] = null;
						tempMRecord = room[i].getMedicalRecordFromPet().CLOSE; 
						medicalH.add(room[i].getMedicalRecordFromPet());
						room[i] = null;
						//room[i].getMedicalRecordFromPet() = null;
						discharged = true;
					}
					else{
						msg = "There is no pet in this room.";
					}
				}
			}	
		}*/
		
		return discharged;
		}

		//Report of medical records #3
		/**
		* This method makes a complete report of all the medical records.
		* pre: Method petMedicalRecords is already inicializated.
		* post: The report has been generated.
		*/
		public MedicalRecord reportOfMedicalRecords(){

			MedicalRecord allReported = null;

			for(int i=0 ; i<medicalH.size() ; i++){

				allReported = client.get(i).getPet1().get(i).petMedicalRecords();
			}
		return allReported;
		}
}

	



