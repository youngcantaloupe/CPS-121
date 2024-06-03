import java.util.Scanner;

public class ChapterThreeLab
{
   public static void main(String[] args)
   {
   
   Scanner keyboard = new Scanner(System.in);
   
   //int to hold whole number values for base fee and number of checks from user input. Error will return if user inputs invalid check amount.
   int base = 10,
       checks;
   
   //double to hold decimal values, used for math operations in decision structure.     
   double fees,
          total;
       
       //get monthly check usage from user
       System.out.print("\nPlease enter number of checks used this month: ");
         checks = keyboard.nextInt();
      
      /*
      if else if statements takes number of checks used and performs calcuation of montly bill, then prints bill rounded to two decimal places.
      first if statement limits checks to: 0-20. This is to avoid user inputting negative check number to lower the base fee amount. 
      */
      if (checks >= 0 && checks < 20)
      {
         fees = .10;
         total = base + (checks * fees);
         System.out.printf("\nYour service fee is: $%.2f.\n", total);
      }
      
      else if (checks >= 20 && checks <= 39)
      {
         fees = .08;
         total = base + (checks * fees);
         System.out.printf("\nYour service fee is: $%.2f.\n", total);      
      }
      
      else if (checks >= 40 && checks <= 59)
      {
         fees = .06;
         total = base + (checks * fees);
         System.out.printf("\nYour service fee is: $%.2f.\n", total);      
      }
      
      else if (checks >= 60)
      {
         fees = .04;
         total = base + (checks * fees);
         System.out.printf("\nYour service fee is: $%.2f.\n", total);      
      } 
      //traliling else catches negative check input.
      else
      { 
         System.out.println("\nInvalid number of checks, please try again.");
      }
   }
}