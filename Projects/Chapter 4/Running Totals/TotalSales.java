import javax.swing.JOptionPane;

// this program calculates a running total

public class TotalSales
{
   public static void main(String[] args)
   {
      int days;
      double sales;
      double totalSales;
      String input;
      
      //get number of days
      input = JOptionPane.showInputDialog("For how many  days " +
                                          "do you have sales figures?");
      days = Integer.parseInt(input);
      
      //set accumulator to 0
      totalSales = 0.0;
      
      //get sales figures and calculate a running total
      for (int count = 1; count <= days; count++)
      {
         input = JOptionPane.showInputDialog("Enter the sales " +
                                             "for day " + count + ": ");
         sales = Double.parseDouble(input);
         totalSales += sales;
      }
      //display total sales.
      JOptionPane.showMessageDialog(null,
         String.format("The total sales are $%,.2f", totalSales));
         
      System.exit(0);
   }
}