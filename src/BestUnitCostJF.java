/**************************
@author: Joshua Farias
@since: 29 September 2020
@program: BestUnitCostJF.java
@purpose: Compares the unit price of 3 packages and calculate best value
***************************/

import java.util.Scanner;

public class BestUnitCostJF {
	public static void main(String[] args) {
		double pkg1, pkg2, pkg3, pkg1wt, pkg2wt, pkg3wt, unitpkg1, unitpkg2, unitpkg3;
      Scanner input = new Scanner(System.in); //names program, imports java utilities and defines variables
      
      System.out.println("\n Enter the price of package 1: ");
		pkg1 = input.nextDouble();
      //user input for the price of package 1
      
      System.out.println("\n Enter the weight of package 1: ");
		pkg1wt = input.nextDouble();
      //user input for the weight of package 1
      
      System.out.println("\n Enter the price of package 2: ");
		pkg2 = input.nextDouble();
      //user input for the price of package 2
      
      System.out.println("\n Enter the weight of package 2: ");
		pkg2wt = input.nextDouble();
      //user input for the weight of package 2
      
      System.out.println("\n Enter the price of package 3: ");
		pkg3 = input.nextDouble();
      //user input for the price of package 3
      
      System.out.println("\n Enter the weight of package 3: ");
		pkg3wt = input.nextDouble();
      //user input for the weight of package 3
      
      unitpkg1 = (pkg1 / pkg1wt); //formula for package 1
      unitpkg2 = (pkg2 / pkg2wt); //formula for package 2
      unitpkg3 = (pkg3 / pkg3wt); //formula for package 3
      
		System.out.format("\n Package 1's unit price is = %.2f", unitpkg1);
      System.out.format("\n Package 2's unit price is = %.2f", unitpkg2);
      System.out.format("\n Package 3's unit price is = %.2f", unitpkg3);
      //displays unit prices from given values and formula
      
      if (unitpkg1 < unitpkg2 && unitpkg1 < unitpkg3)
         System.out.format ("\n Package 1 has the best unit price at %.2f", unitpkg1);
      else if (unitpkg2 < unitpkg1 && unitpkg2 < unitpkg3)
         System.out.format ("\n Package 2 has the best unit price at %.2f", unitpkg2);
      else if (unitpkg3 < unitpkg1 && unitpkg3 < unitpkg2)
         System.out.format ("\n Package 3 has the best unit price at %.2f", unitpkg3);
      //use of if, else if statements to display which package has the best unit price
      
      System.out.println ("\n Brought to you by Joshua Farias, Sept. 2020");
         
    }
    
      
}
