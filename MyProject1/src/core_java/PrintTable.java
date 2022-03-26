package core_java;
import java.util.Scanner;
public class PrintTable {

	public static void main(String[] args) {
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		x=s.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(x*i);
		}
	}

}
