public class GCD {
  public static void main(String[] args){
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    
    System.out.println("Recursive: " + greatestDivisorRec(n,m));
    System.out.println("WhileLoop: " + greatestDivisorWhile(n,m));
    
  }
  public static int greatestDivisorRec( int n, int m){
    
    if (n%m == 0){ 
      return m;
    }
    else {
      return (greatestDivisorRec(m,n%m)); //In the example 6(m) 8(n): 8%6 == 2. Replace m by 2. Replace n by 6. Go through the code again. Return will be 2 as 6%2 = 0.
    }
  }
  public static int greatestDivisorWhile( int n, int m){
    while (m > 0){
      int a = n;
      int b = m;
      m = a%b; //6 becomes 2
      n = b; //8 becomes 6
    }
    return n;
  }
}
