/*
   write a program that asks the user for the names of two files. the first file
   should be opened for reading and the second file should be opened for writing. 
   the program should read the contents of the first file, change all characters
   to uppercase, and store the results in the second file. the second file will
   be a copy of the first file, except that all the characters will be uppercase.
   use notepad or another text editor to creat a simple file that can be used to 
   test the program.
*/
import java.util.Scanner;
import java.io.*;
public class UppercaseFileConverter {
   public static void main(String[] args) throws IOException {
   
      File toUpperCase = new File("ToUpperCase.txt");
      Scanner readFile = new Scanner(toUpperCase);
      
      while (readFile.hasNext()) {
         String contents = readFile.nextLine();
         contents = contents.toUpperCase();
         
         PrintWriter outputFile = new PrintWriter("UpperCase.txt");
         outputFile.println(contents);
         
         outputFile.close();

      }
      readFile.close();
      System.out.println("Data has been apended.");
   }
}