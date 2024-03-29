/******************************************
* @Author Joshua Farias
* @since 2020.09.22
* Program: DayOfWeekJF.java
* Purpose: Calculate the day of the week by a given year, month and day
*******************************************/

import java.util.Scanner;

public class DayOfWeekJF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month (1-31): ");
        int day = input.nextInt();

        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        int k = year % 100; //year of the century
        int j = (int)(year / 100.0); //century
        int q = day; //day of the month
        int m = month;//month
        
        int h = (q + (int)((26 * (m + 1)) / 10.0) + k + (int)(k / 4.0) + (int)(j / 4.0) + (5 * j)) % 7; //day of week program will output, Zeller's Congruence

        String result = "The day of the week is ";

        if (h == 0) 
            System.out.print(result + "Saturday");
        else if (h == 1)
            System.out.print(result + "Sunday");
        else if (h == 2)
            System.out.print(result + "Monday");
        else if (h == 3)
            System.out.print(result + "Tuesday");
        else if (h == 4)
            System.out.print(result + "Wednesday");
        else if (h == 5)
            System.out.print(result + "Thursday");
        else
            System.out.print(result + "Friday");
            
            System.out.println("\nBrought to you by Joshua Farias, Sept. 2020");
         
    }
}
