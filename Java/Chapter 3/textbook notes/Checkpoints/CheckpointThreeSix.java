//writee an if statement that assigns 0 to the variable b and assigns 1 to the variable c if the variable a is less than 10 
import java.util.Scanner;

public class CheckpointThreeSix
{
   public static void main(String[] args)
   {
   
   double a,
          b,
          c;

   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Please assign a value to a: ");
      a = keyboard.nextDouble();
       
      if (a < 10) 
      {
         b = 0;
         c = 1;
      }
      else // how to not show or assign these variables if a is over 10
      {
         b = 10;
         c = 10;
      }
   System.out.println("b = " + b +
                     "\nc = " + c);
                     keyboard.close();
   }
}