import java.util.Scanner;
public class P691A {
    public static void main(String []args){
        
        
        int n;
        
        int c=0;
        Scanner to=new Scanner(System.in);
        
        n=to.nextInt();
        
        if(n==1)
        {
            int s=to.nextInt();
            if(s==1)
                
            { System.out.printf( "YES\n");
            }
            else {
                System.out.printf("NO\n");}
        }
        else {
            for(int i=1;i<=n;i++) {
                int s=to.nextInt();
                if(s==0)
                {
                    c++;
                }
            }
            if(c==1)
            { System.out.printf( "YES\n");
            }
            else
            {
                System.out.printf("NO\n");}
        }
        
    }
}