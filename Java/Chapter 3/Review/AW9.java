import java.util.Arrays;
import java.util.Scanner;
public class AW9
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String title1, title2;
      
      System.out.print("Enter title 1: ");
         title1 = keyboard.nextLine();
         
      System.out.print("Enter title 2: ");
         title2 = keyboard.nextLine();
         
      String[] titles = { title1, title2 };
      Arrays.sort(titles);
      
      System.out.println("\nSorted titles:");
      for (String title : titles)
      {
         System.out.println(title);
      }
   }
}