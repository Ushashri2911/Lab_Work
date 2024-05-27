package lab;
import java.util.*;
public class StudentName 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String key;
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number elements you want to enter : ");
		n=sc.nextInt();
		sc.nextLine();
		String s1[]=new String[n];
		System.out.println("Enter Students Names : ");
		for(i=0;i<n;i++)
		{
			s1[i]=sc.nextLine();
		}
		
		System.out.println("Enter student name that you want to find : ");
		key=sc.nextLine();
		for(i=0;i<n;i++)
		{
			if(key.equals(s1[i]))
			{
				System.out.println("Student name is found : "+key);
			}
		}
		
	}

}



