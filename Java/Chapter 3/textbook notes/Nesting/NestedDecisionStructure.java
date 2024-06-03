import java.util.Scanner;

public class NestedDecisionStructure
{
   public static void main(String[] args)
   {
   
   Scanner keyboard = new Scanner(System.in);
   
   int testScore;
   
   System.out.print("What is your test score? ");
      testScore = keyboard.nextInt();
      
   if (testScore < 60)
   {
      System.out.println("Your grade is F.");
   } 
   else
   {
      if (testScore < 70)
      {
         System.out.println("Your grade is D.");
      }
      else
      {
         if (testScore < 80)
         {
            System.out.println("Your grade is C.");
         }
         else
         {
            if (testScore < 90)
            {
               System.out.println("Your grade is B.");
            }
            else
            {
               if (testScore < 100)
               {
                  System.out.println("Your grade is A.");
               }
            }
         }
      }
   }
   keyboard.close();     
   
   }
}