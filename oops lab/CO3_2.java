import java.util.Scanner;

Scanner sc = new Scanner(System.in);
class Employee 
{
    int Empid,Salary;
    String Name,Address;
    Employee()
    {
        
        System.out.println("Enter the Employee ID : ");
        Empid =sc.nextInt();
        System.out.println("Enter the Name : ");
        Name=sc.nextLine();
        System.out.println("Enter the Address : ");
        Address=sc.nextLine();
        System.out.println("Enter the Salary : ");
        Salary=sc.nextInt();
    }
}
class Teacher extends Employee
{
    String dept,sub;
    Teacher()
    {
        super();
        System.out.println("Enter the Department of the teacher : ");
        dept=sc.nextLine();
        System.out.println("Enter the Subject taught by the teacher : ");
        sub=sc.nextLine();
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
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter  the number of teachers : ");
    n=sc.nextInt();
    Teacher t[]=new Teacher[n];
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter the details of the "+ i + "th Teacher : ");

    }

}
}