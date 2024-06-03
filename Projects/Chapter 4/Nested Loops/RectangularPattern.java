import java.util.Scanner;

//this program displays a rectangular pattern of *

public class RectangularPattern
{
   public static void main(String[] args)
   {
      int rows, cols;
      
      Scanner keyboard = new Scanner(System.in);
      
      //get rows and cols
      System.out.print("How may rows? ");
      rows = keyboard.nextInt();
      System.out.print("how many columns? ");
      cols = keyboard.nextInt();
      
      for (int r = 0; r < rows; r++)
      {
         for (int c = 0; c < cols; c++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}