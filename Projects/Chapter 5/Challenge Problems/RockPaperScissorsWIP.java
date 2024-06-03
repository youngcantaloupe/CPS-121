import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsWIP {

   public static void main(String[] args) {
   
      //variables
      int computerNum;
      int userNum;
      boolean userWin;
      //call methods
      computerNum = computerRoll();
      userNum = userRoll();
      userWin = userWinner(userNum, computerNum);
      //display winner
      System.out.print(computerNum);
      if (userWin = true)
         System.out.print(" User wins!");
      if (userWin = false)
         System.out.print(" Computer wins!");
   }
   //methods
      //get computer roll
   public static int computerRoll() {
      Random random = new Random();
      
      int roll;
      roll = random.nextInt(3) + 1;
      
      return roll;
   }
      //get user roll
   public static int userRoll() {
      Scanner keyboard = new Scanner(System.in);
      
      String input;
      int roll;

      System.out.print("Enter Rock, Paper, or Scissors: ");
         input = keyboard.nextLine();
         
      switch (input.toLowerCase()) {
         case "rock":
            roll = 1;
            break;
         case "paper":
            roll = 2;
            break;
         case "scissors":
            roll = 3;
            break;
         default:
            roll = -1;
            break;
      }
      return roll;
   }
      //determine winner
   public static boolean userWinner(int user, int computer) {
   
   boolean userWinner;
   
      if (user == 1 && computer == 3) {
         userWinner = true;
      }
      if (user == 3 && computer == 2) {
         userWinner = true;
      }
      if (user == 2 && computer == 1) {
         userWinner = true;
      }
      else
         userWinner = false;
      return userWinner;
   }
      
}