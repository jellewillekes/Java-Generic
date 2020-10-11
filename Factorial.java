public class Factorial { 
  public static void main(String[] args) { 
    int n = Integer.parseInt(args[0]);
    System.out.println("Recursion: " + factorialRecursion(n)); 
  }
  public static int factorialRecursion( int n){
    
    if (n==0){
      return 1;
    }
    else {
      return (n * factorialRecursion(n-1));
    }
  }
}