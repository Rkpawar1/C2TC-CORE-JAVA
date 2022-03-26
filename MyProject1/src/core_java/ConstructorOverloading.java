package core_java;
class A 
{
	 int x,y;
	 String name;
	public A()
	{
		x=10;
		y=20;
		name="India";
	}
	public A(int x)
	{
		this.x=x;
	}
	public A(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public A(int x,int y,String name)
	{
		this.x=x;
		this.y=y;
		this.name=name;
	}
	public void show()
	{
		System.out.println("x is:"+x);
		System.out.println("y is:"+y);
		System.out.println("name is:"+name);
	}
}
public class ConstructorOverloading 
{

	public static void main(String[] args) 
	{
		 A ao=new A();
			ao.show();
			
			A ao2=new A(11);
			ao2.show();
			
			A ao3=new A(12,13);
			ao3.show();
			
			A ao4=new A(14,15,"Pune");
			ao4.show();
		
	}

}
