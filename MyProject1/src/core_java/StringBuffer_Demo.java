package core_java;

public class StringBuffer_Demo 
{

	public static void main(String[] args) 
	{
	StringBuffer b=new StringBuffer("Pawar");
    b.append("Rupesh");
    System.out.println(b);
    System.out.println(b.capacity());
    System.out.println(b.reverse());
    System.out.println(b.getClass());
    System.out.println(b.charAt(5));
    System.out.println(b.hashCode());
    
    
	
	

	}

}
