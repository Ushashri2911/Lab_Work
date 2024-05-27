package lab;

public class Emp 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		EmployeeDemo emp1=new EmployeeDemo("Robert",1994,50000,"64C-WallsStreat");
		EmployeeDemo emp2=new EmployeeDemo("Sam",2000,80000,"68D-WallsStreat");
		EmployeeDemo emp3=new EmployeeDemo("John",1999,40000,"26B-WallsStreat");
		System.out.println("Name    Year of Joining   Salary    Address");
		emp1.display();
		emp2.display();
		emp3.display();

	}

}
