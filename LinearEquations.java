public class LinearEquations{
  
  private final int numberOfVariables;
  private final int numberOfEquations;
  private final double[][] coefficientMatrix;
  private final double[] rightHandSide;
  
  
  // constructs a LinearEquations object given the parameters/variables described above
  public LinearEquations(int nVariables, int nEquations, double[][] matrix, double[] b){
    
    this.numberOfVariables = nVariables;
    this.numberOfEquations = nEquations;
    this.coefficientMatrix = matrix;
    this.rightHandSide = b;
  }
    
  // scales the coefficients and the right-hand side value of 
  // equation i by the factor alpha
  // Assumption: 0 <= i < numberOfEquations
  public void scaleEquation(int i, double alpha){
      
 
  }
  
  // replaces equation i2 by the sum of equations i1 and i2
  // Assumption: 0 <= i1, i2 < numberOfEquations
  public void addEquation(int i1, int i2){
    
       
  }
  
  // returns true if the vector represented by the array x is feasible for this
  // system of linear equations, returns false otherwise
  public boolean isFeasible(double[] x){
    
    
  
  }
  
}