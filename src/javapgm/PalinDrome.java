package javapgm;

import java.util.Scanner;

public class PalinDrome 
{
	public static void main(String[] args) 
	{    
		Scanner sc=new Scanner(System.in);
		String input;
		System.out.println("Enter The String : ");
		input=sc.next();
        //Stores the reverse of given string    
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = input.length()-1; i >= 0; i--)
        {    
            reversedStr = reversedStr + input.charAt(i);    
        } 
        System.out.println("Reverse String Is = "+reversedStr);
        
        if(input.equals(reversedStr))  
        {
        	System.out.println("String "+input+" Is Palindrome");
        }
        else
        {
        	System.out.println("String "+input+" Is Not Palindrome");
        }
    }    

}
