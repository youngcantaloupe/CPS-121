import java.util.Scanner;

public class CircleDemo2 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      double input;
      
      //create circle object using no-arg constructor
      Circle circle = new Circle();
            
      //get user-input, pass input as argument to setRadius method 
      //sets radius of circle object allowing for calculation methods to run below
      System.out.print("Enter a circle's radius: ");
         input = keyboard.nextDouble();
         circle.setRadius(input);
         
      //display table, using printf formating, table breaks at 100,000 radius
      //calls accessors in Circle.java, returns calculations to display
      System.out.printf("--------------------------------------------------------\n");
      System.out.printf("|                     Circle Demo 2                    |\n");
      System.out.printf("--------------------------------------------------------\n");
      System.out.printf("| %-16s | %-14s | %-16s |\n", "AREA", "DIAMETER", "CIRCUMFERENCE"); 
      System.out.printf("--------------------------------------------------------\n");
      System.out.printf("| %,-16.2f | %,-14.2f | %,-16.2f |\n", circle.area(), circle.diameter(), circle.circumference());
      System.out.printf("--------------------------------------------------------\n");
   }
}