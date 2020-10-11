public class UnluckyDays {
  public static void main(String[] args){
    int d = 13;
    int beginningYears = Integer.parseInt(args[0]);
    int endYears = Integer.parseInt(args[1]);
    
    
    
    int numberFriday13 = 0;
    for(int i= beginningYears; i <= endYears; i++){
      for(int j= 1; j <= 12; j++){
        int y0 = i - (14 - j)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = j + 12 * ((14 - j)/12) - 2;
        int d0 = (d + x + (31 * m0)/12)%7;
        if (d0 == 5){
          numberFriday13 = numberFriday13 +1;
        }   
      }
    }
    System.out.println(numberFriday13);
  }
}