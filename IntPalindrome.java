// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes

class IntPalindrome {  
  public static void main(String args[]){  
    int remainder = 0;
    int sum = 0;  
    int number= Integer.parseInt(args[0]); 
    int  originalNumber = number; //Save the orginal number so that we can use it for the output.

    while(number>0){              // Let's take the number 123 as an example. The while loop rebuilds this number from the right to the left. 
      remainder = number%10;      // Calculates the remainder of 10 of the entire number 123. This is 3. 
      sum=(sum*10) + remainder;   // As sum equals 0 in the beginning, we obtain 3. 
      number=number/10;           // The number takes a new value equal to the number divided by ten. Since it is an integer we only obtain the first two digits for the number 123. 
    }                             // Start again the while loop with the new value 12 until number take the value 0. 
    if(originalNumber==sum)       // In this example sum=321 hence 123 is not a palindrome number.
      System.out.println(originalNumber + " is a palindrome number ");    
    else    
      System.out.println(originalNumber + " is not a palindrome");    
  }  
}  