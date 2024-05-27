package lab;

public class Manager extends PersonDemo
{
	private int yearOfExperience;
	
	public Manager(int id,String name,double salary,int yearOfExperience)
	{
		super(id,name,salary);
		this.yearOfExperience=yearOfExperience;	
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void show()
	{
		System.out.println(yearOfExperience);
	}
	public int showID()
	{
		return getId();
	}
	public String showName()
	{
		return getName();
	}
	public double showSalary()
	{
		return getSalary();
	}
	public int showYearOfExperience()
	{
		return getYearOfExperience();
	}
	
}
