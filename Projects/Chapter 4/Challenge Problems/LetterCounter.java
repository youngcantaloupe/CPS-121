/*
   write a program that asks the user to enter a string, and then asks the user to enter a character. 
   the program should count and display the number of times that the specified character appears
   in the string.
*/
import java.util.Scanner;
public class LetterCounter {
   public static void main(String[] args) {
   
   int count = 0;
   String input;
   char letter;
   
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter a string: ");
   input = keyboard.nextLine();
   System.out.print("Enter a character: ");
   letter = keyboard.next().charAt(0);
   
   for (int i = 0; i < input.length(); i++) {
         if (input.charAt(i) == letter){
            count++;
         }
      }
     System.out.println("the letter " + letter + " appears " + count + " times.");
   }
}

