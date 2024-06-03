public class Payroll {
   private String name;
   private double idNumber;
   private double payRate;
   private double hours;
   
   //no-arg constructor
   public Payroll() {
      name = "";
      idNumber = 0;
      payRate = 0.0;
      hours = 0;
   }
   
   //mutators
   public void setName(String n) {
      name = n;
   }
   public void setID(double id) {
      idNumber = id;
   }
   public void setPay(double pay) {
      payRate = pay;
   }
   public void setHours(double h) {
      hours = h;
   }
   //accessors
   public String getName() {
      return name;
   }
   public double getID() {
      return idNumber;
   }
   public double getPay() {
      return payRate;
   }
   public double getHours() {
      return hours;
   }
   //grosspay calculation
   public Double grossPay() {
      return hours * payRate;
   }
}