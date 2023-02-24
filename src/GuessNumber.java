/***********************************************************************
 * 
 *      Program Name: GuessNumber.java
 * 
 *      Description: Generates a random number between 0-100 and
 *      prompts user to guess the generated number giving feedback that
 *      is relative the the user's guess.
 * 
 *      Language: Java
 * 
 *      Date: 10/2/2020
 * 
 *      Author: Joshua Farias
 * 
 ***********************************************************************/

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
   public static void main (String[] args) {
      //step 1: generate a random integer in the range of [0, 100] = [0, 101]
      int number = (int) (Math.random() * 101 );
      
      int guessed = -1;
      while (guessed != number) {      
         //step 2: prompt the user to guess a number
         System.out.print("Please enter your guessed number: ");
         Scanner input = new Scanner(System.in);
         guessed = input.nextInt();
         //step 3: compare the guessed number with the generated number
         if(guessed == number)
         //step 4: print out the tracking results
            System.out.println("Yes, " + number + " is the correct number.");
         else if(guessed < number) {
            System.out.println("Sorry, the guessed number is too small.");
         }
         else {
            System.out.println("Sorry, the guessed number is too big.");
         }
      }
   }

}
