package java_Programs2;

public class Diamond_Solution implements InterfaceI1,InterfaceI2 // is a relationship
{
	// method overriding
	public  void m1()
	{
		System.out.println("Hi Good morning from m1()");
	}
	public static void main(String[] args)
	{
		InterfaceI1 ii1= new Diamond_Solution();
		ii1.m1();
		
		InterfaceI2 ii2=new Diamond_Solution();
		ii2.m1();
	}

}
interface InterfaceI1
{
	//int a; //non static var is not allowed
	static int a=10;
	public static void set() {
	 // static // concrete// no argument method
	
		System.out.println(" Hi from set ");
	}
	abstract public void m1(); // non static // abstract method
	
}
interface InterfaceI2
{
	abstract public void m1();
	
}
