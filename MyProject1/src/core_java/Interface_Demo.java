package core_java;
interface A3
{
	public void show();
	
}
interface B1 
{
	public void show2();
}
class C1 implements A3,B1 
{
	public void show()
	{
		System.out.println("Hello A..");
	}
	public void show2()
	{
	System.out.println("Hello B..");	
	}
}
public class Interface_Demo 
{

	public static void main(String[] args) 
	{ 
		
		C1 c=new C1();
		 c.show();
		 c.show2();
	      

	}

}
