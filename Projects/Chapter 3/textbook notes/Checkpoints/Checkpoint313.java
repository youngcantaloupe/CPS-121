import java.util.Scanner;

public class Checkpoint313
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int x, 
          y,
          z = 0;
      
      System.out.println("Enter a value for x: ");
         x = keyboard.nextInt();
      System.out.println("Enter a value for y: ");
         y = keyboard.nextInt();
         
      if (x > 0)
      {
         if (y < 20)
         {
           z = 1;
         }
         else
         {
           z = 0;
         }
      }   
      System.out.println("z is: " + z);
   }
}