import java.util.Scanner;
class complex{
int a,b;
void read()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the real part of the complex number : ");
    this.a=sc.nextInt();
    System.out.print("Enter the imaginary part of the complex number : ");
    this.b=sc.nextInt();
}
void dispaly()
{
    System.out.println(" "+this.a+" + i"+this.b);
}
void add(complex x,complex y)
{
    this.a=x.a+y.a;
    this.b=x.b+y.b;
}
}
public class complexadd 
{
    public static void main(String arg[])
    {
        complex C1=new complex();
        complex C2=new complex();
        complex C3=new complex();
        System.out.println("Enter the first complex number : ");
        C1.read();
        System.out.println("Enter the second complex number : ");
        C2.read();
        System.out.print("The First complex number : ");
        C1.dispaly();
        System.out.print("The second complex number : ");
        C2.dispaly();
        System.out.print("The sum of the complex numbers is : ");
        C3.add(C1,C2);
        C3.dispaly();


    }
}
