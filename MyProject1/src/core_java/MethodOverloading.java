package core_java;
class A1 
{
	public void show()
	{
		System.out.println("No parameter..");
	}
	public void show(int x)
	{
		System.out.println("x is:"+x);
	}
	public void show(int x,int y)
	{
		int z=x+y;
		System.out.println("Sum is:"+z);
	}
	public double show(double x)
	{
		return x*x;
	}
}
public class MethodOverloading 
{

	public static void main(String[] args) 
	{
		 A1 ao=new A1();
		 ao.show();
		 ao.show(11,12);
		 ao.show(14);
		 System.out.println(ao.show(11.21));
		

	}

}
