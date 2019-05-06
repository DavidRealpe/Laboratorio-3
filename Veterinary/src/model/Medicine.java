package model;

public class Medicine{

	//Atributes
	private String name;
	private double dose;
	private double doseCost;
	private double frequency;

	//Methods

		//Constructor
		public Medicine(String name, double dose, double doseCost, double frequency){
			this.name = name;
			this.dose = dose;
			this.doseCost = doseCost;
			this.frequency = frequency;
		}

		//Getters & Setters

		/**
		* This method returns the name of the medicine 
		* pre: the name is already inicializate
		* post: returns the name of the medicine
		*/
		public String getName(){
			return name;
		}

		/**
		* This method returns the dose of the medicine 
		* pre: the dose is already inicializate
		* post: returns the dose of the medicine
		*/
		public double getDose(){
			return dose;
		}

		/**
		* This method returns the dose cost of the medicine 
		* pre: the dose cost is already inicializate
		* post: returns the dose cost of the medicine
		*/
		public double getDoseCost(){
			return doseCost;
		}

		/**
		* This method returns the frequency of the medicine 
		* pre: the frequency is already inicializate
		* post: returns the frequency of the medicine
		*/
		public double getFrequency(){
			return frequency;
		}

}

