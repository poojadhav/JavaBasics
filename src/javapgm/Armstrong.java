package javapgm;
import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number=sc.nextInt();
		Armstrong arm=new Armstrong();
		arm.armstrong(number);
		
	}
	
	public void armstrong(int n)
	{
		int no=n,num=0,sum=0;
		while(no>0)
		{
			num=no%10;
			no=no/10;
			sum=sum+(num*num*num);
		}
		if(n==sum)
		{
			System.out.println("Given Number Is Armstrong....");
		}
		else
		{
			System.out.println("Given Number Is Not Armstrong....");
		}
	}
}
