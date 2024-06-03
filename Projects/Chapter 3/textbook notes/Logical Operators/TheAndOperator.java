import java.util.Scanner;

public class TheAndOperator
{
   public static void main(String[] args)
   {
   
   int temperature, minutes;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("What is the tempurature? ");
      temperature = keyboard.nextInt();
      
   System.out.print("How long has it been? ");
      minutes = keyboard.nextInt();
   
      if (temperature < 20 && minutes > 12)
      {
         System.out.println("The temperature is in the danger zone.");
      }
      keyboard.close();
   }
}