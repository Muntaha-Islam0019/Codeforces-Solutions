import java.util.Scanner ;

public class P673A {
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        int minCount = sc.nextInt() ;
        int [] mins = new int [minCount] ;
        
        for ( int count =  0 ; count < mins.length ; count++ ) {
            mins [count] = sc.nextInt() ;
        }
        
        int borMin = 0 ;
        int totalMin = 0 ;
        
        for ( int count = 1 ; count <= 90 ; count++ ) {
            
            borMin++ ;
            totalMin++ ;
            
            for ( int c = 0 ; c < mins.length ; c++ ) {
                if ( mins [c] == count ) {
                    borMin = 0 ;
                }
            }
            
            if ( borMin == 15 ) {
                break ;
            }
        }
        
        System.out.println (totalMin) ;
    }
}