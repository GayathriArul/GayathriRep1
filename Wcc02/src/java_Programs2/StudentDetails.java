package java_Programs2;

public class StudentDetails {

	public  void Student()
	{
		System.out.println("Student deatils");
	}
	public  void Student(String name)
	{
		System.out.println("Name is "+name);
	}
	public  void Student(int age,String city,int id,char gender)
	{
		System.out.println("Age is "+ age);
		System.out.println("City is "+ city);
		System.out.println("Id is " + id);
		System.out.println("Gender is "+gender);
	}
	public  void Student(float weight,long phno)
	{
		System.out.println("Weight is "+weight);
		System.out.println("Ph no is "+phno);
	}
	public  void Student(String abc, String efg)
	{
		System.out.println("The double string method");
	}
	public static void main(String[] args)
	{
		StudentDetails s=new StudentDetails();
		s.Student();
		s.Student("Lokesh");
		s.Student(55f,56567890l);
		s.Student(23,"chennai",4570,'m');			
	}
}


