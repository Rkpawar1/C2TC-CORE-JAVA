package core_java;
import java.util.Scanner;
public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner so=new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter 1st Value:");	
		x=so.nextInt();
		System.out.println("Enter 2nd Value:");	
		y=so.nextInt();
		System.out.println("Enter choice:\n1.Add\n2.Subs\n3.Multi\n4.Div");	
		z=so.nextInt();
		
		switch(z)
		{
			case 1:
			System.out.println("Addition is:"+(x+y));	
			break;
			case 2:
			System.out.println("subs is:"+(x-y));	
			break;
			case 3:
			System.out.println("Multi is:"+(x*y));	
			break;
			case 4:
			System.out.println("Div is:"+(x/y));	
			break;
			default:
			System.out.println("Invalid choice..try later..");
			break;

	}

	}
}
