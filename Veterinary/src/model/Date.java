package model;

public class Date {
       
    //Atributes
		private int day;
		private int month;
		private int year;

		//Methods

		//Constructor

			public Date(int day, int month, int year){

				this.day = day;
				this.month = month;
				this.year = year;
			}
			
			//Getters & Setters

			/**
			* This method returns the day of the date.
			* pre: the day is already inicializate.
			* post: returns the day of the date.
			*/
			public int getDay(){
				return day;
			}

			/**
			* This method returns the month of the date. 
			* pre: the month is already inicializate.
			* post: returns the month of the date.
			*/
			public int getMonth(){
				return month;
			}

			/**
			* This method returns the year of the date. 
			* pre: the year is already inicializate.
			* post: returns the year of the date.
			*/
			public int getYear(){
				return year;
			}

}

			
