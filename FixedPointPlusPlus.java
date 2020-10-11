public class FixedPointPlusPlus { 
public static void main(String args[]) { 
    int n = Integer.parseInt(args[0]);
    int a[] = new int [n]; 
    for(int i = 0; i < n; i++){
      if ( i==0) {
        a[i] = (int) -Math.sqrt(n);
      }
      else {
        int x = (int) ( Math.random() * 3 +1);
        a[i] = a [i-1] + x;
      }  
      if(binarySearch(a,0, n-1) == -1){
        System.out.println("There is no fixed point");
      }
      else{
        System.out.println("Fixed Point is " 
                             + binarySearch(a,0, n-1)); 
      }
    }
 }

 
 
   static int binarySearch(int a[], int low, int high) 
  { 
    if(high >= low) 
    {    
      /* low + (high - low)/2; */
      int mid = (low + high)/2;   
      if(mid == a[mid]) 
        return mid; 
      if(mid > a[mid]) 
        return binarySearch(a, (mid + 1), high); 
      else
        return binarySearch(a, low, (mid -1)); 
    } 
    
    /* Return -1 if there is  
     no Fixed Point */
    return -1; 
  }
   