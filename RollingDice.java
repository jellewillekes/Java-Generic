// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes

public class RollingDice {
  public static void main(String[] args){  
    int trialsN = Integer.parseInt(args[0]); // trialsN is the number of trial  
    int sum = 0;
    int i = 1;
    while (i <= trialsN){ // this program roll a dice until it get 6, It does that trialsN times.
      int randomNumber =(int) ( Math.random() * 6 +1);
      i = i+1;
      sum = sum + 1;
    }
    System.out.println("sum " + 1.0*sum);
    System.out.println("average: " + 1.0*sum/trialsN); // Then it calculate the average by dividing the sum by the number of trials.
  }
}



