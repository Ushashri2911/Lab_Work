package lab;

public class Employ extends PersonDemo
{
	private int yearOfJoining;
	public Employ(int id,String name,double salary,int yearOfJoining)
	{
		// TODO Auto-generated constructor stub
		super(id,name,salary);
		this.yearOfJoining=yearOfJoining;
	}
	public int getYearOfJoining()
	{
		return yearOfJoining;
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
	public int showYearOfJoining()
	{
		return getYearOfJoining();
	}

}
