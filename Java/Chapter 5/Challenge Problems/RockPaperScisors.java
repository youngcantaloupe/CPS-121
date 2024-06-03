import java.util.Scanner;
import java.util.Random;
public class RockPaperScisors {

   public static void main(String[] args) {
   
      //variables
      String computer;
      String user;
      //do-while to keep playing if tie  
      do {
         computer = computerRoll();
         user = userRoll();
         determineWinner(user, computer);
         
      } while (user.equalsIgnoreCase(computer));

   } 
   //computer
   public static String computerRoll() {
      Random random = new Random();
      
      int computer = random.nextInt(3) + 1;
         String roll;
      switch (computer) {
         case 1: 
            roll = "rock";
            break;
         case 2:
            roll = "paper";
            break;
         default:
            roll = "scissors";
            break;
      }
      return roll;
   }
   //user
   public static String userRoll() {
      Scanner keyboard = new Scanner(System.in);
      
      String roll;
      
      System.out.print("Enter rock, paper, or scissors: ");
         roll = keyboard.nextLine(); 
         
      while (!isValid(roll)) {
         System.out.print("Enter rock, paper, or scissors: ");
            roll = keyboard.nextLine();
      }  
      return roll;
   }
   //validate with switch boolean
   public static boolean isValid(String roll) {
   
   boolean valid = true;
   
      switch (roll.toLowerCase()) {
         case "rock":
            break;
         case "paper":
            break;
         case "scissors":
            break;
         default:
            valid = false;
            break;
      }
      return valid;
   }

   //determine winner
   public static void determineWinner(String user, String computer) {
   
      String output;
      
      output = "\nUser's choice was " + user + ".\n";
      output += "Computer's choice was " + computer + ".\n\n";

      if (user.equalsIgnoreCase("rock")) {
         if (computer.equalsIgnoreCase("scissors"))
            output += "Rock beats scissors, user wins!";
         else if (computer.equalsIgnoreCase("paper"))
            output += "Paper beats rock, computer wins!";
         else 
            output += "It's a tie, play again!";
      }
      if (user.equalsIgnoreCase("paper")) {
         if (computer.equalsIgnoreCase("rock"))
            output += "Paper beats rock, user wins!";
         else if (computer.equalsIgnoreCase("scissors"))
            output += "scissors beats paper, computer wins!";
         else
            output += "It's a tie, play again!";
      }
      if (user.equalsIgnoreCase("scissors")) {
         if (computer.equalsIgnoreCase("paper"))
            output += "scissors beats paper, user wins!";
         else if (computer.equalsIgnoreCase("rock"))
            output += "rock beats scissors, computer wins!";
         else
            output += "It's a tie, play again!";
      }
      System.out.println(output);
   }
}