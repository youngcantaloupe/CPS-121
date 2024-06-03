import java.util.Scanner;
// this program uses a user controlled loop.

public class TestAverage1
{
   public static void main(String[] args)
   {
      int score1, score2, score3;      //three test scores
      double average;                  //average test score
      char repeat;                     //to hold 'y' or 'n'
      String input;                    //to hold input
      
      System.out.println("This program calculates the " +
                        "average of three test scores.");
      
      //create scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //get as many sets of test scores as the user wants.
      do
      {
         System.out.print("Enter score #1: ");
         score1 = keyboard.nextInt();
         
         System.out.print("Enter score #2: ");
         score2 = keyboard.nextInt();
         
         System.out.print("Enter score #3: ");
         score3 = keyboard.nextInt();
         
         //consume the remaining newline
         keyboard.nextLine();
         
         //calculate and print the average test score
         average = (score1 + score2 + score3) / 3.0;
         System.out.println("The average is " + average);
         System.out.println(); // prints blank line
         
         //does the user want to average another set? 
         System.out.println("Would you like to average " +
                            "another set of test scores?");
         System.out.print("Enter Y for yes and N for no: ");
         input = keyboard.nextLine();     //read a line
         repeat = input.charAt(0);        //get the first char
         
      } while (repeat == 'Y' || repeat == 'y');
   }
}