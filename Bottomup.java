
package bottomup;

public class Bottomup {
static int  fob(int n ){
int [] arr = new int[n+1];
arr[0]=0;
arr[1]=1;
for(int i=2;i<=n;i++){
    arr[i]=arr[i-1]+arr[i-2];
}

return arr[n];
}
    public static void main(String[] args) {
        
        int n=64;
        long start = System.nanoTime();
        System.out.println(new Bottomup().fob(n));
        long end = System.nanoTime();
        System.out.println("the time taken is"+" "+(end-start));
    }
    
}
