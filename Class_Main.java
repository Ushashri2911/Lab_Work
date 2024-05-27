package lab;
interface Person
{
	void speak();
}
class Student_Cse implements Person
{
	public void speak()
	{
		System.out.println("This is Student class...");
	}
}
class Teacher implements Person
{
	public void speak()
	{
		System.out.println("This is Teacher class...");
	}
}
public class Class_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Cse s=new Student_Cse();
		s.speak();
		Teacher t=new Teacher();
		t.speak();
	}

}
