import java.util.Scanner;
/*
   This program calculates the total number of points a soccer team
   has earned over a series of games. the user enters a series of
   point values, then -1 when finished.
*/

public class SoccerPoints
{
   public static void main(String[] args)
   {
      int points;             //game points
      int totalPoints = 0;    //accumulator initialized to 0
      
      //create scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //display general instructions
      System.out.println("Enter the number of points your team");
      System.out.println("has earned for each game this season.");
      System.out.println("Enter -1 when finished.");
      System.out.println();
      
      //get first number of points
      System.out.print("Enter game points or -1 to end: ");
      points = keyboard.nextInt();
      
      //accumulate the points until -1 is entered
      while (points != -1)
      {
         //add points to total points
         totalPoints += points;
         
         //get the next number of points
         System.out.print("Enter game points or -1 to end: ");
         points = keyboard.nextInt();
      }
      
      //display the total number of points
      System.out.println("The total points are " +
                         totalPoints);
   }
}