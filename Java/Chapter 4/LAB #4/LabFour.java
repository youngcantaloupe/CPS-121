import java.util.Scanner;
import java.io.*;

public class LabFour {
   public static void main(String[] args) throws IOException {
   
      //create file method assign numbers.txt, then use scanner to read file.
      File file = new File ("Numbers.txt");
      Scanner inputFile = new Scanner(file);
      
      int readLine = 0;             //used to store most recent line read in numbers.txt.
      int greatest = -2147483647;   //will be raised to the greatest number in file in loop below.
      int least = 2147483647;       //will be lowered into smallest number in file in loop below.
      
      //loop reads each line and determines biggest and smallest numbers.
      while (readLine != -99) {
           //^this statement is to prevent potential numbers listed after -99 from being included
         readLine = inputFile.nextInt();
            
         if (readLine != -99) {
           //^this statement is to prevent -99 from being included
            if (readLine > greatest) {
               greatest = readLine; 
            }
            if (readLine < least) {
               least = readLine; 
            }
         }            
      }
      
      System.out.println("The smallest number is: " + least);
      System.out.println("The largest number is: " + greatest);
      //close file!
      inputFile.close();
   }
}