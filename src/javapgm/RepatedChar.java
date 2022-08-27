package javapgm;

import java.util.Scanner;

public class RepatedChar 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input;
		System.out.println("Enter The String : ");
		input=sc.next();
		char search;             // Character to search is 'a'.
		System.out.println("Enter The Charcter : ");
		search=sc.next().charAt(0);

		int count=0;
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i) == search)
				count++;
		}

		System.out.println("The Character '"+search+"' appears "+count+" times.");
	}
}
