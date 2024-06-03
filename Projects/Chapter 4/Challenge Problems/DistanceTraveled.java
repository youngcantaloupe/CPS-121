/*
   Distance = Speed * Time
   Write a program that asks for the speed of a vehicle in MPH and the number of hours
   traveled. it should use a loop to display the distance the vehicle has traveled
   for each hour of a time period specified by the user. 
   
   Hour        Distance Traveled
   -----------------------------
   1           40
   2           80
   3           120
   INPUT VALIDATION: do not accept a negative number for speed. 
                     do not accpet less than 1 for time traveled.
*/
import java.util.Scanner;
public class DistanceTraveled
{
   public static void main(String[] args)
   {
      int speed;
      int time;
      int distance;
      int instances = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the speed traveled: ");
         speed = keyboard.nextInt();
         while (speed < 0)
         {
            System.out.print("\nInvalid input, negative numbers not allowed." +
                               "\nEnter a positive value: ");
            speed = keyboard.nextInt();
         } 
                              
      System.out.print("Enter the hours spent traveling: ");
         time = keyboard.nextInt();
         while (time < 1)
         {
            System.out.print("\nInvalid input, must be at least 1 hour" +
                             "\nEnter hours spent traveling: ");
            time = keyboard.nextInt();
         }
         
      System.out.println("\nHours\t\tDistance Traveled" +
                         "\n---------------------------");
      
      while (time > instances)
      {
         ++instances;
         distance = instances * speed;
         System.out.printf("%d\t\t\t%d\n",instances, distance);
      }
      
   }
}