import java.util.*;

  public class Bins {
  public static void main (String[] args){
    int capacity  = Integer.parseInt(args[0]); 
    int numberOfItem  = Integer.parseInt(args[1]); 
    int[] weights = new int[numberOfItem];
    for (int i = 0;i<numberOfItem;i++){
      weights[i] = (int)(Math.random()*(capacity)+1);
    }
    System.out.println(numberOfBins(weights,capacity));
  }
  
  
  
// returns the number of bins needed by using the first-fit approach
// for the given weights and capacity
  public static int numberOfBins(int[] weights, int capacity ){
    ArrayList<Integer> bin2 = new ArrayList<Integer>();
  int trash = 0;    //What you put in the bin is trash.
  bin2.add(0);
  for(int i = 0; i<weights.length; i++){
    for(int j = 0; j<bin2.size() ; j++){
      if ( bin2.get(j)+weights[i]<=capacity){
        trash = bin2.get(j)+weights[i];
        bin2.set(j,trash);
      }
      else if (j+1==bin2.size()){
        bin2.add(0);
      }
    }
  }
      return bin2.size();
      }


}