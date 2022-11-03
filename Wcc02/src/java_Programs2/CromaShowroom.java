package java_Programs2;

public class CromaShowroom {

	public static void main(String[] args)
	{
		Laptop lp[]=new Laptop[5]; // Initialization
		//adding the elements into an arry 
		
		lp[0]=new Laptop("DELL","SILVER",6000000,32);
		lp[1]=new Laptop("SAMSUNG","BLACK",5000000,64);
		lp[2]=new Laptop("APPLE","SILVER",10000000,128);
		lp[3]=new Laptop("LENOVO","BROWN",7000000,73);
		lp[4]=new Laptop("MSS","PINK",45678223,88);
			
		//accessing array elements
		for(int i=0; i<=lp.length-1;i++)
		{
			System.out.println(lp[i]);
		}

	}

}
class Laptop
{
	String brand;
	String color;
	double price;
	int ram;
	Laptop()
	{
		System.out.println("TEST TES TEST");
	}
	
	Laptop(String brand, String color, double price, int ram)
	{
		this.brand = brand;
		this.color=color;
		this.price=price;
		this.ram=ram;
	}
	public String toString()
	{
		return brand+"\n"+color+"\n"+price+"\n"+ram;
	}
}
