/*
   write a program with a loop that lets the user enter a series of integers. the user should
   enter -99 to signal the end of the series. after all the numbers have been entered, the
   program should display the largest and smallest numbers entered.
   
   the input should be acquired using a .txt file named numbers.txt
*/

import java.util.Scanner;
import java.io.*;

public class LargestAndSmallest {
   public static void main(String[] args) throws IOException {

   Scanner keyboard = new Scanner(System.in);
   
   //creating numbers.txt and checking if it already exists
   File file = new File("Numbers.txt");
      if (file.exists()) {
         System.out.println("The file Numbers.txt already exists.");
         System.exit(0);
      }
   
   //creating printwriter to write to numbers.txt
   PrintWriter outputFile = new PrintWriter("Numbers.txt");
   
   int input = 0;       //this stores numbers entered by user to write to numbers.txt
   int iterations = 1;  //this sentinal value controls number of times loop is run
   
   //loop will run until -99 is entered
   while (input != -99) {
      
      System.out.print("Enter -99 to exit. Enter number " + iterations + ": ");
      input = keyboard.nextInt();
      
      //this is to avoid -99 from being written to the numbers.txt file
      if (input != -99) {
         outputFile.println(input);
         ++iterations;
      }
   }

   outputFile.close();
   
   //creating scanner to read from file
   Scanner inputFile = new Scanner(file);
   
   int greatest = -2147483647;      //set at lowest possible int. this will be increased to the largest number in the loop below.
   int least = 2147483647;          //set at highest possible int. this will be lowered to the smallest number in the loop below.
   
/*
   this loop runs until the file has no more lines.
   it stores the current line into readNumber and checks if the value 
   is greater/less than the previous value stored in variables.
   this will end up with the biggest and smallest numbers stored in greatest and least. 
*/  
   while (inputFile.hasNext()) {
      int readNumber = inputFile.nextInt();
      
      if (readNumber > greatest) {
         greatest = readNumber; 
      }
      if (readNumber < least) {
         least = readNumber; 
      }
   }
   System.out.println("The smallest number is: " + least);
   System.out.println("The largest number is: " + greatest);
   inputFile.close();
   }
}