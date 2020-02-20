import java.util.Scanner ;

public class P_344A {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        int n = sc.nextInt() ;
        String [] arr = new String [n] ;
        int g = 1 ;
        
        arr[0] = sc.next() ;
        
        for ( int x = 1 ; x < n ; x++ ) {
            
            arr[x] = sc.next() ;
            
            if ( arr[x].equals(arr[x-1]) == false ) {
                g++ ;
            }
        }
        
        System.out.println (g) ;
    }
}
