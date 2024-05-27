package lab;
import java.util.*;
class Student
{
	int roll_number;
	String name;
}
class MarkDetails extends Student
{
	int i;
	double marks[]=new double[5];
	Scanner sc=new Scanner(System.in);
	void getDetails()
	{
	System.out.println("Enter Student Roll_Number : ");
	roll_number=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter student name : ");
	name=sc.nextLine();
	System.out.println("Enter Five subject marks : ");
	for(i=0;i<5;i++)
	{
		marks[i]=sc.nextDouble();
	}
	}
	void result()
	{
		double res=0,avg;
		for(i=0;i<5;i++)
		{
			res= res+marks[i];
		}
		avg=res/5.0;
		System.out.println("Result : "+avg);
	}
}
class Result extends MarkDetails 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Result m=new Result();
		m.getDetails();
		m.result();
		

	}

}
