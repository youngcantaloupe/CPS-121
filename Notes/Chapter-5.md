## INTRODUCTION TO METHODS

##### CONCEPT: Methods can be used to break a complex program into small, manageable pieces. A void method simply executes a group of statements and then terminates. A value-returning method returns a value to the statement that called it.

A method is a collection of statements that performs a specific task.

## VOID METHODS AND VALUE-RETURNING METHODS

Void – performs a task then terminates.
- ex. System.out.println;

Value-Returning – performs a task then sends a value back            to the code that called it.
- ex. The Random class’s nextInt 
	- rand.nextInt();

## DEFINING A void METHOD

To create a method you must write its definition: a header and a body.
- Header -> public static void main(String[] args) 
- Body -> System.out.println(“”);

## Simple Method

``` java
public static void displayMessage() {
          System.out.println(“Hello.”);
}
```

METHOD MODIFIERS – The key words public and static are modifiers.
- Public = publicly available to code outside class.
- Static = The method belongs to the class, not a specific object.

RETURN TYPE – void or value-returning methods.
- void – No return value.
- value-returning – Lists a data type here.

METHOD NAME – Name.

PARENTHESIS – This is where you can put arguments.

## CALLING A METHOD

A method executes when it is called. When a method is called, the JVM branches to that method and executes the statement in its body.
``` java
public class SimpleMethod {
   public static void main(String[] args) {
      System.out.println("Hello from the main method.");
      displayMessage();
      System.out.println("Back in the main method.");
   }
   public static void displayMessage() {
      System.out.println("Hello from the displayMessage method");
   }
}
```

Method call statements may be used in control structures like loops, if statements, and switch statements.

``` java
public class LoopCall {
   public static void main(String[] args) {
      System.out.println("Hello from the main method.");
      for (int i = 0; i < 5; i++) {
         displayMessage();
      System.out.println("Back in the main method.");
      }
   }
      public static void displayMessage() {
         System.out.println("Hello from the displayMessage method.");
      }
}
```

``` java
import javax.swing.JOptionPane;

public class CreditCard {

   public static void main(String[] args) {
   
      double salary;
      int creditRating;
      String input;
      
      input = JOptionPane.showInputDialog("What is your annual salary?");
         salary = Double.parseDouble(input);
         
      input = JOptionPane.showInputDialog("On a scale of 1-10, what is your credit rating?" +
                                          "\n10 = excellent, 1 = very bad");
         creditRating = Integer.parseInt(input);
      
      if (salary >= 20000 && creditRating >= 7)
         qualify();
      else
         noQualify();
         
      System.exit(0);   
   }
   public static void qualify() {
      JOptionPane.showMessageDialog(null, "Congratulations! You qualify for the credit card!");
   }
   public static void noQualify() {
      JOptionPane.showMessageDialog(null, "I'm sorry. You do not qualify for the credit card.");
   }
}
```

## LAYERED METHOD CALLS

Methods can also be called in a layered fashion. Method A can call method B, which can then call method C. When method C finishes, the JVM returns to method B. When method B finishes, the JVM returns to method A.

``` java
public class DeeperAndDeeper {
   public static void main(String[] args) {
      System.out.println("I am starting in main.");
      deep();
      System.out.println("Now I am back in main.");
   }
   public static void deep() {
      System.out.println("I am now in deep.");
      deeper();
      System.out.println("Now I am back in deep.");
   }
   public static void deeper() {
      System.out.println("I am no in deeper.");
   }
}
```

## PASSING ARGUMENTS TO A METHOD

##### CONCEPT: A method may be written so it accepts arguments. Data can be then passed into the method when it is called.

Values that are sent into a method are called arguments.

``` java
number = Integer.parseInt(str);
```

This statement calls the Interger.parseInt method and passes the contents of the str variable as an argument. By using parameter variables, you can design your own methods that accept data this way. A parameter variable, is a special variable that holds a value being passed into a method.

``` java
public static void displayValue(int num) {
	System.out.println(“The value is “ + num);
}
```

The integer variable declaration appears inside the parentheses. This is the declaration of a parameter variable, which enables displayValue method to accept an integer value as an argument.

``` java
displayValue(5);
```
This will input 5 as num above.

``` java
displayValue(x);
displayValue(x * 4);
displayVlaue(Integer.parseInt(“700”));
```

The first statement passes the value in varible x as the argument. The second statement passes the result of the expression x * 4 as the argument to the displayValue method. The third statement passes the value returned from the Integer.parseInt method as the argument to the displayValue method.

``` java
public class PassArg {
   public static void main(String[] args) {
      int x = 10;
      
      System.out.println("I am passing values to displayValue.");
      
      displayValue(5);
      displayValue(x);
      displayValue(x * 4);
      displayValue(Integer.parseInt("700"));
      System.out.println("That's all!");
   }
   public static void displayValue(int num) {
      System.out.println("The value is " + num);
   }
}
```

## DO NOT INITIALIZE VARIABLES WHEN CALLING METHODS.

Values that are passed into a method are called arguments.
Variables that receive those values are called parameters.

##### ARGUMENT AND PARAMETER DATA TYPE COMPATABILITY

When you pass an argument to a method, be sure that the argument’s data type is compatible with the parameter variable’s data type. 

Java will automatically perform widening conversion if the argument’s data type is ranked lower than the parameter variable’s data type.

``` java
short s = 1;
displayValue(s);    //converts short to int

byte b = 2;
displayValue(b);    //converts byte to int
```

However, Java will not automatically convert and argument to a lower ranking data type.

Exception: You can use a cast operator to convert a value manually to a lower ranking data type.

##### PARAMETER VARIABLE SCOPE
A variable is visible only to the statements inside the variable’s scope. A parameter variable’s scope is the method in which the parameter is declared. No statement outside the method can access the parameter variable by its name.

##### PASSING MULTIPLE ARGUMENTS
Often it is useful to pass more than one argument to a method.

``` java
public static void showSum(double num1, double num2) {
     double sum;
     sum = num1 + num2;
     System.out.println(“The sum is “ + sum);
}
```

showSum(5, 10);     //for calling ^

Each parameter variable list must have a data type listed before its name.

``` java
public static void showSum(double num1, double num2)
```
                                      ^w/o this double, error.

## ARGUMENTS ARE PASSED BY VALUE

In Java, all arguments of the primitive data types are passed by value, only a copy of an argument’s value is passed into a parameter variable. If a parameter variable is changed in a method, it has no effect on the original argument.

``` java
public class PassByValue {
   public static void main(String[] args) {
      int number = 99;
      
      System.out.println("Number is " + number);
      changeMe(number);
      System.out.println("Number is " + number);
   }
   public static void changeMe(int myValue) {
      System.out.println("I am changing the value.");
      
      myValue = 0;
      System.out.println("Now the value is " + myValue);
   }
}
```


Even though the parameter variable myValue is changed in the changeMe method, the argument number is not modified. The myValue variable contains only a copy of the number variable.

## PASS OBJECT REFERENCES TO A METHOD.

So far the methods have accepted primitive values as arguments. You can also write methods that accept references to objects as arguments.

``` java
public static void showLength(String str) {
     System.out.println(str = “ is “ + str.length() +
“ characters long.”);
}
```

This method accepts a String object reference as its argument.

When an object, such as a String, is passed as an argument, it is actually a reference to the object that is passed. 

In this example, the name variable is a String reference variable. It is passed as an argument to the showLength method. The showLength method has a parameter variable, str, which is also a string reference variable, that receives the argument.

Recall that a reference variable holds the memory address of an object. When the showLength method is called, the address that is stroed in name is passed into the str parameter variable. This means that when the showLength method is executing, both name and str reference the same object.

A method cannot change the contents of any String object that has been passed into it as an argument. String objects are immutable, which means they cannot be changed.

``` java
public class PassString {
   public static void main(String[] args) {
      String name = "Shakespeare";
      
      System.out.println("In main, the name is " + name);
      
      changeName(name);
      
      System.out.println("Back in main, the name is " + name);
   }
   public static void changeName(String str) {
      str = "Dickens";
      System.out.println("In changeName, the name is now " + str);
   }
}
```

A new String object containing “Dickens” is created and its address is stored in the str variable. After this statement executes, the name variable and the str parameter variable reference the different objects.

Anytime you use the = operator to assign a string literal to a String reference variable, a new String object is created in memory.

When writing the documentation comments for a method, you can provide a description of each parameter by using a @param tag.

@param parameterName Description

``` java
public class LocalVars {
   public static void main(String[] args) {
      texas();
      california();
   }
   public static void texas() {
      int birds = 5000;
      System.out.println("In texas there are " + birds + " birds.");
   }
   public static void california() {
      int birds = 3500;
      System.out.println("In california there are " + birds + " birds.");
   }
}
```

A method’s local variables exist only while the method is executing. This is known as the _lifetime_ of a local variable. When the method begins, its local variables and its parameter variable are created in memory, and when the method ends, the local variables and parameter variables are destroyed.

## INITIALIZING LOCAL VARAIBLES WITH PARAMETER VALUES

It is possible to use a parameter variable to initialize a local variable.

It can go from:
``` java
public static void showSum(double num1, double num2) {
     double sum;
     sum = num1 + num2;
     System.out.println(“The sum is “ + sum);
}
```

To:
``` java
public static void showSum(double num1, double num2) {
     double sum = num1 + num2;
     System.out.println(“The sum is “ + sum);
}
```

Because the scope of a parameter variable is the entire method in which it is declared, we can use parameter variables to initialize local variables.

Local variables are not automatically initialized with a default value. They must be given a value before they can be used. If you attempt to use a local variable before it has been given a value, a compiler error will result.

``` java
public static void myMethod() {
     int x;
     System.out.println(x);   //Error! x has no value.
}
```

## RETURNING A VALUE FROM A METHOD

##### CONCEPT: A method may send a value back to the statement that called the method.

You’ve seen that data may be passed into al method by way of parameter variables. Data may also be returned from a method. This is known as _value-returning methods_.

You are already experienced at using value-returning methods. You have used the wrapper class parse methods, such as Integer.parseInt.

``` java
     int num;
     num = Integer.parseInt(“700”);
```

The second line of this code calls the Integer.parseInt method, passing “700” as the argument. The method returns the integer value 700, which is assigned to the num variable by the = operator. You have also seen the Math.pow method. which returns a value.

``` java
     double x;
     x = Math.pow(4.0, 2.0);
```

## DEFINING A VALUE-RETURNING METHOD

When you are writing a value-returning method, you must decide what type of value the method will return. This is because you  must specify the data type of the return value in the method header. Recall that a void method, which does not return a value, uses the key word void as its return type in the header.

A value-returning method will use int, double, Boolean, or any other valid data type in its header.

``` java
     public static int sum(int num1, int num2) {
     int result;

     result = num1 + num2;
     return result;
}
```

This code defines a method named sum that accepts two int arguments. The arguments are passed into the parameter variables num1 and num2. Inside the method, a local variable, result, is declared. The parameter variables num1 and num2 are added, and their sum is assigned to the result variable.

You must have a return statement. It causes the method to end execution and returns a value to the statement.

## GENERAL FORMAT

return _Expression_;

_Expression_ is the value to be returned. It can be any expression that has a value, such as a variable, literal, or mathematical expression.

``` java
     public static int sum(int num1, int num2) {
     return num1 + num2;
}
```

Just make sure that the return statement’s data type is the same or at least compatible. Java will automatically widen the value of a return expression, but will not automatically narrow it.

## CALLING A VALUE-RETURNING METHOD

``` java
public class ValueReturn {
   public static void main(String[] args) {
      int total, value1 = 20, value2 = 40;
      
      total = sum(value1, value2);
      System.out.println("The sum of " + value1 + " and " + value2 + " is " + total);
   }
   public static int sum(int num1, int num2) {
      
      int result;
      result = num1 + num2;
      return result;
   }
}
```

The statement in line 3 calls the sum method, passing value1 and value2 as arguments. It assigns the value returned by the sum method to the total variable. In this case, the method will return 60.

When you call a value-returning method, you usually want to do something meaningful with the value it returns. The _ValueReturn.java_ program shows a method’s return value being assigned to a variable.

``` java
int x = 10, y = 15;

double average;

average = sum(x, y) / 2.0;
```

In the last statement, the sum method is called with x and y as its arguments. The method’s return value, which is 25, is divided by 2.0. The result, 12.5, is assigned to average.

##### ANOTHER EXAMPLE:
``` java
int x = 10, y = 15;

System.out.println(“The sum is “ + sum(x, y));
```

## USING THE @return TAG IN DOCUMENTATION
When writing the documentation comments for a value-returning method, you can provide a description of the return value by using a @return tag.

##### GENERAL FORMAT:
@return _Description_

When a method’s documentation comments contain a @return tag, the Javadoc utility will create a Returns section in the method’s documentation.

``` java
import javax.swing.JOptionPane;

public class CupConverter {

   public static void main(String[] args) {
   
      double cups;
      double ounces;
      
      cups = getCups();
      ounces = cupsToOunces(cups);
      displayResults(cups, ounces);
      System.exit(0);
   }
   
   public static double getCups() {
   
      String input;
      double numCups;
      
      input = JOptionPane.showInputDialog("This program converts measurements\n" +
                                          "in cups to fluid ounces. For your\n" +
                                          "reference the formula is:\n" +
                                          "     1 cup = 8 fluid ounces\n\n" +
                                          "Enter number of cups.");
      numCups = Double.parseDouble(input);
      return numCups; 
   }
   
   public static double cupsToOunces(double numCups) {
   
      return numCups * 8.0;
   }
   
   public static void displayResults(double cups, double ounces) {
   
      JOptionPane.showMessageDialog(null, cups + " cups equals " + ounces + " fluid ounces.");
   } 
} 
```

## RETURNING A _boolean_ VALUE

``` java
public static Boolean isValid(int number) {

     boolean status;

     if (number >= 1 && number <= 100)
          status = true;
     else
          status = false;
     return status;
}
```

Using if-else statement to call method:

``` java
int value = 20;
if (isValid(value))
     System.out.println(“The value is within the range.”);
else
     System.out.println(“The value is out of the range.”);
```

## RETURNING A REFERENCE TO AN OBJECT

A value-returning method can also return a reference to a non-primitive type, such as a String object.

``` java
public class ReturnString {
   public static void main(String[] args) {
      String customerName;
      customerName = fullName("John", "Martin");
      System.out.println(customerName);
   }
   public static String fullName(String first, String last) {
      String name;
      name = first + " " + last;
      return name;
   }
}
```
Line 4 calls the fullName method, passing “John” and “Martin” as arguments. The method returns a reference to a String object containing “John Martin”. The reference is assigned to the customerName variable.

## PROBLEM SOLVING WITH METHODS

##### CONCEPT: A large, complex problem can be solved a piece at a time with methods.

``` java
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
public class SalesReport {
   public static void main(String[] args) throws IOException {
      final int NUM_DAYS = 30;
      String filename;
      double totalSales;
      double averageSales;
      filename = getFileName();
      totalSales = getTotalSales(filename);
      averageSales = totalSales / NUM_DAYS;
      displayResults(totalSales, averageSales);  
      System.exit(0);
   }
   public static String getFileName() {
      String file;
      file = JOptionPane.showInputDialog("Enter the name of the file\n" +
                                         "containing 30 days of sales amounts.");
      return file; 
   }
   public static double getTotalSales(String filename) throws IOException {
      double total = 0.0;
      double sales;
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      while (inputFile.hasNext()) {
         sales = inputFile.nextDouble();
         total += sales;
      }
      inputFile.close();
      return total;
   }
   public static void displayResults(double total, double avg) {
      JOptionPane.showMessageDialog(null, String.format("The total sales for the period is $%,.2f\n" +
                                                        "The average daily sales were $%,.2f", total, avg));
   }
}

```

Instead of writing the entire program in the main method, the algorithm was broken down into the following methods:

- getFileName- This method displays an input dialog box asking the user to enter the name of the file containing 30 days of sales amounts. The method returns a reference to a String object containing the name entered by the user.

- getTotalSales- This method accepts the name of a file as an argument. The file is opened, the sales amounts are read from it, and the total of the sales amounts is accumulated. The method returns the total as a double.

- DisplayResults- This method accepts as arguments in the total sales and the average daily sales. It displays a message dialog box indicating these values.

## CALLING METHODS THAT THROW EXCEPTIONS

One thing to note is that there are throws exceptions in the main method header and getTotalSales method header. The getTotalSales method has the clause because it uses a Scanner object to open a file.

## WHY IS THIS IMPORTANT?

When a Scanner object has a problem opening a file, it throws an exception known as IOException. Java requires that either (a) the exception is handled in the method that caused it to occur, or (b) the method terminates and thorws the exception again. By writing a _throws IOException_ clause in a method’s header, you are telling the compiler that the method does not handle the exception. Instead, it throws the exception again.

That explains why the _getTotalSales_ method has the _throws IOException_ clause, but it doesn’t explain why the main method has one. After all, the main doesn’t use a _Scanner_ object to perform any file operations.  The reason _main_ has to have the clause is because main calls the _getTotalSales_ method. If the _Scanner_ object in _getTotalSales_ throws an _IOException_, the _getTotalSales_ method terminates and throws the _IOException_ again. That means that _main_ must either handle the exception, or terminate and throw it once again. When the _main_ method throws the exception, the JVM displays an error message.
