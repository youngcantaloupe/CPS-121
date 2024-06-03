import javax.swing.JOptionPane;

public class ChallengeThirteen
{
   public static void main(String[] args)
   {
   
   String inputBill;                      //for the input of bill
   double bill;                           //for storing the bill as a double
   
   //input for bill string
   inputBill = JOptionPane.showInputDialog("What is the charge for the meal?");
   
   //turn bill into double
   bill = Double.parseDouble(inputBill);
   
   double tax = bill * .0675;             //for the standard tax rate
   double tip = (bill + tax) * .2;        //for the standard tip amount
   double total = bill + tax + tip;       //for the total 
   
   //display totals
   JOptionPane.showMessageDialog(null, "Your meal charge is: " + bill +
                                 "\nThe tax amount is: " + tax +
                                 "\nThe tip amount is: " + tip +
                                 "\nThe total bill is: " + total);
   
   }
}