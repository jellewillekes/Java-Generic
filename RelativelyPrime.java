public class RelativelyPrime {
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    boolean[][]matrix =  new boolean [n][n];
    for( int row = 0; row<n; row++){
      for(int column = 0; column<n; column++){
        matrix[row][column]=(greatestDivisorRec(row+1,column+1));
      }
    }
    for (int i=0;i<n;i++){
      System.out.print("\n");
      for (int j=0;j<n;j++){
        System.out.print(" " + matrix[i][j]);
      }
    }
  }   
  
  public static boolean greatestDivisorRec( int t, int m){
    if (t%m == 0){ 
      return m==1;
    }
    else {
      return (greatestDivisorRec(m,t%m)); 
    } 
  }
}

