public class Payroll {
   public final int numEmployees = 7;

   private int[] employeeID = { 1000, 1001, 1002, 1003, 1004, 1005, 1006 };
   
   private int[] hours = new int[numEmployees];
   private double[] payRate = new double[numEmployees];
   private double[] wages = new double[numEmployees];
   
   public double getGrossPay(int i) {
      return hours[i] * payRate[i];
   }
   
   public void setEmployeeIdAt(int i, int id) {
      employeeID[i] = id;
   }
   
   public void setHoursAt(int i, int h) {
      hours[i] = h;
   }
   
   public void setPayRateAt(int i, double p) {
      payRate[i] = p;
   }
   
   public void setWages(int i, double w) {
      wages[i] = w;
   }
   
   public int getEmployeeIdAt(int i) {
      return employeeID[i];
   }
   
   public int getHoursAt(int i) {
      return hours[i];
   }
   
   public double getPayRateAt(int i) {
      return payRate[i];
   }
   
   public double getWages(int i) {
      return wages[i];
   }
}