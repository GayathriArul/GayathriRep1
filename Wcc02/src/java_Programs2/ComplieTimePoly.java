package java_Programs2;

public class ComplieTimePoly //static polymorphism
{

	public static void abc(int e, double f)
	{
		System.out.println("Datatype oder"+e+f);
	}
	public static void abc(int e)
	{
		System.out.println(e);	
	}
	public static void abc(double e, double f)
	{
		System.out.println(e-f);
	}
	public static void abc(float e,float f)
	{
		System.out.println((f-e)*2);
	}
	//datatype order 
	//count
	//datatype
	public static void main(String[] args) 
	{
		ComplieTimePoly obj=new ComplieTimePoly();
		obj.abc(2000);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static int abc(int a,int b)
	{
		return a+b;

	}
	public static int abc(int a)
	{
		return a;

	}
	public static double abc(double a,double b)
	{
		return a-b;

	}
	public static float abc(float a,float b)
	{
		return a-b;

	}
	public static void main(String[] args)
	{
		int res = abc(10,10);
		System.out.println("result is "+ res);
	}*/

}
