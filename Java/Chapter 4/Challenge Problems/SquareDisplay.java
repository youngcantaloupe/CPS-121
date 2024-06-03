import java.util.Scanner;

public class SquareDisplay {
   public static void main(String[] args) {
      
      Scanner keyboard = new Scanner(System.in);
      
      int userNum;
      
      do {
         System.out.print("Enter size of square display: ");
            userNum = keyboard.nextInt();
      } while (userNum <= 0 || userNum > 15);  
       
      for (int Vcount = 1; Vcount <= userNum; Vcount++) {   
         for (int Hcount = 1; Hcount <= userNum; Hcount++) {
            System.out.print("X");
         }
         System.out.print("\n");
      }   
   }
}