package java_Programs2;

public class BottleObject {
	
	public static void main(String[] args)
	{
		Bottle bt=new Bottle("Livpet","yello",15,200);
		System.out.println("***********Bottle**********");
		System.out.println("Brand is "+ bt.brand);
		System.out.println("Color is "+bt.color);
		System.out.println("Size is "+bt.size);
		System.out.println("Price is "+bt.price);

	
}}
class Bottle
{
	String brand;
	String color;
	int size;
	double price;
	Bottle(String brand)
	{
		this.brand=brand;
	}
	Bottle(String brand,String color,int size)
	{
		this(brand);
		this.color=color;
		this.size=size;
	}
	
	Bottle(String brand,String color,int size,double price)//parameterized constructor
	{
		this(brand,color,size);
		this.price=price;
		
	}
}

