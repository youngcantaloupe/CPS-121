public class CallCar {
   public static void main(String[] args) {
      Car car = new Car(99, "Honda");
      
      System.out.println("Year Model: " + car.getYear());
      System.out.println("Make: " + car.getMake());
      
      System.out.println("\nAccelerating!");
      
      car.accelerate();
      System.out.println(car.getSpeed());
      car.accelerate();
      System.out.println(car.getSpeed());
      car.accelerate();
      System.out.println(car.getSpeed());
      car.accelerate();
      System.out.println(car.getSpeed());
      car.accelerate();
      System.out.println(car.getSpeed());
      
      System.out.println("\nBraking!");
      
      car.brake();
      System.out.println(car.getSpeed());
      car.brake();
      System.out.println(car.getSpeed());
      car.brake();
      System.out.println(car.getSpeed());
      car.brake();
      System.out.println(car.getSpeed());
      car.brake();
      System.out.println(car.getSpeed());


   }
}