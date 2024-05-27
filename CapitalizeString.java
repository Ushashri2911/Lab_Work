package lab;
import java.util.*;
import java.lang.*;
public class CapitalizeString 
{
	public static void main(String args[])
	{
		String s,s2="";
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		s=sc.nextLine();
		
		s2=s2+s.substring(0, 1).toUpperCase();
		for(i=1;i<s.length();i++)
		{
			if(Character.isWhitespace(s.charAt(i-1)))
			{
				s2=s2+s.substring(i, i+1).toUpperCase();
			}
			else
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
