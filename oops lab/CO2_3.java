import java.util.Scanner;
class Employee
{
    int eno;
    String ename;
    double salary;
    Employee()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the employee number : ");
        eno=sc.nextInt();
        System.out.print("Enter the employee name : ");
        ename=sc.next();
        System.out.print("Enter the employee salary : ");
        salary=sc.nextDouble();
    }
void display()
{
    System.out.println("Employee number : "+this.eno);
    System.out.println("Employee name : "+this.ename);
    System.out.println("Employee salary : "+this.salary);
}    
}
public class CO2_3 {
    public static void main(String args[])
    {
        int f=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of employees : ");
        int n = s.nextInt();
        Employee em[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter the details of the "+(i+1)+"th employee ");
            em[i]=new Employee();
        }
        System.out.print("\nEnter the id of the employee you want to search : ");
        int en=s.nextInt();
for(int i=0;i<n;i++)
{
    if(em[i].eno==en)
    {
        f=1;
        System.out.println("The employee deltails is : ");
        em[i].display();
        break;
    }
}
if(f==0)
        System.out.println("\nSorry no such employee !!!");

    }
}
