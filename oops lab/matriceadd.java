import java.util.Scanner;
class matrix
{
    int row,col;
    int[][] m;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        this.row=sc.nextInt();
        System.out.println("Enter the number of columns : ");
        this.col=sc.nextInt();
        this.m=new int[row][col];
        System.out.println("Enter the elements of the matrix : ");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
               this.m[i][j]=sc.nextInt();
    }
    void display()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.print(" "+m[i][j]);
            System.out.println();
        }
    }
    void add(matrix A, matrix B)
    {
        if(A.row==B.row&&A.col==B.col)
        {
        this.row=A.row;
        this.col=A.col;
        this.m=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
               this.m[i][j]=A.m[i][j]+B.m[i][j];
        }
        else
            System.out.println(" Sorry! Matrices are not addition compactible !!!");
    }
}
public class matriceadd {
    public static void main(String[] args) {
        matrix M1=new matrix();
        matrix M2=new matrix();
        matrix M3=new matrix();
        System.out.println("Enter the first matrix : ");
        M1.read();
        System.out.println("Enter the second matrix : ");
        M2.read();
        System.out.println("The First Matrix : ");
        M1.display();
        System.out.println("The Second Matrix : ");
        M2.display();
        System.out.println("The Sum of two matrix is : ");
        M3.add(M1,M2);
        M3.display();
    }
    
}
