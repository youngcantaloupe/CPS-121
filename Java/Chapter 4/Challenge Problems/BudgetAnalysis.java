/*
   write a program that asks the user to enter the amount that he or she has budgeted
   for a month. a loop should then prompt the user to enter each of her or her expenses
   for the month, and keep a running total. when the loop finishes, the program should
   display the amount that the user is over or under budget.
*/
import java.util.Scanner;

public class BudgetAnalysis {
   public static void main(String[] args) {
   
      Scanner keyboard = new Scanner(System.in);
      
      double budget;
      double expensesCount = 0;
      int count = 1;
      
      System.out.print("Enter your budget for this month: ");
         budget = keyboard.nextDouble();
         
      for (double expenses = 0; expenses != -1; count++) {
         System.out.print("-1 to exit. Enter expense " + count + ": ");
            expenses = keyboard.nextDouble();
         if (expenses != -1){   
            expensesCount += expenses;
         }
      }
      
      double diff = 0;
      
      if (expensesCount > budget) {
         diff = expensesCount - budget;
         System.out.printf("You are over budget by $%.2f this month.", diff); 
      }
      if (expensesCount < budget) {
         diff = budget - expensesCount;
         System.out.printf("You are under budget by $%.2f this month.", diff);
      }
   }
}