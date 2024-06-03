Chapter 4

Increment and Decrement

Number = number + 1;

Number += 1;

Number = number -1;

Number -= 1;

INSTEAD

Postfix

Number++;

Number--;

Prefix also works

++number;

--number;

Int x = 1, y;

Y = x++;

This sets y to 1, THEN increments

     Note: this if you print y, it will print 1 using postfix.

Int x = 1, y ;

Y = ++x;

This sets y to the increment of 1

Note: printing y will result in 2. This is because prefix adds 1 before it is printed.

The while Loop

CONCEPT: A loop is a part of a program that repeats.

General format for while loop:

While (BooleanExpression)

     Statement;

The Boolean Expression is tested, and if it is true, the Statement is executed. This cycle is repeated until the Boolean Expression is false.

The statement that is repeated is known as the body of the loop. And is considered a conditional statement.

 1 // this program demonstrates the while loop  
 2  
 3 public class WhileLoop 4 {  
 5    public static void main(String[] args) 6    { 7       int number = 1; 8        9       while (number <= 5)10       {11          System.out.println("Hello");  
12          number++;13       }14       15       System.out.println("That's all!");  
16    }17 }

The wile loop is a pretest loop, which means it tests its expression before each iteration.

It is possible to create infinite loops by either taking out the increment or adding a semi-colon after the Boolean Expression.

  

Applied ex. Of while loop

1 import java.util.Scanner; 2  
 3 /*  
 4    this program assists the technician in the process of chekcing a substance's temp. 5 */  
 6 public class CheckTemperature 7 {  
 8    public static void main(String[] args) 9    {10       final double MAX_TEMP = 102.5;   //max temp  
11       double temperature;              //holds temp  
12       13       Scanner keyboard = new Scanner(System.in);14       15       System.out.print("Enter the substance's Celsius temperature: ");  
16       temperature = keyboard.nextDouble();17       18       //as long as necessary, instruct technician to adjust temp  
19       while (temperature > MAX_TEMP)20       {21          System.out.println("The temperature is too high. Turn the");  
22          System.out.println("thermostat down and wait 5 minutes.");  
23          System.out.println("Then, take the Celsius temperature again");  
24          System.out.print("and enter it here: ");  
25          temperature = keyboard.nextDouble();26       }27       //remind the technitcian to check temp again in 15 mins.  
28       System.out.println("The temperature is acceptable.");  
29       System.out.println("Check it again in 15 minutes.");  
30       31       32    }33 }

  

Using the while Loop for Input Validation

CONCEPT: The while loop can be used to create input routines that repeat until acceptable data is entered.

1 import java.util.Scanner; 2 public class CleanInputLoop 3 {  
 4    public static void main(String[] args) 5    { 6       Scanner keyboard = new Scanner(System.in); 7        8       int number; 9       10       //get number from user  
11       System.out.print("Enter a number in the range of 1 through 100: ");  
12       number = keyboard.nextInt();13       14       //validate the input  
15       while (number < 1 || number > 100)16       {17          System.out.print("Invalid input. Enter a number in the range " +18                           "of 1 through 100: ");  
19          number = keyboard.nextInt();20       }21    }22 }

The next example uses a slightly more complex system to validate user input to generate a soccer league.  

1 import javax.swing.JOptionPane; 2 /*  
 3    This program calculates the number of soccer teams that a youth league may 4    create from the number of available players. Input validation is demonstrated 5    with while loops. 6 */  
 7  
 8 public class SoccerTeams 9 {  
10    public static void main(String[] args)11    {12       final int MIN_PLAYERS = 9;       //min players per team  
13       final int MAX_PLAYERS = 15;      //max players per team  
14       int players = 0;                     //number of available players  
15       int teamSize = 0;                    //number of players per team  
16       int teams = 0;                       //number of teams  
17       int leftOver = 0;                    //number of left over players  
18       String input;                    //to hold user input  
19       20       //get number of players per team  
21       input = JOptionPane.showInputDialog("Enter the number of " +22                                           "players per team.");  
23       teamSize = Integer.parseInt(input);24       25       //validate the number entered.  
26       while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)27       {28          input = JOptionPane.showInputDialog("The number must " +29                                              "be at least " + MIN_PLAYERS +30                                              " and no more than " +31                                              MAX_PLAYERS + ". \n Enter " +32                                              "the number of players.");  
33          teamSize = Integer.parseInt(input);34       }35       36       //get the number of available players  
37       input = JOptionPane.showInputDialog("Enter the available " +38                                           "number of players.");  
39       players = Integer.parseInt(input);40       41       //validate the numbers entered.  
42       while (players < 0)43       {44          input = JOptionPane.showInputDialog("Enter 0 or " +45                                              "greater.");  
46          players = Integer.parseInt(input);47       }48       49       //calculate the number of teams  
50       teams = players / teamSize;51       52       //calculate the number of leftover players  
53       leftOver = players % teamSize;54       55       //display the results  
56       JOptionPane.showMessageDialog(null, "There will be " +57                                         teams + " teams with " +58                                         leftOver +59                                         " players left over.");  
60       System.exit(0);61    }62 }

  

The do-while Loop

CONCEPT: The do-while loop is a posttest loop, which means its Boolean expression is tested after each iteration.

The do-while loop looks something like an inverted while loop.

Default single expression:

Do

     Statement;

While (BooleanExpression);

Default multi-statement:

Do

{

     Statement;

     Statement;

     //as many statements as necessary.

} while (BooleanExpression);

NOTE: the do-while loop must be terminated with a semicolon.

The do-while loop is a posttest loop. This means that it does no test its Boolean expression until it has competed an iteration. As a result, the do-while loop always performs at least one iteration, even if the Boolean expression is false to begin with. This differs from the while loop, which you will recall is a pretest loop. For example, tin the following while loop the println statement will not execute at all:

Int x = 1;

While (x < 0)

     System.out.println(x);

But the println statement in the following do-while loop will execute once because the do-while loop does not evaluate the expression x < 0 until the end of the iteration:

Int x = 1;

Do

     System.out.println(x);

While(x < 0);

  

This is a user controlled loop. It runs through one iteration before asking the user if they want to continue the loop.

1 import java.util.Scanner; 2 // this program uses a user controlled loop.  
 3  
 4 public class TestAverage1 5 {  
 6    public static void main(String[] args) 7    { 8       int score1, score2, score3;      //three test scores  
 9       double average;                  //average test score  
10       char repeat;                     //to hold 'y' or 'n'  
11       String input;                    //to hold input  
12       13       System.out.println("This program calculates the " +14                         "average of three test scores.");  
15       16       //create scanner object  
17       Scanner keyboard = new Scanner(System.in);18       19       //get as many sets of test scores as the user wants.  
20       do  
21       {22          System.out.print("Enter score #1: ");  
23          score1 = keyboard.nextInt();24          25          System.out.print("Enter score #2: ");  
26          score2 = keyboard.nextInt();27          28          System.out.print("Enter score #3: ");  
29          score3 = keyboard.nextInt();30          31          //consume the remaining newline  
32          keyboard.nextLine();33          34          //calculate and print the average test score  
35          average = (score1 + score2 + score3) / 3.0;36          System.out.println("The average is " + average);37          System.out.println(); // prints blank line  
38          39          //does the user want to average another set?  
40          System.out.println("Would you like to average " +41                             "another set of test scores?");  
42          System.out.print("Enter Y for yes and N for no: ");  
43          input = keyboard.nextLine();     //read a line  
44          repeat = input.charAt(0);        //get the first char  
45          46       } while (repeat == 'Y' || repeat == 'y');  
47    }48 }

  

The for Loop

CONCEPT: the for loop is ideal for performing a known number of iterations.

In general, there are two categories of loops: conditional loops and count-controlled loops. A conditional loop executes as long as a particular condition exists. A loop that repeats a specific number of times is known as a count-controlled loop.

A count-controlled loop must possess three elements:

1. it must initialize a control variable to a starting value.

2. It must test the control variable by comparing it to a maximum value. When the control variable reaches its maximum value, the loop terminates.

3. It must update the control variable during each iteration. This is usually done by incrementing the variable.

Default format:

For (Initialization; Test; Update)

     Statement;

Or

For (Initialization; Test; Update)

{

     Statement;

     Statement;

     //as many statements as necessary

}

The first line of the for loop is known as the loop header. After the key word for, there are three expressions inside the parentheses, separated by semicolons. (Notice there is not a semicolon after the third expression.) The first expression is the initialization expression. It is normally used to initialize a control variable to its starting value. This is the first action performed by the loop, and it is done only once. The second expression is the test expression. This is a boolean expression that controls the execution of the loop. As long as this expression is true, the body of the for loop will repeat. The for loop is a pretest loop, so it evaluates the test expression before each iteration. The third expression is the update expression. It executes at the end of each iteration. Typically, this is a statement that increments the loop’s control variable.

Ex

For (count = 1; count <= 5; count++)

     System.out.println(“Hello”);

You can also use the control number in the body of the loop

Ex

For (number = 1; number <= 10; number++)

     System.out.print(number + “ “);

1 // this program demonstrates the for loop  
 2  
 3 public class Squares 4 {  
 5    public static void main(String[] args) 6    { 7       int number; //loop control variable  
 8        9       System.out.println("Number Number Squared");  
10       System.out.println("------------------------");  
11       12       for (number = 1; number <= 10; number++)13       {14          System.out.println(number + "\t\t|\t" +15                             number * number);16       }17    }18 }

AVOID MODIFYING THE CONTROL VARIABLE IN THE BODY OF THE for LOOP

Other Forms of the Update Expression

Ex. Displays even numbers 2-100

For (number = 2; number <= 100; number += 2)

     System.out.println(number);

Ex. Counts backwards from 10-0

For (number = 10; number >=0; number--)

     System.out.println(number);

  

A USER CONTROLLED for LOOP

1 import java.util.Scanner; 2  
 3 //this program demonstrates a user controlled for loop  
 4  
 5 public class UserSquares 6 {  
 7    public static void main(String[] args) 8    { 9       int number;    //loop control variable  
10       int maxValue;  //maximum value to display  
11       12       System.out.println("I will display a table of " +13                          "numbers and their squares.");  
14                          15       //create scanner object  
16       Scanner keyboard = new Scanner(System.in);17       18       //get max value to display  
19       System.out.print("How high should I go? ");  
20       maxValue = keyboard.nextInt();21       22       //display table  
23       System.out.println("Number Number Squared");  
24       System.out.println("------------------------");  
25       for (number = 1; number <= maxValue; number ++)26       {27          System.out.println(number + "\t\t|\t" +28                             number * number);29       }30    }31 }

  

Using Multiple Statements in the Initialization and Update Expressions

Int x, y;

For (x = 1, y = 1; x <= 5; x++)

{

     System.out.println(x + “ plus ” + y +

                       “ equals “ + (x + y));

}

INITIALIZATION =

X = 1, y = 1

Connecting multiple statements with commas works well in the initialization and update expressions, but don’t try to connect multiple Boolean expressions this way in the test expression. If you wish to combine multiple Boolean expressions in the test expression, you must use the && or || operators.

1 // this program displays a table of speeds in KPH converted to MPH  
 2  
 3 public class SpeedConverter 4 {  
 5    public static void main(String[] args) 6    { 7       //constants  
 8       final int STARTING_KPH = 60; 9       final int MAX_KPH = 130;10       final int INCREMENT = 10;11       12       //variables  
13       int kph;14       double mph;15       16       //display table headings  
17       System.out.println("KPH\t\tMPH");  
18       System.out.println("-------------");  
19       20       //display the speeds  
21       for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT)22       {23          //calculate the mph.  
24          mph = kph * 0.6214;25          26          //display the speeds in kph and mph.  
27          System.out.printf("%d\t\t%.1f\n", kph, mph);  
28       }29    }30 }

  

RUNNING TOTALS AND SENTINEL VALUES

CONCEPT: a running total is a sum of number that accumulates with each iteration of a loop. The variable used to keep the running total is called an accumulator. A sentinel is a value that signals when the end of a list of values has been reached.

Many programming tasks require you to calculate the total of a series of numbers. For example, suppose you are writing a program that calculates a business’s total sales for a week. The program would read the sales for each day as input and calculate the total of those numbers.

Programs that calculate the total of a series of numbers typically use two elements:

·         A loop that reads each number in the series.

·         A variable that accumulates the total of the numbers as they are read.

1 import javax.swing.JOptionPane; 2  
 3 // this program calculates a running total  
 4  
 5 public class TotalSales 6 {  
 7    public static void main(String[] args) 8    { 9       int days;10       double sales;11       double totalSales;12       String input;13       14       //get number of days  
15       input = JOptionPane.showInputDialog("For how many  days " +16                                           "do you have sales figures?");  
17       days = Integer.parseInt(input);18       19       //set accumulator to 0  
20       totalSales = 0.0;21       22       //get sales figures and calculate a running total  
23       for (int count = 1; count <= days; count++)24       {25          input = JOptionPane.showInputDialog("Enter the sales " +26                                              "for day " + count + ": ");  
27          sales = Double.parseDouble(input);28          totalSales += sales;29       }30       //display total sales.  
31       JOptionPane.showMessageDialog(null,  
32          String.format("The total sales are $%,.2f", totalSales));  
33          34       System.exit(0);35    }36 }

USING A SENTINAL VALUE

1 import java.util.Scanner; 2 /*  
 3    This program calculates the total number of points a soccer team 4    has earned over a series of games. the user enters a series of 5    point values, then -1 when finished. 6 */  
 7  
 8 public class SoccerPoints 9 {  
10    public static void main(String[] args)11    {12       int points;             //game points  
13       int totalPoints = 0;    //accumulator initialized to 0  
14       15       //create scanner object  
16       Scanner keyboard = new Scanner(System.in);17       18       //display general instructions  
19       System.out.println("Enter the number of points your team");  
20       System.out.println("has earned for each game this season.");  
21       System.out.println("Enter -1 when finished.");  
22       System.out.println();23       24       //get first number of points  
25       System.out.print("Enter game points or -1 to end: ");  
26       points = keyboard.nextInt();27       28       //accumulate the points until -1 is entered  
29       while (points != -1)30       {31          //add points to total points  
32          totalPoints += points;33          34          //get the next number of points  
35          System.out.print("Enter game points or -1 to end: ");  
36          points = keyboard.nextInt();37       }38       39       //display the total number of points  
40       System.out.println("The total points are " +41                          totalPoints);42    }43 }

  

NESTED LOOPS

CONCEPT: a loop inside another loop is called a nested loop.

Nested loops are necessary when a task performs a repetitive operation and that task itself must be repeated. A clock is a good example of something that works like a nested loop.

1 // this program uses nested loops to simulate a clock  
 2  
 3 public class Clock 4 {  
 5    public static void main(String[] args) 6    { 7       //simulate the clock  
 8       for (int hours = 1; hours <= 12; hours ++) 9       {10          for (int minutes = 0; minutes <= 59; minutes++)11          {12             for (int seconds = 0; seconds <= 59; seconds++)13             {14                System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);  
15             }16          }17       }18    }19 }

Key Points:

·         An inner loop goes through all of its iterations for each iteration of an outer loop.

·         Inner loops complete their iterations before the outer loops do.

·         To get the total number of iterations of a nested loop, multiply the number of iterations of all the loops.

  

1 import java.util.Scanner; 2  
 3 //this program demonstrates a nested loop  
 4  
 5 public class TestAverage2 6 {  
 7    public static void main(String[] args) 8    { 9       int numStudents,10           numTests,11           score,12           total;13       double average;14       15       Scanner keyboard = new Scanner(System.in);16       17       //get number of students  
18       System.out.print("How many students do you have? ");  
19       numStudents = keyboard.nextInt();20       21       //get number of test scores per student  
22       System.out.print("How many test scores per student? ");  
23       numTests = keyboard.nextInt();24       25       //process all the students  
26       for (int student = 1; student <= numStudents; student++)27       {28             total = 0; // set accumulator to 0  
29          30          //get test scores for a student.  
31          System.out.println("Student number " + student);32          System.out.println("-----------------");  
33          for (int test = 1; test <= numTests; test++)34          {35             System.out.print("Enter score " + test + ": ");  
36             score = keyboard.nextInt();37             total += score; // add score to total  
38          }39          40          //calculate and display average  
41          average = total / numTests;42          System.out.printf("The average for student %d is %.1f.\n\n",  
43                            student, average);44       }45    }46 }

PATTERNS

1 import java.util.Scanner; 2  
 3 //this program displays a rectangular pattern of *  
 4  
 5 public class RectangularPattern 6 {  
 7    public static void main(String[] args) 8    { 9       int rows, cols;10       11       Scanner keyboard = new Scanner(System.in);12       13       //get rows and cols  
14       System.out.print("How may rows? ");  
15       rows = keyboard.nextInt();16       System.out.print("how many columns? ");  
17       cols = keyboard.nextInt();18       19       for (int r = 0; r < rows; r++)20       {21          for (int c = 0; c < cols; c++)22          {23             System.out.print("*");  
24          }25          System.out.println();26       }27    }28 }

1 import java.util.Scanner; 2 //this program demonstrates triangle pattern  
 3 public class TrianglePattern 4 {  
 5    public static void main(String[] args) 6    { 7       final int BASE_SIZE = 8; 8        9       for (int r = 0; r < BASE_SIZE; r++)10       {11          for (int c = 0; c < (r + 1); c ++)12          {13             System.out.print("*");  
14          }15          System.out.println();16       }17    }18 }

1 import java.util.Scanner; 2 //this program displays a stairstep pattern  
 3 public class StairStepPattern 4 {  
 5    public static void main(String[] args) 6    { 7       final int NUM_STEPS = 6; 8        9       for (int r = 0; r < NUM_STEPS; r++)10       {11          for (int c = 0; c < r; c++)12          {13             System.out.print(" ");  
14          }15          System.out.println("#");  
16       }17    }18 }

THE BREAK AND CONTINUE STATEMENTS

CONCEPT: the break statement causes a loop to terminate early. The continue statement causes a loop to stop its current iteration and begin the next one.

These are considered taboo to use in loops, avoid when possible.

DECIDING WHICH LOOP TO USE

CONCEPT: although most repetitive algorithms can be written with any of the three types of loops, each works best in different situations.

·         THE while LOOP – the while loop is pretest loop. It is ideal in situations where you do not want the loop to iterate if the condition is false from the beginning. It is also ideal if you want to use a sentinel value to terminate the loop.

·         THE do-while LOOP – the do-while loop is a posttest loop. It is ideal in situations where you always want the loop to iterate at least once.

·         THE for LOOP – the for loop is a pretest loop that has built-in expressions for initializing, testing, and updating. These expressions make it very convenient to use a loop control variable as a counter. The for loop is ideal in situations where the exact number of iterations is known.

INTRODUCTION TO FILE INPUT AND OUTPUT

CONCEPT: the Java API provides several classes that you can use for writing data to a file and reading data from a file. To write data to a file, you can use PrintWriter class and, optionally, the FileWriter class. To read data from a file, you can use the Scanner class and the File class.

In general, there are three steps that are taken when a file I used by a program:

1. The file must be opened. When the file is opened, a connection is created between the file and the program.

2. Data is then written to the file or read from the file.

3. When the program is finished using the file, the file must be closed.

The Java API provides a number of classes that you will use to work with files. To use these classes, you will place the following import statement near the top of your program:

     import java.io.*;

USING THE PrintWriter CLASS TO WRITE DATA TO A FILE

DEFAULT FORMAT:

PrintWriter outputFile = new PrintWriter(“StudentData.txt”);

You may also pass a reference to a String object as an orgument ot the PrintWriter constructor. For example, in the following code the user specifies the name of the file.

String filename;

filename = JOptionPane.showInputDialog(“Enter the filename.”);

PrintWriter outputFile = new PrintWriter(filename);

Once you have created an instance of the PrintWriter class and opened a file, you can write data to the file using print and println methods.

outputFile.println(“Jim”);

When the program is finished writing data to the file, it must close the file.

outputFile.close();

public static void main(String[] args) throws IOException

REVIEW WRITING TO FILE

1. You need the import java.io.*; statement in the top section of your program.

2. Because we have not yet learned how to respond to exceptions, any method that uses PrintWriter object must have a throwsIOException clause in its header.

3. You create a PrintWriter object and pass the name of the file as a string to the constructor.

4. You use the PrintWriter class’s print an println methods to write data to the file.

5. When finished writing to the file, you use the PrintWriter’s class’s close method to close the file.

APPENDING DATA TO A FILE

To append data to an existing file, you first create an instance of the FileWriter class. You pass two arguments to the FileWriter constructor: a string containing the name of the file, and the Boolean value true.

FileWriter fwriter = new FileWriter(“MyFriends.txt”, true);

This statement creates a FileWriter object and opens the file MyFriends.txt for writing. Any data written to the file will be appened to the file’s existing contents. If the file does not exist, it will be created.

You still need to create a PrintWriter object so you can use the print and println methods to write data to the file. When you create the PrintWriter object, you pass a reference to the FileWriter object as an argument to the PrintWriter constructor.

FileWriter fwriter = new FileWriter(“MyFriends.txt”, true);

PrintWriter outputFile = new PrintWriter(fwriter);

SPECIFYING THE FILE LOCATION

DEFUALT FORMAT

PrintWriter outputFile = new PrintWriter(“H:\\PriceList.txt”);

You only need to use double backslashes if the file’s path is in a string literal. If your program asks the user to enter a path into a String object, which is then passed to the PrintWriter or FileWriter constructor, the user does not have to enter double backslashes.

TIP:

“C:\\MyData\\Data.txt”

“C:/MyData/Data.txt”

  

READING DATA FROM A FILE

Recall that the System.in object represents the keyboard. Passing System.in as an argument to the Scanner constructor specifies that the keyboard is the Scanner object’s source of input.

You can also use the Scanner class to read input from a file. Instead of passing System.in to the Scanner class constructor, you pass a reference to a File object.

File myFile = new File(“Customers.txt”);

Scanner inputFile = new Scanner(myFile);

You must use the Scanner class’s close method to close the file

inputFile.close();

READING LINES FROM A FILE WITH THE nextLine METHOD

The Scanner class’s nextLine method reads a line of input, and returns the line as a String.

READING PRIMATIVE VALUES FROM A FILE

You can use nextDouble method to read a floating-point value from a file.

REVIEW READING DATA FROM FILE

1. Import java.util.Scanner; so you can use the Scanner class. Import java.io.*; This is required by the File class.

2. Because we have not yet learned how to respond to exceptions, any method that uses a scanner object to open a file must have a throws IOException clause in its header.

3. You create a File object and pass the name of the file as a string to the constructor.

4. You create a Scanner object and pass a reference to the File object as an argument to the constructor.

5. You use the scanner class’s nextLine method to read a line from the file. The method returns the line of data as a string. To read primitive values, use methods such as nextInt and nextDouble.

6. Call the Scanner class’s hasNext method to determine whether there is more data to read from the file. If the method returns true, then the rei more data to read. If the method returns false, you have reached the end of the file.

7. When finishing writing to the file, you use the Scanner class’s close method to close the file.  

CHECKING FOR A FILE’S EXISTENCE

After you create a File object representing the file that you want to open, you can use the File class’s exists method to determine whether the file exists. The method returns true if the file exists, and false if the file does not exist.

1 import java.util.Scanner;           //needed for scanner class  
 2 import java.io.*;                   //neede for file I/O classes  
 3  
 4 //this program writes data to a file  
 5  
 6 public class FileWriteDemo2 7 {  
 8    public static void main(String[] args) throws IOException 9    {10       String filename;     //file name  
11       String friendName;    //friend's name  
12       int numFriends;      //number of friends  
13       14       Scanner keyboard = new Scanner(System.in);15       16       //get number of friends  
17       System.out.print("How many friends do you have? ");  
18       numFriends = keyboard.nextInt();19       20       //consume the remaining newline character  
21       keyboard.nextLine();22       23       //get filename  
24       System.out.print("Enter the filename: ");  
25       filename = keyboard.nextLine();26       27       //make sure the file does not exist  
28       File file = new File(filename);29       if (file.exists())30       {31          System.out.println("The file " + filename +32                             " already exists.");  
33          System.exit(0);34       }35       36       //open the file  
37       PrintWriter outputFile = new PrintWriter(filename);38       39       //get data and write it into the file  
40       for (int i = 1; i <= numFriends; i++)41       {42          //get the name of a friend  
43          System.out.print("enter the name of friend " +44                           "number " + i + ": ");  
45          friendName = keyboard.nextLine();46          47          //write the name to the file  
48          outputFile.println(friendName);49       }50       51       //close the file  
52       outputFile.close();53       System.out.println("Data has written to the file.");  
54    }55 }

1 import java.util.Scanner; 2 import java.io.*; 3  
 4 //this version of the program confirms that the Numbers.txt file exists before opening it  
 5  
 6 public class FileSum2 7 {  
 8    public static void main(String[] args) throws IOException 9    {10       double sum = 0.0; //accumulator, initialized to 0  
11       12       //make sure the file exists  
13       //open the file for reading  
14       File file = new File("Numbers.txt");  
15       Scanner inputFile = new Scanner(file);16       if (!file.exists())17       {18          System.out.println("The file Numbers.txt is not found.");  
19          System.exit(0);20       }21       22       //read all the values from the file  
23       //and calculate their total  
24       while (inputFile.hasNext())25       {26          //read a value from the file  
27          double number = inputFile.nextDouble();28          29          //add the number to the sum.  
30          sum = sum + number;31       }32       //close the file  
33       inputFile.close();34       35       //display the sum of the numbers  
36       System.out.println("The sum of the numbers in " +37                          "Numbers.txt is " + sum);38    }39 }

GENERATING RANDOM NUMBERS WITH Random CLASS

CONCEPT: random numbers are used in a variety of applications. Java provides the Random class that you can use to generate random numbers.

DEFAULT FORMAT:

import java.util.Random;

CREATE OBJECT:

Random randomNumbers = new Random();

EX.

//declare an int variable

Int number;

//create a random object

Random randomNumbers = new Random();

//get a random integer and assign it to a number

Number = randomNumber.nextInt();

After this code executes it will generate a random number between -2,147,483,648 and +2,147,483,647.

Number = randomNumbers.nextInt(100);

This will generate a random number 0-99

Number = randomNumbers.nextInt(10) + 1;

This will generate a random number 0-9 and then add one

Making it 1-10

  

1 import java.util.Scanner; 2 import java.util.Random; 3  
 4 // this program demonstrates the random class  
 5  
 6 public class MathTutor 7 {  
 8    public static void main(String[] args) 9    {10       int number1;11       int number2;12       int sum;13       int userAnswer;14       15       Scanner keyboard = new Scanner(System.in);16       17       Random randomNumbers = new Random();18       19       //get two random numbers  
20       number1 = randomNumbers.nextInt(100);21       number2 = randomNumbers.nextInt(100);22       23       //display an addition problem  
24       System.out.println("What is the answer to the " +25                          "following problem?");  
26       System.out.print(number1 + " + " +27                        number2 + " + ? ");  
28                        29       //calculate the answer  
30       sum = number1 + number2;31       32       //get the user's answer  
33       userAnswer = keyboard.nextInt();34       35       //display the user's results  
36       if (userAnswer == sum)37          System.out.println("Correct!");  
38       else  
39       {40          System.out.println("Sorry, wrong answer. " +41                             "The correct answer is " +42                             sum);43       }44    }45 }

1   import java.util.Scanner; 2   import java.util.Random; 3   4   /**  
 5      This program simulates the rolling of dice. 6   */ 7   8   public class RollDice 9   {10     public static void main(String[] args)11     {12       String again = "y";    // To control the loop  
13       int die1;              // To hold the value of die #1  
14       int die2;              // to hold the value of die #2  
15  16       // Create a Scanner object to read keyboard input.  
17       Scanner keyboard = new Scanner(System.in);18  19       // Create a Random object to generate random numbers.  
20       Random rand = new Random();21  22       // Simulate rolling the dice.  
23       while (again.equalsIgnoreCase("y"))  
24       {25          System.out.println("Rolling the dice . . . ");  
26          die1 = rand.nextInt(6) + 1;27          die2 = rand.nextInt(6) + 1;28          System.out.println("Their values are:");  
29          System.out.println(die1 + " " + die2);30  31          System.out.print("Roll them again (y = yes)? ");  
32          again = keyboard.nextLine();33       }34     }35   }

  

1  import java.util.Random; 2   3   /**  
 4      This program simulates 10 tosses of a coin. 5   */ 6   7   public class CoinToss 8   { 9      public static void main(String[] args)10      {11         // Create a Random object to generate random numbers.  
12         Random rand = new Random();13  14         // Simulate the coin tosses.  
15         for (int count = 0; count < 10; count++)16         {17            if (rand.nextInt(2) == 0)18               System.out.println("Tails");  
19            else  
20              System.out.println("Heads");  
21         }22     }23   }

![[CSO_Gaddis_Java_Chapter04_7e.ppt]]