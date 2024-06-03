import java.util.Scanner;
import java.io.*;

//this program reads data from a file.

public class FileReadDemo
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      
      //get filename
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();
      
      //open the file
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      //read lines from the file until none are left
      while (inputFile.hasNext())
      {
         //read next name
         String friendName = inputFile.nextLine();
         
         //display the last name read.
         System.out.println(friendName);
      }
      //close the file
      inputFile.close();
   }
}