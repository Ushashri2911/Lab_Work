import java.util.*;
class SumEvenOddArray
{
    public static void main(String args[])
    {
        int i,sume=0,sumo=0;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements you want : ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Elements : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
            sume+=a[i];
            }
            else
            {
                sumo+=a[i];
            }
        }
        System.out.println("Sum of Even Numbers : "+sume);
        System.out.println("Sum of Even Numbers : "+sumo);

    }
}