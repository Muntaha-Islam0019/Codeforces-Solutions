import java.util.Scanner;
public class P_472A {
    public static boolean pn(int num)
    {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                return false; // here
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner z = new Scanner(System.in);
        int a=z.nextInt();
        int b=0;
        if(a%2==0 && (a/2)%2==0)
            System.out.println(a/2+" "+a/2);
        else
        {
            b = a / 2;
            for (; b > 0; b--) {
                if (pn(b) || pn(a - b))
                    continue;
                else {
                    System.out.println(b + " " + (a - b));
                    break;
                }
            }
        }

        z.close();
    }
}