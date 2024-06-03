import java.util.Scanner;

public class PaintJobEstimatorWIP {

   public static void main(String[] args) {
      
      Scanner keyboard = new Scanner(System.in);
      
      double rooms;
      double paintPrice;
      double paintCost;
      double sqft;
      double defaultSQ = 115;
      double hourlyRate = 18;
      double hours;
      double totalHours;
      
      System.out.print("Enter number of rooms: ");
         rooms = keyboard.nextDouble();
      System.out.print("Enter price of paint: ");
         paintPrice = keyboard.nextDouble();
      System.out.print("Enter sq/ft of wall: ");
         sqft = keyboard.nextDouble();
      System.out.println(paintRequired(sqft, defaultSQ));
         
   }
   public static double paintRequired(double sqft, double defaultSQ, double gallons) {
      gallons = defaultSQ / sqft;
      
      return gallons; 
   }
   public static double hoursRequired(double gallons, double hours) {
      hours = gallons * 8;
      return hours;
   }
   public static double paintCost(double paintPrice, double paintCost, double gallons) {
      paintCost = paintPrice * gallons;
      return paintCost;
   }
   public static double laborCost(double hours, double totalHours, double hourlyRate) {
      totalHours = hourlyRate * hours;
      return totalHours;
   }
   public static double totalCost(double paintCost, double totalHours) {
      return paintCost + totalHours;
   }  
}