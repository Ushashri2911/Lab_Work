package lab;
import java.util.*;
public class EmployeeDemo
{
	private String name;
	private int yearOfJoining;
	private double salary;
	private String address;
	public EmployeeDemo(String name,int yearOfJoining,double salary,String address) 
	{
		// TODO Auto-generated constructor stub
		this.name=name;
		this.yearOfJoining=yearOfJoining;
		this.salary=salary;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void display()
	{
		
		System.out.printf("%-10s %-13d %-10.2f %-30s%n",name,yearOfJoining,salary,address);
	}

}

