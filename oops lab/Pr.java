import java.util.Scanner;
class Products
{
int p_code;
String p_name;
double price; 
void read_data()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter product code:");
    this.p_code=sc.nextInt();
    System.out.print("Enter product name:");
    this.p_name=sc.next();
    System.out.print("Enter product price:");
    this.price=sc.nextDouble();
}
void display_data()
{
    System.out.println("Product Code : "+this.p_code);
    System.out.println("Product Name : "+this.p_name);
    System.out.println("Product Price : "+this.price);
}
void lowestprice(Products p1,Products p2,Products p3)
{
    if(p1.price<p2.price && p1.price<p3.price)
    {
        this.p_code=p1.p_code;
        this.p_name=p1.p_name;
        this.price=p1.price;
    }
    else 
    {
         if(p2.price<p3.price)
    {
        this.p_code=p2.p_code;
        this.p_name=p2.p_name;
        this.price=p2.price;
    }
    else
    {
        this.p_code=p3.p_code;
        this.p_name=p3.p_name;
        this.price=p3.price;
    }
    }
}
}
class Pr
{
 
    public static void main(String args[]) 
    {
        Products  P1 = new Products();
        Products  P2 = new Products();
        Products  P3 = new Products();
        
        System.out.println("Enter the data to the first obect : ");
        P1.read_data();
        System.out.println("Enter the data to the second object :");
        P2.read_data(); 
        System.out.println("Enter the data to the third object :");
        P3.read_data(); 
        System.out.print("Data of product with lowest price is : \n");
        Products P4=new Products();
        P4.lowestprice(P1,P2,P3);
        P4.display_data();  
    }
}
