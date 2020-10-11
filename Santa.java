public class Santa{
  
  public static void main(String[] args){
    
    IntegerStack presents = new IntegerStack();
    double totalNumberOfPresentLeft = 24;
    double numberRedPresentsLeft = 12;
    int alabasterWon = 0;
    int santaWon = 0;
    int ties = 0;
    int n = 0;
    int p = 0;
    while(n<1000){
      createStack(totalNumberOfPresentLeft,numberRedPresentsLeft,presents);
      p = santaGame(presents);
      if (p == -1){
        alabasterWon++;
      }
      else if (p == 1){
        santaWon++;
      }
      else{
        ties++;
      }
      n++;
    }
    System.out.print("Santa won " + santaWon + "times, Alabaster won " + alabasterWon + "times and they tied " + ties );
  }
  
  
  public static void createStack( double totalNumberOfPresentLeft, double numberRedPresentsLeft , IntegerStack presents ){
    
    while (presents.size()<24){
      double p = numberRedPresentsLeft/totalNumberOfPresentLeft;
      if (Math.random()< p){
        presents.push(0);
        totalNumberOfPresentLeft--;
        numberRedPresentsLeft--;
      }
      else {
        presents.push(1);
        totalNumberOfPresentLeft--;
      }
    }
  }
  
  public static int santaGame(IntegerStack presents){
    int santaPresents = 0;
    int alabasterPresents = 0;
    int firstPresent = 0;
    int secondPresent = 0;
    while (presents.size()>1){
      firstPresent=presents.pop();
      secondPresent=presents.pop();
      if ((int)Math.random()*2 == 0){
        if(firstPresent==0 && secondPresent==0){
          santaPresents++;
          presents.push(0);
        }
        else if(firstPresent==0 && secondPresent==1 || firstPresent==1 && secondPresent==0){
          santaPresents++;
          presents.push(1);
        }
        else{
          presents.push(1);
        }
      }
      else {
        if (firstPresent==0 && secondPresent==1 || firstPresent==1 && secondPresent==0){
          alabasterPresents++;
          presents.push(0);
        }
        else if(firstPresent==1 && secondPresent==1){
          alabasterPresents++;
          presents.push(0);
        }
        else if (firstPresent==0 && secondPresent==0){
          presents.push(1) ; 
        }
      }
    }
    if((int)Math.random()*2 ==0){
      firstPresent=presents.pop(); 
      if (firstPresent==0){
        santaPresents++;
      }
    }
    else {
      firstPresent=presents.pop(); 
      if (firstPresent==1){
        alabasterPresents++;
      }
    }
    System.out.print(alabasterPresents + "  ");
    
    if( santaPresents==alabasterPresents ) {
      return 0;
    }
    else if ( santaPresents>alabasterPresents ){
      return 1;
    }
    else {
      return -1;
    }
  }
}





  