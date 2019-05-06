package model;

import java.util.ArrayList;

public class Pet{

	//Constants
	public final static char CAT = 'c';
	public final static char DOG = 'd';
	public final static char BIRD = 'b';
	public final static char OTHER = 'o';

	//Atributes
	private String name;
	private int age;
	private char specie;
	private double height;
	private double weight;
	private String petId;


	//Relations
	private ArrayList<MedicalRecord> medicalRecordPet;

	//Methods

		//Constructor
		public Pet(String name, int age, char specie, double height, double weight, String petId){
			this.name = name;
			this.age = age;
			this.specie = specie;
			this.weight = weight;                       
			this.petId = petId;
			medicalRecordPet = new ArrayList<MedicalRecord>();
		}

		//Getters & Setters

		/**
		* This method returns the name of the pet 
		* pre: the name is already inicializate
		* post: returns the name of the pet
		*/
		public String getName(){
			return name;
		}
		
		/**
		* This method returns the age of the pet 
		* pre: the age is already inicializate
		* post: returns the age of the pet
		*/
		public int getAge(){
			return age;
		}

		/**
		* This method returns the specie of the pet 
		* pre: the specie is already inicializate
		* post: returns the specie of the pet
		*/
		public char getSpecie(){
			return specie;
		}

		/**
		* This method returns the weight of the pet 
		* pre: the weight is already inicializate
		* post: returns the weight of the pet
		*/
		public double getWeight(){
			return weight;
		}

		/**
		* This method returns the id of the pet 
		* pre: the id is already inicializate
		* post: returns the id of the pet
		*/
		public String getPetId(){
			return petId;
		}

		/**
		* This method returns the medical records of the pet 
		* pre: the ArrayList of medical records is already inicializate
		* post: returns the medical record of the pet
		*/
		public ArrayList<MedicalRecord> getMedicalRecordPet(){
			return medicalRecordPet;
		}

		/**
		* This method stores all the medical records of the pet.
		* pre: the ArrayList of medical records is already inicializate.
		* post: all the medical records has been stored.
		*/
		public MedicalRecord petMedicalRecords(){

		MedicalRecord allMR = null; 

			for(int i=0; i<medicalRecordPet.size(); i++){

				allMR = medicalRecordPet.get(i);
			}			
		return allMR;
		}
}