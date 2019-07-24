package com.epam.fundamentals.cleanCode.sequence;

import java.util.Scanner;

import com.epam.fundamentals.cleanCode.sequence.service.CollatzSequenceImpl;

public class CollatzSequenceMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100 :");
		int number = sc.nextInt();
		if (number > 99 || number < 1) {
			System.out.println("Number was not in between 0 and 100.");
		} else {
			CollatzSequenceImpl collatzSequence = new CollatzSequenceImpl();
			System.out.println(collatzSequence.generateSequence(number));
		}
		sc.close();
	}

}
