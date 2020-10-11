// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes
public class Primes3{
  
  public static void main (String[] args){
    
    int n = Integer.parseInt(args[0]);
    int i = 2;
    int count = 0;
    double startTime = System.currentTimeMillis();
    while ( count < n){ //When i is a prime number according to method isPrime2, count increases by 1.
      if (isPrime3(i)== true){
        count++;
      }
      if (count<n){ // as count<n the while loop continues and i increases such that we search for higher prime number.
        i++;
    }
  }
    double endTime = System.currentTimeMillis();
    System.out.print(i);
    System.out.println("\nn = " + n + "; time = " + (endTime - startTime));
  }    
  
    public static boolean isPrime3(int i){
    if (i==1){
      return false;
    }
    else {
      for (int j=2; j<=i/j;j++){ // check the remainder of i/j for every j until j>(i/j).
        if (i%j==0){
          return false; // if remainder of i/j = 0 then i is not a prime number hence go back to while loop.
        }
      }
              return true; // i is a prime number, go back to while loop, increases count by 1.
    }
    
  }
}