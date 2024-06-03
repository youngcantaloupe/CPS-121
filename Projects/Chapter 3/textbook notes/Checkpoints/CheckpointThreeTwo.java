import java.util.Scanner;
/*
write an if statement that multiplies payRate by 1.5 if hours is greater than 40
*/
public class CheckpointThreeTwo
{
   public static void main(String [] args)
   {
   
   Scanner keyboard = new Scanner(System.in);
   
   double 
      payRate,
      hours,
      total; 
      
         System.out.println("What is your pay rate? ");
            payRate = keyboard.nextDouble();
      
         System.out.println("How many hours did you work? ");
            hours = keyboard.nextDouble();
      
      if (hours > 40)
         {
         payRate = payRate * 1.5;
         System.out.println("You worked overtime. ");
         }
      
   total = payRate * hours;
   
   System.out.println("Your total is: " + total);

   keyboard.close();
   }
}