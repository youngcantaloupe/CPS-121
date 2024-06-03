// this program displays a table of speeds in KPH converted to MPH

public class SpeedConverter
{
   public static void main(String[] args)
   {
      //constants
      final int STARTING_KPH = 60;
      final int MAX_KPH = 130;
      final int INCREMENT = 10;
      
      //variables
      int kph;
      double mph;
      
      //display table headings
      System.out.println("KPH\t\tMPH");
      System.out.println("-------------");
      
      //display the speeds
      for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT)
      {
         //calculate the mph.
         mph = kph * 0.6214;
         
         //display the speeds in kph and mph.
         System.out.printf("%d\t\t%.1f\n", kph, mph);
      }
   }
}