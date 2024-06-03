public class Circle {
   //fields
   private double radius;              //to store user-inputted radius 
   private final double PI = 3.14159;  //constant PI for calculations
   
   //no-arg constructor
   public Circle() {
      radius = 0.0;
   }
   //constructor takes radius as an argument
   public Circle(double rad) {
      radius = rad;
   }
   //mutator to set radius if using no-arg constructor
   public void setRadius(double rad) {
      radius = rad;
   }
   //accessor to return value of radius when called
   public double getRadius() {
      return radius;
   }
   //accessor calculates and returns area with user-inputted radius and constant PI
   public double area() {
      double area = PI * radius * radius;
      return area;
   }
   //accessor calculates and returns diameter 
   public double diameter() {
      double diameter = radius * 2;
      return diameter;
   }
   //accessor calculates and returns circumference
   public double circumference() {
      double circumference = 2 * PI * radius;
      return circumference;
   }
}