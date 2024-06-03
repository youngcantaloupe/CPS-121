import java.util.Scanner;
import java.io.*;

//this version of the program confirms that the Numbers.txt file exists before opening it

public class FileSum2
{
   public static void main(String[] args) throws IOException
   {
      double sum = 0.0; //accumulator, initialized to 0
      
      //make sure the file exists
      //open the file for reading
      File file = new File("Numbers.txt");
      Scanner inputFile = new Scanner(file);
      if (!file.exists())
      {
         System.out.println("The file Numbers.txt is not found.");
         System.exit(0);
      }
      
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