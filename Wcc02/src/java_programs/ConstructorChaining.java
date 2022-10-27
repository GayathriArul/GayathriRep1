package java_programs;

class ConstructorChaining
{
	public static void main(String[] args) {
		Television1 tv=new Television1("REALME;",60000,42);
		System.out.println("Brand is "+tv.brand);
		System.out.println("Price is "+tv.price);
		System.out.println("Size is "+tv.size);
		
	}
}
class Television1
{
	String brand;
	double price;
	int size;
	String color;
	String type;
	
	Television1(String brand)
	{
		this.brand=brand;
		System.out.println("Constructor1");
	}
	Television1(String brand,double price,int size)// non parameterized
	{
		this(brand);
		this.price=price;
		this.size=size;
		System.out.println("Constructor2");
	}
	Television1 (String brand,double price,int size,String type)// parameterrized
	{
		this(brand,price,size);
		this.type=type;
		System.out.println("Constructor3");
		
	}
	public void entertainment()// nonstatic methods
	{
		System.out.println("Hey the users are watching bigboss");
		
	}
}
	
