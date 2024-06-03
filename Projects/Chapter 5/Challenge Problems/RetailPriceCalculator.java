import java.util.Scanner;
public class RetailPriceCalculator {

   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
   
   double wholesale;
   double markup;
   double retailPrice;
   
   System.out.print("Enter wholesale cost: ");
      wholesale = keyboard.nextDouble();
   System.out.print("Enter markup percentage: ");
      markup = keyboard.nextInt();
      
   markup = markup / 100.0;
   retailPrice = calculateRetail(wholesale, markup);
   
   System.out.printf("The retail price is $%.2f\n", retailPrice);
   }
   public static double calculateRetail(double wholesale, double markupPercent) {
      double retail = wholesale + (wholesale * markupPercent);
      return retail;
   }
}