
package algorithms.fobnacci.assgiment;
  import java.util.*; 
public class AlgorithmsFobnacciAssgiment {
   static  int fibnacci (int n){
    if (n==1 || n==2)
        return 1;
    return fibnacci(n-1)+fibnacci(n-2) ;
    }
    

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(fibnacci(8));
        long end = System.nanoTime();
        System.out.println("the time taken is"+" "+(end-start));
        
        
           }
    
}
