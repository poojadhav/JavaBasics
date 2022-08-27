package javapgm;

import java.util.Scanner;

public class MaxNoInArray 
{
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
		
		int max=arr[0];
		for(int j=1;j<n;j++)
		{
			if(max<arr[j])
				max=arr[j];
		}
		System.out.println("Max No In Array Is = "+max);
		
		int max1=arr[0];
		for(int j=1;j<n;j++)
		{
			if(max>arr[j])
				max=arr[j];
		}
		System.out.println("Smallest No In Array Is = "+max1);
	}
}
