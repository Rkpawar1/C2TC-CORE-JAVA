package core_java;
import java.util.Scanner;
public class ReversePyramid 
{

	public static void main(String[] args)
	{
		int rows;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of Row:");
		rows=s.nextInt();
		for (int i= 0; i<= rows-1; i++)  
		{  
		for (int j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=rows-1-i; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println();  
		}  

	}

}
