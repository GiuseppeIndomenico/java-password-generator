package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
				
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("inserisci il tuo nome:");
	String name = sc.nextLine();
	
	System.out.print("inserisci il tuo cognome:");
	
	String surname = sc.nextLine();
	
System.out.print("inserisci il tuo colore preferito:");
	
	String color = sc.nextLine();
	
	System.out.println("-----------------------------------");
	
	System.out.println("inserisci la tua data di nascita:");
	
	System.out.print("giorno:");
	int day = sc.nextInt();
	System.out.print("mese:");
	int month = sc.nextInt();
	System.out.print("anno:");
	int year = sc.nextInt();
		
	sc.close();
	
	System.out.println("-----------------------------------");
	
	int sum = day + month + year;
	
	String pass = name +"-"+ surname + "-" + color +"-"+ sum;
			
	System.out.print("La tua password e': " + pass);	
	
	
	
	}
}
