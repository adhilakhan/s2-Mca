import java.util.Scanner;
class Employee 
{
    int Empid,Salary;
    String Name,Address;
    Scanner sc = new Scanner(System.in);
    Employee()
    {
        
        System.out.print("Enter the Employee ID : ");
        Empid =sc.nextInt();
        System.out.print("Enter the Name : ");
        Name=sc.next();
        System.out.print("Enter the Address : ");
        Address=sc.next();
        System.out.print("Enter the Salary : ");
        Salary=sc.nextInt();
    }
}
class Teacher extends Employee
{
    String dept,sub;
    Scanner sc = new Scanner(System.in);
    Teacher()
    {
        super();
        System.out.print("Enter the Department of the teacher : ");
        dept=sc.next();
        System.out.print("Enter the Subject taught by the teacher : ");
        sub=sc.next();
    }
    void Display()
    {
        System.out.println("Employee ID : "+Empid);
        System.out.println("Teacher Name : "+Name);
        System.out.println("Teacher Address : "+Address);
        System.out.println("Salary : "+Salary);
        System.out.println("Department : "+dept);
        System.out.println("Subject : "+sub);
        
    }
}

public class CO3_2 
{
    public static void main(String[] args) 
    {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter  the number of teachers : ");
    int n=s.nextInt();
    Teacher tr[]=new Teacher[n];
    for(int i=0;i<n;i++)
    {
        System.out.println("\nEnter the details of the "+ i +" th Teacher : ");
        tr[i]=new Teacher();
    }
    System.out.println("\n\t\tDetails of all the Teachers");
    for(int j=0;j<n;j++)
    {
        tr[j].Display();
        System.out.println("\n");
    }
 
}
}