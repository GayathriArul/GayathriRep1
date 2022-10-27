package java_Programs2;

public class ObjectClass
{

	public static void main(String[] args) 
	{
		Book b1 = new Book("Red","ChetanBagat",600,580);
		System.out.println(b1); // will print junk because of tostring method()
		Book b2 =new Book("Red","ChetanBagat",600,580);
		System.out.println(b2);
		System.out.println(b1==b2); //false => comparing 2 reference of the objects
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
	}

}
class Book
{
	String color;
	String author;
	double price;
	int noofpages;
	
	//parameterised constructor
	Book(String color, String author, double price, int noofpages)
	{
		this.color=color;
		this.author=author;
		this.price=price;
		this.noofpages=noofpages;
		
	}
	//method overrinding
	//To return attributes of an object
	
	public String toString()
	{
		return "The book color is: " +color+"\nThe author of the book is " + author + "\nThe price of the book is " + price+ "\nNo of pages of the book are " + noofpages;
		
	}
	//method overrinding
	//To compare attributes of 2 object instead of its references
	public boolean equals(Object o)
	{
		Book b = (Book) o;// downcasting
		return this.color.equals(b.color)&& this.author.equals(b.author);
	}
	public int hashCode()
	{
		int hc1 = color.hashCode();
		int hc2 = author.hashCode();
		int hc3 = (int) price;
		int hc4 = noofpages;
		return hc1+hc2+hc3+hc4;
		
	}
	
	//non static no argument method
	public void bookDetails()
	{
		System.out.println("BOOK DETAILS***********%%%%%%%%%%%%%%%%");
		System.out.println("The color is "+color);
		System.out.println("The author is "+ author);
		System.out.println("The price is "+ price);
		System.out.println("The no of pages are"+ noofpages);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
			
}
