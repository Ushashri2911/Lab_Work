package lab;
import java.util.*;
public class SwapNum 
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	public void getNum()
	{
		System.out.println("Enter two Number : ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void swap()
	{
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SwapNum s=new SwapNum();
		s.getNum();
		s.swap();
	}

}
