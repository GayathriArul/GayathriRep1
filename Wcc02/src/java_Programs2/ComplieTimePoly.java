package java_Programs2;

public class ComplieTimePoly {

	public static int abc(int a,int b)
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
	}

}
