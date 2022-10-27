package java_Programs2;

public class VehicleDriverGeneralization 
{

	public static void main(String[] args) 
	{
		Vehicle v1 =new Bike("KTM","Orange",300000,2, 200);
		Bike b = (Bike) v1;//down casting or generalization
		b.bikeDetails();
		Vehicle v2 = new Jeep("Thor","Black",800000,4, 4);
		Jeep j=(Jeep) v2; //down casting or generalization
		j.jeepDetails();
	}

}
class Vehicle
{
	String type;
	String color;
	double price;
	int noofwheels;
	
	Vehicle(String type, String color, double price,int noofwheels)
	{
		this.type=type;
		this.color=color;
		this.price=price;
		this.noofwheels=noofwheels;
	}
}
class Bike extends Vehicle
{
	int cc;
	Bike(String type, String color, double price,int noofwheels,int cc)
	{
		super(type,color,price,noofwheels);
		this.cc=cc;
	}
	public void bikeDetails()
	{
		System.out.println("*******************Bike details*****************");
		System.out.println("The Type of bike is "+ type);
		System.out.println("The color of the bike is "+ color);
		System.out.println("The pric eo fthe bike is " + price);
		System.out.println("No of wheels are " + noofwheels);
		System.out.println("The cc is "+ cc);
		System.out.println("#################################################");
	}
}
class Jeep extends Vehicle
{
	int noofdoors;
	Jeep(String type, String color, double price,int noofwheels,int noofdoors)
	{
		super(type,color,price,noofwheels);
		this.noofdoors=noofdoors;
		
	}
	public void jeepDetails() 
	{
		System.out.println("*******************Jeep details*****************");
		System.out.println("The Type of jeep is "+ type);
		System.out.println("The color of the jeep is "+ color);
		System.out.println("The pric eo fthe jeep is " + price);
		System.out.println("No of wheels are " + noofwheels);
		System.out.println("No of doors are "+ noofdoors);
		System.out.println("#################################################");
	}
}