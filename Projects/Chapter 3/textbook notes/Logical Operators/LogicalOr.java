import java.util.Scanner;

//this program demonstrates the logical || operator

public class LogicalOr
{
   public static void main(String[] args)
   {
     
   double salary;       //annual salary
   double yearsOnJob;   //years on job
   
   //create scanner class
   Scanner keyboard = new Scanner(System.in);
   
   //get users annual salary
   System.out.print("Enter your annual salary: ");
   salary = keyboard.nextDouble();
   
   //get users years on job
   System.out.print("Enter number of years on the job: ");
   yearsOnJob = keyboard.nextDouble();
   
      //determine qualification
      if (salary >= 50000 || yearsOnJob >= 2)
      {
         System.out.println("You Qualify for the loan.");
      }
      else 
      {
         System.out.println("You do not qualify");
      }
      keyboard.close();
   }
}