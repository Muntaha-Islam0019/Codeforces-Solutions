import java.util.Scanner ;

public class P_653A {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        int ballCount = sc.nextInt() ;
        int size [] = new int [ballCount] ;
        
        for (int count = 0 ; count < size.length ; count++) {
            size [count] = sc.nextInt() ;
        }
        
        boolean flag = false ;
        outer : 
        for (int count = 0 ; count < size.length ; count++) {
            for (int coun = count+1 ; coun < size.length ; coun++) {
                
                if (size[count] != size[coun]) {
                    if ( ( (int) Math.abs(size[count] - size[coun] ) ) <= 2 ) {
                        
                        for (int cou = coun+1 ; cou < size.length ; cou++) {
                            
                            if ( (size[cou] != size[coun]) && (size[cou] != size[count])) {
                                if ( (( (int) Math.abs(size[cou] - size[coun] ) ) <= 2) && (( (int) Math.abs(size[cou] - size[count] ) ) <= 2)  ) {
                                    flag = true ;
                                    break outer ;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if ( flag == true ) {
            System.out.println ("YES" ) ;
        } else {
            System.out.println ("NO") ;
        }
    }
}