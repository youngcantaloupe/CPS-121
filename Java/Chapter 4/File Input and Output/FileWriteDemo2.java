import java.util.Scanner;           //needed for scanner class
import java.io.*;                   //neede for file I/O classes

//this program writes data to a file

public class FileWriteDemo2
{
   public static void main(String[] args) throws IOException
   {
      String filename;     //file name
      String friendName;    //friend's name
      int numFriends;      //number of friends
      
      Scanner keyboard = new Scanner(System.in);
      
      //get number of friends
      System.out.print("How many friends do you have? ");
      numFriends = keyboard.nextInt();
      
      //consume the remaining newline character
      keyboard.nextLine();
      
      //get filename
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
      
      //make sure the file does not exist
      File file = new File(filename);
      if (file.exists())
      {
         System.out.println("The file " + filename + 
                            " already exists.");
         System.exit(0);
      }
      
      //open the file
      PrintWriter outputFile = new PrintWriter(filename);
      
      //get data and write it into the file
      for (int i = 1; i <= numFriends; i++)
      {
         //get the name of a friend
         System.out.print("enter the name of friend " + 
                          "number " + i + ": ");
         friendName = keyboard.nextLine();
         
         //write the name to the file
         outputFile.println(friendName);
      }
      
      //close the file
      outputFile.close();
      System.out.println("Data has written to the file.");
   }
}