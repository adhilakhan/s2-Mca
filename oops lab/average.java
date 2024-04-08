import java.util.Scanner;
class negativeException extends Exception
{
    negativeException(String s)
    {
        super(s);
    }
} 
public class average {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of +ve integers : ");
        int n=sc.nextInt();
        int a;
        double sum=0, avg;
        for(int i=0;i<n;i++)
        
            try
            {
                a=sc.nextInt();
                if(a<0) 
                    throw new negativeException("Input is Negative");
                else
                    sum+=a;
            }
        
        catch(negativeException e)
        {
            System.out.println("The input cannot be negative!!!");
        }
        avg=(sum/n);
        System.out.println("Average = "+avg);
    }

    
}
