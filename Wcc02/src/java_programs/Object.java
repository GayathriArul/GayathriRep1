package java_programs;

class Object 
{
	private static void main() 
	{
		Table t = new Table();
		System.out.println(t.color);
		t.color = "BROWN";
		System.out.println(t.color);
		t.placingsubstance();
		t.Studying();
	}

}
class Table
{
	String color;
	double price;
	String material;
	int no_of_legs;
	
	//NO ARGUMENT CONSTRUCTOR IS BEING CREATED BY OMPLIER (IMPLICITLY)
	public void placingsubstance () 
	{
		System.out.println("Hey u can place an obj");
		
	}
	public void Studying()
	{
		System.out.println("Hey u can read");
	}
	
	Table()
	{}
	
	
	

}


