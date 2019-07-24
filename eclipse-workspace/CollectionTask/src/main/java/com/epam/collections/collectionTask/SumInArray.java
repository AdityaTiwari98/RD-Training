package com.epam.collections.collectionTask;

import java.util.Scanner;

public class SumInArray {
	
	public static Scanner sc;
	private int size;
	private int array[][];
	private int sumOfRow[];
	private int sumOfColumn[];
	private int sumOfDiagonal;
	
	private void readMatrix()
	{
		System.out.println("Enter the elements of Matrix\n");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Row :"+(i+1));
			for(int j=0;j<size;j++)
				array[i][j]=sc.nextInt();
		}
	}
	
	public void initialize()
	{
		System.out.println("Enter size of Matrix :");
		size=sc.nextInt();
		array=new int[size][size];
		sumOfColumn=new int[size];
		sumOfRow=new int[size];
		sumOfDiagonal=0;
		readMatrix();
		
	}
	
	private void rowSum()
	{
		for(int i=0;i<size;i++)
		{
			sumOfRow[i]=0;
			for(int j=0;j<size;j++)
				sumOfRow[i]+=array[i][j];
		}
	}
	
	private void columnSum()
	{
		for(int i=0;i<size;i++)
		{
			sumOfColumn[i]=0;
			for(int j=0;j<size;j++)
				sumOfColumn[i]+=array[j][i];
		}
	}
	
	private void diagonalSum()
	{
		for(int i=0;i<size;i++)
		{
			sumOfDiagonal+=array[i][i];
		}
	}
	
	public void calculateSum()
	{
		columnSum();
		diagonalSum();
		rowSum();
	}
	
	private void printMatrixWithRowSum()
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
				System.out.print(array[i][j]+" ");		
			System.out.println("| "+sumOfRow[i]);
		}
	}
	
	private void printColumnSum()
	{
		for(int i=0;i<size;i++)
			System.out.print("_ ");
		System.out.println("/");
		for(int i=0;i<size;i++)
			System.out.print(sumOfColumn[i]+" ");
	}
	
	public void printMatrix()
	{
		printMatrixWithRowSum();
		printColumnSum();
		System.out.println(" "+sumOfDiagonal);
	}
	

	public static void main(String[] args) {
		
		sc=new Scanner(System.in);
		SumInArray sumInArray=new SumInArray();
		sumInArray.initialize();
		sumInArray.calculateSum();
		sumInArray.printMatrix();
		sc.close();
	}

}
