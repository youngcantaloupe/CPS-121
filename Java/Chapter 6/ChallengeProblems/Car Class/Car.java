public class Car {
   private int yearModel;
   private String make;
   private int speed;
   
   //constructors
   public Car(int year, String m) {
      yearModel = year;
      make = m;
      speed = 0;
   }
   //accessors
   public int getYear() {
      return yearModel;
   }
   public String getMake() {
      return make;
   }
   public int getSpeed() {
      return speed;
   }
   //accelerate
   public int accelerate() {
      final int increase = 5;
      speed += increase;
      return speed;
   }
   //brake
   public int brake() {
      final int decrease = 5;
      speed -= decrease;
      return speed;
   }
}