import java.util.Scanner;

public class AW2
{
   public static void main(String[] args)
   {
      int x = 0,
          y;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter value for y: ");
         y = keyboard.nextInt();
         
      if (y == 10)
          x = 0;
      else 
          x = 1;
      System.out.println(x);
   }
}