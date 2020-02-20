import java.util.Scanner ;

public class P_620B {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        int seg = 0 ;
        
        for ( int count = a ; count <= b ; count++ ) {
            
            int num = count ;
            
            for ( int digit = num%10 ; num != 0 ; num = num/10 ,digit = num%10 ) {
                
                 switch (digit) {
                    case 0 :
                        seg += 6 ;
                        break ;
                    case 1 :
                        seg += 2 ;
                        break ;
                    case 2 :
                        seg += 5 ;
                        break ;
                    case 3 :
                        seg += 5 ;
                        break ;
                    case 4 :
                        seg += 4 ;
                        break ;
                    case 5 :
                        seg += 5 ;
                        break ;
                    case 6 :
                        seg += 6 ;
                        break ;
                    case 7 :
                        seg += 3 ;
                        break ;
                    case 8 :
                        seg += 7 ;
                        break ;
                    case 9 :
                        seg += 6 ;
                        break ;
                } 
            }
        }
        
        System.out.println(seg);  
        sc.close();
    }
}