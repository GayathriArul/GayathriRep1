package java_Programs2;

public class RunTimePoly extends Xyz // child
{

	public  void disp()
	{
		System.out.println("Child class ");
	}
public static void main(String[] args)
{
	xyz x=new RunTimePoly();
	x.disp();
}
class xyz
{
	public void disp() //parent
	{
		System.out.println("QSPIDER");
	}
}
}
