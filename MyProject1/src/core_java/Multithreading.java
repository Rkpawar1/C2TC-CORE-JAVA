package core_java;
class T extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
			if(i==5)
			{
				Thread.sleep(5000);
			}
			}
			catch(Exception e)
			{
				
			}
			System.out.println("A.."+i);
		}
	}
}
class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("B.."+i);
		}
	}
}
class T2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("C.."+i);
		}
	}
}
public class Multithreading
{

	public static void main(String[] args)
	{
		T a=new T();
		  T1 b=new T1();
		 T2 c=new T2();
		 
		 
		 a.start();
		 b.start();
		 c.start();
		
		 

	}

}
