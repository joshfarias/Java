/******************************************
* @Author Joshua Farias
* @since 2020.10.12
* Program: PasswordCheckerJF.java
* Purpose: Checks to see if a given password meets the requirements
*******************************************/

import java.util.Scanner;

public class PasswordCheckerJF {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       
      System.out.println("The rules for a valid password are as follows:");
      System.out.println("-   A password must have at least eight characters and less than thirteen characters.");
      System.out.println("-	A password consists of only letters and digits.");
      System.out.println("-	A password must contain at least two digits.");
      System.out.println("-	A password must have at least one upper case letter and one lower case letter."); 
        
      System.out.print("\nPlease enter a password that meets the aformentioned requirements: ");
      String password = input.nextLine();
        
      if (passwordChecker(password)) {
         System.out.println("Password is valid.");
      }
      
      else {
         System.out.println("Password is invalid.");
      }
      
   }
        
   public static boolean passwordChecker(String password) {
      boolean passwordChecker = true; //checks to see if password meets parameters
       
      if (password.length() <= 7) { //password is to have at least 8 characters 
         passwordChecker = false; //since passwords are to be no shorter than 8 characters this defines the parameter using the boolean data types of true and false
         System.out.println("ERROR: Password is too short.");
      }      
                   
      else if (password.length() > 13) { //password is to have no more than 13 characters
         passwordChecker = false;
         System.out.println("ERROR: Password is too long.");
      }
         
      else { // A password is to have only letters and digits
      //scans the user entered password and keeps count for the variables
      //specific variable requirements are assigned later within the program 
         int digitCount = 0;
         int upperCaseCount = 0;
         int lowerCaseCount = 0;
         int letterCount = 0;
         for (int pwd = 0; pwd < password.length(); pwd++) {
            if (isLetter(password.charAt(pwd)) || isNumber(password.charAt(pwd))) {
               if (isNumber(password.charAt(pwd))) {
                  digitCount++;
                  }
               if (isLetter(password.charAt(pwd))) {
                  letterCount++;
                  }
               if (isUpperCase(password.charAt(pwd))) {
                  upperCaseCount++;
                  }
               if (isLowerCase(password.charAt(pwd))) {
                  lowerCaseCount++;
                                         
               }
               
            }
            
            else { //if user enters a special character such as "!" this message will appear
               System.out.println("ERROR: Password should contain only numbers and letters.");
               passwordChecker = false;
            }
            
            
            
         }
         //sets variable requirements                      
         if (digitCount < 2) { //password is to have at least 2 digits     
            System.out.println("ERROR: Password does not contain enough digits.");
            passwordChecker = false;
         }
         
         if (letterCount < 1) { //password must contain letters
            System.out.println("ERROR: Password must contain letters.");
            passwordChecker = false;
         }
         
         if (upperCaseCount < 1) { //at least 1 uppercase letter
            System.out.println("ERROR: Password does not have any uppercase letters.");
            passwordChecker = false;
         }
         
         if (lowerCaseCount < 1) { //at least 1 lowercase letter
            System.out.println("ERROR: Password does not have any lowercase letters.");
            passwordChecker = false;
         }
        
               
      }
      
      return passwordChecker;

   }
   
   public static boolean isNumber(char num) {//defines "isNumber"
      return (num <= '9' && num >= '0'); 
   
   }
      
   public static boolean isLetter(char ch) { //defines "isLetter"
      return (ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A');
          
   }
   
   public static boolean isUpperCase(char Up) { //defines "isUpperCase"
      return (Up <= 'Z' && Up >= 'A');
      
   }
   
   public static boolean isLowerCase(char lc) { //defines "isLowerCase"
      return (lc <= 'z' && lc >= 'a');
   
   }

  
}         
