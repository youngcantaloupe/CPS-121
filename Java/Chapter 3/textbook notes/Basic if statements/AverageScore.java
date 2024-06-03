import java.util.Scanner;

//this program demonstrates the if statement and the scanner utility

public class AverageScore
{
   public static void main(String [] args)
   {
   
   double score1,    //score #1
          score2,    //score #2
          score3,    //score #3
          average;   //average score
          
          //create a scanner object to read input
          Scanner keyboard = new Scanner(System.in);
          
          System.out.println("This program averages 3 test scores.");
          
          //Get the first score
          System.out.print("Enter score #1: ");
          score1 = keyboard.nextDouble();
          
          //get second score
          System.out.print("Enter score #2: ");
          score2 = keyboard.nextDouble();
          
          //get the third score
          System.out.print("Enter score #3: ");
          score3 = keyboard.nextDouble();
          
          //calculate and display average score
          average = (score1 + score2 + score3) / 3.0; 
          System.out.println("The average is " + average);
          
          //if the average is higher than 95, congratulate the user.
          if (average > 95)
            System.out.println("That's a great score!");
            keyboard.close();
   }
}