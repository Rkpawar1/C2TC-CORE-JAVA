package core_java;
class A2 
{
	public void show(int x,int y)
	{
		int z=x+y;
		System.out.println("sum is:"+z);
	}
}
class B extends A2 
{
	public void show(int x,int y)
	{
		int z=x-y;
		System.out.println("subs is:"+z);
	}
}
class C extends A2 
{
	public void show(int x,int y)
	{
		int z=x*y;
		System.out.println("Multi is:"+z);
	}
}
class D extends A2 
{
	public void show(int x,int y)
	{
		int z=x/y;
		System.out.println("Div is:"+z);
	}
}
public class MethodOverriding
{

	public static void main(String[] args) 
	{
		  A2 a=new A2();
			B b=new B();
			C c=new C();
			D d=new D();
			a.show(10,20);
			b.show(10,20);
			c.show(10,20);
			d.show(10,20);
	}

}
