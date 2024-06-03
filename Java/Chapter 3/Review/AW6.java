import java.util.Scanner;
public class AW6
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int grade;
      
      System.out.print("Enter value for grade: ");
         grade = keyboard.nextInt();
         
      if (grade > 0 && grade < 100)
         System.out.println("The number is valid.");
      else 
         System.out.println("The number is not valid.");
   }
}