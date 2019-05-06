package model ui;

import model.Vet;

import java.util.Scanner;

public class Main{

	//Relations
	private Vet vet;
	private Scanner reader;

	//Methods
	public Main(){
		reader = new Scanner(System.in);
		init();
	}

	public void init(){

		vet = new Vet();
		vet.addClient(3);
	}

	public static void main(String[] args){
		System.out.println("******************************************************************\n");
		System.out.println("**************** BIENVENIDO A MI PEQUEÑA MASCOTA *****************\n");
		System.out.println("******************************************************************\n");
		
		Main m = new Main();
	}

}