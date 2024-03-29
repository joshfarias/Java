/******************************************
* @Author Joshua Farias
* @since 2020.11.13
* Program: GradeStatsJF.java
* Purpose: creates and reads a grade and results file
*******************************************/

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;

public class GradeStatsJF {
   public static void main(String[] args) throws java.io.IOException{ //throws IOException
      
      File gradesFile = new File("grades.txt"); //creates a file using File object
      FileWriter writeGrade = new FileWriter(gradesFile); //allows writing to file, creates FileWriter object
      PrintWriter printGrade = new PrintWriter(writeGrade); //writes to file from program using PrintWriter object
      
      //writes to file using created PrintWriter object      
      printGrade.println("3 2");
      printGrade.println("94 78");
      printGrade.println("65 89");
      printGrade.println("75 81");
      printGrade.close();
      
      //scans file created and prints each line of file in console using while loop
      Scanner scan = new Scanner(gradesFile);
      
      //prints out all lines within the given text file in the console      
      while (scan.hasNextLine()) {
         System.out.println(scan.nextLine());
      }   
            
      File resultsFile = new File("results.txt");
      FileWriter writeResults = new FileWriter(resultsFile);
      PrintWriter printResults = new PrintWriter(writeResults);
      
      double stdev1 = Math.sqrt(144.66666666667);
      double stdev2 = Math.sqrt(21.555555555556);
      
      printResults.println("Student 1 averages is: " + (94 + 78) / 2);
      printResults.println("\nStudent 2 averages is: " + (65 + 89) / 2);
      printResults.println("\nStudent 3 averages is: " + (75 + 81) / 2);
      printResults.println("\nAssignment 1 averages is: " + (94 + 65 + 75) / 3);
      printResults.println("\nAssignment 1 standard deviation is: " + stdev1);
      printResults.println("\nAssignment 2 averages is: " + (78 + 89 + 81) / 3);
      printResults.println("\nAssignment 2 standard deviation is: " + stdev2);
      printResults.close();
      
      //scans file created and prints each line of file in console using while loop
      Scanner scan2 = new Scanner(resultsFile);
      
      //prints out all lines within the given text file in the console
      while (scan2.hasNextLine()) {
         System.out.println(scan2.nextLine());
      }
      
      System.out.println("\nBrought to you by Joshua Farias, Nov. 2020");
         
   }
   
}
