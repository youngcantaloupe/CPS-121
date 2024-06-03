import javax.swing.JOptionPane;
/*
   This program calculates the number of soccer teams that a youth league may
   create from the number of available players. Input validation is demonstrated
   with while loops.
*/

public class SoccerTeams
{
   public static void main(String[] args)
   {
      final int MIN_PLAYERS = 9;       //min players per team
      final int MAX_PLAYERS = 15;      //max players per team
      int players = 0;                     //number of available players
      int teamSize = 0;                    //number of players per team
      int teams = 0;                       //number of teams
      int leftOver = 0;                    //number of left over players
      String input;                    //to hold user input
      
      //get number of players per team
      input = JOptionPane.showInputDialog("Enter the number of " + 
                                          "players per team.");
      teamSize = Integer.parseInt(input);
      
      //validate the number entered.
      while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
      {
         input = JOptionPane.showInputDialog("The number must " +
                                             "be at least " + MIN_PLAYERS +
                                             " and no more than " +
                                             MAX_PLAYERS + ". \n Enter " +
                                             "the number of players.");
         teamSize = Integer.parseInt(input);
      }
      
      //get the number of available players
      input = JOptionPane.showInputDialog("Enter the available " +
                                          "number of players.");
      players = Integer.parseInt(input);
      
      //validate the numbers entered.
      while (players < 0)
      {
         input = JOptionPane.showInputDialog("Enter 0 or " +
                                             "greater.");
         players = Integer.parseInt(input);
      }
      
      //calculate the number of teams
      teams = players / teamSize;
      
      //calculate the number of leftover players
      leftOver = players % teamSize;
      
      //display the results
      JOptionPane.showMessageDialog(null, "There will be " +
                                        teams + " teams with " +
                                        leftOver + 
                                        " players left over.");
      System.exit(0);
   }
}