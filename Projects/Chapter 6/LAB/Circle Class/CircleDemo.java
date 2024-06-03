import javax.swing.JOptionPane;

public class CircleDemo {
   public static void main(String[] args) {
      String input;
      
      //get user input (radius)
      input = JOptionPane.showInputDialog("Please enter a circle's radius.");
      
      //Create circle object, convert user-input String into double
      //passes converted double as an argument to second constructor in Circle.java
      Circle circle = new Circle(Double.parseDouble(input));

      //calls methods performing calculations from Circle.java and displays them
      JOptionPane.showMessageDialog(null, "Area: " + String.format("%,.2f", circle.area()) + " units^2" +  
                                          "\nDiameter: " + String.format("%,.2f", circle.diameter()) + " units" +
                                          "\nCircumference: " + String.format("%,.2f", circle.circumference()) + " units");
      System.exit(0);
   }
}