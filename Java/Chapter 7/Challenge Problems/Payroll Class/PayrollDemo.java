import java.util.Scanner;

public class PayrollDemo {
   public static void main(String[] args) {
      int hours;
      double payRate;
      
      Scanner keyboard = new Scanner(System.in);
      
      Payroll pr = new Payroll();
      
      for (int i = 0; i < pr.numEmployees; i++) {
         System.out.print("Enter the hours worked by employee number " + pr.getEmployeeIdAt(i) + ": ");
         hours = keyboard.nextInt();
         
         while (hours < 0 ) {
            System.out.print("ERROR: Enter 0 or greater for hours: ");
            hours = keyboard.nextInt();
         }
         
         System.out.print("Enter the hourly pay rate for employee number " + pr.getEmployeeIdAt(i) + ": ");
         payRate = keyboard.nextDouble();
         
         while (payRate < 6.0) {
            System.out.print("ERROR: Enter 6.00 or greater for pay rate: ");
            payRate = keyboard.nextDouble();
         }
         
         pr.setHoursAt(i, hours);
         pr.setPayRateAt(i, payRate);
      }
      
      System.out.println("\nPAYROLL DATA");
      System.out.println("============");
      for (int i = 0; i < pr.numEmployees; i++)
      {
         System.out.println("Employee ID: " +
                            pr.getEmployeeIdAt(i));
         System.out.printf("Gross pay: $%,.2f\n",
                           pr.getGrossPay(i));
      }
   }
}