import java.util.Scanner;
public class stingmanupulation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the string : ");
        String str=sc.nextLine();
        System.out.println(" Entered string is : "+str.trim());
        System.out.println(" Length of the Entered string is : "+str.length());
        System.out.println(" Entered string in upper case : "+str.toUpperCase());
        System.out.println(" Entered string in lower case : "+str.toLowerCase());
        System.out.println(" Substring of the entered string from index 5 : "+str.substring(5));
        System.out.println(" Substring of the entered string from index 5 to 10 : "+str.substring(5,10));
    }
}
