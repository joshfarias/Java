/**************************
@author: Joshua Farias
@since: 29 September 2020
@program: VolumeConeJF.java
@purpose: Compare the volume of two cones from a given height and radius
***************************/

import java.util.Scanner;

public class VolumeConeJF {
	public static void main(String[] args) {
		double c1radius, c1height, c2radius, c2height, c1volume, c2volume;
		Scanner input = new Scanner(System.in); //names program,imports java utilities and defines variables
		
		System.out.println("\n Enter the radius of cone 1: ");
		c1radius = input.nextDouble();
      //user input for radius of cone 1
      
      System.out.println("\n Enter the height of cone 1: ");
		c1height = input.nextDouble();
      //user input for height of cone 1
      
      System.out.println("\n Enter the radius of cone 2: ");
     	c2radius = input.nextDouble();
      //user input for radius of cone 2
      
      System.out.println("\n Enter the height of cone 2: ");
		c2height = input.nextDouble();
      //user input for radius of cone 2
		
		c1volume = (1.0 / 3) * Math.PI * Math.pow(c1radius, 2) * c1height; //formula for cone 1
      c2volume = (1.0 / 3) * Math.PI * Math.pow(c2radius, 2) * c2height; //formula for cone 2

		System.out.format("\n Volume of cone 1 is  = %f", c1volume);
		System.out.format("\n Volume of cone 2 is  = %f ", c2volume);
      //displays calculations from given values and formula
      
      if (c1volume > c2volume)
         System.out.println ("\n Cone 1 has the larger volume.");
      else if (c2volume > c1volume)
         System.out.println ("\n Cone 2 has the larger volume.");
      //use of if, else if statements to display larger value
      
      System.out.println ("\n Brought to you by Joshua Farias, Sept. 2020");
	   
   }
  
   
}
