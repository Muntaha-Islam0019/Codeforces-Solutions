import java.util.Scanner ;

public class P_255A_K {
    public static void main (String[] args) {
        
        Scanner sc =new Scanner (System.in) ;
        
        int ex = sc.nextInt() ;
        int exCount [] = new int [3] ;
        
        for ( int count = 0 , c = 1 ; c <= ex ; c++ ) {
            
            int num = sc.nextInt() ;
            
            switch (count) {
                case 0:
                    exCount [0] = exCount [0] + num ;
                    break;
                case 1:
                    exCount [1] = exCount [1] + num ;
                    break;
                case 2:
                    exCount [2] = exCount [2] + num ;
                    break;
                default:
                    break;
            }
            
            if (count == 2) {
                count = 0 ;
            } else {
                count++ ;
            }
        }
        
        int max = exCount[0] ;
        int index = 0 ;
        
        for ( int x = 1 ; x < exCount.length ; x++ ) {
            
            if ( exCount[x] > max ) {
                max = exCount[x] ;
                index = x ;
            }
        }
        
        switch (index) {
            case 0 :
                System.out.println ("chest") ;
                break ;
            case 1 :
                System.out.println ("biceps") ;
                break ;
            case 2 :
                System.out.println ("back") ;
                break ;
            default:
                break;
        }
    }
}
