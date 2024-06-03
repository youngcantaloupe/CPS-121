/*
   write a program that calculates the amount a person would earn over a period
   of time if his or her salary is one penny the first day, two pennies the second,
   and continues to double each day. the program should display a table showing the 
   salary for each day, and then show the total pay at the end of the period. 
   the output should be displayed in dollar amount, not the number of pennies.
   
   INPUT VALIDATION: do not accept less than 1 for days worked.
*/
import java.util.Scanner;
public class PenniesForPay
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int days;
      int pennies = 1;
      double salary = 0;
      
      System.out.print("Enter number of days worked: ");
         days = keyboard.nextInt();
      while (days < 1)
      {
         System.out.print("Invalid input, must be at least one day." +
                            "\nEnter days worked: ");
         days = keyboard.nextInt();
      }
      
      System.out.println("Days\t\tPennies Earned");
      
      for (int instances = 1; instances <= days; instances++)
      {
         System.out.println(instances + "\t\t\t" + pennies);
         salary += pennies;
         pennies *= 2;
         
          
      }   
      
         
      System.out.printf("Total pay: $%,.2f", (salary / 100));  
   }
}