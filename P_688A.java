import java.util.Scanner;
public class P_688A
{
    public static void main(String[] args)
    {
        String res="";
        Scanner meow =new Scanner(System.in);
        String n =meow.next();
        
        res +=n;
        StringBuilder sb = new StringBuilder(res);
        
        res += sb.reverse();
        
        System.out.println(res);
    }
}