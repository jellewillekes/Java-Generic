// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes
public class FixedPoint {
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    int[] a;
    a = new int[n];
    int j = 0;
    int index = 0;
    System.out.print("The generated sequence is : ");  
    for(int i = 0; i < n; i++){ //Creating an array with a for-loop.
      if ( i==0) {
        a[i] = (int) -Math.sqrt(n); //The calcutation of the 0 position of the array.
      }
      else {
        int x = (int) ( Math.random() * 3 +1); //The calculation of the i-th position of the array.
        a[i] = a [i-1] + x;
      }  
      System.out.print(a[i] + " ");  //Write down the array in the interaction menu. 
      if (a[i] == i && j<1) { //If a[i] = i, then there is a fixed point. We only want the first one, so j act like a countdown, hence when the first fixed point is found, it stop looking for fixed point.
        j=1+j;
        index += i;
      }
    }
    if (j==0){
      System.out.println("\nThere is no fixed point");
    }
    else{
      System.out.println("\nThe index of the first fixed point of the array is: " + index); 
      
    }
  }
}

