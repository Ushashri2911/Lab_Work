package lab;

public abstract class PersonDemo 
{
	private int id;
	private String name;
	private double salary;
	public PersonDemo(int id,String name,double salary) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

	public abstract int showID();
	public abstract String showName();
	public abstract double showSalary();
	
}
