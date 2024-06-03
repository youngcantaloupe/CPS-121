public class RetailItem {
   private String description;
   private int unitsOnHand;
   private double price;
   
   //constructors
   public RetailItem() {
      description = "";
      unitsOnHand = 0;
      price = 0.0;
   }
   public RetailItem(String des, int units, double p) {
      description = des;
      unitsOnHand = units;
      price = p;
   } 
   //mutators
   public void setDes(String des) {
      description = des;
   }
   public void setUnits(int units) {
      unitsOnHand = units;
   }
   public void setPrice(double p) {
      price = p;
   }
   //accessors
   public String getDes() {
      return description;
   }
   public int getUnits() {
      return unitsOnHand;
   }
   public double getPrice() {
      return price;
   }
}