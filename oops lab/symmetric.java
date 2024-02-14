import java.util.Scanner;
class matrix
{
    int row,col;
    int[][] m;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        this.row=sc.nextInt();
        System.out.print("Enter the number of columns : ");
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
    void issymmetric()
    {
        int f=0;
        if(this.row==this.col)
        {
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
              if(this.m[i][j]!=this.m[j][i])
              {
                f=1;
                break;
              }
        if(f==0)
             System.out.println(" The Matrix is a symmetric matrix ");
        else
             System.out.println(" The Matrix is not a symmetric matrix !!");
        }
        else
            System.out.println(" Sorry! Matrix is not a square matrix !!!");
    }
}

public class symmetric  {
    public static void main(String[] args) {
        matrix M=new matrix();
        System.out.println("Enter the matrix : ");
        M.read();
        System.out.println("The Matrix is: ");
        M.display();
        M.issymmetric();
    }
    
}