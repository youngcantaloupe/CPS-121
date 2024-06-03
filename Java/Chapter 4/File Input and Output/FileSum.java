import java.util.Scanner;
import java.io.*;

//this program reads a series of number from a file and accumulates their sum

public class FileSum
{
   public static void main(String[] args) throws IOException
   {
      double sum = 0.0; //accumulator, initialized to 0
      
      //open the file for reading
      File file = new File("Numbers.txt");
      Scanner inputFile = new Scanner(file);
      
      //read all the values from the file
      //and calculate their total
      while (inputFile.hasNext())
      {
         //read a value from the file
         double number = inputFile.nextDouble();
         
         //add the number to the sum.
         sum = sum + number;
      }
      //close the file
      inputFile.close();
      
      //display the sum of the numbers
      System.out.println("The sum of the numbers in " +
                         "Numbers.txt is " + sum);
   }
}