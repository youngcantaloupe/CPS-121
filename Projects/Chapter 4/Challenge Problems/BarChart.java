/*
   write a program that asks the user to enter today's sales for five stores. the program should display
   a bar chart comparing each store's sales. create each bar chart by displaying a row of *. each
   * should represent $100 of sales. 
*/
import java.util.Scanner;
public class BarChart {

   public static void main(String[] args) {
   
      Scanner keyboard = new Scanner(System.in);
      
      int storeOne = 0;
      int storeTwo = 0;
      int storeThree = 0;
      int storeFour = 0;
      int storeFive = 0;
   
      for (int count = 1; count <= 5; count++) {
         System.out.print("Enter today's sales for store " + count + ": ");
         int sales = keyboard.nextInt();
         switch (count) {
            case 1:
               storeOne = sales;
               break;
            case 2:
               storeTwo = sales;
               break;
            case 3:
               storeThree = sales;
               break;
            case 4:
               storeFour = sales;
               break;
            case 5:
               storeFive = sales;
               break;
            default:
               System.out.println("Invalid store number.");
         }
      }
      int starOne = storeOne / 100;
      int starTwo = storeTwo / 100;
      int starThree = storeThree / 100;
      int starFour = storeFour / 100;
      int starFive = storeFive / 100;
      
      System.out.println("SALES BAR CHART");
      System.out.print("Store 1: ");
      for (int star = 0; star < starOne; star++) {
         System.out.print("*");
      }
      System.out.println();
      System.out.print("Store 2: ");
      for (int star = 0; star < starTwo; star++) {
         System.out.print("*");
      }
      System.out.println();
      System.out.print("Store 3: ");
      for (int star = 0; star < starThree; star++) {
         System.out.print("*");
      }
      System.out.println();
      System.out.print("Store 4: ");
      for (int star = 0; star < starFour; star++) {
         System.out.print("*");
      }
      System.out.println();
      System.out.print("Store 5: ");
      for (int star = 0; star < starFive; star++) {
         System.out.print("*");
      }                    
   }
}