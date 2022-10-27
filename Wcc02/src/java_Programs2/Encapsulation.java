package java_Programs2;

public class Encapsulation 
{
	public static void main(String[] args)
	{
	pen p = new pen(); //instantiation
	//System.out.println("brnad is "p.getbrand());
	p.setBrand("Cello");
	System.out.println(" The modified brand value is "+ p.getbrand());
	
	
	
}}

class pen
{
	private String brand; //non static variables
	double price;
	String color;
	String material;
	int size;
	
	public String getbrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	
	public void writting()
	{
		System.out.println("Hey user u can start writting");
	}
}

