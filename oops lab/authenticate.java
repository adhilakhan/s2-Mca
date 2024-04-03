import java.util.Scanner;

class usernameException extends RuntimeException
{
    usernameException(String s)
    {
        super(s);
    }
}
class passwordException extends RuntimeException
{
    passwordException(String s)
    {
        super(s);
    }
}
class usernamepassword
{
    String uname;
    String psswd;
    usernamepassword(String u,String p)
    {
        uname=u;
        psswd=p;
    }
}

public class authenticate {
    public static void main(String arg[])
    {
        int f=0;
        String un,ps;
        usernamepassword unps[]=new usernamepassword[3];
        unps[0]=new usernamepassword("admin","admin");
        unps[1]=new usernamepassword("faculty","faculty");
        unps[2]=new usernamepassword("student","student");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter new username : ");
        un=sc.next();
        System.out.print("Enter new password : ");
        ps=sc.next();
        for(int i=0;i<3;i++)
        {
            if(unps[i].uname.equals(un))
            {
                f=1;
                if(unps[i].psswd.equals(ps))
                {
                    System.out.println("SCCESSFULLY LOGGED IN ");
                }  
                else
                {
                    throw new passwordException("username and password does not match!!!!");
                }
            }
        }
        if(f==0)
        throw new usernameException("Not a valid username!!!");
    }
    
}
