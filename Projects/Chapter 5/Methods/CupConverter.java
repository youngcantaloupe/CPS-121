import javax.swing.JOptionPane;

public class CupConverter {

   public static void main(String[] args) {
   
      double cups;
      double ounces;
      
      cups = getCups();
      ounces = cupsToOunces(cups);
      displayResults(cups, ounces);
      System.exit(0);
   }
   
   public static double getCups() {
   
      String input;
      double numCups;
      
      input = JOptionPane.showInputDialog("This program converts measurements\n" +
                                          "in cups to fluid ounces. For your\n" +
                                          "reference the formula is:\n" +
                                          "     1 cup = 8 fluid ounces\n\n" +
                                          "Enter number of cups.");
      numCups = Double.parseDouble(input);
      return numCups; 
   }
   
   public static double cupsToOunces(double numCups) {
   
      return numCups * 8.0;
   }
   
   public static void displayResults(double cups, double ounces) {
   
      JOptionPane.showMessageDialog(null, cups + " cups equals " + ounces + " fluid ounces.");
   } 
} 