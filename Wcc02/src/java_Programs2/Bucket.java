package java_Programs2;

public class Bucket
	{
		public static void main(String[] args)
		{
		Bucket1 b=new Bucket1();
		System.out.println("Color is "+ b.getcolor());
		b.setcolor("Blue");
		System.out.println("the modified color is "+b.getcolor());
		
		


	}}

class Bucket1
{
	private String color;
	private String material;
	private double price;
	private int capacity;
	private String brand;
	
	public String getcolor()
	{
		return color;
	}
	
	public void setcolor(String color)
	{
		this.color=color;
	}
	public String getmaterial()
	{
		return material;
	}
	public double getprice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
}