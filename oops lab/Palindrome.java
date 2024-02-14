  import java.util.Scanner;
public class Palindrome
 {
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter any integer number : ");
       int n=sc.nextInt();
       int num=n,rem,rev=0;
       while(n!=0)
       {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
       }
       if(rev==num)
            System.out.println(" "+num+" is a palindrome ");
        else
            System.out.println(" "+num+" is not a palindrome ");
       
    }
}
