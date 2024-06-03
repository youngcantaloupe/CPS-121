## Chapter 6 Classes

OBJECTS AND CLASSES

CONCEPT: An object is a software component that exists in memory and serves a specific purpose in a program. An object is created from a class that contains code describing the object.

·         An object can store data. The data stored in an object are commonly called fields.

·         An object can perform operations. The operations that an object can perform are called methods.

EX.

·         If you need to read input from the keyboard, or from a file, you can use a Scanner object.

·         If you need to generate random numbers, you can use a Random object.

·         If you need to write output to a file, you can use a PrintWriter object.

CLASSES: WHERE OBJECTS COME FROM

Class -> then object stored in memory.

A class is code that describes a particular type of object. Describing its data types (object’s fields), and actions (methods). Visualize as a blueprint.

Each object that is created from a class is called an instance of the class.

Each time you create a Scanner object, you are creating an instance of a classed named Scanner, which is in the Java API.

  

ObjectDemo.java

1 import java.util.Scanner; 2 import java.util.Random; 3 import java.io.*; 4  
 5 public class ObjectDemo { 6  
 7    public static void main(String[] args) throws IOException { 8     9       int maxNumbers;10       int number;11       12       Scanner keyboard = new Scanner(System.in);13       Random rand = new Random();14       PrintWriter outputFile = new PrintWriter("numbers.txt");  
15       16       System.out.print("How many random numbers should I write? ");  
17          maxNumbers = keyboard.nextInt();18          19       for (int count = 0; count < maxNumbers; count++) {20       21          number = rand.nextInt();22          23          outputFile.println(number);24       }25       26       outputFile.close();27       System.out.println("Done.");  
28    }29 }

This program creates three instances of objects, Scanner, Random, and PrintWriter. It Asks the user for input and writes the inputted amount of random numbers to a file called “numbers.txt”

This simple example demonstrates how most programs work. A program creates the various objects that it needs to complete its job. Each object has a set of methods that can be called, causing the object to perform an operation. When the program needs an object to do something, it calls the appropriate method

PRIMITIVE VARIABLES vs. OBJECTS

Primitive types: _byte, short, int, long, char, float, double, and Boolean._

Primitive values and objects are created differently.

int wholeNumber;                  //primitive value

Random rand = new Random();        //object

Primitive variables, such as ints, doubles, and so forth, are simply storage locations in the computer’s memory. A primitive data type is called “primitive” because a variable created with primitive data type has no built-in capabilities other than storing a value. When you declare a primitive variable, the compiler sets aside, or allocates, a chunk of memory that is big enough for that variable.

int wholeNumber;         //4 bytes

double realNumber;       //8 bytes

Primitive variables are very straightforward. When you are working with a primitive variable, you are using a storage location that holds a piece of data.

When you are working with an object, you are typically using two things:

·         The object itself, which must be created in memory.

·         A reference variable that refers to the object.

The object that is created in memory holds data of some sort and performs operations of some sort. In order to work with the object in code, you need a way to refer to the object.

That’s where the reference variable comes in. The reference variable doesn’t hold an actual piece of data that your program will work with. Instead, it holds the object’s memory address. This way, when you want to work with the object, you use the variable to reference it.

Reference variables, also known as class type variables, can be used only to reference objects.

Creating an object:

1. You declare a reference variable.

2. You create the object in memory and assign its memory address to the reference variable.

After you have done this, you can use the reference variable to work with an object.

Random rand = new Random();

·         The first part of the statement, appearing on the left side of the = operator, reads Random rand. This declares a variable named rand, which can be used to reference an object of the Random type.

·         The second part of the statement, appearing to the right of the = operator, reads new Random();. The new operator creates an object in memory, and returns that object’s memory address. So, the expression new Random() creates an object from the Random class, and returns that object’s memory address.

·         The = operator assigns the memory address that was returned from the new operator to the rand variable

After this statement executes, the rand variable will reference a Random object. The rand variable can then be used to perform operations with the object, such as generating random numbers.

  

# Writing a Simple Class

CONCEPT: You can write your own classes to create the objects that you need in a program. Next, is the process of writing a class, step-by-step.

The Java API provides many prewritten classes, ready for use in your programs. Sometimes, however, you will wish you had an object to perform a specific task, and no such class will exist in the Java API.

In this section we will write a class named _Rectangle_. Each object that is created from the _Rectangle_ class will be able to hold data about a rectangle. Specifically, a _Rectangle_ object will have the following fields:

·         _length._ The _length_ field will hold the rectangle’s length.

·         _width._ The _width_ field will hold the rectangle’s width.

The _Rectangle_ class will also have the following methods:

·         _setLength._ Method stores a value in an object’s length field.

·         _setWidth._ Method stores a value in an object's width field.

·         _getLength._ Method returns value in an object's length field.

·         _getWidth._ Method returns value in an object’s width field.

·         _getArea._ Method returns the area of the rectangle.

UML – Unified Modeling Language. Provides a set standard of diagrams for graphically depicting object-oriented systems.

WRITING THE CODE FOR A CLASS

After identifying the fields and methods, create “skeleton”.

1 public class Rectangle {2 }

Key word _public_ is an access specifier. This indicates how the class can be accessed.

_public_ access specifier indicates that the class will be publicly available to the code that is written outside the Rectangle.java file.

In general terms, the fields and methods that belong to a class are referred to as the class’s _members._

WRITING THE CODE FOR THE CLASS FIELDS

1 public class Rectangle {2    private double length;3    private double width;4 }

This declare variables length and width. Begins with key word _Private,_ access specifier meaning these variables cannot be accessed outside of this class.

By using the _private_ access modifier, a class can hide its data from code outside the class. This way, the data is protected from accidental corruption. It is common practice to make all of a class’s fields _private_ and to provide access to those fields through methods only.

A class usually has _private_ fields, and _public_ methods that access those fields.

WRITING THE _setLength_ METHOD

Starting with setLength method. This will allow code outside the class to store a value in the length field.

1 public class Rectangle 2 {  
 3    private double length; 4    private double width; 5     6    public void setLength(double len) 7    { 8       length = len; 9    }10 }

·         _public. –_ _Public_ access specifier can be called by statements outside the class

·         _void. –_ Method’s return type. _Void_ indicates method returns no data to the statement that called it.

·         _setLength. –_ Name of the method.

·         _(double len). –_ Declaration of the parameter variable of the _double_ data type, named _len_.

  

Notice _static_ does not appear in the method header. When a method is designed to work on an instance of a class, it is referred to as an _instance method,_ and you do not write _static_ in it’s header.

Because this method will store a value in the _length_ field of an instance of the _Rectangle_ class, it is an instance method.

The body of this method assigns the value of _len_ to the _length_ field. When the method executes, the _len_ parameter variable will hold the value of an argument that is passed into the method. That value is assigned to the _length_ field.

This _Rectangle_ class does not contain a _main_ method.

This is not a complete program, but is a blueprint that Rectangle objects may be created from.

Other programs will use the _Rectangle_ class to create objects.

ex.

1 public class LengthDemo 2 {  
 3    public static void main(String[] args) 4    { 5       Rectangle box = new Rectangle(); 6        7       System.out.println("Sending the value 10.0 to the setLength method.");  
 8        9       box.setLength(10.0);10       11       System.out.println("Done.");  
12    }13 }

NOTE: This program must be saved in the same directory as the file Rectangle.java.

When the compiler reads the source code, and sees _Rectangle_ is being used, it looks in the current directory for the file. If _Rectangle_ has not been compiled, the compiler will compile it.

  

_Rectangle_ box

·         Declares a variable named box. The data type of box is _Rectangle._ Because the word _Rectangle_ is not the name of a primitive data type, Java assumes it to be the name of a class. The variable _box_ is a reference variable, which holds the memory address. When a reference variable holds the memory address of an object, it is said that the variable references the object. So, the variable _box_ will be used to reference a _Rectangle_ object.

= new _Rectangle_();

·         new creates an object in memory. Then, the name of the class is followed. This specifies the class that the object should be created from. In this case, an object of the _Rectangle_ class is created. The memory address of the object is then assigned by the = operator to the variable box. After this statement executes, the variable _box_ will reference the object that was created in memory.

box.setLength(10.0);

·         This statement passes the argument 10.0 to the _setLength_ method. When the method executes, the value 10.0 is copied to the _len_ parameter variable. The method assigns the value of _len_ to the _length_ field and then terminates.

  

WRITING THE _setWidth_ METHOD

1 public class Rectangle 2 {  
 3    private double length; 4    private double width; 5     6    public void setLength(double len) 7    { 8       length = len; 9    }10    11    public void setWidth(double w)12    {13       width = w;14    }15 }

Width can be set in _RectangleDemo_ using:

box.setWidth(20.0);

WRITING THE _getLength_ AND _getWidth_ METHODS

The _length_ and _width_ fields are private, we wrote _setLength_ and _setWidth_ methods to allow code outside the _Rectangle_ class to store values in the fields. We must also write methods that allow code outside the class to get the values that are stored within these fields.

This is done with _getLength_ and _getWidth_ methods. They will return values stored in each of the _width_ and _length_ fields.

This is done by:

16    public double getLength()17    {18       return length;19    }

Calling getLength in RectangleDemo

·         size = box.getWidth();

  

Rectangle.java

1 public class Rectangle 2 {  
 3    private double length; 4    private double width; 5     6    public void setLength(double len) 7    { 8       length = len; 9    }10    11    public void setWidth(double w)12    {13       width = w;14    }15    16    public double getLength()17    {18       return length;19    }20    21    public double getWidth()22    {23       return width;24    }25 }

LengthDemo.java

1 public class LengthDemo 2 {  
 3    public static void main(String[] args) 4    { 5       Rectangle box = new Rectangle(); 6        7       box.setLength(10.0); 8        9       box.setWidth(20.0);10       11       System.out.println("The box's length is " + box.getLength());12       13       System.out.println("The box's width is " + box.getWidth());14    }15 }

  

WRITING THE _getArea_ METHOD

Rectangle.java

26    public double getArea()27    {28       return length * width;29    }

RectangleDemo.java

System.out.println("The box's area is " + box.getArea());

ACCESSOR AND MUTATOR METHODS

It is common practice to make all of a class’s fields private and to provide public methods for accessing and changing those fields. This ensures that the object owning those fields is in control of all the changes being made to them.

A method that gets a value from a class’s field but does not change it is known as an _accessor method_.

A method that stores a value in a field or changes the value of a field in some other way is known as a _mutator method._

In _Rectangle_, the methods _getLength_ and _getWidth_ are accessors.

The methods _setLength_ and _setWidth_ are mutators.

Also known as:

Accessors – “Getters”

Mutators – “Setters”

  

THE IMPORTANCE OF DATA HIDING

_Data hiding_ is an important concept in object-oriented programming. An object hides its internal data from code that is outside the class that the object is an instance of.

Only the class’s methods may directly access and make changes to the object’s internal data.

Hide internal data by:

·         Making class’s fields _private._

·         Making methods that access those fields _public._

AVOIDING STALE DATA

In the _Rectangle_ class, the _getLength_ and _getWidth_ methods return the values stored in fields, but the _getArea_ method returns a result of a calculation. The area is not stored in a field because it could potentially become stale.

When the value of an item is dependent on other data and that item is not updated when the other data is changed, the item becomes _stale_.

If the area were stored in a field, the value of the field would become incorrect as soon as either the _length_ or _width_ field changed.

Be weary of storing calculated data that could potentially become _stale_ in a field.

MORE ON UML DIAGRAMS AND NOTATION IN TEXT

In the _Rectangle_ class, the field variables are declared first then the methods are defined. This is not required, some programmers write definitions for public methods first and write the declarations for private fields last. Regardless of style, be consistent.

  

INSTANCE FIELDS AND METHODS

CONCEPT: Each instance of a class has its own set of fields, which are known as instance fields. You can create several instances of a class and store different values in each instance’s fields. The methods that operate on an instance of a class are known as instance methods.

1 import javax.swing.JOptionPane; 2  
 3 public class RoomAreas 4 {  
 5    public static void main(String[] args) 6    { 7       double number; 8       double totalArea; 9       String input;10       11       Rectangle kitchen = new Rectangle();12       Rectangle bedroom =  new Rectangle();13       Rectangle den = new Rectangle();14       15       input = JOptionPane.showInputDialog("What is the kitchen's length?");  
16       number = Double.parseDouble(input);17       kitchen.setLength(number);18       19       input = JOptionPane.showInputDialog("What is the kitchen's width?");  
20       number = Double.parseDouble(input);21       kitchen.setWidth(number);22       23       input = JOptionPane.showInputDialog("What is the bedroom's length?");  
24       number = Double.parseDouble(input);25       bedroom.setLength(number);26       27       input = JOptionPane.showInputDialog("What is the bedroom's width?");  
28       number = Double.parseDouble(input);29       bedroom.setWidth(number);30       31       input = JOptionPane.showInputDialog("What is the den's length?");  
32       number = Double.parseDouble(input);33       den.setLength(number);34       35       input = JOptionPane.showInputDialog("What is the den's width?");  
36       number = Double.parseDouble(input);37       den.setWidth(number);38       39       totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();40       41       JOptionPane.showMessageDialog(null, "The total area of the rooms is " + totalArea);42       43       System.exit(0);44    }45 }

Each instance of the _Rectangle_ class has its own _length_ and _width_ variables. For this reason, the variables are known as _instance variables,_ or _instance fields._ Every instance of a class has its own set of instance fields and can store its own values in those fields.

The methods that operate on an instance of a class are known as _instance methods_. All of the methods in the _Rectangle_ class are instance methods because they perform operations on specific instances of the class. For example ln 17.

kitchen.setLength(number);

This statement calls the _setLength_ method, which stores a value in the _kitchen_ object’s length field.

The _setLength_ method stores a value in a specific instance of the _Rectangle_ class. This is true of all of the methods that are members of the _Rectangle_ class.

Note ^ instance methods do not have the key word _static_ in their headers.

CONSTRUCTORS

CONCEPT: A constructor is a method that is automatically called when an object is created.

A constructor is a method that is automatically called when an instance of a class is created. Constructors normally perform initialization or setup operations, such as storing initial values in instance fields. They are called “constructors” because they help construct an object.

A constructor method has the same name as the class.

6    public Rectangle(double len, double w) 7    { 8       length = len; 9       width = w;10    }

This constructor accepts two arguments, which are passed into the len and w parameter variables. The parameter variables are then assigned to the _length_ and _width_ fields.

Notice that the constructor’s heading doesn’t specify a return type-not even void. This is because constructors are not executed by explicit method calls and cannot return a value.

The method header general form:

_AccessSpecifier ClassName(Parameters…)_

1 public class ConstructorDemo 2 {  
 3    public static void main(String[] args) 4    { 5       Rectangle box = new Rectangle(5.0, 15.0); 6        7       System.out.println("The box's length is " + box.getLength()); 8        9       System.out.println("The box's width is " + box.getWidth());10       11       System.out.println("The box's area is " + box.getArea());12    }13 }

UNINITIALIZED LOCAL REFERENCE VARIABLES

The program above initializes the _box_ variable with the address of a _Rectangle_ object. Reference variables can also be declared without being initialized, as follows:

Rectangle box;

Note that this statement does not create a _Rectangle_ object. It only declares a variable named _box_ that can be used to reference a _Rectangle_ object. Because the _box_ variable does not yet hold an object’s address, it is an _uninitialized_ _reference variable._

After declaring the reference variable, the following statement can be used to assign it the address of an object. This statement creates a _Rectangle_ object, passes the values 7.0 and 14.0 into its constructor, and assigns the object’s address to the _box_ variable:

box = new Rectangle(7.0, 14.0);

Once this statement executes, the _box_ variable will reference a _Rectangle_ object.

Careful with uninitialized reference variables, all local variables must be initialized or assigned a variable before they can be used. This is also true for reference variables. A local variable must reference an object before it can be used. Otherwise a compiler error will occur.

THE DEFAULT CONSTRUCTOR

When an object is created, its constructor is always called. If you do not write one, Java automatically provides one when compiling. The constructor that Java provides is called the _default constructor_.

The default constructor doesn’t accept arguments. It sets all of the object’s numeric fields to 0 and Boolean fields to false. If the object has any fields that are reference variables, the default constructor sets them to the special value _null,_ which means they do not reference anything.

So, when we created ConstructorDemo.java we added arguments to pass to the constructor we updated in the Rectangle class. Without passing arguments when the object is created, an error will occur.

WRITING YOUR OWN NO-ARG CONSTRUCTOR

A constructor that does not accept arguments is a no-arg constructor. The default constructor doesn’t accept arguments, so it is considered a no-arg constructor. In addition, you can write you own no-arg constructor. For example:

37 public Rectangle()38 {  
39    length = 1.0;40    width = 1.0;41 }

If this constructor was used in the Rectangle class, we would not pass any arguments when creating a Rectangle object.

  

THE _String_ CLASS CONSTRUCTOR

There is one class you can instantiate without the new operator. The string class.

Java allows you to create String objects in the same way you create primitive variables.

String name = “Joe Mahoney”;

This statement creates a String object in memory, initialized it with the string literal “Joe Mahoney”. The object is referenced by the name variable.

You can also create a string object by passing a string literal to the constructor

String name = new String(“Joe Mahoney”);

String objects are a special case in Java because they are so commonly used, Java provides shortcut operations with String objects that are not possible with other objects of other types.

In addition to creating String objects without new, you can aso use the = operator to assign values, and the + operator to concatenate strings.

  

1 public class CellPhone { 2    private String manufact; 3    private String model; 4    private double retailPrice; 5     6    public CellPhone(String man, String mod, double price) { 7       manufact = man; 8       model = mod; 9       retailPrice = price;10    }11    public void setManufact(String man) {12       manufact = man;13    }14    public void setMod(String mod) {15       model = mod;16    }17    public void setRetailPrice(double price) {18       retailPrice = price;19    }20    public String getManufact() {21       return manufact;22    }23    public String getModel() {24       return model;25    }26    public double getRetailPrice() {27       return retailPrice;28    }29 }

1 import java.util.Scanner; 2 public class CellPhoneTest { 3    public static void main(String[] args) { 4       String testMan; 5       String testMod; 6       double testPrice; 7        8       Scanner keyboard = new Scanner(System.in); 9       System.out.print("Enter manufacturer: ");  
10       testMan = keyboard.nextLine();11       12       System.out.print("Enter the model number: ");  
13       testMod = keyboard.nextLine();14       15       System.out.print("Enter the retail price: ");  
16       testPrice = keyboard.nextDouble();17       18       CellPhone phone = new CellPhone(testMan, testMod, testPrice);19       System.out.println();20       System.out.println("Here is the data that you provided:");  
21       System.out.println("Manufacturer: " + phone.getManufact());22       System.out.println("Model number: " + phone.getModel());23       System.out.println("Retail price: " + phone.getRetailPrice());24    }25 }

  

1 import java.util.Random; 2 public class Die { 3    private int sides; 4    private int value; 5     6    public Die(int numSides) { 7       sides = numSides; 8       roll(); 9    }10    public void roll() {        //constructor  
11       Random rand = new Random();12       value = rand.nextInt(sides) + 1;13    }14    public int getSides() {15       return sides;16    }17    public int getValue() {18       return value;19    }20 }

1 public class DiceDemo { 2    public static void main(String[] args) { 3       final int DIE1_SIDES = 6; 4       final int DIE2_SIDES = 12; 5       final int MAX_ROLLS = 5; 6        7       Die die1 = new Die(DIE1_SIDES); 8       Die die2 = new Die(DIE2_SIDES); 9       10       System.out.println("This simulates the rolling of a " + DIE1_SIDES +11                          " sided die and a " + DIE2_SIDES + " sided die.");  
12       System.out.println("Initial value of the dice:");  
13       System.out.println(die1.getValue() + " " + die2.getValue());14       System.out.println("Rolling the dice " + MAX_ROLLS + " times.");  
15       16       for (int i = 0; i < MAX_ROLLS; i++) {17          die1.roll();18          die2.roll();19          System.out.println(die1.getValue() + " " + die2.getValue());20       }21    }22 }

PASSING OBJECTS AS ARGUMENTS

CONCEPT: When an object is passed as an argument to a method, the object’s address is passed into the method’s parameter variable. As a result, the parameter references the object.

When you are developing applications that will work with objects, you will often need to write methods that accept objects as arguments.

**void showDieSides(Die d) {**

**System.out.println(“This die has “ + d.getSides() + “sides.”); }**

CREATING OBJECT

**Die myDie = new Die(6);**

**showDieSides(myDie)**

When you pass an object as an argument, the thing that is passed into the parameter variable is the object’s memory address. As a result, the parameter variable references the object, and the method has access to the object.

1 public class DieArgument { 2    public static void main(String[] args) { 3       final int SIX_SIDES = 6; 4       final int TWENTY_SIDES = 20; 5        6       Die sixDie = new Die(SIX_SIDES); 7       Die twentyDie = new Die(TWENTY_SIDES); 8        9       rollDie(sixDie);10       rollDie(twentyDie);11    }12    public static void rollDie(Die d) {13       System.out.println("Rolling a " + d.getSides() + " sided die.");  
14       d.roll();15       16       System.out.println("The die's value: " + d.getValue());17    }18 }

  

1 public class Dealer { 2    private int die1Value; 3    private int die2Value; 4     5    public Dealer() {          //constructor  
 6       die1Value = 0; 7       die2Value = 0; 8    } 9    public void rollDice() {   //rolls dice, saves values  
10       final int SIDES = 6;11       12       Die die1 = new Die(SIDES);13       Die die2 = new Die(SIDES);15       die1Value = die1.getValue();16       die2Value = die2.getValue();17    }18    public String getChoOrHan() {19       String result;20       int sum = die1Value + die2Value;22       if (sum % 2 == 0)23          result = "Cho";  
24       else  
25          result = "Han";  
26       return result;27    }28    public int getDie1Value() {29       return die1Value;30    }31    public int getDie2Value() {32       return die2Value;33    }34 }

1 import java.util.Random; 2 public class Player { 3    private String name; 4    private String guess; 5    private int points; 7    public Player(String playerName) { 8       name = playerName; 9       guess = "";  
10       points = 0;11    }12    public void makeGuess() {13       Random rand = new Random();14       15       int guessNumber = rand.nextInt(2);16       17       if (guessNumber == 0)18          guess = "Cho";  
19       else  
20          guess = "Han";  
21    }22    public void addPoints(int newPoints) {23       points += newPoints;24    }25    public String getName() {26       return name;27    }28    public String getGuess() {29       return guess;30    }31    public int getPoints() {32       return points;33    }34 }

1 import java.util.Scanner; 2 public class ChoHan { 3    public static void main(String[] args) { 4       final int MAX_ROUNDS = 5; 5       String player1Name; 6       String player2Name; 7        8       Scanner keyboard = new Scanner(System.in); 9       10       System.out.print("Enter the first player's name: ");  
11       player1Name = keyboard.nextLine();12       System.out.print("Enter the second player's name: ");  
13       player2Name = keyboard.nextLine();14       15       Dealer dealer = new Dealer();16       17       Player player1 = new Player(player1Name);18       Player player2 = new Player(player2Name);19       20       for (int round = 0; round < MAX_ROUNDS; round++) {21          System.out.println("------------------------------");  
22          System.out.printf("Now playing round %d.\n", round + 1);  
23          24          dealer.rollDice();25          26          player1.makeGuess();27          player2.makeGuess();28          29          roundResults(dealer, player1, player2);30       }31       displayGrandWinner(player1, player2);32    }33    public static void roundResults(Dealer dealer, Player player1, Player player2) {34       System.out.printf("The dealer rolled %d and %d.\n", dealer.getDie1Value(),  
35                                                           dealer.getDie2Value());36       System.out.printf("Result: %s\n", dealer.getChoOrHan());  
37       38       checkGuess(player1, dealer);39       checkGuess(player2, dealer);40    }41    public static void checkGuess(Player player, Dealer dealer) {42       final int POINTS_TO_ADD = 1;43       String guess = player.getGuess();44       String choHanResult = dealer.getChoOrHan();45       46       System.out.printf("The player %s guessed %s.\n", player.getName(), player.getGuess());  
47       48       if (guess.equalsIgnoreCase(choHanResult)) {49          player.addPoints(POINTS_TO_ADD);50          System.out.printf("Awarding %d point(s) to %s.\n", POINTS_TO_ADD, player.getName());  
51       }52    }53    public static void displayGrandWinner(Player player1, Player player2) {54       System.out.println("------------------------------");  
55       System.out.println("Game over. Here are the results:");  
56       System.out.printf("%s: %d points.\n", player1.getName(), player1.getPoints());  
57       System.out.printf("%s: %d points.\n", player2.getName(), player2.getPoints());  
58       59       if (player1.getPoints() > player2.getPoints())60          System.out.println(player1.getName() + " is the grand winner!");  
61       else if (player2.getPoints() > player1.getPoints())62          System.out.println(player2.getName() + " is the grand winner!");  
63       else  
64          System.out.println("Both players are tied!");  
65    }66 }

  

OVERLOADING METHODS AND CONSTRUCTORS

CONCEPT: Two or more methods in a class may have the same name as long as their parameter lists are different. This also applies to constructors.

Method overloading is an important part of OOP. When a method is overloaded, it means that multiple methods in the same class have the same name, but use different types of parameters. Method overloading is important because sometimes you need several different ways to perform the same operation. Suppose a class has these two methods:

1 public int add (int num1, int num2) {2    int sum = num1 + num2;3    return sum;4 }  
5 public String add (String str1, String str2) {6    String combined = str1 + str2;7    return combined;8 }

Both of these methods are named add. They both take two arguments, which are added together. When we write a call to the add method, the compiler must determine which one of the overloaded methods we intended to call.

The process of matching a method call with the correct method is known as binding. When an overloaded method is being called, Java uses the method’s name and parameter list to determine which method to bind the call to. If two int arguments are passed into the add method, the version of the method with two int parameters is called. Likewise, when two String arguments are passed to add.

Java uses a method’s signature to distinguish it from other methods of the same name. A method’s signature consists of the method’s name and the data types of the method’s parameters, in the order that they appear. ex.

1 add(int, int)  
2 add(String, String)

Note that the method’s return type is not part of the signature. For this reason, the following add method cannot be added to the same class with the previous one:

1 public int add(String str1, String str2) {2    int sum = Integer.parseInt(str1) + Integer.parseInt(str2);3    return sum;4 }

Because the return type is not part of the signature, this method’s signature is the same as that of the other add method that takes two String arguments. An error will occur.

Constructors can also be overloaded, which means that a class can have more than one constructor. The rules for overloading constructors are the same for overloading other methods: Each version of the constructor must have a different parameter list. As long as each constructor has a unique signature, the compiler can tell them apart. ex.

1 public Rectangle() {2    length = 0.0;3    width = 0.0;4 }  
5 public Rectangle(double len, double w) {6    length = len;7    width = w;8 }

The first constructor shown here accepts no arguments, and assigns 0.0 to the length and width fields. The second constructor accepts two arguments, which are assigned to the length and width fields. Ex. shows how to call each of these:

1 Rectangle box1 = new Rectangle();2 Rectangle box2 = new Rectangle(5.0, 10.0);

The first statement creates a Rectangle object, referenced by the box 1 variable, and executes the no-arg constructor. Its length and width fields will be set to 0.0. The second statement creates another Rectangle object, referenced by the box2 variable, and executes the second constructor. Its length and width fields will be set to 5.0 and 10.0, respectively.

  

Java does provide a default constructor only when you do not write any constructors for that class. If a class has a constructor that accepts arguments, but it does not have a no-arg constructor, you cannot create an instance of the class without passing arguments to the constructor. Therefore, any time you write a constructor for a class, and that constructor accepts arguments, you should also write a no-arg constructor if you want to be able to create instances of the class without passing arguments to the constructor.

THE BANK ACCOUNT CLASS

1 public class BankAccount { 2    private double balance; 3     4    public BankAccount() { 5       balance = 0.0; 6    } 7    public BankAccount(double startBalance) { 8       balance = startBalance; 9    }10    public BankAccount(String str) {11       balance = Double.parseDouble(str);12    }13    public void deposit(double amount) {14       balance += amount;15    }16    public void deposit(String str) {17       balance += Double.parseDouble(str);18    }19    public void withdraw(double amount) {20       balance -= amount;21    }22    public void withdraw(String str) {23       balance -= Double.parseDouble(str);24    }25    public void setBalance(double b) {26       balance = b;27    }28    public void setBalance(String str) {29       balance = Double.parseDouble(str);30    }31    public double getBalance() {32       return balance;33    }34 }

  

The class has one field, balance, which is a double. This field holds an account’s current balance. Here is a summary of the class’s overloaded constructors:

The first constructor is a no-arg constructor it sets the balance field to 0.0. If we wish to execute this constructor when we create an instance of this class, we simply pass no constructor arguments.

1 BankAccount account = new BankAccount();

The second constructor has a double parameter variable, startBalance, which is assigned to the balance field. If we wish to execute this constructor when we create an instance of the class, we pass a double value as a constructor argument.

1 BankAccount account = new BankAccount(1000.0);

The third constructor has a String parameter variable, str. It is assumed that the String contains a string representation of the account’s balance. The method uses the Double.parseDouble method to convert the string to a double, and then it assigns it to the balance field. If we wish to execute this constructor when we create an instance of the class, we can pass a reference to a string as a constructor argument

1 BankAccount account = new BankAccount("1000.0");

This constructor is provided as a convenience. If the class is used in a program that reads the account balance from a dialog box, or from a text file, the amount does not have to be converted from a string before it is passed to the constructor.

SUMMARY OF OVERLOADED DEPOSIT METHODS:

The first deposit method has a parameter, amount, which is a double. When the method is called, an amount that is to be deposited into the account is passed into this parameter. The value of the parameter is then added to value in the balance field.

The second deposit method has a parameter, str, which is a reference to a String. It is assumed that the String contains a string representation of the amount to be deposited. The method uses the Double.parseDouble method to convert the string to a double, and then adds it to the balance field. For example, if we call the method and pass “500.0” as the argument, it will add 500.0 to the balance field. As with the overloaded constructors, this method is provided as a convenience for programs that read the amount to be deposited from a dialog box or from a text file.

SUMMARY OF OVERLOADED WITHDRAW METHODS:

The first withdraw method has a parameter, amount, which is a double. When the method is called, an amount that is to be withdrawn from the account is passed into this parameter. The value of the parameter is then subtracted from the value in the balance field.

The second withdraw method has a parameter, str, which is a reference to a String. It is assumed that the String contains a string representation of the amount to be withdrawn. This amount is converted into a double, and then subtracted from the balance field. As with the overloaded constructors, and deposit methods, this method is provided as a convenience.

SUMMARY OF OVERLOADED SETBALANCE METHODS

The first setBalance method accepts a double argument, which is assigned to the balance field.

The second setBalance method accepts a String as a reference as an argument. It is assumed that the String contains a string representation of the account’s balance. The String is converted to a double and then assigned to the balance field. This is also a convenience.

  

1 public class BankAccount { 2    private double balance; 3     4    public BankAccount() { 5       balance = 0.0; 6    } 7    public BankAccount(double startBalance) { 8       balance = startBalance; 9    }10    public BankAccount(String str) {11       balance = Double.parseDouble(str);12    }13    public void deposit(double amount) {14       balance += amount;15    }16    public void deposit(String str) {17       balance += Double.parseDouble(str);18    }19    public void withdraw(double amount) {20       balance -= amount;21    }22    public void withdraw(String str) {23       balance -= Double.parseDouble(str);24    }25    public void setBalance(double b) {26       balance = b;27    }28    public void setBalance(String str) {29       balance = Double.parseDouble(str);30    }31    public double getBalance() {32       return balance;33    }34 }

1 import javax.swing.JOptionPane; 2 public class AccountTest { 3    public static void main(String[] args) { 4       String input; 5       input = JOptionPane.showInputDialog("What is your account's starting balance?");  
 6        7       BankAccount account = new BankAccount(input); 8        9       input = JOptionPane.showInputDialog("How much were you paid this month?");  
10  
11       account.deposit(input);12       13       JOptionPane.showMessageDialog(null, String.format("Your pay has been deposited.\n" +14                                                         "Your current balance is $%,.2f",  
15                                                         account.getBalance()));16       input = JOptionPane.showInputDialog("How much would you like to withdraw?");  
17       account.withdraw(input);18       19       JOptionPane.showMessageDialog(null, String.format("Now your balance is $%,.2f",  
20                                                         account.getBalance()));21       System.exit(0);22    }23 }

OVERLOADED METHODS CAN MAKE CLASSES MORE USEFUL

Wouldn’t it be simpler without the overloaded classes, after all many of them weren’t used?

An object’s purpose is to provide a specific service. The service provided by the BankAccount class is that it simulates a bank account. Any program that needs a simulated bank account can simply create a BankAccount object and then use its methods to put the simulation into action. Because the BankAccount class has numerous overloaded methods, it is much more flexible than it would be if it provided only one way to perform every operation. By providing overloaded constructors, deposit methods, withdraw methods, and setBalance methods, we made the BankAccount class useful to programs other than our simple demonstration program. This is an important consideration to keep in mind when you are designing classes.

SCOPE OF INSTANCE FIELDS

CONCEPT: Instance fields are visible to all of the class’s instance methods.

A variables scope is the part of the program where the variable may be accessed by its name. The variable’s location declaration determines the variable’s scope.

There have been variables declared as instance fields in a class. An instance field can be accessed by any instance method in the same class as the field. If an instance field is declared with the public access specifier, it can also be accessed by code outside of the class.

  

SHADOWING

You cannot have two local variables with the same name in the same scope. This also applies to parameter variables as well. A parameter variable is, in essence, a local variable. So, you cannot give a parameter variable and a local variable in the same method the same name.

However, you can have a local variable or parameter variable with the same name as a field. When you do, the name of the local or parameter variable shadows the name of the field. This means that the field name is hidden by the name of the local or parameter variable.

1 public void setLength(double len) {2    int length;3    length = len;4 }

In this code a local variable is given the same name as a field. Therefore, the local variable’s name shadows the field’s name. When the statement length = len; is executed, the value of len is assigned to the local variable length, not to the field. The unintentional shadowing of field names can cause elusive bugs, so you need to be careful not to give local variables the same names as fields.

PACKAGES AND IMPORT STATEMENTS

CONCEPT: The classes in the Java API are organized into packages. An import statement tells the compiler which package a class is located in.

Many of the classes in the Java API are not automatically available to your program. Quite often, you have to import an API class in order to use it.

EXPLICIT AND WILDCARD IMPORT STATEMENTS

Explicit import statement – identifies the package location of a single class. > import java.util.Scanner;

Wildcard import statement – tells the compiler to import all of the classes in a package. > import java.util.*;

the “.*” tells the compiler to import all the classes that are a part of the java.util package. Using a wildcard import statement does not affect the performance or size of your program. It just lets the compiler know that you want to make every class in a particular package available to your program.

THE java.lang PACKAGE

The Java API does have one package, java.lang, which is automatically imported into every Java program. This package contains general classes, such as String and System, that are fundamental to the Java programming language.

OTHER API PACKAGES

·         java.io – Performs various types of input and output

·         java.lang – Provides general classes. Automatically imported.

·         java.net – Provides classes for network communications

·         java.security – Provides classes that implement security features.

·         java.sql – Provides classes for accessing databases using structured query language.

·         java.text – Provides various classes for formatting text.

·         java.util – Provides various utility classes.

  

FOCUS ON OBJECT-ORIENTED DESIGN: FINDING THE CLASSES AND THEIR RESPONSIBILITIES

So far you have learned the basics of writing a class, creating an object from the class, and using the object to perform operations. The first step to creating an object-oriented application is to analyze the problem and determine which classes you will need.

FINDING THE CLASSES

When developing an object-oriented application, one of your first tasks is to identify the classes that you will need to create. Typically, your goal is to identify the different types of real-world objects that are present in your problem, and then create classes for those types of objects in your application

Finding classes:

1. Get a written description of the problem domain.

2. Identify all the nouns (including pronousn and noun phrases) in the description. Each of these is a potential class.

3. Refine the list to include only the classes that are relevant to the problem.

WRITING A DESCRIPTION OF THE PROBLEM DOMAIN

The problem domain is the set of real-world objects, parties, and major events related to the problem. If you understand the problem, you can write a description of the problem domain yourself.

  

Joe’s Automotive Shop services foreign cars, and specializes in servicing cars made by Mercedes, Porsche, and BMW. When a customer brings a car to the shop, the manager get the customer’s name, address, and telephone number. Then the manager determines the make, model, and year of the car, and give the customer a service quote. The service quote shows the estimated parts charges, estimated labor charges, sales tax, and total estimated charges.

THE PROBLEM DOMAIN:

·         Physical object such as vehicles, machines, or products

·         Any role played by a person, such as manager, employee, customer, teacher, student, and so forth.

·         The results of a business event, such as a customer order, or in this case a service quote.

·         Recordkeeping items, such as customer histories, and payroll records.

  

IDENTIFYING ALL THE NOUNS

|   |   |   |
|---|---|---|
|Address|Foreign cars|Porsche|
|BMW|Joe’s automotive Shop|Sales tax|
|Car|Make|Service quote|
|cars|Manager|Shop|
|customer|Mercedes|Telephone number|
|Estimated labor charges|Model|Total estimated charges|
|Estimated parts|Name|year|

Red = no information | Orange = objects | Purple = primitive

Ultimately, this program will need classes for cars, service quotes, and customers.

·         Some nouns might not represent items we do not need to be concerned about.

o   We can cross shop off the list because our application only needs to be concerned with individual service quotes. It doesn’t need to work with or determine company-wide information. If the problem description asked us to keep a total of all the service quotes, it would make sense to have a class for shop

o   We will not need a class for manager. The problem does not direct us to process any information about the manager. If there were multiple shop managers, and the problem description asked to record which manager generated each service quote, then it would make sense to have a class for manager.

·         Some nouns might represent objects not classes

o   Mercedes, Porsche, and BMW will be instances of the car class.

·         Some nouns might represent simple values that can be stored in a primitive variable

o   A class contains fields and methods. Fields are related items that are stored within an object of the class, and define the object’s state. Methods are actions or behaviors that may be performed by an object of the class. if a noun represents a type of item that would not have any identifiable fields or methods, then it can probably be eliminated. To help ask these questions:

§  Would you use a group of related values to represent the item’s state?

§  Are there any obvious actions to be performed by the item?

o   If the answer to both is no, then the noun probably represents a value that can be stored in a primitive variable.

IDENTIFYING A CLASS’S RESPONSIBILITIES

Next is to identify each class’s responsibilities:

·         The things that the class is responsible for knowing.

·         the actions that the class is responsible for doing.

When you have identified the things that a class is responsible for knowing, you have identified the class’s attributes. These values will be stored in fields. Likewise, when you have identified the actions that a class is responsible for doing, you have identified its methods.

It is often helpful to ask the questions “In the context of this problem, what must the class know? What must the class do?” The first place to look for the answers is in the description of the problem domain. Many of the things that a class must know and do will be mentioned. Some class responsibilities, however, might not be directly mentioned in the problem domain, so brainstorming is often required. Application:

THE CUSTOMER CLASS

·         The customer’s name.

·         The customer’s address.

·         The customer's telephone number.

These are all values that can be represented as strings and stored in the class’s fields. The Customer class can potentially know many other things. A mistake at this point could be identifying too many things that an object is responsible for knowing.

METHODS

·         Create an object of the Customer class

·         Set and get the customer’s name.

·         Set and get the customer’s address.

·         Set and get the customer’s telephone number.

From this list we can see that the Customer class will have a constructor, as well as accessor and mutator methods for each of its fields.

CAR CLASS

·         The car’s make.

·         The car’s model.

·         The car’s year.

In the context of our problem domain, what must the Car class do? Once again, the only obvious actions are the standard set of methods that we will find in most classes (constructors, accessors, and mutators). Actions:

·         Create an object of the Car class.

·         Set and get the car’s make.

·         Set and get the car’s model.

·         Set and get the car’s year.

SERVICE QUOTE CLASS

·         The estimated parts charges.

·         The estimated labor charges.

·         The sales tax.

·         The total estimated charges.

Brainstorming will reveal that sales tax and total estimated charges are results of calculations. These items are dependent on the values of the estimated parts and labor charges. To avoid stale data, we will not store these values in fields. Rather, we will provide methods that calculate these values and return them. The other methods that we will need for this class are constructor and the accessors and mutators for the estimated parts charges and the estimated labor charges fields.

![[CSO_Gaddis_Java_Chapter06_7e.ppt]]