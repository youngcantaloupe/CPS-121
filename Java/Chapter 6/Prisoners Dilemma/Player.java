public class Player {
   private String name;
   private int choice;
   private int points;
   
   //how to get other players choice back to player method
   
   public Player(String playerName) {
      name = playerName;
      choice = 0;
      points = 0;
   }
   public void addPoints(int newPoints) {
      points += newPoints;
   }
   public void setGuess(int g) {
      choice = g;
   }
   public String getName() {
      return name;
   }
   public int getChoice() {
      return choice;
   }
   public int getPoints() {
      return points;
   }
}