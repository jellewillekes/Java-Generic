

public class RootOfFunction{
  
  public static void main(String args[]){
    
    double left = Double.parseDouble(args[0]);
    double right = Double.parseDouble(args[1]);
    double epsilon = Double.parseDouble(args[2]);
    
    double root = bisection(left, right, epsilon);
    
    System.out.println("Function has a root at " + root + ".");
    
  }
 
  
  public static double evaluate_f(double x) 
  {
    return (4*Math.pow(x,3) + 5*Math.pow(x,2) - 10*x + 50);
  }
  
  public static double bisection(double left, double right, double epsilon){
    
    while (right-left > epsilon)
    {
      if (evaluate_f(left)*evaluate_f((left+right)/2)<0)
        right=(left+right)/2;
      
      else 
        left  =(left+right)/2;
    }
    return (left+right)/2;
    
  }
}