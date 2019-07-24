package com.epam.collections.collectionTask;

import java.util.Scanner;

public class Pyramid {
	
	public static void rowOfPyramid()
	{
		
	}
	
	public static void printPyramid(int height,int X)
	{
		int h=1;
		int element=0;
		while(h<=height)
		{
			int nItem=0;
			while(nItem!=h)
			{
				System.out.print(element+"\t");
				element+=X;
				nItem++;
			}
			h++;
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of pyramid :");
		int height=sc.nextInt();
		System.out.println("Enter X :");
		int X=sc.nextInt();
		printPyramid(height, X);
		sc.close();
	}

}
