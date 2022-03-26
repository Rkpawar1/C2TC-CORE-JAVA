package core_java;
import java.util.Scanner;
public class SumofNaturalNo {

	public static void main(String[] args)
	{
   
        int num , i = 1, sum = 0;
        Scanner so=new Scanner(System.in);
        System.out.println("Enter  no:");
        num=so.nextInt();
        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
	}

}
