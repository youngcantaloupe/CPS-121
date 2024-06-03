import java.util.Scanner;

//this program demonstrates a user controlled for loop

public class UserSquares
{
   public static void main(String[] args)
   {
      int number;    //loop control variable
      int maxValue;  //maximum value to display
      
      System.out.println("I will display a table of " +
                         "numbers and their squares.");
                         
      //create scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //get max value to display
      System.out.print("How high should I go? ");
      maxValue = keyboard.nextInt();
      
      //display table
      System.out.println("Number Number Squared");
      System.out.println("------------------------");
      for (number = 1; number <= maxValue; number ++)
      {
         System.out.println(number + "\t\t|\t" +
                            number * number);
      }
   }
}