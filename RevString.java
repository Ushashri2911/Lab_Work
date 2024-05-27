package lab;
import java.util.*;
public class RevString 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		s=sc.nextLine();
		String s2="";
		for(int i=s.length();i>0;i--)
		{
			s2=""+s.charAt(i-1);
			System.out.print(s2);
		}
	}

}
