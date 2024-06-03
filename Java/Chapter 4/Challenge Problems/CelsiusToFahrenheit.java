/*
   write a program that displays a table of Celsius temperatures 0 - 20 and their Fahrenheit equivalents
   F = (9/5)*C + 32
   your program must use a loop to display the table
*/

public class CelsiusToFahrenheit {

   public static void main(String[] args) {
      double fah,
             cel;
     
      System.out.println("Fahrenheit\t\tCelsius");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

      
      for (cel = 0; cel <= 20; cel++) {
         fah = (1.8 * cel) + 32;
         System.out.printf("%.1f\t\t|\t\t%.1f\n", fah, cel);
      }
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
   }
}