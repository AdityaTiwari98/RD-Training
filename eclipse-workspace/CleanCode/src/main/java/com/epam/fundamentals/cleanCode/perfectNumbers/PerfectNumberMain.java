package com.epam.fundamentals.cleanCode.perfectNumbers;

import java.util.Scanner;

import com.epam.fundamentals.cleanCode.perfectNumbers.service.PerfectNumberImpl;

public class PerfectNumberMain {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Enter number to be checked");
			long number = sc.nextLong();
			PerfectNumberImpl perfectNumbers = new PerfectNumberImpl();

			if (perfectNumbers.isPerfectNumber(number))
				System.out.println(number + " is a perfect Number!");
			else
				System.out.println(number + " is not a perfect Number!");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
