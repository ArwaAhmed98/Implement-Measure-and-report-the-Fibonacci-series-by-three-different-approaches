
package topdownfoban;

public class TopDownFoban {
    static int [] arr = new int [150];
    TopDownFoban(int []arr){
    for (int i=0;i<150;i++){
    arr[i]=-1;
    }}
 public static int Fob(int n){
     //create arr
    //before doing fob check if the value is already exist
    // y3ny lw el mkan zero 5zn 
    // lw msh zero return el value
   
    
   if (arr[n]<0){
       if(n==0){
           arr[n]=0;
       }
       else if(n==1){
           arr[n]=1;}
       
    else{
        arr[n]=Fob(n-1)+Fob(n-2);
       }}
    return arr[n];}

 
    public static void main(String[] args) {
        int n=64;
         long start= System.nanoTime();
        System.out.println(new TopDownFoban(arr).Fob(n));
         long end = System.nanoTime();
         System.out.println("the time taken is"+" "+(end-start));
    }
    
}
