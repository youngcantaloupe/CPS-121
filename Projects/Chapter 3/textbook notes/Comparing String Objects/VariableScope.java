import java.util.Scanner;

/*
This program demonstrates how variables can be declared in various  
locations throughout the program
*/

public class VariableScope
{
   public static void main(String[] args)
   {
   
   //create scanner class
   Scanner keyboard = new Scanner(System.in);
   
   //get user's first name
   System.out.print("Enter your first name: ");
   String firstName;
   firstName = keyboard.nextLine();
   
   //get user's last name
   System.out.print("Enter your last name: ");
   String lastName;
   lastName = keyboard.nextLine();
   
   //display message
   System.out.println("Hello " + firstName + " " + lastName + ".");
   

   keyboard.close();
   }
}