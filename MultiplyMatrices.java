public class MultiplyMatrices{
  
  public static void main (String[] args){
    
    int maximumValueOfN = Integer.parseInt(args[0]);
    int n = 2;
    create(n,maximumValueOfN);
  }
  
  public static void create(int n,int maximumValueOfN){
    while (n<=maximumValueOfN){
      int[][] matrixA = new int[n][n];
      int[][] matrixB = new int[n][n];
      
      for (int i=0;i<n;i++){
        for (int j=0;j<n;j++){
          matrixA[i][j]=(int)(Math.random()*5 + 1);
          matrixB[i][j]=(int)(Math.random()*5 + 1);
        }
      }
       double startTime = System.currentTimeMillis();     
      multiply( matrixA, matrixB, n);
      double endTime = System.currentTimeMillis();
     
      System.out.println("n = " + n + "; time = " + (endTime - startTime));
      n=2*n;
    }
  }
  public static int[][] multiply(int[][] matrixA, int[][] matrixB, int n){
    int[][] matrixC = new int[n][n];  
    for (int i=0;i<n;i++){
      for(int z=0;z<n;z++){
        for (int j=0;j<n;j++){
          matrixC[i][z] = matrixC[i][z] + matrixA[i][j]*matrixB[j][z];
        }
      }
    }
    return matrixC;
  }
}

