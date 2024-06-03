/*
   modify distance traveled so it writes the report to a file instead of the screen
   open the file in notepad or a text editor to confirm the output. 
*/
import java.io.*;
import java.util.Scanner;
public class DistanceFile
{
   public static void main(String[] args) throws IOException
   {
      int speed;
      int time;
      int distance;
      int instances = 0;
      String filename;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the filename: ");
         filename = keyboard.nextLine();
         
      PrintWriter outputFile = new PrintWriter(filename);
      
      System.out.print("Enter the speed traveled: ");
         speed = keyboard.nextInt();
         while (speed < 0)
         {
            System.out.print("\nInvalid input, negative numbers not allowed." +
                               "\nEnter a positive value: ");
            speed = keyboard.nextInt();
         } 
                              
      System.out.print("Enter the hours spent traveling: ");
         time = keyboard.nextInt();
         while (time < 1)
         {
            System.out.print("\nInvalid input, must be at least 1 hour" +
                             "\nEnter hours spent traveling: ");
            time = keyboard.nextInt();
         }
         
      outputFile.println("\nHours\t\tDistance Traveled" +
                         "\n---------------------------------");
      
      while (time > instances)
      {
         ++instances;
         distance = instances * speed;
         outputFile.printf("%d\t\t\t%d\n",instances, distance);
      }
      outputFile.close();
      System.out.println("Data has been written to the file.");
   }
}