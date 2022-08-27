package javapgm;

public class ReverseStar 
{

	public static void main(String[] args) 
	{
		int n=3;
		System.out.println("-----------ReverseStar--------- ");
		for(int i=0;i<3;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		int n1=3;
		System.out.println("-----------ReverseStarTirangle--------- ");
		for(int i=0;i<3;i++)
		{
			for (int j1=0; j1<=i; j1++)
	        {
	            System.out.print(" ");
	        }
			for(int j=n1;j>i;j--)
			{
				System.out.print("* ");
				
			}
			System.out.print("   ");
			System.out.println();
		}
		
		
		
		int n2=3;
		System.out.println("-----------Pattern--------- ");
		for(int i=0;i<n2;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		int n3=3;
		System.out.println("-----------StarTirangle--------- ");
		for(int i=0;i<n2;i++)
		{
			for (int j1=n2; j1>i; j1--)
	        {
	            System.out.print(" ");
	        }
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
