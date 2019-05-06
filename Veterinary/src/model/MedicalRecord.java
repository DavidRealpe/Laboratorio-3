package model;

public class MedicalRecord{

	//Constants
	public final static char OPEN = 'O';
	public final static char CLOSE = 'E';

	//Atributes
	private String symptom;
	private String diagnosis;
	private char status;

	//Relations
	private Person petOwner;
	private Pet hospitalizedPet;
	private Date admissionDate;
	private Date leaveDate;
	private Medicine medicine;

	//Methods

		//Constructor
		public MedicalRecord(String symptom, String diagnosis, Person petOwner, Pet hospitalizedPet, Date admissionDate, Date leaveDate, Medicine medicine){
			this.symptom = symptom;
			this.diagnosis = diagnosis;
			this.status = status;
			this.petOwner = petOwner;
			this.hospitalizedPet = hospitalizedPet;
			this.admissionDate = admissionDate;
			this.leaveDate = leaveDate;
			this.medicine = medicine;
		}

		//Getters & Setters 

		/**
		* This method returns the symptom of the medical record 
		* pre: the symptom is already inicializate
		* post: returns the symptom of the medical record
		*/
		public String getSymptom(){
			return symptom;
		}
		
		/**
		* This method returns the diagnosis of the medical record 
		* pre: the diagnosis is already inicializate
		* post: returns the diagnosis of the medical record
		*/
		public String getDiagnosis(){
			return diagnosis;
		}

		/**
		* This method returns the status of the medical record 
		* pre: the status is already inicializate
		* post: returns the status of the medical record
		*/
		public char getStatus(){
			return status;
		}

		
		//Hospitalization costs #5

		/**
		* This method calculates the cost of the hospitalization according to the type of animal and the days hospitalizated.
		* post: returns the cost of the hospitalization
		*/

		public double hospitalizationCost(int daysH){

			double costTotal = 0.0;

			if(hospitalizedPet.getSpecie()==hospitalizedPet.CAT){

				if(hospitalizedPet.getWeight()<3.1){
					costTotal = 10000*daysH;

					if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
				else if(hospitalizedPet.getWeight()>3 && hospitalizedPet.getWeight()<10.1){
					costTotal = 12000*daysH;

						if(medicine.getDose()<15.1){
							costTotal += 2000;
						}

						else if(medicine.getDose()>15 && medicine.getDose()<20.1){
							costTotal += 5000;
						}

						else if(medicine.getDose()>20 && medicine.getDose()<30.1){
							costTotal += 7000;
						}

						else if(medicine.getDose()>30.1){
							costTotal += 10000;
						}
				}
				else if(hospitalizedPet.getWeight()>10 && hospitalizedPet.getWeight()<20.1){
					costTotal = 15000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}						
				}
				else if(hospitalizedPet.getWeight()>20.1){
					costTotal = 20000*daysH;	
				}
					if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
			}
			else if(hospitalizedPet.getSpecie()==hospitalizedPet.DOG){

				if(hospitalizedPet.getWeight()<3.1){
					costTotal = 15000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
				else if(hospitalizedPet.getWeight()>3 && hospitalizedPet.getWeight()<10.1){
					costTotal = 17000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
				else if(hospitalizedPet.getWeight()>10 && hospitalizedPet.getWeight()<20.1){
					costTotal = 20000*daysH;	

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}					
				}
				else if(hospitalizedPet.getWeight()>20.1){
					costTotal = 25000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}						
				}
			}
			else if(hospitalizedPet.getSpecie()==hospitalizedPet.BIRD){

				if(hospitalizedPet.getWeight()<3.1){
					costTotal = 10000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
				else if(hospitalizedPet.getWeight()>3 && hospitalizedPet.getWeight()<10.1){
					costTotal = 12000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
				else if(hospitalizedPet.getWeight()>10 && hospitalizedPet.getWeight()<20.1){
					costTotal = 20000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
				else if(hospitalizedPet.getWeight()>20.1){
					costTotal = 25000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
			}
			else if(hospitalizedPet.getSpecie()==hospitalizedPet.OTHER){
			
				if(hospitalizedPet.getWeight()<3.1){
				costTotal = 10000*daysH;

					if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
				else if(hospitalizedPet.getWeight()>3 && hospitalizedPet.getWeight()<10.1){
				costTotal = 17000*daysH;

					if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
				else if(hospitalizedPet.getWeight()>10 && hospitalizedPet.getWeight()<20.1){
					costTotal = 30000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
				else if(hospitalizedPet.getWeight()>20.1){
					costTotal = 33000*daysH;

						if(medicine.getDose()<15.1){
						costTotal += 2000;
					}

					else if(medicine.getDose()>15 && medicine.getDose()<20.1){
						costTotal += 5000;
					}

					else if(medicine.getDose()>20 && medicine.getDose()<30.1){
						costTotal += 7000;
					}

					else if(medicine.getDose()>30.1){
						costTotal += 10000;
					}
				}
			}
		return costTotal;
		}
}
