import java.util.Scanner;
public class Checkpoint38
{
   public static void main(String[] args)
   {
      int x;
      int y;
      
      Scanner keyboard = new Scanner(System.in);
        
      System.out.println("Enter a number for x: ");
         x = keyboard.nextInt();
        
        if (x > 100)
            y = 20;
        else 
            y = 0;
            
      System.out.println("y = " + y);
             
         
   }
}