package java_Programs2;

public class Abstraction extends Activa // child class // is a relationship
{

	// method Overriding -> Implementation for abstract method
	public void run() 
	{
		System.out.println(" He user u can start the vehicle");
		
	}
	public static void main(String[] args) 
	{
		Activa a = new Abstraction();
		a.setting();
		System.out.println(a.a);
		a.run(); // run time polymorphism
	}


}
abstract class Activa // abstract class
{
	int a;
	public void setting ()// non static method // no argument method // concrete method
	{
		System.out.println(" Hey customer u can start setting the millage");
	}
	abstract public void run(); // abstract method
	
	// How to give implementation to the abstract method? -> successive child class
	
}
