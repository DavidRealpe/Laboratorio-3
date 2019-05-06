package model;

public class Service{

	//Constants
	public final static char BATH_IN_VET = 'v';
	public final static char DOMI_BATH = 'd';
	public final static char NAIL_CUTTING = 'n';
	public final static char DENTAL_PROPHYLAXIS = 'p';
	public final static char VACCINE_APLICATION = 'a';

	//Atributes 
	private char type;
	private double cost;

	//Relations
	private Person idOwner;
	private Pet idPet;

	//Constructor
	public Service(char type, double cost){
		this.type = type;
		this.cost = cost;
		this.idOwner = idOwner;
		this.idPet = idPet;
	}

	//Getters & Setters

		/**
		* This method returns the type of a service.
		* pre: the type is already inicializated.
		* post: returns the type of a service,
		*/
		public char getType(){
			return type;
		}

		/**
		* This method returns the cost of a service.
		* pre: the cost is already inicializated.
		* post: returns the cost of a service,
		*/
		public double getCost(){
			return cost;
		}

		/**
		* This method returns the id of the person who hires the service.
		* pre: the id of the person is already inicializated.
		* post: returns the id of the person who hires the service.
		*/
		public Person getIdOwner(){
			return idOwner;
		}

		/**
		* This method returns the id of the pet that requires the service.
		* pre: the id of the pet is already inicializated.
		* post: returns the id of the pet that requires the service.
		*/
		public Pet getIdPet(){
			return idPet;
		}

}