package com.epam.fundamentals.cleanCode.fizzBuzz;

import com.epam.fundamentals.cleanCode.fizzBuzz.api.FizzBuzzSeries;
import com.epam.fundamentals.cleanCode.fizzBuzz.service.FizzBuzzImpl;

public class FizzBuzzMain {

	private static long START = 1;
	private static long END = 100;

	public static void main(String[] args) {

		FizzBuzzSeries fizzBuzz = new FizzBuzzImpl();
		System.out.println(fizzBuzz.generateSeries(START, END));
	}

}
