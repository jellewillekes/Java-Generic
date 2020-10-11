// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes
import java.util.*;
import java.io.*;

public class Lottery{
  
  public static void main(String[] args){
    
    int numberOfPicks = 6;
    int maximumNumber = 49;
    
    int[][] lots = null;    
    try{
      lots = readLots(args[0]);
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
    
    // here you should correctly use the two methods below
    // and output for each i from {3,4,5,6) how many lots have had i correctly predicted number
    // Example:  Number of winners with 3 correct number: 43;
    int[]winners = new int[4];
    int[]drawnNumbers = new int[numberOfPicks];
    drawnNumbers = draw(numberOfPicks,maximumNumber);
    int[]correctlyPickedNumber=new int[1000];
    correctlyPickedNumber=determineWinners(lots,drawnNumbers);
    for (int i=0;i<1000;i++){       
      if (correctlyPickedNumber[i]==3){
        winners[0]=winners[0]+1;
      }
      else if (correctlyPickedNumber[i]==4){
        winners[1]=winners[1]+1;
      }
      else if (correctlyPickedNumber[i]==5){
       winners[2]=winners[2]+1;
      }
      else if (correctlyPickedNumber[i]==6){
       winners[3]=winners[3]+1;
      }
    }
    System.out.println( "\n Number of winners with 3 correct number: " + winners[0]);
    System.out.println( " Number of winners with 4 correct number: " + winners[1]);
    System.out.println( " Number of winners with 5 correct number: " + winners[2]);
    System.out.println( " Number of winners with 6 correct number: " + winners[3]);
    System.out.println( " Total number of winners: " + (winners[0] +winners[1] + winners[2] + winners[3]));
  }
  // given the number of picks and a maximum number, this method returns an
  // array of 'numberOfPicks' many distinct random integers
  // between 1 and maximumNumber
  public static int[] draw(int numberOfPicks, int maximumNumber){
    int[] drawnNumbers = new int[numberOfPicks];
    
    for (int i = 0; i < numberOfPicks; i++) {
      drawnNumbers[i] = (int)(Math.random()*49 + 1);           //Draw the numbers from the lottery by math.random function. partcipants with more than 3 equivalent numbers will win. 
      
    }   
    System.out.print("The winning lot is: ");
    for (int i = 0; i < numberOfPicks; i++) {
      drawnNumbers[i] = (int)(Math.random()*49+1);              //this generates numbers from [1,49]
      
      for (int j = 0; j < i; j++) {
        if (drawnNumbers[i] == drawnNumbers[j]) {
          i--;                                                 //if drawnNumbers[i] is a duplicate of drawnNumbers[j], then run the for loop of i again. 
          break;
        }
      } 
    }
    for (int i = 0; i < numberOfPicks; i++) {
      System.out.print(drawnNumbers[i]+" ");
      
    }
    return drawnNumbers;
  }
  
  
  
  // given a matrix lots, whose rows contain the picked numbers of the lots,
  // and given the array drawnNumbers, this method returns an integer array 
  // whose (i-1)-th entry is the number of lots with exactly i correctly picked numbers (i=1, ..., 6)
  public static int[] determineWinners(int[][] lots, int[] drawnNumbers){
    int[]correctlyPickedNumber = new int[1000];                     //Create a new array composed of 1000 elements. the elements are the number of correctly guessed number in their lots
    for(int row=0;row<1000;row++){
      int sum =0;
      for(int j=0;j<6;j++){
        for(int i=0; i<6;i++){                        
          if( drawnNumbers[i] == lots[row][j]){                     // compare the drawnNumbers with the chosen number by participants
            sum=sum+1;
          }
        }
      }
      correctlyPickedNumber[row]=sum;
    }
    return correctlyPickedNumber;
  }
  
  public static int[][] readLots(String filename)
    throws java.io.FileNotFoundException{
    File file = new File(filename);
    Scanner input = new Scanner (file);
    
    int numberOfPicks = 6;
    int numberOfLots = input.nextInt();
    
    int[][] lots = new int[numberOfLots][numberOfPicks];
    
    for (int i=0;i<numberOfLots;i++){
      for (int j=0;j<numberOfPicks;j++){
        lots[i][j] = input.nextInt();
      }   
    }
    input.close();
    return lots;   
  }
  
}