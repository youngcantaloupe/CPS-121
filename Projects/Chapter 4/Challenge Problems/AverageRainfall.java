/*
   write a program that uses nested loops to collect data and calculate the average rainfall 
   over a period of years. the outer loop should ask for the number of years. the inner loop
   will iterate 12 times, once for each month. each iteration of the inner loop will ask
   the user for the inches of rainfall for that month. after all iterations, the program should
   display the number of months, the total rainfall, and the average rainfall per month
   for the entire period. 
   
   INPUT VALIDATION: do not accept less than 1 year
                     do not accept negative numbers for monthly rainfall
*/
import java.util.Scanner;

public class AverageRainfall {
   public static void main(String[] args) {
      
      Scanner keyboard = new Scanner(System.in);
      
      //declare variables
      int years = 0;
      int months = 12;
      int rainFall = 0;
      int rainTotal = 0;
      int noMonths;
      int averageRain;
      
      while (years < 1) {
      System.out.print("Enter number of years: ");
         years = keyboard.nextInt();
      }
      
      for (int instances = 1; instances <= years; instances++) {
      
         for (int count = 1; count <= months; count++) {
            System.out.print("Enter inches of rain during month " + count + ": ");
            rainFall = keyboard.nextInt();
            if (rainFall < 0) {
               System.out.print("Cannot be negative. Enter inches of rain during month " + count + ": ");
               rainFall = keyboard.nextInt();
            }
            rainTotal += rainFall;
         }
      }
      noMonths = years * months;
      averageRain = rainTotal / noMonths;
      
      System.out.println("\nTotal rainfall: " + rainTotal);
      System.out.println("Number of months: " + noMonths);
      System.out.println("Average rainfall: " + averageRain);
   }
}