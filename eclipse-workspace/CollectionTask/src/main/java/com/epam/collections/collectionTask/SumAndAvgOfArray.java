package com.epam.collections.collectionTask;

import java.util.Scanner;

public class SumAndAvgOfArray {
	
	static Scanner sc;
	private float array[];
	private int size;
	
	SumAndAvgOfArray() {
		inputSize();
		array=new float[size];
		inputArray();
	}
	
	void inputSize()
	{
		System.out.println("Enter size of the array :");
		this.size=sc.nextInt();
	}
	void inputArray()
	{
		System.out.println("Enter the elements of array :");
		for(int i=0;i<size;i++)
			this.array[i]=sc.nextFloat();
	}
	
	float sum()
	{
		float totalSum=0;
		for(float item: array)
			totalSum+=item;
		return totalSum;
	}
	
	float average()
	{
		float avg=sum()/size;
		return avg;
	}
	
	void printSum()
	{
		System.out.println("Sum of the array is :"+sum());
	}
	
	void printAverage()
	{
		
		System.out.println("Average of the array is :"+average());
	}
	

	public static void main(String[] args) {
		
		sc=new Scanner(System.in);
		SumAndAvgOfArray sumAndAvgOfArray=new SumAndAvgOfArray();
		sumAndAvgOfArray.printSum();
		sumAndAvgOfArray.printAverage();
		sc.close();
	}

}
