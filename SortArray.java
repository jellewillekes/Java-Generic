// file: SortArray.java

import java.util.*;
import java.io.*;

public class SortArray{
 
 public static void main(String[] args){
    double[] array = null;
    try{
      array = readArray(args[0]);
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
     
    System.out.print("Array before sorting: ");
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();

    sort(array);

    System.out.print("Array after sorting: ");
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
  
 public static double[] readArray(String filename){
    throws java.io.FileNotFoundException{
    File file = new File(filename);
    Scanner input = new Scanner (file);
    
    int n = input.nextInt();    
    double[] doubleArray = new double[n];    
    for (int i=0;i<n;i++){
      doubleArray [i] = input.nextDouble();
    }   
    input.close();    
    return doubleArray;
  }
 }
  
  //  returns the index of the minimum element of the array x 
  //  between  position k and the last position
  public static int index_of_min(double[] x, int k){
    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < array.length; j++){
        if (a[i]<a[j]){
         return a[i]; 
        }
      }
    }
  }

  // swaps the elements of the array x at positions j and k
  public static void exchange(double[] x, int j, int k){´   

  }
  
  // sorts the array a in non-decreasing order
    public static void sort (double[] a){
int j,k;
k = 0 ;
while (k < a.length - 1){
j = index of min (a,k);
exchange (a,j,k);
k = k+1;
}
} 
  }

