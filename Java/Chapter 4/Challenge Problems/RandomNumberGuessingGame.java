/*
   write a program that generates a random number and ask the user to guess what
   the number is. if the user's guess is higher than the random number, the program
   should display "Too high, try again." if the user's guess is lower than the random
   number the program should display "Too low, try again." the program should use
   a loop that repeats until the user correctly guesses the random number.
*/
import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuessingGame {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      Random randomNumbers = new Random();
      
      int number;
      int userNumber;
      number = randomNumbers.nextInt(100) + 1;
      
      System.out.print("A random number between 1-100 has been generated, \nEnter your guess: ");
         userNumber = keyboard.nextInt();
         
      while (userNumber != number) {
         if (userNumber > number) {
            System.out.print("Too high, try again: ");
            userNumber = keyboard.nextInt();
         }
         if (userNumber < number) {
            System.out.print("Too low, try again: ");
            userNumber = keyboard.nextInt();
         }
      }  
      if (userNumber == number) {
         System.out.print("Correct! The random number is " + number + ".");
      } 
   }
}