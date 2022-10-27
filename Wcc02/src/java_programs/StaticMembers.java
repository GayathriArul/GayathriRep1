package java_programs;

class StaticMembers
{
	static int x; //static variable 
	
	static int y=10; //Single line static initializer
	
	static
	{
		System.out.println(" Hello from multiline static initializer");
	}
	
	public static void disp() // static method no arugument method
	{
		System.out.println(" Hello world static method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(StaticMembers.x); //access with class name
		
		disp();
		
		StaticMembers.disp(); //access using class name
		
		System.out.println(StaticMembers.y);// access using class name - Single line static initializer
		
	}

}
