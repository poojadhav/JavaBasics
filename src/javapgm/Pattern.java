package javapgm;

public class Pattern 
{
	public static void main(String[] args) 
	{
		int n2=4;
		
		
		System.out.println("-----------StarTirangleWithExtra Stars--------- ");
		for(int i=0;i<n2;i++)
		{
			for (int j1=n2; j1>i; j1--)
	        {
	            System.out.print(" ");
	        }
			for(int j=0;j<(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------StarTirangleWithExtra Stars--------- ");
		for(int i=0;i<n2;i++)
		{
			for (int j1=0; j1<i; j1++)
	        {
	            System.out.print(" ");
	        }
			for(int j=n2;j>(2*i)-1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------ReverseStar--------- ");
		for(int i=0;i<n2;i++)
		{
			for (int j = i; j < n2; j++)  
	        {  
	            System.out.print(" ");
	        }
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("-----------ReverseStar--------- ");
		for (int i = 0; i <n2; i++)   
	    {   
			System.out.print(" ");
	        for (int k = n2; k>i ; k--)  
	        {  
	        	System.out.print("*"); // print the Star  
	        }  
	        System.out.print("\n");   
	    }  
		
		
		System.out.println("-----------star--------- ");
		for(int i=0;i<n2;i++)
		{
			for (int j = 0; j < i; j++)  
	        {  
	            System.out.print(" ");
	        }
			 for (int k =i; k <n2; k++)  
		        {  
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
