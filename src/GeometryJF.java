/******************************************
* @Author Joshua Farias
* @since 2020.10.12
* Program: GeometryJF.java
* Purpose: Calculate area of given shapes
*******************************************/

import java.util.Scanner;

public class GeometryJF {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calculate the Area of a Rectangle");
      System.out.println("3. Calculate the Area of a Triangle");
      System.out.println("4. Quit");
        
      System.out.println("Please enter '1, 2, 3 or 4' to select what you want to do.");
      int choosenNum = input.nextInt();
            
            
      if (choosenNum != 1 && choosenNum != 2 && choosenNum != 3 && choosenNum != 4) {
         System.out.print("Invalid entry. Please restart the program and try again.");            
      }
        
      if (choosenNum == 1) {
         System.out.println("Enter the radius of a given circle: ");
         double radiusCircle = input.nextDouble();
         if (radiusCircle<=0) {
            System.err.println("Non-positive values are not accepted.");            
         }
         else if (radiusCircle>0) {
            System.out.println("Using the formula: (Area = pi*r2), the area of a circle with the given radius is: ");
            double areaCircle = Math.PI * Math.pow(radiusCircle, 2);
            System.out.format("%.2f", areaCircle);            
         }
      }
        
      else if (choosenNum == 2) {
         System.out.println("Enter the length of a given rectangle: ");
         double lengthRectangle = input.nextDouble();
         if (lengthRectangle<=0) {
            System.err.println("Non-positive values are not accepted.");
         }
         System.out.println("Enter the width of a given rectangle: ");
         double widthRectangle = input.nextDouble();
         if (widthRectangle<=0) {
            System.err.println("Non-positive values are not accepted.");
            System.err.println("ERROR");
         }
         else if (lengthRectangle>0 && widthRectangle>0) {     
            System.out.println("Using the formula: Area = width * length, the area of a rectangle with the given length and width is: ");
            double areaRectangle = widthRectangle * lengthRectangle;
            System.out.format("%.2f", areaRectangle);             
         }
      }
      
      else if (choosenNum == 3) {
         System.out.println("Enter the length of a given triangle's base: ");
         double lengthTriangle = input.nextDouble();
         if(lengthTriangle<=0) {
            System.err.println("Non-positive values are not accepted.");
         }
         System.out.println("Enter the height of a given triangle: ");
         double heightTriangle = input.nextDouble();
         if(heightTriangle<=0) {
            System.err.println("Non-positive values are not accepted.");
            System.err.println("ERROR");
         }
         else if (lengthTriangle>0 && heightTriangle>0) {
            System.out.println("Using the formula: Area = base * height * .5, the area of a triangle with the given height and base is: ");
            double areaTriangle = heightTriangle * lengthTriangle * 0.5;
            System.out.format("%.2f", areaTriangle);             
         }
      }
            
      else if (choosenNum == 4) {
         System.out.println("Thank you for using the program!");
      }
            
      System.out.println("\nBrought to you by Joshua Farias, Oct. 2020");
   }
   
   public static double areaCircle(double radiusCircle) {
      if(radiusCircle<=0) {
         System.err.println("Non-positive values are not accepted.");
         return 0;
      }
      return Math.PI*radiusCircle*radiusCircle;
   }
   
   public static double areaRectangle(double lengthRectangle, double widthRectangle) {
      if(lengthRectangle<=0) {
         System.err.println("Non-positive values are not accepted.");
         return 0;
      }
      if(widthRectangle<=0) {
         System.err.println("Non-positive values are not accepted.");
         return 0;
      }
      return widthRectangle * lengthRectangle;
   }
         
   public static double areaTriangle(double heightTriangle, double lengthTriangle) {
      if(heightTriangle<=0) {
         System.err.println("Non-positive values are not accepted.");
         return 0;
      }
      if(lengthTriangle<=0) {
         System.err.println("Non-positive values are not accepted.");
         return 0;
      }
      return heightTriangle*lengthTriangle;
   }
   
}
