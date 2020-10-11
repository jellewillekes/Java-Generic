public class ContainsValue{
 public static void main (String[] args){
   double[]array = new double[1000000];
   double x = Math.random();
   System.out.println(x);
   for(int i=0;i<1000000;i++){
     array[i]=(double)(Math.random()); 
   }
   sortArray(1000000,array);
   
 System.out.println();    
 System.out.print(containsValue(x, array));  
 }
  public static double[] sortArray(int n, double [] array){  //Sort the array using the insertion sort method. 
    for(int i=1; i<n; i++){
      for (int j = i; j > 0; j--) {
        if (array[j] < array[j-1]){
          
          double t = array[j];
          array[j] = array[j-1];
          array[j-1] = t;
        }
      }
    }    
    return array;
  }

 public static boolean containsValue(double x, double[] array) {
 int a=0;
 int b = array.length-1;
  while ((b-a) > 1 ) { 
        // Find middle point 
        int c = (int)(a+b)/2;   
        if (array[c] == x) {
            return true; 
        }
          else if (array[c] < x) {
            a = c; 
        }
        else {
            b = c; 
    }
  }
 return false;
   
 }
}
