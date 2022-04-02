package core_java;
abstract class A4 
{
   abstract void hello();
     
}
class B2 extends A4 
{
	void hello()
	{
	 System.out.println("B..");	
	}
}
class C2 extends A4 
{
	void hello()
	{
	 System.out.println("C..");	
	}
}
public class Abstract_Class
{

	public static void main(String[] args)
	{
		A4 ao=new B2();
		ao.hello();
		
		A4 ao2=new C2();
		ao2.hello();
	      

	}

}
