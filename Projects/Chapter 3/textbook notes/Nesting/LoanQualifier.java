import java.util.Scanner;

//this program demonstrates a nested if statement

public class LoanQualifier
{
   public static void main(String[] args)
   {
   
   double salary;
   double yearsOnJob;
   
   //create scanner object for keyboard input
   Scanner keyboard = new Scanner(System.in);
   
   //get users salary
   System.out.print("Enter your annual salary: ");
   salary = keyboard.nextDouble();
   
   //get number of years at current job
   System.out.print("Enter the number of years " +
                   "at your current job: ");
   yearsOnJob = keyboard.nextDouble();
   
   //determine if qualified
   if (salary >= 50000)
   {
         if (yearsOnJob >= 2)
         {
            System.out.println("You qualify for the loan.");
         }
      
         else
         {
            System.out.println("You must have been on your current job " + 
                              "for at least two years to qualify.");
         }
   }
   
   else
   {
      System.out.println("You must earn at least $50,000 per year to " +
                           "qualify.");
   }
   keyboard.close();
   }
}