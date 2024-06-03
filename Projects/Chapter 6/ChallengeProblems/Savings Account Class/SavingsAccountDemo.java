import java.util.Scanner;

public class SavingsAccountDemo {
   public static void main(String[] args) {
      
      double input;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the starting balance? ");
         input = keyboard.nextDouble();
      SavingsAccount account = new SavingsAccount(input);
      
      System.out.print("What is the annual interest rate? ");
         input = keyboard.nextDouble();
         account.setInterestRate(input);
         
      System.out.print("How many months has the account been open? ");
         input = keyboard.nextDouble();
         account.setMonths(input);
         
      System.out.println();
               
      //loop to get account changes over period of months
      for (int i = 1; i <= account.getMonths(); i++) {
         System.out.println("Month " + i);
         System.out.print("Deposit amount for month " + i + ": ");
            input = keyboard.nextDouble();
            account.deposit(input);
                     
         System.out.print("Withdraw amount for month " + i + ": ");
            input = keyboard.nextDouble();
            account.withdraw(input);
            
         account.setMonthlyInterest();
            
         System.out.println();
         
      }
      
      System.out.printf("----------------------------------------------------------------------\n");
      System.out.printf("|                       Savings Account Demo                         | \n");
      System.out.printf("----------------------------------------------------------------------\n");
      System.out.printf("| %-10s | %-10s | %-10s | %-10s |\n", "ENDING BALANCE", "TOTAL INTEREST", "TOTAL DEPOSITS", "TOTAL WITHDRAWS");
      System.out.printf("----------------------------------------------------------------------\n");
      System.out.printf("| $%,-12.2f  | $%,-11.2f   | $%,-12.2f  | $%,-14.2f |\n", account.getBalance(), account.getInterestTotal(), account.getDepositTotal(), account.getWithdrawTotal());
      System.out.printf("----------------------------------------------------------------------\n");
   }
}