package com.epam.fundamentals.cleanCode.temperatureConverter;

import java.util.Scanner;

import com.epam.fundamentals.cleanCode.temperatureConverter.api.TemperatureConverter;
import com.epam.fundamentals.cleanCode.temperatureConverter.factory.TemperatureFactory;

public class TemperatureConverterMain {

	public static String getChoice(int choice) {
		if (choice == 1)
			return "celciusToFarenhite";
		else
			return "FarenhiteToCelcius";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Celcius To Frenhite\n2.Frenhite  To Celcius\n");
		int choice = sc.nextInt();
		TemperatureConverter tempConverter = TemperatureFactory.getInstance(getChoice(choice));
		System.out.println("Enter Temperature :");
		System.out.println(tempConverter.convert(sc.nextDouble()));
		sc.close();
	}

}
