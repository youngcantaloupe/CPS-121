import java.util.Scanner;
public class AW5
{
   public static void main(String[] args)
   {
      int amount1,
          amount2;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter value 1: ");
         amount1 = keyboard.nextInt();
      System.out.print("Enter value 2: ");
         amount2 = keyboard.nextInt();
         
      if (amount1 > 10 && amount2 < 100)
      {
         if (amount1 > amount2)
            System.out.print(amount1);
         if (amount1 < amount)
            System.out.print(amount2);
      }
   }
}