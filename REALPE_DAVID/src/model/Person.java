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
		public String getName(){
			return name;
		}

		public void setName(String name){
			this.name = name;
		}

		public String getId(){
			return id;
		}

		public void setId(String id){
			this.id = id;
		}

		public String getAddress(){
			return address;
		}

		public void setAddress(String address){
			this.address = address;
		}

		public String getPhone(){
			return phone;
		}

		public void setPhone(String phone){
			this.phone = phone;
		}

		public ArrayList<Pet> getPet1(){
			return pet1;
		}

		public void setPet1(ArrayList<Pet> pet1){
			this.pet1 = pet1;
		}

		//Create a pet to this person (needed to #1)
		public void createPet(String name, int age, char specie, double weight){
			pet1.add(new Pet(name, age, specie, weight));
		}

		
} 



