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

	//Methods

		//Constructor
		public Vet(String name){
			this.name = name;
			client = new ArrayList<>();		
			medicalH = new ArrayList<>();
			room = new MiniRoom[MAX];
		}

		//Getters & Setters

		public String getName(){
			return name;
		}

		public void setName(String name){
			this.name = name;
		}

		//Create person #1
		public void createPerson(String name, String id, String address, String phone){
			client.add(new Person(name, id, address, phone));
		}

		//Hospitalization #2
		public boolean hospitalizationPet(String id, String petName){

		boolean	petAdded = false;		

		String msg = "";

		    for(int i=0; i<MAX; i++){

		    	if(room[i].getAvailability()==true){

						if(client.getId().equals(id)){

							for(int j=0; j<MAX && !petAdded; j++){

								MiniRoom tempMRecord = room.getMedicalRecordFromPet().get(j);

								if(client.getPet1().getName().equals(petName7)){

									room[j] = client.getPet1();

									room[j].createMedicalRecord(symptom, diagnosis, petOwner, hospitalizedPet, admissionDate, leaveDate, medicine);
									tempMRecord = room[j].getMedicalRecordFromPet().OPEN;
									petAdded = true;

									//Add old medical record to the new one. #8

									if(client.getPet1().getMedicalRecordPet()!=null){

										tempMRecord += room[j].createMedicalRecord(symptom, diagnosis, contacInfo, initialData, admissionDate, leaveDate, medicine);

									}
								}
								else{	
									msg = "Please type an valid name.";
								}
							}
						}
						else{
							msg = "Please type an valid ID.";
						}					
					}
		    }         
				
		return petAdded;
		}

		public MedicalRecord reportOfMedicalRecords(){

			MedicalRecord reportTotal;

			for(int i=0; i<medicalH.size; i++){

				reportTotal += client.pet1.petMedicalRecords();
			}
		return reportTotal;
		}

		//Contact information of the owner #4

		public String infoContact(String ownerName){

		boolean finded = true;

		String msg = "";

		String ownerN;
		String ownerId;
		String ownerAddress;
		String ownerPhone;

			for(int i=0; i<client.size(); i++){

				if(client.get(i).getName().equals(ownerName)){
					
					for(int j=0; j<client.size() && !finded; j++){
						ownerN = client.getName();
						ownerId = client.getId();
						ownerAddress = client.getAddress();
						ownerPhone = client.getPhone();
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
		public boolean dischargePet(){

		boolean discharged = false;

		String msg = "";

			for(int pos=0; pos<MAX && !discharged; pos++){

			MiniRoom tempMRecord = room[pos].getMedicalRecordFromPet().getStatus();


				if(room[pos]!=null){
					room[pos] = null;
					tempMRecord = room[pos].getMedicalRecordFromPet().CLOSE; 
					medicalH.add(room[pos].getMedicalRecordFromPet());
					room[pos].getMedicalRecordFromPet() = null;
					discharged = true;
				}
				else{
					msg = "There is no pet in this room.";
				}
			}
		return discharged;
		}

		//Report of medical records #3
		public MedicalRecord reportOfMedicalRecords(){

			MedicalRecord allReported;

			for(int i=0 ; i<medicalH.size() ; i++){

				allReported += client.getPet1().petMedicalRecords();
			}
		return allReported;
		}
}

	



