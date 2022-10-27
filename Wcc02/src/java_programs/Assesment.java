package java_programs;

class Bag 
{
	String color;
	int no_of_compartments;
	String material;
	
	public void Store()
	{
		System.out.println("Store all things required handy");
	}
	

public static void main()
{
	{
		Bag b=new Bag();
		Bag b1=new Bag();
		
		b.color="red";
		b1.color="brown";
		b.Store();
		b1.Store();
		System.out.print(b.color);
		System.out.print(b1.color);
	}
}}
