The if Statement

import java.util.Scanner;

//this program demonstrates the if statement and the scanner utility

public class AverageScore

{

   public static void main(String [] args)

   {

   double score1,    //score #1

          score2,    //score #2

          score3,    //score #3

          average;   //average score

          //create a scanner object to read input

          Scanner keyboard = new Scanner(System.in);

          System.out.println("This program averages 3 test scores.");

          //Get the first score

          System.out.print("Enter score #1: ");

          score1 = keyboard.nextDouble();

          //get second score

          System.out.print("Enter score #2: ");

          score2 = keyboard.nextDouble();

          //get the third score

          System.out.print("Enter score #3: ");

          score3 = keyboard.nextDouble();

          //calculate and display average score

          average = (score1 + score2 + score3) / 3.0;

          System.out.println("The average is " + average);

          //if the average is higher than 95, congratulate the user.

          if (average > 95)

            System.out.println("That's a great score!");

   }

}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

if else Statements

import java.util.Scanner;

//this program demonstrates the if-else statement

public class Division

{

   public static void main(String [] args)

   {

   double number1, number2;   //division operands

   double quotient;           //result of division

   //create scanner object for keyboard input

   Scanner keyboard = new Scanner(System.in);

   //get the first number

   System.out.print("Enter a number: ");

      number1 = keyboard.nextDouble();

   //get the second number

   System.out.print("Enter another number: ");

      number2 = keyboard.nextDouble();

   if (number2 == 0)

      {

         System.out.println("Division by zero is not possible.");

         System.out.println("Please run the program again and ");

         System.out.println("enter a number other than zero");

      }

      else

      {

         quotient =  number1 / number2;

         System.out.print("The quotient of " + number1);

         System.out.print(" divided by " + number2);

         System.out.println(" is " + quotient);

      }

   }

}

  

Nested if else Statements

import java.util.Scanner;

public class NestedDecisionStructure

{

   public static void main(String[] args)

   {

   Scanner keyboard = new Scanner(System.in);

   int testScore;

   System.out.print("What is your test score? ");

      testScore = keyboard.nextInt();

   if (testScore < 60)

   {

      System.out.println("Your grade is F.");

   }

   else

   {

      if (testScore < 70)

      {

         System.out.println("Your grade is D.");

      }

      else

      {

         if (testScore < 80)

         {

            System.out.println("Your grade is C.");

         }

         else

         {

            if (testScore < 90)

            {

               System.out.println("Your grade is B.");

            }

            else

            {

               if (testScore < 100)

               {

                  System.out.println("Your grade is A.");

               }

            }

         }

      }

   }

   }

}

import java.util.Scanner;

//this program demonstrates a nested if statement

public class LoanQualifier

{

   public static void main(String[] args)

   {

   double salary;

   double yearsOnJob;

   //create scanner object for keyboard input

   Scanner keyboard = new Scanner(System.in);

   //get users salary

   System.out.print("Enter your annual salary: ");

   salary = keyboard.nextDouble();

   //get number of years at current job

   System.out.print("Enter the number of years " +

                   "at your current job: ");

   yearsOnJob = keyboard.nextDouble();

   //determine if qualified

   if (salary >= 50000)

   {

         if (yearsOnJob >= 2)

         {

            System.out.println("You qualify for the loan.");

         }

         else

         {

            System.out.println("You must have been on your current job " +

                              "for at least two years to qualify.");

         }

   }

   else

   {

      System.out.println("You must earn at least $50,000 per year to " +

                           "qualify.");

   }

   }

}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

if else if Statements

import javax.swing.JOptionPane;

/*

   this program asks the user to enter a numeric test score and displays

   a letter grade for the score. the program uses an if-else-if statement

   to determine the letter grade.

*/

public class TestResults

{

   public static void main(String[] args)

   {

   int testScore;    //numeric test score

   String input;     //to hold user's input

   //get the numeric test score

   input = JOptionPane.showInputDialog("Enter your numeric test score " +

                                       "and I will tell you the grade: ");

   testScore = Integer.parseInt(input);

   //display the grade

   if (testScore < 60)

      JOptionPane.showMessageDialog(null, "Your grade is F.");

   else if (testScore < 70)

      JOptionPane.showMessageDialog(null, "Your grade is D.");

    else if (testScore < 80)

      JOptionPane.showMessageDialog(null, "Your grade is C.");

    else if (testScore < 90)

      JOptionPane.showMessageDialog(null, "Your grade is B.");

    else if (testScore < 100)

      JOptionPane.showMessageDialog(null, "Your grade is A.");

    //trailing else used to catch errors

    else

      JOptionPane.showMessageDialog(null, "Invalid score.");

   System.exit(0);

   }

}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

Logical Operators

&& - AND - Connects two boolean expressions into one. Both expressions

            must be true for the overall expression to be true.

|| - OR  -  Connects two boolean expressions into one. One or both expressions

            must be true for the overall expression to be true. it is only

            necessary for one to be true, and it does not matter which one.

!  - NOT -  The ! operator reverses the truth of a boolean expression.

            If it is applied to an expression that is true, the operator

            returns false. If it is applied to an expression that is false,

            the operator returns true.

EX.

x > y && a < b    ~~~~~~~~~ Is x greater than y AND less than b?

x == y || x == z ~~~~~~~~ Is x equal to y OR is x equal to z?

! (x > y) ~~~~~~~~~~~~~~~ Is the expression x > y NOT true?

Precedence of all operators so far

Order of Precedence

Operators

Description

1

− (unary negation) !

Unary negation, logical NOT

2

* / %

Multiplication, division, modulus

3

+ −

Addition, subtraction

4

< > <= >=

Less than, greater than, less than or equal to, greater than or equal to

5

== !=

Equal to, not equal to

6

&&

Logical AND

7

||

Logical OR

8

= += −= *= /= %=

Assignment and combined assignment

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

Logical AND

import java.util.Scanner;

//this program demonstrates the logical && operator

public class LogicalAnd

{

   public static void main(String[] args)

   {

   double salary;       //annual salary

   double yearsOnJob;   //years at current job

   //create scanner class

   Scanner keyboard = new Scanner(System.in);

   //get users annual salary

   System.out.print("Enter your annual salary: ");

   salary = keyboard.nextDouble();

   //get users number of years on the job

   System.out.print("Enter the number of years at the current job: ");

   yearsOnJob = keyboard.nextDouble();

      //determine if user qualifies

      if (salary >= 50000 && yearsOnJob >= 2)

      {

         System.out.println("You qualify for the loan.");

      }

      else

      {

         System.out.println("You do not qualify for the loan.");

      }

   }

}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

Logical OR

import java.util.Scanner;

//this program demonstrates the logical || operator

public class LogicalOr

{

   public static void main(String[] args)

   {

   double salary;       //annual salary

   double yearsOnJob;   //years on job

   //create scanner class

   Scanner keyboard = new Scanner(System.in);

   //get users annual salary

   System.out.print("Enter your annual salary: ");

   salary = keyboard.nextDouble();

   //get users years on job

   System.out.print("Enter number of years on the job: ");

   yearsOnJob = keyboard.nextDouble();

      //determine qualification

      if (salary >= 50000 || yearsOnJob >= 2)

      {

         System.out.println("You Qualify for the loan.");

      }

      else

      {

         System.out.println("You do not qualify");

      }

   }

}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

Comparing Strings

You can compare String objects to string literals.

      if (name1.equals("Mark"))

To determine whether two strings are not equal apply ! operator

      if (!name1.equals("Mark"))

      StringReference.compareTo(OtherString)

StringReference is a variable that references a String object, and OtherString is either another variable that references a String object or a string literal. The method returns an integer value that can be used in the following manner:

      If the method's return value is negative, the string referenced by StringReference (the          calling object) is less than the OtherString argument.

      If the method's return value is 0, the two strings are equal.

      If the method's return value is postive, the string referenced by StringReference (the              calling object) is greater than the OtherString argument.

EX.

//statement uses compareTo method to compare two strings.

if (name1.compareTo(name2) == 0)

      System.out.println("The names are the same.");

//compares the string referenced by name1 to the string literal "Joe".

if (name1.compareTo("Joe") == 0)

      System.out.println("The names are the same.");

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

String Compare Using Equal Method

//this program correctly comares two string objects using the equals method

public class StringCompare

{

   public static void main(String[] args)

   {

   String name1 = "Mark",

          name2 = "Mark",

          name3 = "Mary";

          //compare "Mark" and "Mark"

          if (name1.equals(name2))

          {

            System.out.println(name1 + " and " + name2 +

                              " are the same.");

          }

          else

          {

            System.out.println(name1 + " and " + name2 +

                              " are NOT the same.");

          }

          //compare "Mark" and "Mary"

          if (name1.equals(name3))

          {

            System.out.println(name1 + " and " + name3 +

                              " are the same.");

          }

          else

          {

            System.out.println(name1 + " and " + name3 +

                              " are NOT the same.");

          }

   }

}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

String Compare Using compareTo method

//This program compares two String objects using the compareTo method

public class StringCompareTo

{

   public static void main(String[] args)

   {

      String name1 = "Mary",

             name2 = "Mark";

      //compare "Mary" and "Mark"

      if (name1.compareTo (name2) < 0)

      {

         System.out.println(name1 + " is less than " + name2);

      }

      else if (name1.compareTo (name2) == 0)

      {

         System.out.println(name1 + " is equal to " + name2);

      }

      else if (name1.compareTo (name2) > 0)

      {

         System.out.println(name1 + " is greater than " + name2);

      }

   }

}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

Variable Scope

import java.util.Scanner;

/*

This program demonstrates how variables can be declared in various 

locations throughout the program

*/

public class VariableScope

{

   public static void main(String[] args)

   {

   //create scanner class

   Scanner keyboard = new Scanner(System.in);

   //get user's first name

   System.out.print("Enter your first name: ");

   String firstName;

   firstName = keyboard.nextLine();

   //get user's last name

   System.out.print("Enter your last name: ");

   String lastName;

   lastName = keyboard.nextLine();

   //display message

   System.out.println("Hello " + firstName + " " + lastName + ".");

   }

}

  

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Conditional Operator

the conditonal opererator takes three operands and is considered a ternary operator.

This provides a shorthand way of expressing a simple if-else statement. the operator

consists of a ? and a :

ex.

BooleanExpression ? Value1: Value2;

the BooleanExpression is like the boolean expression in the parentheses of an

if statement. If the BooleanExpression is ture, then the value of the conditional

expression is Value1. Otherwise, the value is Value2.

ex.

y = x < 0 ? 10: 20;

same statement in if form

fi (x < 0)

      y = 10;

else

      y = 20;

This gives you the power to condense decision-making power into concise code

ex.

System.out.println("Your grade is: " +

      (score < 60 ? "Fail." : "Pass."));

same statement in if form

if (score < 60)

      System.out.println("Your grade is: Fail.");

else

      System.out.println("Your grade is: Pass.");

  

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

The switch Statement

The switch statement lets the value of a variable or expression to determine

where the program will branch to.

general format

switch (testExpression)

{

      case value_1:

            statement;

            statement;

            etc.

            break;

      case value_2:

            statement;

            statement;

            etc.

            break;

      Insert as many case sections as neccesary

      case value_N:

            statement;

            statement;

            etc.

            break;

      default:

            statement;

            statement;

            etc.

            break;

}

  

ex.

 1 import java.util.Scanner;

 2

 3  /**

 4     This program demonstrates the switch statement.

 5  */

 6

 7  public class SwitchDemo

 8  {

 9       public static void main(String[] args)

10       {

11         int number;   // A number entered by the user

12

13      // Create a Scanner object for keyboard input.

14         Scanner keyboard = new Scanner(System.in);

15

16         // Get one of the numbers 1, 2, or 3 from the user.

17         System.out.print("Enter 1, 2, or 3: ");

18         number = keyboard.nextInt();

19

20         // Determine the number entered.

21         switch (number)

22         {

23            case 1:

24               System.out.println("You entered 1.");

25               break;

26            case 2:

27               System.out.println("You entered 2.");

28               break;

29            case 3:

30               System.out.println("You entered 3.");

31               break;

32            default:

33               System.out.println("That's not 1, 2, or 3!");

34         }

35     }

36  }

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

Formatted output using System.out.printf and String.format

the System.out.printf method allows you to format output in a variety of ways.

The String.format method allows you to format a string, without displaying it.

the string can be displayed at a later time.

general method

System.out.printf(FormatString, ArgumentsList)

ex.

double sales = 12345.67;

System.out.printf("Our sale are %f for the day.\n", sales);

The letter f in the format specifier is a vonversion character that

indicates the data type of the arguement that is being formatted.

You can use the f conversion character with any argument that is a

float or double.

If you want to format an integer value, you must use the %d format specifier.

The d conversion character stands for decimal ingeger, and it can be used with

arguments of the int, short, and long data types.

ex.

int hours = 40;

System.out.printf("I worked %d hours this week.\n, hours);

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Format Specifier Syntax

In the previous examples you saw how format specifiers correspond to the arguments

that appear after the format string. Now you can learn how to use format specifiers to

actually format the values that they correspond to. When displaying numbers, the general

syntax for writing a format specifier is:

%[flags] [width] [.precision] conversion

  

Summary

% - all format specifiers begin with %

flags - after the % charater, one or mor optional flags may appear. Flags cause the value to be formatted in a variety of ways.

width - after any flags, you can optionally specify the minimum field width for the value.

.precision - if the value is a floating-point number, after the minimum field width, you can optionally specify theprecision. This is the number of decimal places that the number should be rounded to.

conversioin - all format specifiers must end with a conversion character, such as f for floating-point, or d for decimal integer.

ex. precision

double temp = 78.42819;

System.out.printf("The tempurature is %.2f degrees.\n", temp);

      the .2 after the % will round to two decimal places

Keep in mind that you can only specify precision only with floating-point values. If you specify a precision with a %d format specifier, an error will occur.

ex. width

double number = 12345.6789;

System.out.printf("The number is:%20f\n", number);

      the number 20 will tell the program to display the variable number in a field that is a minimum of 20 spaces wide

      setting the minimum field witdh will work for integers and floating-point values.

ex. combining

double number = 12345.6789;

System.out.printf("The number is:%12.2f\n", number);

      output:

The number is:   12345.68

  

field widths can help if you want to print numbers aligned in columns.

ex.

/**

 2     This program displays a variety of

 3     floating-point numbers in a column

 4     with their decimal points aligned.

 5  */

 6

 7  public class Columns

 8  {

 9     public static void main(String[] args)

10     {

11        // Declare a variety of double variables.

12        double num1 = 127.899;

13        double num2 = 3465.148;

14        double num3 = 3.776;

15        double num4 = 264.821;

16        double num5 = 88.081;

17        double num6 = 1799.999;

18

19        // Display each variable in a field of

20        // 8 spaces with 2 decimal places.

21        System.out.printf("%8.2f\n", num1);

22        System.out.printf("%8.2f\n", num2);

23        System.out.printf("%8.2f\n", num3);

24        System.out.printf("%8.2f\n", num4);

25        System.out.printf("%8.2f\n", num5);

26        System.out.printf("%8.2f\n", num6);

27     }

28  }

      output:

   127.90

3465.15

       3.78

   264.82

     88.08

1800.00

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

Flags

flags can be used for the following purposes

      to display numbers with comma separators

      to pad numbers with leading zeros

      to left-justify numbers

flag specifiers go before the field width and the precision

comma separators

ex.

double amount = 1234567.89;

System.out.printf("%,f\n", amount);

      output:

1,234,567.890000

ex combination.

double sales = 28756.89;

System.out.printf("Sales for the month are %,.2f\n", sales);

      output:

Sales for the month are 28,756.89

Displaying currency amounts ex.

/**

   This program demonstrates how to use the System.out.printf

   method to format a number as currency

*/

public class CurrencyFormat

{

   public static void main(String[] args)

   {

      double monthlyPay = 5000.0;

      double annualPay = monthlyPay * 12;

      System.out.printf("Your annual pay is $%,.2f\n", annualPay);

   }

}  

      output:

Your annual pay is $60,000.00

ex. floating-point number with comma separators, in a field of 15 spaces, rounded to two decimal places

double amount = 1234567.8901;

System.out.printf("%,15.2f\n"n amount);

      output:

1,234,567.89

ex. int with min field of 6 characters

int number = 200;

System.out.printf("The number is:%6d", number);

      output:

The number is: 200

ex. int with comma separators, and minimum field width of 10 characters

int number - 20000;

System.out.printf("The number is: %,10d", number);

      output:

The number is: 20,000

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Padding numbers with leading zeros

Sometimes, when a number is shorter than the field in which it is displayed, you want to pad the number with leading zeros. If you insert a - flag into a format specifier, the resulting number will be padded with leading zeros, if it is shorter than the field width.

ex. pad with zeros, field width of 8 and round to one decimal place.

double = number 123.4;

System.out.printf("The number is:%08.1f\n", number);

      output:

The number is:000123.4

Padding with zeros works with floating-points and integers

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

Left-Justifying Numbers

By default, when a number is shorter than the field in which it is displayed, the number is right-justified within that field. If you want a number to be left-justified within its field, you must insert a - flag into the format specifier.

ex. left justified

/*

   This program displays a variety of

   numbers left-justified in columns.

*/

public class LeftJustified

{

   public static void main(String[] args)

   {

      //declare a variety of int variables

      int num1 = 123;

      int num2 = 12;

      int num3 = 45678;

      int num4 = 456;

      int num5 = 1234567;

      int num6 = 1234;

      //display each variable left-justified

      //in a field of 8 spaces

      System.out.printf("%-8d%-8d\n", num1, num2);

      System.out.printf("%-8d%-8d\n", num3, num4);

      System.out.printf("%-8d%-8d\n", num5, num6);

   }

}

      output:

123           12     

45678      456    

1234567 1234

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  

Formatting String Arguments

if you wish to print a string arguement, use the %s format specifier

ex.

String name = "Ringo";

System.out.printf("Your name is %s\n", name);

      output:

Your name is Ringo

PRINTING DIFFERENT DATA TYPES

int hours = 40;

double pay = hours * 25;

String name = "Jay";

System.out.printf("Name: %s, Hours: %d, Pay: $%,.2f\n",

            name, hours, pay);

      output:

Name: Jay, Hours: 40, Pay: $1,000.00

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

The String.format Method

The System.out.printf method formats a string and displays it in the console window. Sometimes you need to format a string without displaying it. For example, you might need to display formatted output in a graphical interface, such as a message dialog. When this is the case, you can use the String.format method.

The String.format method works exactly like the System.out.printf method, except that it does not display the formatted string on the screen. Instead, it returns a reference to the formatted string. You can assign a reference to avaliable, and then use it later.

general format

String.format(FormatString, ArgumentsList)

  

ex.

import javax.swing.JOptionPane;

/*

   This program demonstrates how to use the String.format

   method to format a number as currency

*/

public class CurrencyFormat2

{

   public static void main(String[] args)

   {

      double monthlyPay = 5000.0;

      double annualPay = monthlyPay * 12;

      String output = String.format("Your annual pay is $%,.2f",

                                    annualPay);

      JOptionPane.showMessageDialog(null, output);

   }

}

      output:

Your annual  pay is $60,000.00

ex. the program above can be simplified by calling the String.format mehtod, and passing the value that it returns to the JOptionPane.showMessageDialog method. This allows us to elimiate the declaration of the output variable.

import javax.swing.JOptionPane;

/*

   This program demonstrates how to use the String.format

   method to format a number as currency

*/

public class CurrencyFormat3

{

   public static void main(String[] args)

   {

      double monthlyPay = 5000.00;

      double annualPay = monthlyPay * 12;

      JOptionPane.showMessageDialog(null,

            String.format("Your annual pay is $%,.2f", annualPay));

   }

}

      output:

Your annual  pay is $60,000.00


![[CSO_Gaddis_Java_Chapter03_7e.ppt]]