import java.util.Scanner;

public class Charge {
   public static void main(String[] args) {
      int accountNumber;
      
      Validator val = new Validator();
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the charge account number: ");
         accountNumber = keyboard.nextInt();
         
      if (val.isValid(accountNumber))
         System.out.println("That is a valid account number.");
      else
         System.out.println("That is an INVALID account number.");
   }
}