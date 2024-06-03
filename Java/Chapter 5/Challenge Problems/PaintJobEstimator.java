import java.util.Scanner;

public class PaintJobEstimator {

   public static void main(String[] args) {
      
         int numRooms;
         int sqft;
         int gallons;
         double paintPrice;
         double laborCost;
         double totalCost;
      
      numRooms = getRooms();
      
      gallons = getGallons(numRooms);
      
      paintPrice = getPaintPrice(gallons);
      
      laborCost = getLaborCharges(gallons);
      
      totalCost = getTotalCost(paintPrice, laborCost);
      
         //total cost of paint job
         System.out.printf("The total cost: $%.2f.", totalCost);
   }
      //total number of rooms
      public static int getRooms() {
      Scanner keyboard = new Scanner(System.in);

         int rooms;
         
         System.out.print("Enter number of rooms: ");
            rooms = keyboard.nextInt();
         return rooms;
      }
      //num of gallons required
      public static int getGallons(int rooms) {
         Scanner keyboard = new Scanner(System.in);
         
         final int defaultSQ = 115;
         int total = 0;
         int sqft = 0;
         
         for (int i = 1; i <= rooms; i++) {
            
            System.out.print("Enter sq/ft for room " + i + ": ");
                sqft = keyboard.nextInt();
                total += sqft;
         }
         int numGallons = total / defaultSQ;
         return numGallons;
      }
      //cost of paint
      public static double getPaintPrice(double numGallons) {
         Scanner keyboard = new Scanner(System.in);
         
         double pricePerGallon;
         double total;
         
         System.out.print("Enter price of paint per gallon: ");
            pricePerGallon = keyboard.nextDouble();
            
         total = pricePerGallon * numGallons;
         return total;
      }
      //hours of labor required
      //labor charges
      public static double getLaborCharges(int numGallons) {
         
         double hours = numGallons * 8;
         final double hourlyRate = 18;
         double total = hours * hourlyRate;
         
         return total;
      }
      //total cost 
      public static double getTotalCost(double paintPrice, double laborCost) {
      
         double total = paintPrice + laborCost;
         
         return total;
      }
}