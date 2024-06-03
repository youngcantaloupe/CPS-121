import java.util.Scanner;
public class AW7
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      double temperature;
      
      System.out.println("Enter temperature: ");
         temperature = keyboard.nextDouble();
         
      if (temperature > -50 && temperature < 150)
         System.out.println("The number is valid.");
      else 
         System.out.println("The number is not valid.");
         
   }
}