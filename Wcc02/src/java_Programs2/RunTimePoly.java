package java_Programs2;

public class RunTimePoly extends Poly
{
	static int a=30;
	public void display()
	{
		System.out.println("Child class new home");
	}
	public static void main(String[] args) 
	{
		Poly x=new RunTimePoly();
		x.display();
		Poly x1=new Poly();
		x1.display();
		RunTimePoly x2=new RunTimePoly();
		x2.display();
	
	}
	
}
class Poly
{
	static int a=10;
		
	public void display()
	{
		System.out.println("Parent class old home");
	}
	
	
	
}


