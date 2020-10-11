// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes
public class DigitSum {
  public static void main(String[] args){
    int number = Integer.parseInt(args[0]);
    System.out.println("The digit sum of " + number + " is " + digitSum(number));
    System.out.println("The total digit sum of " + number + " is " + totalDigitSum(number));
  }
  
  public static int digitSum(int number){ // isolate each digit then add them up
    int digit;
    int digitSum = 0;
    while (number >0){ // e.g: number = 123 / number = 12 / number = 1 
      digit = number%10; // 123%10=3 / 12%10=2 / 1%10=1
      number = number/10; // 123/10=12 / 12/10=1 / 1/10=0
      digitSum = digitSum + digit; // digitSum = 0+3 = 3 / digitSum = 3+2 = 5 / digitSum = 5 + 1 = 6 
    }
    return digitSum;
  }
   public static int totalDigitSum(int number){ // if the digitSum from the method digitSum(number) is strictly greater than 9, substract until it smaller or equal to 9
     int totalDigitSum = digitSum(number);
     while (totalDigitSum>9){ 
      totalDigitSum =  totalDigitSum-9;
}
     return totalDigitSum;
   }
}

  
  