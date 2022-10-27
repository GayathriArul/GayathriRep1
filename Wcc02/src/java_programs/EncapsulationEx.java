package java_programs;

class EncapsulationEx 
{
	public static void main(String[] args)
	{
		pen p = new pen(); //instantiation
		System.out.println("brand is "+p.getbrand());
		
	}
	
	
}


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
	public void writting()
	{
		System.out.println("Hey user u can start writting");
	}
}

