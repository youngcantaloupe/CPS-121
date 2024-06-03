import java.util.Scanner;

/*
   this program assists the technician in the process of chekcing a substance's temp.
*/
public class CheckTemperature
{
   public static void main(String[] args)
   {
      final double MAX_TEMP = 102.5;   //max temp
      double temperature;              //holds temp
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the substance's Celsius temperature: ");
      temperature = keyboard.nextDouble();
      
      //as long as necessary, instruct technician to adjust temp
      while (temperature > MAX_TEMP)
      {
         System.out.println("The temperature is too high. Turn the");
         System.out.println("thermostat down and wait 5 minutes.");
         System.out.println("Then, take the Celsius temperature again");
         System.out.print("and enter it here: ");
         temperature = keyboard.nextDouble();
      }
      //remind the technitcian to check temp again in 15 mins.
      System.out.println("The temperature is acceptable.");
      System.out.println("Check it again in 15 minutes.");
      
      
   }
}