import java.util.Scanner ;

public class P688B {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        int opponents = sc.nextInt() ;
        int days = sc.nextInt() ;
        String [] presence = new String [days] ;
        
        for (int count = 0 ; count < days ; count++) {
            presence [count] = sc.next() ;
        }
        
        int conVictory = 0 , max = 0 ;
        
        for (int count = 0 ; count < days ; count++) {
            
            if ( presence [count].contains("0") ) {
                conVictory++ ;
            } else {
                
                if (conVictory > max) {
                    max = conVictory ;
                }
                conVictory = 0 ;
            }
            
            if (conVictory > max) {
                max = conVictory ;
            }
        }
        
        System.out.println (max) ;
    }
}