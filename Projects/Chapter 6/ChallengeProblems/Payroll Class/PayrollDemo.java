import javax.swing.JOptionPane;

public class PayrollDemo {
   public static void main(String[] args) {
      
      Payroll employee1 = new Payroll();
      
      String input;
      double number;
      double grossPay;
      
      input = JOptionPane.showInputDialog("What is your name?");
         employee1.setName(input);
      input = JOptionPane.showInputDialog("What is your ID number?");
         number = Double.parseDouble(input);
         employee1.setID(number);
      input = JOptionPane.showInputDialog("What is your hourly rate?");
         number = Double.parseDouble(input);
         employee1.setPay(number);
      input = JOptionPane.showInputDialog("How many hours did you work?");
         number = Double.parseDouble(input);
         employee1.setHours(number);
      
      JOptionPane.showMessageDialog(null, "Your gross pay is: $" + employee1.grossPay());
      
      System.exit(0);   
   }
}