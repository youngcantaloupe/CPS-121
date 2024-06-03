//importing in the JOptionPane
import javax.swing.JOptionPane;

public class ChallengeSeven
{
   public static void main(String[] args)
   {
   
   String inputString;            //for reading input
   double purchase;               //for purchase price
   double stateTax = .04;         //for state tax rate
   double countyTax = .02;        //for county tax rate
   double purchaseStateTax;       //for the state tax on purhcase
   double purchaseCountyTax;      //for the county tax on purhcase
   double total;                  //for the total amount of purchase tax included
   
      //for the purchase amount input from user
      inputString = JOptionPane.showInputDialog("What is the purchase amount?");
      
      //convert input into double
      purchase = Double.parseDouble(inputString);
      
      //find thep state tax of the purchase 
      purchaseStateTax = purchase * stateTax;
      
      //find the county tax of the purchase
      purchaseCountyTax = purchase * countyTax;
      
      //find the total of the purchase all tax included
      total = purchase + purchaseCountyTax + purchaseStateTax;
      
      //display amounts of taxes and total
      JOptionPane.showMessageDialog(null, "The state tax is: $" + purchaseStateTax +
                                          " The county tax is: $" + purchaseCountyTax +
                                          " The purchase total is: $" + total + ".");
      //end the program                                    
      System.exit(0);
   
   }
}