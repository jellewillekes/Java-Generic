public class Duplicate{
 public static void main (String[] args){
   int[]array = new int[10];
   for(int i=0;i<10;i++){
     array[i]=(int)(Math.random()*30);
     System.out.print(array[i]+" "); 
   }
 System.out.println();    
 System.out.print(duplicate(array));  
 }

 public static boolean duplicate (int[] array){
   for(int i= 0; i<array.length; i++){
   for(int j= i+1; j<array.length; j++){
     if (array[i]==array[j]){
       return true;
     }
      }
     }
       return false; 
   }
 }
 
