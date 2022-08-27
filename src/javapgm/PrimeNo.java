package javapgm;

import java.util.Scanner;

public class PrimeNo 
{
	public static void main(String args[])
	{     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No = ");
		int n=sc.nextInt();//it is the number to be checked 

	    boolean flag = false;
	    for (int i = 2; i <= n / 2; ++i) 
	    {
	      if (n % i == 0) 
	      {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(n + " is a prime number.");
	    else
	      System.out.println(n + " is not a prime number.");
	    
	    

		System.out.println("Enter The No = ");
		int n1=sc.nextInt();
		for (int num = 2; num <= n1; num++)
		{
			boolean isPrime = true;
			for (int j=2; j <= num/2; j++)
			{
				if ( num % j == 0)
				{
					isPrime = false;
					break;
				}
			}

			if ( isPrime == true )
				System.out.println(num);
		}
	}    
}
