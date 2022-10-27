package java_Assignments;

import java.util.Scanner;

public class School123
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name of the school");
		String schname1=scn.next();
		System.out.println("Enter the location of the school:");
		String loc1=scn.next();
		System.out.println("Enter the principal name");
		String princi1=scn.next();
		
		School schoo=new School(schname1,loc1,princi1); // creating an obj
		System.out.println("Enter the options: \n 1==>ADD STUDENT\n2==>REMOVE STUDENT\n 3==>SCHOOL DETAILS\n 4==>STUDENT DETAILS");
		int options=scn.nextInt();
		
		switch(options)
		{
		
			case 1: 
			{
				schoo.addStudent();
			}
			break;
			case 2:
			{
				schoo.removeStudent();
			}
			break;
			case 3:
			{
				schoo.schoolDetails();
			}
			break;
			case 4:
			{
				schoo.stu.studentDetails();
			}
			break;
			case 5:
			{
				System.out.println("EXIT");
			}
			break;
			default:
			{
				System.out.println("Please enter valid option");
			}
		}
	}

}
class Student
{
	String sname;// attributes 1
	int sid;
	long cno;
	
	Student(String sname, int sid, long cno)//parameterised con 2
	{
		this.sname = sname;
		this.sid=sid;
		this.cno=cno;
	}
	public String getSname()//getter no argument non static method
	{
		return sname;
	}
	public int getSid()
	{
		return sid;
	}
	public long getCno()
	{
		return cno;
	}
	public void studentDetails()
	{
		System.out.println("***************8SUTEND DETAILS**********************");
		System.out.println("This name is "+ sname);
		System.out.println("The ID id is "+ sid);
		System.out.println("The contact is "+ cno);
		System.out.println("******************************************************");
	}
}
class School
{
	String schname;
	String schlocation;
	String principal;
	Student stu;
	
	public School(String schname, String schlocation, String principal)
	{
		this.schname=schname;
		this.schlocation=schlocation;
		this.principal=principal;
	}
	public void schoolDetails()
	{
		System.out.println("***********************SCHOOL DETAILS**********************");
		System.out.println("Schoool name "+ schname);
		System.out.println("School location "+ schlocation);
		System.out.println(" The pricipal name is "+ principal);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
	public void addStudent() // helper non static method, no argument method
	{
		if(this.stu == null)//if there is no student add student
		{
		Scanner sc=new Scanner(System.in); // scanner obj
		System.out.println("Enter student name:");
		String name1=sc.next();
		System.out.println("Enter the ID of Student:");
		int id1=sc.nextInt();
		System.out.println("Enter the contact no:");
		long cno1=sc.nextLong();
		
		stu=new Student(name1,id1,cno1);
		System.out.println("Sudent got admitted successfully.............");
		}
		else// Don't add
		{
			System.out.println("Student already exists...BETTER LUCK NEXT ACADEMIC YEAR.....");
		}
	}
	
	public void removeStudent()// non static no argument method
	{
		if(this.stu!=null)
		{
		this.stu=null;
		System.out.println("The Student is removed successfully.........");
		}
		else
		{
			System.out.println("No student exists................");
		}
	}
	
	
}