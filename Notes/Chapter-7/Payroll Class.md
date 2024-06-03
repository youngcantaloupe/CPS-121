``` java
/**
   The Payroll class stores data about a payroll
   for the Payroll Class programming challenge.
*/

public class Payroll
{
   public final int NUM_EMPLOYEES = 7; // Number of employees
   // Employee ID numbers
   private int[] employeeId = { 5658845, 4520125, 7895122,
                                8777541, 8451277, 1302850,
                                7580489 };
                                
   // Array to hold hours worked
   private int[] hours = new int[NUM_EMPLOYEES];
   
   // Array to hold pay rates
   private double[] payRate = new double[NUM_EMPLOYEES];
   
   // Array to hold gross wages
   private double[] wages = new double[NUM_EMPLOYEES];

   /**
      The getGrossPay method returns the gross pay
      for the employee whose data is stored at a
      specified element of each array.
      @param i The specified element.
      @return The value stored at the specified element.
   */

   public double getGrossPay(int i)
   {
      return hours[i] * payRate[i];
   }
   
   /**
      The setEmployeeIdAt method stores an ID number
      at a specified element of the employeeId array.
      @param i The specified element.
      @param id The ID number to store.
   */

   public void setEmployeeIdAt(int i, int id)
   {
      employeeId[i] = id;
   }

   /**
      The setHoursAt method stores a number of hours
      at a specified element of the hours array.
      @param i The specified element.
      @param h The ID number of hours to store.
   */
   
   public void setHoursAt(int i, int h)
   {
      hours[i] = h;
   }

   /**
      The setPayRateAt method stores a pay rate
      at a specified element of the payRate array.
      @param i The specified element.
      @param p The pay rate to store.
   */
   
   public void setPayRateAt(int i, double p)
   {
      payRate[i] = p;
   }

   /**
      The setWages method stores an amount of wages
      at a specified element of the wages array.
      @param i The specified element.
      @param w The wages to store.
   */
   
   public void setWages(int i, double w)
   {
      wages[i] = w;
   }

   /**
      The getEmployeeIdAt method returns the ID number
      at a specified element of the employeeId array.
      @param i The specified element.
      @param id The ID number found at element i.
   */
   
   public int getEmployeeIdAt(int i)
   {
      return employeeId[i];
   }

   /**
      The getHoursAt method returns the hours found
      at a specified element of the hours array.
      @param i The specified element.
      @param id The hours found at element i.
   */

   public int getHoursAt(int i)
   {
      return hours[i];
   }

   /**
      The getPayRateAt method returns the pay rate
      found at a specified element of the payRate array.
      @param i The specified element.
      @param id The pay rate found at element i.
   */
   
   public double getPayRateAt(int i)
   {
      return payRate[i];
   }

   /**
      The getWages method returns the wages found
      at a specified element of the wages array.
      @param i The specified element.
      @param id The wages found at element i.
   */
   
   public double getWages(int i)
   {
      return wages[i];
   }
}
```

``` java
import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Payroll Class programming challenge.
*/

public class PayrollDemo
{
   public static void main(String[] args)
   {
      int hours;        // Hours worked
      double payRate;   // Hourly pay rate

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Create a Payroll object.
      Payroll pr = new Payroll();

      // Get the hours and pay rate for each employee.
      for (int i = 0; i < pr.NUM_EMPLOYEES; i++)
      {
         // Get the hours worked.
         System.out.print("Enter the hours worked by employee " +
                          "number " + pr.getEmployeeIdAt(i) +
                          ": ");
         hours = keyboard.nextInt();

         // Validate hours worked.
         while (hours < 0)
         {
            System.out.print("ERROR: Enter 0 or greater for hours: ");
            hours = keyboard.nextInt();
         }

         // Get the hourly pay rate.
         System.out.print("Enter the hourly pay rate for employee " +
                          "number " + pr.getEmployeeIdAt(i) +
                          ": ");
         payRate = keyboard.nextDouble();

         // Validate pay rate.
         while (payRate < 6.0)
         {
            System.out.print("ERROR: Enter 6.00 or greater for pay rate: ");
            payRate = keyboard.nextDouble();
         }

         // Store the data in the pr object.
         pr.setHoursAt(i, hours);
         pr.setPayRateAt(i, payRate);
      }

      // Display the payroll data for each employee.
      System.out.println("\nPAYROLL DATA");
      System.out.println("============");
      for (int i = 0; i < pr.NUM_EMPLOYEES; i++)
      {
         System.out.println("Employee ID: " +
                            pr.getEmployeeIdAt(i));
         System.out.printf("Gross pay: $%,.2f\n",
                           pr.getGrossPay(i));
      }
   }
}


```