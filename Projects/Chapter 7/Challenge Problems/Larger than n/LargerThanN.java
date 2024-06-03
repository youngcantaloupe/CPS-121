import java.util.Scanner;

public class LargerThanN {
   public static void main(String[] args) {
      
      Scanner keyboard = new Scanner(System.in);
      
      int number;
      int[] numbers = { 1, 2, 4, 8, 14, 24, 45, 56, 78, 99, 102 };
      
      System.out.println("Enter a number: ");
         number = keyboard.nextInt();
         
      isGreater(numbers, number);
   }
   
   public static void isGreater(int[] array, int n) {
      for (int numbers : array) {
         if (numbers > n) {
            System.out.println(numbers);
         }
      }
   }
}