package model;

import java.util.ArrayList;

public class Person{


	//Atributes
	private String name;
	private String id; 
	private String address;
	private String phone;


	//Relations
	private ArrayList<Pet> pet1;	

	//Methods

		//Constructor
		public Person(String name, String id, String address, String phone){
			this.name = name;
			this.id = id;
			this.address = address;
			this.phone = phone;
			pet1 = new ArrayList<Pet>();
		}

		//Getters & Setters

		/**
		* This method returns the name of the person
		* pre: the name is already inicializated
		* post: returns the name of the person
		*/
		public String getName(){
			return name;
		}

		/**
		* This method returns the id of the person 
		* pre: the id is already inicializate
		* post: returns the id of the person
		*/
		public String getId(){
			return id;
		}

		/**
		* This method returns the address of the person 
		* pre: the address is already inicializate
		* post: returns the address of the person
		*/
		public String getAddress(){
			return address;
		}

		/**
		* This method returns the phone of the person 
		* pre: the phone is already inicializate
		* post: returns the phone of the person
		*/
		public String getPhone(){
			return phone;
		}

		/**
		* This method returns the pets of the person 
		* pre: the ArrayList of pets is already inicializate
		* post: returns the pets of the person
		*/
		public ArrayList<Pet> getPet1(){
			return pet1;
		}

		
		//Create a pet to this person (needed to #1)

		/**
		* This method creates a person
		* pre: the person can be null
		* post: a person has been created
		*/
		public void createPet(String name, int age, char specie, double height, double weight, String petId){
			pet1.add(new Pet(name, age, specie, height, weight, petId));
		}

		
} 



