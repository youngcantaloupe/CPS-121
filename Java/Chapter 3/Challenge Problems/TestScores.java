/*
write a program that has variables to hold three test scores. 
the program should ask the user to enter three test scores and then assign the values
entered to the variables. the program should display the average of the test scores and
the letter grade that is assign for the test score average. 
*/

import java.util.Scanner;

public class TestScores
{
   public static void main(String[] args)
   {
      double   scoreOne,
               scoreTwo,
               scoreThree,
               average;
      
   Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter test score one: ");
         scoreOne = keyboard.nextInt();
      System.out.print("Enter test score two: ");
         scoreTwo = keyboard.nextInt();
      System.out.print("Enter test score three: ");
         scoreThree = keyboard.nextInt();
         
   average = (scoreOne + scoreTwo + scoreThree)/3;
      System.out.printf("\nThe average of your scores is: %.0f\n", average);
      
      if (average < 60)
         System.out.print("Your grade is an F.");
      else if (average < 70)
         System.out.print("Your grade is a D.");
      else if (average < 80)
         System.out.print("Your grade is a C.");
      else if (average < 90)
         System.out.print("Your grade is a B.");
      else if (average < 100)
         System.out.print("Your grade is an A.");
      else 
         System.out.print("The test scores you entered are invalid");
         
   }
}