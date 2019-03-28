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
	private double weight;
	private int state;


	//Relations
	private ArrayList<MedicalRecord> medicalRecordPet;

	//Methods

		//Constructor
		public Pet(String name, int age, char specie, double weight){
			this.name = name;
			this.age = age;
			this.specie = specie;
			this.weight = weight;                       
			this.state = state;
			medicalRecordPet = new ArrayList<MedicalRecord>();
		}

		//Getters & Setters
		public String getName(){
			return name;
		}

		public void setName(String name){
			this.name = name;
		}

		public int getAge(){
			return age;
		}

		public void setAge(int age){
			this.age = age;
		}

		public char getSpecie(){
			return specie;
		}

		public void setSpecie(char specie){
			this.specie = specie;
		}

		public double getWeight(){
			return weight;
		}

		public void setWeight(double weight){
			this.weight = weight;
		}

		public int getState(){
			return state;
		}

		public void setState(int state){
			this.state = state;
		}

		public ArrayList<MedicalRecord> getMedicalRecordPet(){
			return medicalRecordPet;
		}

		public void setMedicalRecordPet(ArrayList<MedicalRecord> medicalRecordPet){
			this.medicalRecordPet = medicalRecordPet;
		}

		public MedicalRecord petMedicalRecords(){

		MedicalRecord allMR; 

			for(int i=0; i<medicalRecordPet.size(); i++){

				allMR += medicalRecordPet.get(i);
			}
			
		return allMR;
		}
}