import java.util.Scanner;

//this program demonstrates a case insensitive string comparison

public class SecretWord
{
   public static void main(String[] args)
   {
   
   String input;     //to hold user's input
   
   //create scanner class
   Scanner keyboard = new Scanner(System.in);
   
   //prompt user to enter secret word
   System.out.print("Enter the secret word: ");
   input = keyboard.nextLine();
   
      //determine if user entered secret wor
      if (input.equalsIgnoreCase("PROSPERO"))
      {
         System.out.println("Congratulations! You know the secret word.");
      }
      else
      {
         System.out.println("Sorry, that is NOT the secret word.");
      }
      keyboard.close();
   }
}