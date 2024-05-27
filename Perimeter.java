import java.util.Scanner;
class Perimeter
{
    public static void main(String args[])
    {
        double peri;
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Between 1 to 3: ");
        System.out.println("1. Perimeter of a Square ");
        System.out.println("2. Perimeter of Rectangle ");
        System.out.println("3. Perimeter of Circle ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter side of Square : ");
            double sq=sc.nextDouble();
            peri=4*sq;
            System.out.println("Perimeter of Square is "+peri);
            break;
            case 2:
            System.out.println("Enter Length and Breadth : ");
            double l=sc.nextDouble();
            double b=sc.nextDouble();
            peri=2*(l+b);
            System.out.println("Perimeter of Rectangle is  "+peri);
            break;
            case 3:
            System.out.println("Enter Radius of Circle : ");
            double r=sc.nextDouble();
            peri=2*3.14*r;
            System.out.println("Perimeter of Circle is  "+peri);;
            break;
            default:
            System.out.println("Invalid Input");
            break;
        }
    }
}
