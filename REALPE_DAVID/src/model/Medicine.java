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
		public String getName(){
			return name;
		}

		public void setName(String name){
			this.name = name;
		}

		public double getDose(){
			return dose;
		}

		public void setDose(double dose){
			this.dose = dose;
		}

		public double getDoseCost(){
			return doseCost;
		}

		public void setDoseCost(double doseCost){
			this.doseCost = doseCost;
		}

		public double getFrequency(){
			return frequency;
		}

		public void setFrequency(double frequency){
			this.frequency = frequency;
		}
}

