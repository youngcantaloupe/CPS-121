/*
write a program that calculates the customer's monthly bill. it
should ask the user to enter the letter of the package the customer
has purchased (A, B, or C) and the number of minutes that were used. 
the program should display the total charges.
*/

import java.util.Scanner;

public class MobileServiceProvider
{
   public static void main(String[] args)
   {
   double packageA = 39.99;
   double packageB = 59.99;
   double packageC = 69.99;
   double minutes;
   String plan;
   
   
   Scanner keyboard = new Scanner(System.in);
   
   //get plan from user
   System.out.print("Please enter what package you purchased (A, B, or C): ");
      plan = keyboard.nextLine();
      
   //get minutes from user   
   System.out.print("How many minutes did you use this month? ");
      minutes = keyboard.nextDouble();
      
   if (plan.equalsIgnoreCase("A"))
      {
         System.out.println("\nYou entered package A.");
         System.out.printf("You used %.0f minutes this month.", minutes);
         
         if (minutes > 450)
         {
            double minutesOverA = (minutes - 450) * 0.45;
            double totalA = minutesOverA + packageA;
            System.out.println("\nYour total for this month is: " + totalA);
         }
         
         else
         {
            System.out.println("\nYour total for this month is: " + packageA);
         }   
      }
      
   else if (plan.equalsIgnoreCase("B"))
      {
         System.out.println("\nYou entered package B.");
         System.out.printf("You used: %.0f minutes this month.", minutes);
         
         if (minutes > 900)
         {
            double minutesOverB = (minutes - 900) * 0.4;
            double totalB = minutesOverB + packageB;
            System.out.println("\nYour total for this month is: " + totalB);
         }
         
         else
         {
            System.out.println("Your total for this month is: " + packageB);
         } 
      }  
      
   else if (plan.equalsIgnoreCase("C"))  
      { 
         System.out.println("\nYou entered package C.");
         System.out.printf("You used: %.0f minutes this month.", minutes);
         System.out.println("\nYour total for this month is: " + packageC);
      }
   else
         System.out.println("\nThe package you entered is invalid");

   }
}