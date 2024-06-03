import java.util.Scanner;
public class IsPrime {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      int number;
      
      System.out.print("Enter a number: ");
         number = keyboard.nextInt();
         
      if (isPrime(number)) {
         System.out.print(number + " is prime.");
      }
      else 
         System.out.print(number + " is not prime.");
   }
   //methods
      //if prime
         //get user input
         //nested if to % by 2-9.
   public static boolean isPrime(int num) {
      boolean divisorFound = false;
      int div = 2;
      
      while (div < num && !divisorFound) {
      
         if ((num % div) == 0) 
            divisorFound = true;
         div++;
      }
         return !divisorFound;
      
   }
}