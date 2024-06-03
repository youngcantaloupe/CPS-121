import java.util.Random;
import java.util.Scanner;
public class EspGame {

   public static void main(String[] args) {
      Random random = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      int randomNumber;
      String userColor;
      int score = 0;
      String compColor = "White";

      for (int games = 1; games <= 10; games++) {
         randomNumber = random.nextInt(5) + 1 ;
         System.out.println("Enter Red, Green, Blue, Orange, or Yellow.");
         System.out.print("Your Color: ");  
         userColor = keyboard.nextLine();
         
         switch (randomNumber) {
            case 1: 
               compColor = "Red";
               break;
            case 2:
               compColor = "Green";
               break;
            case 3:
               compColor = "Blue";
               break;
            case 4:
               compColor = "Orange";
               break;
            case 5:
               compColor = "Yellow";
               break;
            default:
               System.out.println("Something's wrong.");
         }
         
         System.out.println("Computer color: " + compColor + "\n");

         if (compColor.equalsIgnoreCase(userColor)) {
            score++;
         }
      }
      System.out.println("Your score is: " + score);
   }
}

