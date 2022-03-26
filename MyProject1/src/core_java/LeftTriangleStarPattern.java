package core_java;
import java.util.Scanner;
public class LeftTriangleStarPattern 
{

	public static void main(String[] args) 
	{
		int i, j, row;       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of Row:");
		row=sc.nextInt();
		for (i=0; i<row; i++)   
		{  
      
		for (j=2*(row-i); j>=0; j--)         
		{  
      
		System.out.print(" ");   
		}   
  
		for (j=0; j<=i; j++ )   
		{   
	 
		System.out.print("* ");   
		}   
		
		System.out.println();   
		}   

	}

}
