import java.util.Scanner;
class Prime_or_Not 
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter any integer number : ");
       int n=sc.nextInt();
       if(n==1)
            System.out.println("Niether prime nor composite ");
        else
        {
        int i,fl=1;
       for(i=2;i<=n/2;i++)
       {
            if(n%i==0)
            {
                fl=0;
                break;
            }
       }
       if(fl==1)
            System.out.println("The given number is prime ");
        else
            System.out.println("The given number is not a prime ");
    }
    }
}
