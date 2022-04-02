package core_java;

public class Multithreading1 implements Runnable
{
	    public void run() 
	    {  
        System.out.println("Thread has ended"); 
	    }

	public static void main(String[] args) 
	{
		Multithreading1 m=new Multithreading1();
		Thread t=new Thread(m);
		t.start();
		System.out.println("hi");
		
	}

}
