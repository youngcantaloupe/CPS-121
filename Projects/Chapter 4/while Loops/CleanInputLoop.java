import java.util.Scanner;
public class CleanInputLoop
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int number;
      
      //get number from user
      System.out.print("Enter a number in the range of 1 through 100: ");
      number = keyboard.nextInt();
      
      //validate the input
      while (number < 1 || number > 100)
      {
         System.out.print("Invalid input. Enter a number in the range " +
                          "of 1 through 100: ");
         number = keyboard.nextInt();
      }
   }
}