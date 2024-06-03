## Increment and Decrement

``` java
Number = number + 1;
Number += 1;

Number = number -1;
Number -= 1;
```

##### Instead
``` java
//Postfix
Number++;
Number--;
//Prefix also works
++number;
--number;
```

``` java
// This sets y to 1, THEN increments
// this if you print y, it will print 1 using postfix.
int x = 1, y;
Y = x++;
```

``` java
//This sets y to the increment of 1
// printing y will result in 2. This is because prefix adds 1 before it is printed.
int x = 1, y ;
Y = ++x;
```

## The while Loop

#### CONCEPT: A loop is a part of a program that repeats. 

General format for while loop:

``` java
while (BooleanExpression)
     Statement;
```

The Boolean Expression is tested, and if it is true, the Statement is executed. This cycle is repeated until the Boolean Expression is false.

The statement that is repeated is known as the body of the loop. And is considered a conditional statement.

``` java
public class WhileLoop {
	public static void main(String[] args) {
		int number = 1;
		
		while (number <= 5) {
			System.out.println("Hello");
			number++;
		}
		System.out.println("That's all!");
	}
}
```

The while loop is a pretest loop, which means it tests its expression before each iteration.

It is possible to create infinite loops by either taking out the increment or adding a semi-colon after the Boolean Expression.

``` java
import java.util.Scanner;

public class CheckTemperature {
	public static void main(String[] args) {
		final double MAX_TMEP = 102.5;
		double temperature;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the substance's Celsius temperature: ");
			temperature = keyboard.nextDouble();
		
		while (temperature > MAX_TEMP) {
			 System.out.println("The temperature is too high. Turn the");
	         System.out.println("thermostat down and wait 5 minutes.");
	         System.out.println("Then, take the Celsius temperature again");
	         System.out.print("and enter it here: ");
	         temperature = keyboard.nextDouble();
		}
			System.out.println("The temperature is acceptable.");
		    System.out.println("Check it again in 15 minutes.");
	}
}
```

## While loop Input Validation

``` java
import java.util.Scanner;
public class CleanInputLoop {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      int number;
      
      //get number from user
      System.out.print("Enter a number in the range of 1 through 100: ");
      number = keyboard.nextInt();

      //validate the input
      while (number < 1 || number > 100) {
        System.out.print("Invalid input. Enter a number in the range " +
                         "of 1 through 100: ");
        number = keyboard.nextInt();
     }
  }
```

The next example uses a slightly more complex system to validate user input to generate a soccer league.

``` java
import javax.swing.JOptionPane;
/*
   This program calculates the number of soccer teams that a youth league may
   create from the number of available players. Input validation is demonstrated
   with while loops.
*/
public class SoccerTeams {
   public static void main(String[] args) {
      final int MIN_PLAYERS = 9;       //min players per team
      final int MAX_PLAYERS = 15;      //max players per team
      int players = 0;                     //number of available players
      int teamSize = 0;                    //number of players per team
      int teams = 0;                       //number of teams
      int leftOver = 0;                    //number of left over players
      String input;                    //to hold user input
      
      //get number of players per team
      input = JOptionPane.showInputDialog("Enter the number of " + 
                                          "players per team.");
      teamSize = Integer.parseInt(input);

      //validate the number entered.
      while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS) {
         input = JOptionPane.showInputDialog("The number must " +
                                             "be at least " + MIN_PLAYERS +
                                             " and no more than " +
                                             MAX_PLAYERS + ". \n Enter " +
                                             "the number of players.");
         teamSize = Integer.parseInt(input);
      }
      
      //get the number of available players
      input = JOptionPane.showInputDialog("Enter the available " +
                                          "number of players.");
      players = Integer.parseInt(input);
      
      //validate the numbers entered.
      while (players < 0) {
         input = JOptionPane.showInputDialog("Enter 0 or " +
                                             "greater.");
         players = Integer.parseInt(input);
      }
      //calculate the number of teams
      teams = players / teamSize;
      //calculate the number of leftover players
      leftOver = players % teamSize;
      //display the results
      JOptionPane.showMessageDialog(null, "There will be " +
                                        teams + " teams with " +
                                        leftOver + 
                                        " players left over.");
      System.exit(0);
   }
}
```

## The do-while Loop
##### CONCEPT: The do-while loop is a posttest loop, which means its Boolean expression is tested after each iteration.

The do-while loop looks something like an inverted while loop.

##### Default single expression:
``` java
do
     Statement;
while (BooleanExpression);

default multi-statement:

do {
     Statement;
     Statement;
     //as many statements as necessary.
} while (BooleanExpression);
```
NOTE: the do-while loop must be terminated with a semicolon.

The do-while loop is a posttest loop. This means that it does no test its Boolean expression until it has competed an iteration. As a result, the do-while loop always performs at least one iteration, even if the Boolean expression is false to begin with. 

This differs from the while loop, which you will recall is a pretest loop. For example, tin the following while loop the println statement will not execute at all:
``` java
int x = 1;
while (x < 0)
     System.out.println(x);
```

But the println statement in the following do-while loop will execute once because the do-while loop does not evaluate the expression x < 0 until the end of the iteration:
``` java
int x = 1;
do
     System.out.println(x);
while(x < 0);
```

This is a user controlled loop. It runs through one iteration before asking the user if they want to continue the loop.

``` java
import java.util.Scanner;
// this program uses a user controlled loop.
public class TestAverage1 {
   public static void main(String[] args) {
      int score1, score2, score3;      //three test scores
      double average;                  //average test score
      char repeat;                     //to hold 'y' or 'n'
      String input;                    //to hold input
      
      System.out.println("This program calculates the " +
                        "average of three test scores.");
      
      //create scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //get as many sets of test scores as the user wants.
      do {
         System.out.print("Enter score #1: ");
         score1 = keyboard.nextInt();
         
         System.out.print("Enter score #2: ");
         score2 = keyboard.nextInt();
         
         System.out.print("Enter score #3: ");
         score3 = keyboard.nextInt();
         
         //consume the remaining newline
         keyboard.nextLine();
         
         //calculate and print the average test score
         average = (score1 + score2 + score3) / 3.0;
         System.out.println("The average is " + average);
         System.out.println(); // prints blank line
         
         //does the user want to average another set? 
         System.out.println("Would you like to average " +
                            "another set of test scores?");
         System.out.print("Enter Y for yes and N for no: ");
         input = keyboard.nextLine();     //read a line
         repeat = input.charAt(0);        //get the first char
      } while (repeat == 'Y' || repeat == 'y');
   }
}
```

## The for Loop

##### CONCEPT: the for loop is ideal for performing a known number of iterations.

In general, there are two categories of loops: conditional loops and count-controlled loops.

A conditional loop executes as long as a particular condition exists. A loop that repeats a specific number of times is known as a count-controlled loop.

A count-controlled loop must possess three elements:

1. it must initialize a control variable to a starting value.

2. It must test the control variable by comparing it to a maximum value. When the control variable reaches its maximum value, the loop terminates.

3. It must update the control variable during each iteration. This is usually done by incrementing the variable.

##### Default format:
``` java
for (Initialization; Test; Update)
     Statement;
// OR
for (Initialization; Test; Update) {
     Statement;
     Statement;
     //as many statements as necessary
}
```


The first line of the for loop is known as the loop header. After the key word for, there are three expressions inside the parentheses, separated by semicolons. 

(Notice there is not a semicolon after the third expression.) 

The first expression is the initialization expression. It is normally used to initialize a control variable to its starting value. This is the first action performed by the loop, and it is done only once. 

The second expression is the test expression. This is a boolean expression that controls the execution of the loop. As long as this expression is true, the body of the for loop will repeat. 

The for loop is a pretest loop, so it evaluates the test expression before each iteration. 

The third expression is the update expression. It executes at the end of each iteration. Typically, this is a statement that increments the loop’s control variable.

``` java
for (count = 1; count <= 5; count++)
     System.out.println(“Hello”);
```

You can also control the number in the body of the loop

``` java
for (number = 1; number <= 10; number++)
     System.out.print(number + “ “);
```

##### For loop Ex.
``` java
public class Squares {
   public static void main(String[] args) {
      int number; //loop control variable
      
      System.out.println("Number Number Squared");
      System.out.println("------------------------");
      
      for (number = 1; number <= 10; number++) {
         System.out.println(number + "\t\t|\t" +
                            number * number);
      }
   }
}
```

AVOID MODIFYING THE CONTROL VARIABLE IN THE BODY OF THE for LOOP

Other Forms of the Update Expression

Ex. Displays even numbers 2-100
``` java
for (number = 2; number <= 100; number += 2)
     System.out.println(number);
```

Ex. Counts backwards from 10-0
``` java
for (number = 10; number >=0; number--)
     System.out.println(number);
```

A USER CONTROLLED for LOOP
``` java
import java.util.Scanner;
public class UserSquares {
   public static void main(String[] args) {
      int number;    //loop control variable
      int maxValue;  //maximum value to display

      System.out.println("I will display a table of " +
                         "numbers and their squares.");
                         
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How high should I go? ");
      maxValue = keyboard.nextInt();
      
      System.out.println("Number Number Squared");
      System.out.println("------------------------");
      for (number = 1; number <= maxValue; number ++) {
         System.out.println(number + "\t\t|\t" +
                            number * number);
      }
   }
}
```

## Using Multiple Statements in the Initialization and Update Expressions

``` java
int x, y;
for (x = 1, y = 1; x <= 5; x++) {
     System.out.println(x + “ plus ” + y +
                       “ equals “ + (x + y));
}
```
INITIALIZATION - X = 1, y = 1

Connecting multiple statements with commas works well in the initialization and update expressions, but don’t try to connect multiple Boolean expressions this way in the test expression. 

If you wish to combine multiple Boolean expressions in the test expression, you must use the && or || operators.

``` java
public class SpeedConverter {
   public static void main(String[] args) {

      final int STARTING_KPH = 60;
      final int MAX_KPH = 130;
      final int INCREMENT = 10;
      
      int kph;
      double mph;
      
      System.out.println("KPH\t\tMPH");
      System.out.println("-------------");
      
      for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT) {
         mph = kph * 0.6214;
         System.out.printf("%d\t\t%.1f\n", kph, mph);
      }
   }
}
```

## RUNNING TOTALS AND SENTINEL VALUES

##### CONCEPT: a running total is a sum of number that accumulates with each iteration of a loop. The variable used to keep the running total is called an accumulator. A sentinel is a value that signals when the end of a list of values has been reached.

Many programming tasks require you to calculate the total of a series of numbers. For example, suppose you are writing a program that calculates a business’s total sales for a week. The program would read the sales for each day as input and calculate the total of those numbers.

Programs that calculate the total of a series of numbers typically use two elements:
- A loop that reads each number in the series.
- A variable that accumulates the total of the numbers as they are read.

``` java
import javax.swing.JOptionPane;
// this program calculates a running total
public class TotalSales {
   public static void main(String[] args) {
      int days;
      double sales;
      double totalSales;
      String input;
      
      input = JOptionPane.showInputDialog("For how many  days " +
                                          "do you have sales figures?");
      days = Integer.parseInt(input);
      totalSales = 0.0;
      for (int count = 1; count <= days; count++) {
         input = JOptionPane.showInputDialog("Enter the sales " +
                                             "for day " + count + ": ");
         sales = Double.parseDouble(input);
         totalSales += sales;
      }
      JOptionPane.showMessageDialog(null,
         String.format("The total sales are $%,.2f", totalSales));
      System.exit(0);
   }
}
```

## USING A SENTINAL VALUE

``` java
import java.util.Scanner;
/*
   This program calculates the total number of points a soccer team
   has earned over a series of games. the user enters a series of
   point values, then -1 when finished.
*/
public class SoccerPoints {
   public static void main(String[] args) {
      int points;             //game points
      int totalPoints = 0;    //accumulator initialized to 0
      
      Scanner keyboard = new Scanner(System.in);
      
      //display general instructions
      System.out.println("Enter the number of points your team");
      System.out.println("has earned for each game this season.");
      System.out.println("Enter -1 when finished.");
      System.out.println();
      
      //get first number of points
      System.out.print("Enter game points or -1 to end: ");
      points = keyboard.nextInt();
      
      //accumulate the points until -1 is entered
      while (points != -1) {
         //add points to total points
         totalPoints += points;
         
         //get the next number of points
         System.out.print("Enter game points or -1 to end: ");
         points = keyboard.nextInt();
      }
      
      //display the total number of points
      System.out.println("The total points are " +
                         totalPoints);
   }
}
```

## Nested Loops

##### CONCEPT: a loop inside another loop is called a nested loop. 

Nested loops are necessary when a task performs a repetitive operation and that task itself must be repeated. A clock is a good example of something that works like a nested loop.

``` java
public class Clock {
   public static void main(String[] args) {
      //simulate the clock
      for (int hours = 1; hours <= 12; hours ++) {
         for (int minutes = 0; minutes <= 59; minutes++) {
            for (int seconds = 0; seconds <= 59; seconds++) {
               System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
            }
         }
      }
   }
}

```

Key Points:
- An inner loop goes through all of its iterations for each iteration of an outer loop.
- Inner loops complete their iterations before the outer loops do.
- To get the total number of iterations of a nested loop, multiply the number of iterations of all the loops.

``` java
import java.util.Scanner;
//this program demonstrates a nested loop
public class TestAverage2 {
   public static void main(String[] args) {
      int numStudents,
          numTests,
          score,
          total;
      double average;
      
      Scanner keyboard = new Scanner(System.in);
      
      //get number of students
      System.out.print("How many students do you have? ");
      numStudents = keyboard.nextInt();
      
      //get number of test scores per student
      System.out.print("How many test scores per student? ");
      numTests = keyboard.nextInt();
	
      //process all the students
      for (int student = 1; student <= numStudents; student++) {
            total = 0; // set accumulator to 0
         //get test scores for a student.
         System.out.println("Student number " + student);
         System.out.println("-----------------");
         for (int test = 1; test <= numTests; test++) {
            System.out.print("Enter score " + test + ": ");
            score = keyboard.nextInt();
            total += score; // add score to total
         }
         //calculate and display average
         average = total / numTests;
         System.out.printf("The average for student %d is %.1f.\n\n",
                           student, average);
      }
   }
}

```

## Patterns

``` java
import java.util.Scanner;
//this program displays a rectangular pattern of *
public class RectangularPattern {
   public static void main(String[] args) {
      int rows, cols;
      
      Scanner keyboard = new Scanner(System.in);
      
      //get rows and cols
      System.out.print("How may rows? ");
      rows = keyboard.nextInt();
      System.out.print("how many columns? ");
      cols = keyboard.nextInt();
      
      for (int r = 0; r < rows; r++) {
         for (int c = 0; c < cols; c++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
```

``` java
import java.util.Scanner;
//this program demonstrates triangle pattern
public class TrianglePattern {
   public static void main(String[] args) {
      final int BASE_SIZE = 8;
      
      for (int r = 0; r < BASE_SIZE; r++) {
         for (int c = 0; c < (r + 1); c ++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
```

``` java
import java.util.Scanner;
//this program displays a stairstep pattern
public class StairStepPattern {
   public static void main(String[] args) {
      final int NUM_STEPS = 6;
      
      for (int r = 0; r < NUM_STEPS; r++) {
         for (int c = 0; c < r; c++) {
            System.out.print(" ");
         }
         System.out.println("#");
      }
   }
}
```

## THE BREAK AND CONTINUE STATEMENTS

##### CONCEPT: the break statement causes a loop to terminate early. The continue statement causes a loop to stop its current iteration and begin the next one.

These are considered taboo to use in loops, avoid when possible.

## DECIDING WHICH LOOP TO USE
##### CONCEPT: although most repetitive algorithms can be written with any of the three types of loops, each works best in different situations.

- THE while LOOP – the while loop is pretest loop. It is ideal in situations where you do not want the loop to iterate if the condition is false from the beginning. It is also ideal if you want to use a sentinel value to terminate the loop.
- THE do-while LOOP – the do-while loop is a posttest loop. It is ideal in situations where you always want the loop to iterate at least once.
- THE for LOOP – the for loop is a pretest loop that has built-in expressions for initializing, testing, and updating. These expressions make it very convenient to use a loop control variable as a counter. The for loop is ideal in situations where the exact number of iterations is known.

## INTRODUCTION TO FILE INPUT AND OUTPUT

##### CONCEPT: the Java API provides several classes that you can use for writing data to a file and reading data from a file. To write data to a file, you can use PrintWriter class and, optionally, the FileWriter class. To read data from a file, you can use the Scanner class and the File class.

In general, there are three steps that are taken when a file I used by a program:
1. The file must be opened. When the file is opened, a connection is created between the file and the program.
2. Data is then written to the file or read from the file.
3. When the program is finished using the file, the file must be closed.

The Java API provides a number of classes that you will use to work with files. To use these classes, you will place the following import statement near the top of your program

``` java
import java.io.*;
```

## USING THE PrintWriter CLASS TO WRITE DATA TO A FILE

##### DEFAULT FORMAT:

``` java
PrintWriter outputFile = new PrintWriter(“StudentData.txt”);
```

You may also pass a reference to a String object as an orgument ot the PrintWriter constructor. For example, in the following code the user specifies the name of the file.

``` java
String filename;
filename = JOptionPane.showInputDialog(“Enter the filename.”);
PrintWriter outputFile = new PrintWriter(filename);
```

Once you have created an instance of the PrintWriter class and opened a file, you can write data to the file using print and println methods.

``` java
outputFile.println(“Jim”);
```

When the program is finished writing data to the file, it must close the file.

``` java
outputFile.close();
```

``` java
public static void main(String[] args) throws IOException
```
## REVIEW WRITING TO FILE

1. You need the import java.io.*; statement in the top section of your program.
2. Because we have not yet learned how to respond to exceptions, any method that uses PrintWriter object must have a throwsIOException clause in its header.
3. You create a PrintWriter object and pass the name of the file as a string to the constructor.
4. You use the PrintWriter class’s print an println methods to write data to the file.
5. When finished writing to the file, you use the PrintWriter’s class’s close method to close the file.

## APPENDING DATA TO A FILE

To append data to an existing file, you first create an instance of the FileWriter class. You pass two arguments to the FileWriter constructor: a string containing the name of the file, and the Boolean value true.

``` java
FileWriter fwriter = new FileWriter(“MyFriends.txt”, true);
```

This statement creates a FileWriter object and opens the file MyFriends.txt for writing. Any data written to the file will be appened to the file’s existing contents. If the file does not exist, it will be created.

You still need to create a PrintWriter object so you can use the print and println methods to write data to the file. When you create the PrintWriter object, you pass a reference to the FileWriter object as an argument to the PrintWriter constructor.

``` java
FileWriter fwriter = new FileWriter(“MyFriends.txt”, true);
PrintWriter outputFile = new PrintWriter(fwriter);
```

## SPECIFYING THE FILE LOCATION

##### DEFAULT FORMAT
``` java
PrintWriter outputFile = new PrintWriter(“H:\\PriceList.txt”);
```

You only need to use double backslashes if the file’s path is in a string literal. If your program asks the user to enter a path into a String object, which is then passed to the PrintWriter or FileWriter constructor, the user does not have to enter double backslashes.
##### TIP:
“C:\\MyData\\Data.txt”
“C:/MyData/Data.txt”

## READING DATA FROM A FILE

Recall that the System.in object represents the keyboard. Passing System.in as an argument to the Scanner constructor specifies that the keyboard is the Scanner object’s source of input.

You can also use the Scanner class to read input from a file. Instead of passing System.in to the Scanner class constructor, you pass a reference to a File object.

``` java
File myFile = new File(“Customers.txt”);
Scanner inputFile = new Scanner(myFile);
```

You must use the Scanner class’s close method to close the file inputFile.close();

## READING LINES FROM A FILE WITH THE nextLine METHOD

The Scanner class’s nextLine method reads a line of input, and returns the line as a String.

## READING PRIMATIVE VALUES FROM A FILE

You can use nextDouble method to read a floating-point value from a file.

## REVIEW READING DATA FROM FILE
1. Import java.util.Scanner; so you can use the Scanner class. Import java.io.*; This is required by the File class.
2. Because we have not yet learned how to respond to exceptions, any method that uses a scanner object to open a file must have a throws IOException clause in its header.
3. You create a File object and pass the name of the file as a string to the constructor.
4. You create a Scanner object and pass a reference to the File object as an argument to the constructor.
5. You use the scanner class’s nextLine method to read a line from the file. The method returns the line of data as a string. To read primitive values, use methods such as nextInt and nextDouble.
6. Call the Scanner class’s hasNext method to determine whether there is more data to read from the file. If the method returns true, then the rei more data to read. If the method returns false, you have reached the end of the file.
7. When finishing writing to the file, you use the Scanner class’s close method to close the file.

## CHECKING FOR A FILE’S EXISTENCE

After you create a File object representing the file that you want to open, you can use the File class’s exists method to determine whether the file exists. The method returns true if the file exists, and false if the file does not exist.

``` java
import java.util.Scanner;           //needed for scanner class
import java.io.*;                   //neede for file I/O classes
//this program writes data to a file
public class FileWriteDemo2 {
   public static void main(String[] args) throws IOException {
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
      if (file.exists()) {
         System.out.println("The file " + filename + 
                            " already exists.");
         System.exit(0);
      }
      //open the file
      PrintWriter outputFile = new PrintWriter(filename);
      
      //get data and write it into the file
      for (int i = 1; i <= numFriends; i++) {
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
```

``` java
import java.util.Scanner;
import java.io.*;
//this version of the program confirms that the Numbers.txt file exists before opening it
public class FileSum2 {
   public static void main(String[] args) throws IOException {
      double sum = 0.0; //accumulator, initialized to 0
      //make sure the file exists
      //open the file for reading
      File file = new File("Numbers.txt");
      Scanner inputFile = new Scanner(file);
      if (!file.exists()) {
         System.out.println("The file Numbers.txt is not found.");
         System.exit(0);
      }
      //read all the values from the file
      //and calculate their total
      while (inputFile.hasNext()) {
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
```

``` java
import java.util.Scanner;
import java.io.*;
//this program reads data from a file.
public class FileReadDemo {
   public static void main(String[] args) throws IOException {
      Scanner keyboard = new Scanner(System.in);
      //get filename
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();
      //open the file
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      //read lines from the file until none are left
      while (inputFile.hasNext()) {
         //read next name
         String friendName = inputFile.nextLine();
         //display the last name read.
         System.out.println(friendName);
      }
      //close the file
      inputFile.close();
   }
}
```

``` java
import java.util.Scanner;
import java.io.*;
//this program reads the first line from a file.
public class ReadFirstLine {
   public static void main(String[] args) throws IOException {
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
```

## GENERATING RANDOM NUMBERS WITH Random CLASS

##### CONCEPT: random numbers are used in a variety of applications. Java provides the Random class that you can use to generate random numbers.

##### DEFAULT FORMAT:
``` java
import java.util.Random;
```
##### CREATE OBJECT:
``` java
Random randomNumbers = new Random();
```

``` java
  import java.util.Scanner;
  import java.util.Random;
  /**
     This program simulates the rolling of dice.
  */
  public class RollDice {
    public static void main(String[] args) {
      String again = "y";    // To control the loop
      int die1;              // To hold the value of die #1
      int die2;              // to hold the value of die #2
      // Create a Scanner object to read keyboard input.
      Scanner keyboard = new Scanner(System.in);
      // Create a Random object to generate random numbers.
      Random rand = new Random();
      // Simulate rolling the dice.
      while (again.equalsIgnoreCase("y")) {
         System.out.println("Rolling the dice . . . ");
         die1 = rand.nextInt(6) + 1;
         die2 = rand.nextInt(6) + 1;
         System.out.println("Their values are:");
         System.out.println(die1 + " " + die2);
         System.out.print("Roll them again (y = yes)? ");
         again = keyboard.nextLine();
      }
    }
  }
```

``` java
import java.util.Scanner;
import java.util.Random;
// this program demonstrates the random class
public class MathTutor {
   public static void main(String[] args) {
      int number1;
      int number2;
      int sum;
      int userAnswer;
      
      Scanner keyboard = new Scanner(System.in);
      Random randomNumbers = new Random();
      //get two random numbers
      number1 = randomNumbers.nextInt(100);
      number2 = randomNumbers.nextInt(100);
      //display an addition problem
      System.out.println("What is the answer to the " + 
                         "following problem?");
      System.out.print(number1 + " + " + 
                       number2 + " + ? ");
      //calculate the answer
      sum = number1 + number2;
      //get the user's answer
      userAnswer = keyboard.nextInt();
      //display the user's results
      if (userAnswer == sum)
         System.out.println("Correct!");
      else {
         System.out.println("Sorry, wrong answer. " +
                            "The correct answer is " +
                            sum);
      }
   }
}
```

``` java
 import java.util.Random;
  /**
     This program simulates 10 tosses of a coin.
  */
  public class CoinToss {
     public static void main(String[] args) {
        // Create a Random object to generate random numbers.
        Random rand = new Random();
        // Simulate the coin tosses.
        for (int count = 0; count < 10; count++) {
           if (rand.nextInt(2) == 0)
              System.out.println("Tails");
           else
             System.out.println("Heads");
        }
    }
  }
```

