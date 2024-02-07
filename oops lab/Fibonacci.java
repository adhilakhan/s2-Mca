class Fibonacci
{
    public static void main(String args[])
    {
        System.out.print("\n The fibonacci series of "+args[0]+" terms is : ");
        int first=-1,second=1,current,i=1,n;
        n=Integer.parseInt(args[0]);
        while(i<=n)
        {
            current=first+second;
            System.out.print("  " + current);
            first = second;
            second=current; 
            i++;
        }
    }
}