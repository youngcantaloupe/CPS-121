import java.util.Scanner;

/*
write an if statement that assigns 0 to x when y is equal to 20
*/

public class CheckpointThreeOne
{
   public static void main(String [] args)
   {
   
   double x = 1 , 
          y;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("This program assigns 0 to x when y is equal to 20. ");
   
   System.out.print("Enter value for y: ");
   y = keyboard.nextDouble();
   
   if (y == 20)
      x = 0;
   
   System.out.println("The value of x is : " + x );

   keyboard.close();
   }
}