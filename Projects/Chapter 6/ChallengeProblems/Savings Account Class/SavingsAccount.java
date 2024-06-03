public class SavingsAccount {
   private double annualInterestRate;
   private double balance;
   private double months;
   private double interestTotal;
   private double monthlyInterestRate;
   private double depositTotal;
   private double withdrawTotal;
   
   //constructors
   public SavingsAccount() {
      annualInterestRate = 0.0;
      balance = 0.0;
      months = 0.0;
   }
   public SavingsAccount(double startBal) {
      annualInterestRate = 0.0;
      balance = startBal;
      months = 0.0;
   }
   //mutators
   public void setInterestRate(double itr) {
      annualInterestRate = itr;
      monthlyInterestRate = annualInterestRate / 12;
   }
   public void setBalance(double startBal) {
      balance = startBal;
   }
   public void setMonths(double mo) {
      months = mo;
   }
   public void deposit(double amount) {
      balance += amount;
      depositTotal += amount;
   }
   public void withdraw(double amount) {
      balance -= amount;
      withdrawTotal += amount;
   }
   public void setMonthlyInterest() {
      interestTotal = (monthlyInterestRate * balance) + interestTotal;
      balance = (monthlyInterestRate * balance) + balance;
   }
   //accessors
   public double getAnnualInterestRate() {
      return annualInterestRate;
   }
   public double getBalance() {
      return balance;
   }
   public double getMonths() {
      return months;
   }
   public double getMonthlyInterest() {
      return monthlyInterestRate;
   }
   public double getInterestTotal() {
      return interestTotal;
   }
   public double getDepositTotal() {
      return depositTotal;
   }
   public double getWithdrawTotal() {
      return withdrawTotal;
   }
}