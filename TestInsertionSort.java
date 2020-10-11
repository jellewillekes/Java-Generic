// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes
/*n = 2; time = 0.0 
n = 4; time = 0.0 
n = 8; time = 0.0 
n = 16; time = 0.0 
n = 32; time = 0.0 
n = 64; time = 0.0 
n = 128; time = 0.0 
n = 256; time = 0.0 
n = 512; time = 0.0 
n = 1024; time = 0.0 
n = 2048; time = 0.0 
n = 4096; time = 15.0 
n = 8192; time = 47.0 
n = 16384; time = 141.0 
n = 32768; time = 578.0 
n = 65536; time = 2423.0 
n = 131072; time = 9365.0 */
public class TestInsertionSort{
  
  public static void main (String[] args){
    
    int N = Integer.parseInt(args[0]);
    int n = 2;
    create(n,N);
  }
  
  public static void create(int n,int N){ // create an array of N numbers composed of random numbers between 1 and 2n. 
    while (n<=N){
      int[] array = new int[n];
      
      
      for (int i=0;i<n;i++){
        array[i]=(int)(Math.random()*2*n + 1);
      }
      double startTime = System.currentTimeMillis();     
      sortArray(n, array);
      double endTime = System.currentTimeMillis();
      
      System.out.println("n = " + n + "; time = " + (endTime - startTime));
      n=2*n; // multiply n by 2 and start the method create again until n>N.
    }
  }   
  
  public static int[] sortArray(int n, int [] array){  //Sort the array using the insertion sort method. 
    for(int i=1; i<n; i++){
      for (int j = i; j > 0; j--) {
        if (array[j] < array[j-1]){
          
          int t = array[j];
          array[j] = array[j-1];
          array[j-1] = t;
        }
      }
    }    
    return array;
  }
}
 
   for(int i= 0; i<array.length; i++){
     if (x==array[i]){
       return true;
     }
       return false; 
   }
 }
  
 
  