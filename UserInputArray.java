package lab;
import java.util.*;
public class UserInputArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n[]=new int[10];
		System.out.println("Enter 10 Numbers : ");
		for(int i=0;i<10;i++)
		{
			n[i]=sc.nextInt();
		}
		int min=n[0];
		int max=n[0];
		for(int i=1;i<10;i++)
		{
			if(min<n[i])
			{
				min=n[i];
			}
			if(max>n[i])
			{
				max=n[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
