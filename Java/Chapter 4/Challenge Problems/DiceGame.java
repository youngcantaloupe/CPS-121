import java.util.Random;

public class DiceGame {
   public static void main(String[] args) {
      Random random = new Random();
      
      int compDice;
      int compScore = 0;
      int userDice;
      int userScore = 0;
      int ties = 0;
      
      for (int games = 1; games <= 10; games++) {
         System.out.println("Game: " + games);
         compDice = random.nextInt(6) + 1;
         userDice = random.nextInt(6) + 1;
      
         System.out.println("Computer roll: " + compDice);
         System.out.println("Your roll: " + userDice);
         
         if (userDice > compDice) {
            userScore++;
            System.out.println("User wins!");
            System.out.println("\nComputer: " + compScore + " User: " + userScore + " Ties: " + ties);
         }
         if (compDice > userDice) {
            compScore++;
            System.out.println("Computer wins!");
            System.out.println("\nComputer: " + compScore + " User: " + userScore + " Ties: " + ties);
         }
         if (compDice == userDice) {
            ties++;
            System.out.println("Tie!");
            System.out.println("\nComputer: " + compScore + " User: " + userScore + " Ties: " + ties);
         }
         System.out.println();

      }
      if (userScore > compScore) {
         System.out.println("User wins series!");
      }
      if (compScore > userScore) {
         System.out.println("Computer wins series!");
      }
      if (compScore == userScore) { 
         System.out.println("Tied series!");
      }
   }
}