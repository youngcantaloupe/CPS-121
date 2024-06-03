/*
write a program that asks the user to enter three names, and then
displays the names sorted in acending order. for example, if the user
entered "Charlie", "Leslie", and "Andy", the program would display

Andy
Charlie
Leslie
*/

import java.util.Scanner;
import java.util.Arrays;

public class SortedNames
{
   public static void main(String[] args)
   {
      String nameOne,
             nameTwo,
             nameThree;
             
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Enter a first name: ");
      nameOne = keyboard.nextLine();
   System.out.print("Enter a second name: ");
      nameTwo = keyboard.nextLine();
   System.out.print("Enter a third name: ");
      nameThree = keyboard.nextLine();
//create an array with the strings inputed and sort them
      String[] names = { nameOne, nameTwo, nameThree };
      Arrays.sort(names);
      
//print sorted array of strings
      System.out.println("\nSorted names:");
      for (String name : names)
      {
         System.out.println(name);
      }
   }
}