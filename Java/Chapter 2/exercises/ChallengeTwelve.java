//import the JOptionPane
import javax.swing.JOptionPane;

public class ChallengeTwelve
{
   public static void main(String[] args)
   {
   
      String cityName;               //for the city name
      String cityNameCaps;           //for the city name in caps
      String cityNameLower;          //for the city name in lowercase
      char firstChar;                //for the first character of the city name
      
         //asking user for favorite city   
         cityName = JOptionPane.showInputDialog("What is the name of your favorite city?");
         
         //getting the length
         int cityLength = cityName.length();
         
         //changing to uppercase
         cityNameCaps = cityName.toUpperCase();
         
         //changing to lowercase
         cityNameLower = cityName.toLowerCase();
         
         //getting the first character
         firstChar = cityName.charAt(0);
         
         JOptionPane.showMessageDialog(null, "Number of characters: " + cityLength +
                                             "\nUppercase: " + cityNameCaps +
                                             "\nLowercase: " + cityNameLower +
                                             "\nFirst character: " + firstChar);
   
   }
}