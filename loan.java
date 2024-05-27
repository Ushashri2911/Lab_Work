import java.util.Scanner;
class Loan
{
    public static void main(String args[])
    {
        double sal;
        String c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Country : ");
        c=sc.next();
        System.out.println("Enter Salary : ");
        sal=sc.nextDouble();
        if(c.equalsIgnoreCase("India") && sal>50000)
        {
            System.out.println("You are eligible for loan");
        }
        else
        {
            System.out.println("You are not eligible for loan");
        }
    }
}