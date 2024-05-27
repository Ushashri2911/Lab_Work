package com.thread;
import java.util.*;
public class Armstrong {
	int n;
	Scanner sc=new Scanner(System.in);
	public void getNum()
	{
		System.out.println("Enter Number : ");
		n=sc.nextInt();
	}
	public void calc()
	{
		int rev=0,rem=0;
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev+rem*rem*rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong a=new Armstrong();
		a.getNum();
		a.calc();
	}

}
