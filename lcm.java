public class lcm{
  public static void main (String[] args){
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    System.out.print(lcm(n, m));  
  }
  
  
  public static int lcm(int n, int m){
    for(int i=2;i<=n;i++){
      if (n%i==0 && m%i==0){
        return i;
      }
    }
    return 1;
  }
}
