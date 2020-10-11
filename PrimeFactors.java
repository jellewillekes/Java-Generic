// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes


public class PrimeFactors  {
  public static void main(String[] args){
    int number = Integer.parseInt(args[0]);
    System.out.print( number + " = ");
    printPrimeFactors(number);
  }
  public static void printPrimeFactors(int number){
    int primeFactor=0 ;
    while (number>1){                        //As long as number >1, start the while loop.
      for(int i=2;i <= number;i++){          //Starting from 2, if the reminder is = 0 then, i must be a primefactor.
        if (number%i==0){
          primeFactor = i;
          break;                             //The smallest primefactor of the number has been found hence stop the loop.
        }
      }
      System.out.print(primeFactor + " � ");
        number = number/primeFactor;        // new number is define and return in the while loop.
    }   
  }
}