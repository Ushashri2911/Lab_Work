import java.util.*;
class Fibo
{
    public static void main(String args[])
    {
    int a=0,b=1,c,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number :");
    n=sc.nextInt();
    System.out.print(a+" "+b+" ");
    for(int i=2;i<=n;i++)
    {
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }
    }
}