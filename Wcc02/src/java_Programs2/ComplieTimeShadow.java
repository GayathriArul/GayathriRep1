package java_Programs2;

public class ComplieTimeShadow extends Abc
{
	static int x=30; // variable shadowing
	public static void set() // method shadowing
	{
		System.out.println("Hello from child");
	}
	public static void main(String[] args) {
		Abc.set();// calling with classname
		System.out.println(x);
		System.out.println(Abc.x);
		System.out.println(ComplieTimeShadow.x);
	}
}


class Abc
{
	static int x=200;//static initializer
	
	public static void set() //static method //no argument method
	{
		System.out.println("Hello from parent");
	}
}