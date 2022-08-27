package javapgm;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter elements of the array = ");
		for(int i=0; i<n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array Before Sorting Is =  ");
		for(int i=0; i<n; i++) 
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			} 
		}

		System.out.print("Sortted Array Is =  ");
		for(int i=0; i<n; i++) 
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}
}
