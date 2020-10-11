public class PerfectNumber {
  public static void main(String[] args){
    int number = Integer.parseInt(args[0]);
    if (isPerfectNumber(number)==true){
      System.out.println(number + " is a perfect number");
    }
    else if (isPerfectNumber(number)==false){
      System.out.println(number + " is not a perfect number");
    }
  }   
  
  
  public static boolean isPerfectNumber(int number){
    int sum=0;
    for (int i = 1; i <= number/2; i++) { // divide number by every i<=number/2, if remainder = 0 then i is a divider of number.
      if (number%i == 0) {
        sum = sum + i; 

      }
      else {
        
      }
    }
     return sum==number; //if all the divider are equal to number, then it is a perfect number hemce return true.
  }
}


     