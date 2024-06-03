import java.util.Scanner;

//this program demonstrates the logical && operator

public class LogicalAnd
{
   public static void main(String[] args)
   {
   
   double salary;       //annual salary
   double yearsOnJob;   //years at current job
   
   //create scanner class
   Scanner keyboard = new Scanner(System.in);
   
   //get users annual salary
   System.out.print("Enter your annual salary: ");
   salary = keyboard.nextDouble();
   
   //get users number of years on the job
   System.out.print("Enter the number of years at the current job: ");
   yearsOnJob = keyboard.nextDouble();
   
      //determine if user qualifies
      if (salary >= 50000 && yearsOnJob >= 2)
      {
         System.out.println("You qualify for the loan.");
      }
      else
      {
         System.out.println("You do not qualify for the loan.");
      }
      keyboard.close();
   }
}