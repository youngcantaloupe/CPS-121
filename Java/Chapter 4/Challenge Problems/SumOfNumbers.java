/*
write a program that asks the user for a positive nonzero integer value. the program should
use a loop to get the sum of all the integers from 1 up to the number entered.
*/

import java.util.Scanner;
public class SumOfNumbers
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int num1;
      int num2 = 0;
      int num3 = 0;
      System.out.print("Enter a positive value: ");
      num1 = keyboard.nextInt();
      
      //use another var to store added numbers? 
      
      while (num1 > num2)
      {
         ++num2;
         num3 += num2;
      }
      System.out.println(num3);
   }
}