package com.epam.collections.collectionTask;

import java.util.Scanner;


public class JoinArray {
	
	static Scanner sc;
	static int array[];
	static int size;
	static String separator;
	
	static void initialize() {
		inputSize();
		array=new int[size];
		inputArray();
	}
	
	static void inputSize()
	{
		System.out.println("Enter size of the array :");
		size=sc.nextInt();
	}
	
	static void inputArray()
	{
		System.out.println("Enter the elements of array :");
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();
	}

	static boolean readSeparator()
	{
		System.out.println("Do you want any separator ? Yes/No\n");
		String yesNo=sc.next();
		if(yesNo.equalsIgnoreCase("yes"))
		{
			separator=sc.next();
			return true;
		}
		else 
			return false;
	}
	
	public static String join(int arr[],String separator)
	{
		StringBuilder output=new StringBuilder();
		for(int i=0;i<size;i++)
		{
			output.append(arr[i]);
			if(i+1<size)
				output.append(separator);
		}
		return output.toString();
	}
	
	public static String join(int arr[])
	{
		return join(array,",");
	}
	
	public static void main(String[] args) {

		sc=new Scanner(System.in);
		initialize();
		if(readSeparator())
			System.out.println(join(array,separator));
		else
			System.out.println(join(array));
	}

}
