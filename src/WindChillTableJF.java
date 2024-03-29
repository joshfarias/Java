/**************************
@author: Joshua Farias
@since: 6 October 2020
@program: WindChillTableJF.java
@purpose: make a wind chill data table
***************************/

import java.util.Scanner;

public class WindChillTableJF {

	public static void drawLine() {
		for (int i=0; i<75; i++) {
			System.out.print("=");
		} 
		System.out.println();
	} 

	public static int getWindChill(int airTemp, int windSpeed) {
		double windChill;
		windChill = 35.74 + 0.6215 * airTemp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * airTemp * Math.pow(windSpeed, 0.16);
		return (int) windChill;
	} 

	public static void main(String[] args) {
      System.out.println ("                            Wind Chill Table                                  ");
      drawLine();
		System.out.println ("                         Temperature (degrees F)                              ");
		drawLine();
		System.out.print("      "); // text alignment
		for (int temp=50; temp>=-50; temp-=10) {
			System.out.printf("%6d",temp);
		}
      
		System.out.println("\n MPH");

      drawLine();
		
		for (int windSpeed=5; windSpeed<=50; windSpeed+=5) {
			System.out.printf("%3d | ",windSpeed);
			for (int temp=50; temp>=-50; temp-=10) {
				System.out.printf("%6d", getWindChill(temp, windSpeed));
			}
			   System.out.println();
	   }
            drawLine();
            System.out.println ("\n Brought to you by Joshua Farias, Oct. 2020");
	}

  
}
