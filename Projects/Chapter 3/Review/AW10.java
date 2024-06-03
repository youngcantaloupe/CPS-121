import java.util.Scanner;
public class AW10
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int choice;
      
      System.out.print("Please select 1, 2, 3, or 4. ");
         choice = keyboard.nextInt();
         
      switch (choice)
      {
         case 1:
            System.out.println("You entered 1.");
            break;
         case 2:
         case 3:
            System.out.println("You entered 2 or 3.");
            break;
         case 4:
            System.out.println("You entered 4.");
            break;
         default:
            System.out.println("Select again please.");
      }
   }
}