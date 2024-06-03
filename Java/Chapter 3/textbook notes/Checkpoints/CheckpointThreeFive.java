//write an if statement that assigns 20 to the variable y and assigns 40 to the variable z if the variable x is greater than 100
import java.util.Scanner;

public class CheckpointThreeFive
{
   public static void main(String[] args)
   {
   
   double x,
          y,
          z;
          
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Please give a integer for x: ");
      x = keyboard.nextDouble();
      
      if (x > 100) {
         y = 20;
         z = 40;
      }
      else {
      y = 0;
      z = 0;
      }
      
      System.out.println("y = " + y +
                         "\nz = " + z);
                         
                         keyboard.close();
   }
}