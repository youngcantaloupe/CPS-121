import javax.swing.JOptionPane;

public class TimeCalculator
{
   public static void main(String[] args)
   {
      double seconds;
      String input;
      
      //constants
      final double SECONDS_PER_MINUTE = 60.0;
      final double SECONDS_PER_HOUR = 3600;
      final double SECONDS_PER_DAY = 86400;
      
      //get number of seconds
      input = JOptionPane.showInputDialog("Enter the number of seconds. ");
      seconds = Double.parseDouble(input);
      
      //display the number of seconds in minutes
      if (seconds >= SECONDS_PER_MINUTE)
      {
         //calculate number of minutes
         double minutes = seconds / SECONDS_PER_MINUTE;
         
         //display number of minutes
         JOptionPane.showMessageDialog(null, "There are " +
                           minutes + " minutes in " + seconds + " seconds.");
      }  
                        
      if (seconds >= SECONDS_PER_HOUR)
      {
         //calculate number of hours
         double hours = seconds/ SECONDS_PER_HOUR;
         
         //display number of minutes
         JOptionPane.showMessageDialog(null, "There are " +
                           hours + " hours in " + seconds + " seconds.");
      }
      
      if (seconds >= SECONDS_PER_DAY)
      {
         //calculate number of hours
         double days = seconds/ SECONDS_PER_DAY;
         
         //display number of minutes
         JOptionPane.showMessageDialog(null, "There are " +
                           days + " days in " + seconds + " seconds.");
      }
      System.exit(0);
   }
}