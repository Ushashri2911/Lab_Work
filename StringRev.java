import java.util.Scanner;
class StringRev
{
    public static void main(String args[])
    {
        String s1;
        String s2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        s1=sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            s2=s1.charAt(i)+s2;
        }
        System.out.println(s2);
    }
}