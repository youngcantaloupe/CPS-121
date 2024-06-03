//write an if statement that assigns 0.2 to commission if sales is greater than or equal to 10000
import java.util.Scanner;

public class CheckpointThreeThree
{
   public static void main(String[] args)
   {
   
   double commission,
          sales;
          
          Scanner keyboard = new Scanner(System.in);
          
          System.out.println("How much revenue did you generate in sales? ");
          sales = keyboard.nextDouble();
          
          if (sales >= 10000)
          {
            commission = 0.2;
          }
          else 
          {
            System.out.println("You did not generate enough revenue to qualify for commission.");
            commission = 0;
          }  
   System.out.println("You recieve: " + commission + "% in commission.");

   keyboard.close();
   }
}