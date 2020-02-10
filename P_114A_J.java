import java.util.Scanner;
public class P_114A_J
{
    public static void main(String []args){
        
        Scanner m=new Scanner (System.in);
        
        int c=2;
        int  k=m.nextInt();
        int l=m.nextInt();
        long res =k;
        while(res<l)
        {
            res=(long)Math.pow(k,c);
            c++;
        }
        if(res==l)
        { System.out.println("YES");
            System.out.println(c-2);}
        else
        {
            System.out.println("NO");
        }
    }
}