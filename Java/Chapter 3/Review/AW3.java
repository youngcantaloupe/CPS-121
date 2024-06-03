import java.util.Scanner;

public class AW3
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      double commission = 0,
             sales; 
      
      System.out.print("Enter sales: ");
         sales = keyboard.nextDouble();
      
      if (sales < 10000)
         commission = .10;
      else if (sales < 15000 && sales > 10000)
         commission = .15;
      else 
         commission = .20;
      
      System.out.printf("%.2f", commission);
   }
}