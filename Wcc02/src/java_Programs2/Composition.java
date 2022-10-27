package java_Programs2;

public class Composition 
{

	public static void main(String[] args)
	{
		Carr c=new Carr("INNOVA",1800000,"WHITE",new Engine(123,5000,"v6"));
		c.carDetails();
		c.eng.EngineDetails();
	}
}
class Engine
{
	int engineno;
	int cc;
	String type;
	
	Engine(int engineno,int cc, String type)
	{
		this.engineno=engineno;
		this.cc=cc;
		this.type=type;
		
	}
	public void EngineDetails()
	{
		System.out.println("***********************Engine Details**********************");
		System.out.println("Engine no is "+ engineno);
		System.out.println("The cc of the engine is "+ cc);
		System.out.println("The Type of the engine is "+ type);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
}
class Carr
{
	String model;
	double price;
	String color;
	Engine eng; //creating a compartment in-order to place the engine inside the car
	
	Carr(String model,double price,String color,Engine eng)
	{
		this.model=model;
		this.price=price;
		this.color=color;
		this.eng=eng;
	}
	public void carDetails() // non static no argument method
	{
		System.out.println("*******************CAR DETAILS)***********************");
		System.out.println("The model of the car is "+model);
		System.out.println("The price of the car is "+price);
		System.out.println("The color of the car is "+color);
	}

}