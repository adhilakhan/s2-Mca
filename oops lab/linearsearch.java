import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the elements to the array : ");
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter the element to be searched : ");
        int item = sc.nextInt(); 
        int f=0;
        for (int j=0;j<n;j++)   
        {
            if(item==a[j])
            {
                f=j+1;
                break;
            }
        }
        if(f!=0)
            System.out.println("The item is found at position "+f);
        else
            System.out.println("The item is not found ");
            

    }
}
