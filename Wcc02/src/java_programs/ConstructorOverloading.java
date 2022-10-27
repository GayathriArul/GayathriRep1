package java_programs;

public class ConstructorOverloading 
{
	public static void main(String[] args) 
	{
		// based on matching actual argument's datatype, order and count the respective constructor will get executed
		Television tv=new Television("RealMe",80000,42,"SMART");// instantiation
		System.out.println("********************************Television************************************");
		System.out.println("Brand is "+tv.brand);
		System.out.println("Price is "+tv.price);
		System.out.println("Size is "+tv.size);
		System.out.println("Type is "+tv.type);
		System.out.println("*******************************************************************************");
		tv.entertainment();
	}
}

// constructor overloading with 10 constructors
class Television
{
	String brand;
	double price;
	int size;
	String color;
	String type;
	Television()// non parameterized
	{
		System.out.println("nonparameterized constructor");
	}
	Television (String brand,double price,int size,String type)// parameterrized
	{
		this.brand=brand;
		this.price=price;
		this.size=size;
		this.type=type;
		System.out.println("Constructor1");
		
	}
	Television(String brand,int size,double price)
	{
		this.brand=brand;
		this.size=size;
		this.price=price;
		System.out.println("Constructor2");
	}
	Television(double price,String brand)
	{
		this.price=price;
		this.brand=brand;
		System.out.println("Constructor3");
	}
	Television(int size,String color)
	{
		this.size=size;
		this.color=color;
		System.out.println("Constructor4");
		
	}
	Television(double price,int size)
	{
		this.price=price;
		this.size=size;
		System.out.println("Constructor5");
	}
	Television(int size,double price)
	{
		this.size=size;
		this.price=price;
		System.out.println("Constructor6");
	}
	Television(String brand)
	{
		this.brand=brand;
		System.out.println("Constructor7");
	}
	Television(String brand, String color,String type)
	{
		this.brand=brand;
		this.color=color;
		this.type=type;
		System.out.println("Constructor8");
	}
	Television(int size)
	{
		this.size=size;
		System.out.println("Constructor9");
	}
	public void entertainment()// nonstatic methods
	{
		System.out.println("Hey the users are watching bigboss");
		
	}
}
	
