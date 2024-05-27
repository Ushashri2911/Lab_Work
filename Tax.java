import java.util.Scanner;
class Salary
{
    String name;
    double sal;
    Scanner sc=new Scanner(System.in);
    public void getInfo()
    {
        System.out.println("Enter name : ");
        name=sc.nextLine();
        System.out.println("Enter Annual Income : ");
        sal=sc.nextDouble();
    }
    public void calTax()
    {
       double tax;
       if(sal<=250000)
       {
        tax=0;
       }
       else if(sal>250000 && sal<=500000)
       {
        tax=0.1*250000;
       }
       else if(sal>500000 && sal<=1000000)
       {
        tax=30000+0.2*500000;
       }
       else
       {
        tax=50000+0.3*100000;
       }
       System.out.println("Tax amount is Rs. "+tax);
    }
}
class Tax
{
    public static void main(String[] args)
    {
        Salary i=new Salary();
        i.getInfo();
        i.calTax();
    }
}