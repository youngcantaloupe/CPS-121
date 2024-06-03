import java.util.Scanner;

//this program demonstrates the if-else statement

public class Division
{
   public static void main(String [] args)
   {
   
   double number1, number2;   //division operands
   double quotient;           //result of division
   
   //create scanner object for keyboard input
   Scanner keyboard = new Scanner(System.in);
   
   //get the first number
   System.out.print("Enter a number: ");
      number1 = keyboard.nextDouble();
   
   //get the second number
   System.out.print("Enter another number: ");
      number2 = keyboard.nextDouble();
   
   if (number2 == 0)
      {
         System.out.println("Division by zero is not possible.");
         System.out.println("Please run the program again and ");
         System.out.println("enter a number other than zero");
      }
      
      else
      {
         quotient =  number1 / number2;
         
         System.out.print("The quotient of " + number1);
         System.out.print(" divided by " + number2);
         System.out.println(" is " + quotient);
      }
      keyboard.close();
   }
}