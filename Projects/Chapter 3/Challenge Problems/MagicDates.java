/*
write a program that asks the user to enter a month (in numeric form), a day, and a two-digit year. 
the program should then determine whether the month times the day is equal to the year. if so,
it should display a message saying the date is magic. Otherwise, it should display that the date is not magic.
*/
import java.util.Scanner;

public class MagicDates
{
    public static void main(String[] args)
    {
      int month;
      int day;
      int year;
      
      //import scanner
      Scanner keyboard = new Scanner(System.in);
        
        //get user input for month day and year
        System.out.print("Enter a month in numerical form: ");
         month = keyboard.nextInt();
         
        System.out.print("Enter a day in numerical form: ");
         day = keyboard.nextInt();
         
        System.out.print("Enter a two digit year: ");
         year = keyboard.nextInt();
         
        //see if the date is magical
        if (month * day == year)
         System.out.println("This date is magic.");
        
        else
         System.out.println("This date is not magic.");
         
        
    }    
}
