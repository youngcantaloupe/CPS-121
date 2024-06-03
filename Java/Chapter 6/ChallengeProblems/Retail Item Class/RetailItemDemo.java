public class RetailItemDemo {
   public static void main(String[] args) {
      //create objects
      RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
      RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
      RetailItem item3 = new RetailItem();
         item3.setDes("Shirt");
         item3.setUnits(20);
         item3.setPrice(24.95);
      
      //Display objects
      System.out.printf("----------------------------------------------------\n");
      System.out.printf("|                Retail Item Demo                  |\n");
      System.out.printf("----------------------------------------------------\n");
      System.out.printf("|        |   %-10s   | %-8s | %4s |%n", "DESCRIPTION", "UNITS ON HAND", "PRICE");
      System.out.printf("---------------------------------------------------\n");
      
      System.out.printf("| Item 1 | %-15s | %-13d | %4.2f |\n", item1.getDes(), item1.getUnits(), item1.getPrice());
      System.out.printf("| Item 2 | %-15s | %-13d | %4.2f |\n", item2.getDes(), item2.getUnits(), item2.getPrice());
      System.out.printf("| Item 3 | %-15s | %-13d | %4.2f |\n", item3.getDes(), item3.getUnits(), item3.getPrice());
      
      System.out.printf("----------------------------------------------------\n");
   }
}