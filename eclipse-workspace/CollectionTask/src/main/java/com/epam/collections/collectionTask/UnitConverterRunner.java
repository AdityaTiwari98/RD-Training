package com.epam.collections.collectionTask;

import java.util.Scanner;

public class UnitConverterRunner {
	
	static Scanner sc;
	static int EXIT=7;
	
	static void printMenu()
	{
		System.out.println("\n\n###### MENU ######");
		System.out.println("1. Inch to Feet");
		System.out.println("2. Inch to Meter");
		System.out.println("3. Feet to Inch");
		System.out.println("4. Feet to Meter");
		System.out.println("5. Meter to Inch");
		System.out.println("6. Meter to Feet");
		System.out.println("7. Exit");
		System.out.println("\n\nChoice :");
	}
	
	static int getChoice()
	{
		int choice;
		choice=sc.nextInt();
		return choice;
	}
	
	static int getLength()
	{
		System.out.println("Enter length :");
		int length;
		length=sc.nextInt();
		return length;
	}

	public static void main(String[] args) {
		
		sc=new Scanner(System.in);
		int choice;
		do {
			printMenu();
			choice=getChoice();
			if(choice>0&&choice<6) {
				Unit unit=UnitConverter.getConverter(choice);
				System.out.println(unit.convert(getLength()));
			}
			else if(choice!=EXIT)
				System.out.println("Enter a Valid choice");
			
		}while(choice!=7);
		sc.close();
	}

}
