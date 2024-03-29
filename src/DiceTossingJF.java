/******************************************
* @Author Joshua Farias
* @since 2020.10.27
* Program: DiceTossingJF.java
* Purpose: roll 2 dice and return frequency
*******************************************/

import java.util.*;

public class DiceTossingJF {
   public static void main(String[] args) {
      int userRolls;
      Scanner input = new Scanner(System.in);
      
      int die1 = (int)(Math.random() * 6) + 1;                
      int die2 = (int)(Math.random() * 6) + 1;
      int faceValue[] = new int [13];        
   
      System.out.println("How many times would you like to roll the dice?:  ");  
      userRolls = input.nextInt();
         
      for (int i = 0; i < userRolls; i++) {
         die1 = (int)(Math.random() * 6) + 1;
         die2 = (int)(Math.random() * 6) + 1;
         int sum = die1 + die2;
         faceValue[sum] = faceValue[sum] + 1;
         System.out.println("\nthe value of die1 is: " + die1);
         System.out.println("the value of die2 is: " + die2);
         System.out.println("the sum of die1 and die2 is: " +sum);    
      }
         System.out.println("\nResults for " + userRolls + " tosses:");
         System.out.println("\nSum of 2 dice:      Frequency:");
      for(int x=2; x < faceValue.length; x++){
         System.out.println(x + "                      " + faceValue[x]);
      } 
         System.out.println("\nBrought to you by Joshua Farias, Oct. 2020");
   }
   
   
}
