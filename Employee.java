
package lab;

public class Employee {
	int eid;
	String ename;
	double esalary;
	public Employee() 
	{
		// TODO Auto-generated constructor stub
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	

	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getEsalary() {
		return esalary;
	}


	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e=new Employee();
		
		e.setEid(45);
		e.setEname("Ushashri");
		e.setEsalary(50000);
		
		System.out.println("Employee Id is "+e.getEid());
		System.out.println("Employee name is "+e.getEname());
		System.out.println("Employee Salary is "+e.getEsalary());
		
	}

}
