//imports the joptionpane utility
import javax.swing.JOptionPane;

//class
public class ChapterTwoLab
{
   //method
   public static void main(String[] args)
   {
      //amount of shares kathryn bought
      double kathrynShares = 600;
   
      //price of individual shares
      double sharePrice = 21.77;
   
         //total amount paid by kathryn for shares
         double stockAlone = kathrynShares * sharePrice;
   
   
      //calculates commission by taking 2% of kathryns total price paid for stocks
      double calculateCommission = stockAlone * .02;
    
         //calculates the total price kathryn owes by adding the total stock price plus commission
         double calculateTotal = stockAlone + calculateCommission;
         
         //converts doubles into strings to be read by joptionpane
         String stock = Double.toString(stockAlone);
         String commission = Double.toString(calculateCommission);
         String total = Double.toString(calculateTotal);
         
   //displays the results
   JOptionPane.showMessageDialog(null, "Kathryn paid $" + stock + " for 600 shares of stock at $21.77 per share." +
                                       "\nAt a 2% commission Kathryn owes her stock-broker $" + commission + ". " + 
                                       "\nThe total price Kathryn paid for this transaction is: $" + total + ".");

   }
}