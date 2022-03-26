package core_java;
import java.util.Scanner;
public class EvenOdd
{

	public static void main(String[] args)
	{
         int x;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter a Number:");
         x=s.nextInt();
         if(x%2==0)
         {
        	 System.out.println("Even Number");
        	 
         }
         else
         {
        	 System.out.println("Odd Number");
         }

	}

}
