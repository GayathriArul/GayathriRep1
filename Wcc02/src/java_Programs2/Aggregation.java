package java_Programs2;

public class Aggregation 
{

	public static void main(String[] args)
	{
		Mobilee m=new Mobilee("iphone","Blue",100000);
		m.mobiledetails();
		m.insertSim("AIRTEL",1234567);
		m.simm.simDetails();
		m.removeSim();
	}

}
class Sim
{
	String serviceprovider;
	int simno;
	
	Sim(String serviceprovider,int simno)
	{
		serviceprovider=serviceprovider;
		simno=simno;
	}
	public void simDetails()
	{
	System.out.println("************************SIM DETAILS*************************");
	System.out.println("The service provider name is "+ serviceprovider);
	System.out.println("The sim number is "+simno);
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	
	}
}
class Mobilee
{
	String brand;
	String color;
	double price;
	Sim simm;
	
	Mobilee(String brand, String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public void insertSim(String serviceprovider,int simno)
	{
		simm=new Sim(serviceprovider,simno);
		System.out.println("The sim got insterted successfully");
	}
	public void removeSim()
	{
		this.simm=null;
		System.out.println("The sim got removed successfully");
	}
	public void mobiledetails()
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@MOBILE DETAILS@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("The brand of the mobile is "+brand);
		System.out.println("The color of the mobile is "+color);
		System.out.println("The price of the mobile is "+price);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
}