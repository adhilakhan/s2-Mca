import java.util.Scanner;
class shapeoverload {
    double area(double radius)
   {
    return Math.PI*radius*radius;
   }
   int area(int side)
   {
    return side*side;
   }
   double area(double l,double b)
   {
    return l*b;
   }
}
public class shape
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        shapeoverload sh=new shapeoverload();
        System.out.print("Enter the radius of the circle : ");
        double r=sc.nextDouble();
        System.out.print("Enter the length and breadth of the rectangle : ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.print("Enter the side of the square : ");
        int s=sc.nextInt();
        System.out.println("Area of the Circle : "+ sh.area(r));
        System.out.println("Area of the Rectangle : "+ sh.area(l,b));
        System.out.println("Area of the Square : "+ sh.area(s));
    }
}