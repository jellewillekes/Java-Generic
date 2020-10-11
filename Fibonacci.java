public class Fibonacci {
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    int F0 = 0;
    int F1 = 1;
    int Fn = 0;
      for(int i=2;i<=n;i++){
      Fn = F0 + F1;
      F0 = F1;
      F1 = Fn;
      System.out.println(Fn);
      }
      
  }
}
      

    