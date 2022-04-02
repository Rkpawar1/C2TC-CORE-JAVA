package core_java;

public class Custom_Exception 
{

	public static void main(String[] args) 
	{
		int balance=5000;
		 int withdrawl=6000;
		 try
		 {
		 if(balance<=withdrawl)
	
		  throw new ArithmeticException("Insfficient Balance...!!");
		 
	       balance=balance-withdrawl;
	       
		   System.out.println("Transaction completed...");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		System.out.println("program continuesss....");
		
	}

}
