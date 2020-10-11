/***********************************
  * File: MinMaxMatrix.java
  * Author: Andre Berger
  * 
  * program will take an integer parameter N as input
  * it then calls a method that creates a random NxN matrix with entries
  * from the set {1,....,5N}
  * and then calls a method that determines 
  * the smallest row maximum (definition see exercise X-2)
  **********************************/

public class MinMaxMatrix{
  
  public static void main(String[] args) {
    
    int N = Integer.parseInt(args[0]);
    
    int[][] matrix = RandomMatrix(N);
    
    int minMax = MinMax(matrix);
    
    System.out.println("Smallest row maximum is " + minMax);
    
    
    
    
  }
  
  // this method returns a two-dimensional NxN array
  // of integers, where the entries are from {1,...,5N}
  public static int[][] RandomMatrix(int N){
    int[][] matrix = new int[N][N];
    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
        matrix[i][j] = (int)(Math.random()*5*N+1);
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    return matrix;
  }
  // this method returns the smallest row maximum 
  // of the matrix given as a parameter
  // no variables can be declared inside this method
  // (except for indices that are used in loops)
  public static int MinMax(int[][] matrix){
    for (int i =0;i<N;i++){
      for (int j1=0;j1<N;j1++){
        for (int j2=0;j2<N;j2++){
          if (matrix[i][j1]>matrix[i][j2]){
            
            
          
        }
      }
  }
  
}

