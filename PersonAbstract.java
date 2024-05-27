package lab;

public class PersonAbstract 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Manager's Details");
		Manager m=new Manager(12,"annam",750000,4);
		System.out.println("Manager Id : "+m.showID());
		System.out.println("Manager Name : "+m.showName());
		System.out.println("Manager Salary : "+m.showSalary());
		System.out.println("Manager Year of Experience " +m.showYearOfExperience());
		System.out.println();
		System.out.println("Employee Details");
		Employ e=new Employ(13,"Usha",340000,2019);
		System.out.println("Employee ID : " +e.showID());
		System.out.println("Employee Name "+e.showName());
		System.out.println("Employee Salary "+e.showSalary());
		System.out.println("Employee Year of Joining"+e.showYearOfJoining());
	}

}
