public class SumOfPowers {
  public static void main(String[] args){
    int p = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);
    int sum = 0;
    for(int i=1; i<=m; i++){
      int power = 1;
      for(int j=1; j<=p; j++){
        power = i*power;
      }        
      sum = sum + power;
      
      System.out.println( sum );
    }
  
}
}
