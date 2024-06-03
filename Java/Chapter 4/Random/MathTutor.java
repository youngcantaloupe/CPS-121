import java.util.Scanner;
import java.util.Random;

// this program demonstrates the random class

public class MathTutor
{
   public static void main(String[] args)
   {
      int number1;
      int number2;
      int sum;
      int userAnswer;
      
      Scanner keyboard = new Scanner(System.in);
      
      Random randomNumbers = new Random();
      
      //get two random numbers
      number1 = randomNumbers.nextInt(100);
      number2 = randomNumbers.nextInt(100);
      
      //display an addition problem
      System.out.println("What is the answer to the " + 
                         "following problem?");
      System.out.print(number1 + " + " + 
                       number2 + " + ? ");
                       
      //calculate the answer
      sum = number1 + number2;
      
      //get the user's answer
      userAnswer = keyboard.nextInt();
      
      //display the user's results
      if (userAnswer == sum)
         System.out.println("Correct!");
      else
      {
         System.out.println("Sorry, wrong answer. " +
                            "The correct answer is " +
                            sum);
      }
   }
}