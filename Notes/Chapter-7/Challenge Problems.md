## 1. Rainfall Class

Write a *RainFall* class that stores the total rainfall for each of the 12 months into an array of *doubles*. The program should have methods that return the following:

	the total rainfall for the year
	the average monthly rainfall
	the month with the most rain
	the month with the least rain

Demonstrate the class in a complete program

*Input validation: Do not accept negative numbers for monthly rainfall figures.*

## 2. Payroll Class

Write a *Payroll* class that uses the following arrays as fields:

- **EmployeeId**. An array of seven figures to hold employee identification numbers. The array should be initalized with the following numbers:

	*5658845 4520125 7895122 8777541 8451277 1302850 7580489*

- **hours**. An array of seven integers to hold the number of hours worked by each employee
- **payRate**. An array  of seven *doubles* to hold each employee's hourly pay rate
- **wages**. An array of seven *doubles* to hold each employee's gross wages

The class should relate the data in each array through the subscripts. For example, the number in element 0 of the *hours* array should be the number of hours worked by the employee whos ID number is stored in element 0 of the *employeeId* array. That same employee's pay rate should be stored in element 0 of the *payRate* array.

In addition to the appropriate accessor and mutator methods, the class should have a method that accepts an employee's ID number as an argument and returns the gross pay for that employee.

Demonstrate the class in a complete program that displays each employee number and asks the user to enter that employee's hours and pay rate. It should then display each employee's identification number and gross wages. 

*Input Validation: Do not accept negative values for hours or numbers less than 6.0 for pay rate.*

## 3. Charge Account Validation

Create a class with a method that accepts a charge account number as its argument. The method should determine whether the number is valid by comparing it to the following list of valid charge account numbers:
	*5658845    4520125    7895122    8777541    8451277    1302850 8080152    4562555    5552012    5050552    7825877    1250255 1005231    6545231    3852085    7576651    7881200    4581002*
Check out Video.

These numbers should be stored in an array or an *ArrayList* object. Use a sequential search to locate the number passed as an argument. If the number is an array, the method should return *true*, indicating the number is valid. If the number is not in the array, the method should return *false*, indicating the number is invalid.

## 5. Larger than n

In a program, write a method that accepts two arguments: an array and a number *n*. Assume that the array contains integers. The method should display all of the numbers in the array that are greater than the number *n*.  

## 8. Grade Book
A teacher has five students who have taken four tests. The teacher uses the following grading scale to assign a letter grade to a student based on the average of 4 test scores:
- 90-100 A
- 80-89 B
- 70-79 C
- 60-69 D
- 0-59 F
Write a class that uses a *String* array or an *ArrayList* object to hold the five students' names, and an array of five characters to hold the ffive student's letter grades, and five arrays of four *doubles* each to hold each student's set of test scores. The class should have methods that reutnr a specific student's name, the average test score, and a lettergrade based on the average

Demonstrate the class in a program that allows the user to enter each student's name and the four test scores. Then it should display each student's average test score and letter grade.

*Input validation- do not accept test scores less than zero or greater than 100.*

## 9. Grade Book Modification

Modify the grade book application in Programming Challenge 8 so that it drops each student's lowest score when determining the test score averages and letter grades.

## 16. World Series Champions

Download source code: *WorldSeriesWinners.txt*. This file contains a chronological list of the winning teams in the World Series from 1903 through 2009. The first line in the file is the name of the team that won in 1903, and the last line is the name of the team that won in 2009. Note that the World Series was not played in 1904 and 1994, so those years are skipped in the file.

Write a program that lets the user enter the name of a team, and then displays the number of times that team has won the World Series in the time period.

*Tip: Read the contents of the WorldSeriesWinners.txt file into an array, or and ArrayList. When the user enters the name of a team, the program should step through the array or ArrayList, conting the number of times the selected team appears*
## 17. 2D Array Operations

Write a program that creates a two-dimensional array initalized with test data. Use any primitive data type that you wish. The program should have the following methods: 

- *getTotal*. This method should accept a two-dimensional array as its argument and return the total of all the values in the array.
- *getAverage*. This method should accept a two-dimesional array as its argument and return the average of all the values in the array.
- *getRowTotal*. This method should accept a two-dimensional array as its first argument and an integer as its second argument. The second argument should be the subscript of a row in the array. The method should return the total of the values in the specified row.
- *getColumnTotal*. This method should accept a two-dimensional array as its first argument and an integer as its second argument. The second argument should be the subscript of a column in the array. The method should return the total of the values in the specified column.
- *getHighestInRow*. This method should accept a two-dimensional array as its first arugment and an integer as its second argument. The second argument should be the subscript of a row in the array. The method should return the highest value in the specified row of the array. 
- *getLowestInRow*. This method should accpet a two-dimensional array as its first argument and an integer as its second argument. The second argument should be the subscript of a row in the array. The method should return the lowest value in the specified row of the array. 

Demonstrate each of the methods in this program.
