public class Knapsack{
  public static void main (String[] args){
    int n = Integer.parseInt(args[0]);
    int V = 1000;
    create(n,V);
  }
  public static void create (int n, int V){
    int [] profit = new int[n];
    int [] volume = new int[n];
    
    for (int i=0; i<n; i++){
      profit [i] = (int)(Math.random()*20 + 1); 
      volume [i] = (int)(Math.random()*5 + 1);
    }
  }
  public static int maximize (int n, int V, int [] profit, int [] volume){
    int[][] P= new int[n+1][V+1];
    for (int j=0; j<=V;j++){
      P[0][j]=0;
    }
    for(int i=1; i<=n; i++){
      for(int j=0;j<=V;j++){
        if(volume[i-1] <= j){
          P[i][j] = Math.max(profit[i-1] + P[i-1][j-volume[i-1]],P[i-1][j]);
        }
        else {
          P[i][j] = P[i-1][j];
        }    
      }
    }
    return P[n][V];
  }
}



   