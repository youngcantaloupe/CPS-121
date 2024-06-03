import java.util.Scanner;
import java.io.*;

//this program reads the first line from a file.

public class ReadFirstLine
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      
      //get the file name
      System.out.print("Enter the name of the file: ");
      String filename = keyboard.nextLine();
      
      //open the file
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      //read the first line from the file
      String line = inputFile.nextLine();
      
      //display the line
      System.out.println("The first line the file is: ");
      System.out.println(line);
      
      //close the file
      inputFile.close();
   }
}