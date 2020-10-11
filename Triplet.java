// 200 + 375 + 425 = 1000
// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes

public class Triplet {
  public static void main(String[] args){
    int perimeter = Integer.parseInt(args[0]); 
    for(int a=1; a <= perimeter/3 ; a++){
      for (int b = a + 1; b <= perimeter/2; b++){
        int c = perimeter - a - b;
        if ( a*a + b*b == c*c ){
          System.out.println(a + " + " + b + " + " + c + " = " + perimeter);
        }
      }
    }
  }
}