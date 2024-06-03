/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/

// Insert any necessary import statements here.
import java.util.Scanner;
public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
   public static double getLength() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter length: ");
         double length = keyboard.nextDouble();
      return length;
   }
   public static double getWidth() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter width: ");
         double width = keyboard.nextDouble();
      return width;
   }
   public static double getArea(double length, double width) {
      return length * width;
   }
   public static void displayData(double length, double width, double area) {
      System.out.println("Length: " + length +
                         "\nWidth: " + width +
                         "\nArea: " + area);
   }
}

