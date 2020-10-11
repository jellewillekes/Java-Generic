public class FixedPointPlus {
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    int a[] ;
    a = new int[n];
    System.out.println("Fixed Point is "   + bisection(a ,0, n-1));
    for(int i = 0; i < n; i++){
      if ( i==0) {
        a[i] = (int) -Math.sqrt(n);
      }
      else {
        int x = (int) ( Math.random() * 3 +1);
        a[i] = a [i-1] + x;
      }
          System.out.print(a[i]);
    }
  }

  public static int bisection(int [i] a, int low, int high){
     for(int i = 0; i < n; i++){
   int middle = (low + high)/2;
    if (middle == a[middle]){
      return middle;
    }
    else if(middle > a[middle]){ 
      return bisection(a, (middle+1), high); 
    }
    else{
      return bisection(a, low, (middle-1)); 
  }
}
}