# 9.1 Intro to Wrapper Classes
**Concept**: Java provides wrapper classes for the primitive data types. The wrapper class for a given primitive type contains not only a value of that type, but also methods that perform operations related to the type. 

A wrapper class allows you to wrap around a primitive data type and allows you to create objects instead of variables. They provide methods that perform useful operations on primitive values.

Wrapper classes are immutable.

# 9.2 Character testing and Conversion with the Character class

**Concept**: The character class is a wrapper class for the char data type. it provides numerous methods for testing and converting character data. 

It's part of the java.lang package, no import necessary.

**Boolean**
	isDigit(char ch)
	isLetter(char ch)
	isLetterOrDigit(char ch)
	isLowerCase(char ch)
	isUpperCase(char ch)
	isSpaceChar(char ch)
	isWhiteSpace(char ch)

``` java
 1 import javax.swing.JOptionPane;
 2
 3  /**
 4     This program demonstrates some of the Character
 5     class's character testing methods.
 6  */
 7
 8  public class CharacterTest
 9  {
10     public static void main(String[] args)
11     {
12        String input;  // To hold the user's input
13        char ch;       // To hold a single character
14
15        // Get a character from the user and store
16        // it in the ch variable.
17        input = JOptionPane.showInputDialog("Enter " +
18                                "any single character.");
19        ch = input.charAt(0);
20
21        // Test the character.
22        if (Character.isLetter(ch))
23        {
24           JOptionPane.showMessageDialog(null,
25                            "That is a letter.");
26        }
27
28        if (Character.isDigit(ch))
29        {
30           JOptionPane.showMessageDialog(null,
31                            "That is a digit.");
32        }
33
34        if (Character.isLowerCase(ch))
35        {
36           JOptionPane.showMessageDialog(null,
37                 "That is a lowercase letter.");
38        }
39
40        if (Character.isUpperCase(ch))
41        {
42           JOptionPane.showMessageDialog(null,
43                 "That is an uppercase letter.");
44        }
45
46        if (Character.isSpaceChar(ch))
47        {
48           JOptionPane.showMessageDialog(null,
49                             "That is a space.");
50        }
51
52        if (Character.isWhitespace(ch))
53        {
54           JOptionPane.showMessageDialog(null,
55                    "That is a whitespace character.");
56        }
57
58        System.exit(0);
59    }
60  }
```

``` java
 1  import javax.swing.JOptionPane;
 2
 3  /**
 4     This program tests a customer number to
 5     verify that it is in the proper format.
 6  */
 7
 8  public class CustomerNumber
 9  {
10    public static void main(String[] args)
11    {
12        String input;  // To hold the user's input
13
14        // Get a customer number.
15        input = JOptionPane.showInputDialog("Enter " +
16           "a customer number in the form LLLNNNN\n" +
17           "(LLL = letters and NNNN = numbers)");
18
19        // Validate the input.
20        if (isValid(input))
21        {
22           JOptionPane.showMessageDialog(null,
23                    "That's a valid customer number.");
24        }
25        else
26        {
27           JOptionPane.showMessageDialog(null,
28               "That is not the proper format of a " +
29               "customer number.\nHere is an " +
30               "example: ABC1234");
31        }
32
33        System.exit(0);
34    }
35
36    /**
37        The isValid method determines whether a
38        String is a valid customer number. If so, it
39        returns true.
40        @param custNumber The String to test.
41        @return true if valid, otherwise false.
42    */
43
44    private static boolean isValid(String custNumber)
45    {
46        boolean goodSoFar = true;   // Flag
47        int i = 0;                  // Control variable
48
49        // Test the length.
50        if (custNumber.length() != 7)
51           goodSoFar = false;
52
53        // Test the first three characters for letters.
54        while (goodSoFar && i < 3)
55        {
56           if (!Character.isLetter(custNumber.charAt(i)))
57              goodSoFar = false;
58           i++;
59        }
60
61        // Test the last four characters for digits.
62        while (goodSoFar && i < 7)
63        {
64           if (!Character.isDigit(custNumber.charAt(i)))
65              goodSoFar = false;
66           i++;
67        }
68
69        return goodSoFar;
70    }
71  }
```

**CASE CONVERSION**
	char toLowerCase(char ch)
	char toUpperCase(char ch)

``` java
System.out.println(Character.toLowerCase('A'));

System.out.println(Character.toUpperCase('a'));
```

``` java
 1  import java.util.Scanner;
 2
 3  /**
 4     This program demonstrates the Character
 5     class's toUpperCase method.
 6  */
 7
 8  public class CircleArea
 9  {
10     public static void main(String[] args)
11     {
12        double radius; // The circle's radius
13        double area;   // The circle's area
14        String input;  // To hold a line of input
15        char choice;   // To hold a single character
16
17        // Create a Scanner object to read keyboard input.
18        Scanner keyboard = new Scanner(System.in);
19
20        do
21        {
22           // Get the circle's radius.
23           System.out.print("Enter the circle's radius: ");
24           radius = keyboard.nextDouble();
25
26           // Consume the remaining newline character.
27           keyboard.nextLine();
28
29           // Calculate and display the area.
30           area = Math.PI * radius * radius;
31           System.out.printf("The area is %.2f.\n", area);
32
33           // Repeat this?
34           System.out.print("Do you want to do this " +
35                            "again? (Y or N) ");
36           input = keyboard.nextLine();
37           choice = input.charAt(0);
38
39        } while (Character.toUpperCase(choice) == 'Y');
40    }
41  }
```

# 9.3 More String Methods

**CONCEPT**: The String class provides several methods for searching and working with string objects.

substring - string that is part of another string.
##### Searching for Substrings

- boolean startsWith(String str) - true if calling string begins with string passed into str
- boolean endsWith(String str) - true if calling string ends with string passed into str
- boolean regionMatches(int start, String str, int start2, int n) - This method returns true if a specified region of the calling string matches a specified region of the string passed into str. The start parameter indicates the starting position of the region within the calling string. The start2 parameter indicates the starting position of the region within str. The n parameter indicates the number of characters in both regions.
- boolean regionMatches(Boolean ignoreCase, int start, String str, int start2, int n) -This overloaded version of the regionMatches method has an additional parameter, ignoreCase. If true is passed into this parameter, the method ignores the case of the calling string and str when comparing the regions. If false is passed into the ignoreCase parameter, the comparison is case-sensitive.

``` java
 1  import java.util.Scanner;
 2
 3  /**
 4     This program uses the startsWith method to search using
 5     a partial string.
 6  */
 7
 8  public class PersonSearch
 9  {
10     public static void main(String[] args)
11     {
12        String lookUp; // To hold a lookup string
13
14        // Create an array of names.
15        String[] people = { "Cutshaw, Will", "Davis, George",
16                            "Davis, Jenny", "Russert, Phil",
17                            "Russell, Cindy", "Setzer, Charles",
18                            "Smathers, Holly", "Smith, Chris",
19                            "Smith, Brad", "Williams, Jean" };
20
21        // Create a Scanner object for keyboard input.
22        Scanner keyboard = new Scanner(System.in);
23
24        // Get a partial name to search for.
25        System.out.print("Enter the first few characters of " +
26                         "the last name to look up: ");
27        lookUp = keyboard.nextLine();
28
29        // Display all of the names that begin with the
30        // string entered by the user.
31        System.out.println("Here are the names that match:");
32        for (String person : people)
33        {
34           if (person.startsWith(lookUp))
35              System.out.println(person);
36        }
37    }
38  }
```

##### the regionMatches methods
determines whether specified regions of two strings match
``` java
String str = "Four score and seven years ago";
String str2 = "Those seven years passed quickly";
if (str.regionMatches(15, str2, 6, 11))
   System.out.println("The regions match.");
else
   System.out.println("The regions do not match.");
```

Each of these methods returns a boolean value.

There are also methods to search for items within a string, and report their location

``` java
String str = "Four score and seven years ago";
int first, last;
first = str.indexOf('r');
last = str.lastIndexOf('r');

System.out.println("The letter r first appears at " +
                   "position " + first);

System.out.println("The letter r last appears at " +
                   "position " + last);

The letter r first appears at position 3
The letter r last appears at position 24
```

``` java
String str = "Four score and seven years ago";
int position;

System.out.println("The letter r appears at the " +
                   "following locations:");
position = str.indexOf('r');
while (position != −1)
{
   System.out.println(position);
   position = str.indexOf('r', position + 1);
}

The letter r appears at the following locations:
3
8
24
```

##### Finding substrings with the indexOf and lastIndexOf methods
``` java 
String str = "and a one and a two and a three";
int position;

System.out.println("The word and appears at the " +
                   "following locations.");
position = str.indexOf("and");
while (position != -1)
{
   System.out.println(position);
   position = str.indexOf("and", position + 1);
}

The word and appears at the following locations.
0
10
20
```

Similar but uses lastIndexOf and shows positions in reverse order
``` java
String str = "and a one and a two and a three";
int position;

System.out.println("The word and appears at the " +
                   "following locations.");
position = str.lastIndexOf("and");
while (position != −1)
{
   System.out.println(position);
   position = str.lastIndexOf("and", position − 1);
}

The word and appears at the following locations.
20
10
0
```

##### Extracting substrings

``` java
 1  import java.util.Scanner;
 2
 3  /**
 4     This program displays the number of letters,
 5     digits, and whitespace characters in a string.
 6  */
 7
 8  public class StringAnalyzer
 9  {
10     public static void main(String [] args)
11     {
12        String input;        // To hold input
13        char[] array;        // Array for input
14        int letters = 0;     // Number of letters
15        int digits = 0;      // Number of digits
16        int whitespaces = 0; // Number of whitespaces
17
18        // Create a Scanner object for keyboard input.
19        Scanner keyboard = new Scanner(System.in);
20
21        // Prompt the user to enter a line of input.
22        System.out.print("Enter a string: ");
23        input = keyboard.nextLine();
24
25        // Convert the string to a char array.
26        array = input.toCharArray();
27
28        // Analyze the characters.
29        for (int i = 0; i < array.length; i++)
30        {
31           if (Character.isLetter(array[i]))
32              letters++;
33           else if (Character.isDigit(array[i]))
34              digits++;
35           else if (Character.isWhitespace(array[i]))
36              whitespaces++;
37        }
38
39        // Display the results.
40        System.out.println("That string contains " +
41                           letters + " letters, " +
42                           digits + " digits, and " +
43                           whitespaces + 
44                           " whitespace characters.");
45     }
46  }


Enter a string: 99 red balloons [Enter]

That string contains 11 letters, 2 digits, and 2 whitespace characters.
```

##### methods that return a modified string

concat replaces +
``` java
//original
String fullName;
String firstName = "Timothy ";
String lastName = "Haynes";
fullName = firstName + lastName;
//concat
String fullName;
String firstName = "Timothy ";
String lastName = "Haynes";
fullName = firstName.concat(lastName);
```

replace returns copy of string object
``` java
String str1 = "Tom Talbert Tried Trains";
String str2;
str2 = str1.replace('T', 'D');
System.out.println(str1);
System.out.println(str2);

Dom Dalbert Dried Drains
```
replace method does not modify the contents of the calling string object, but returns a reference to a string that is a modified copy of it. 

trim method
```java
String greeting1 = "   Hello   ";
String greeting2;
greeting2 = greeting1.trim();
System.out.println("*" + greeting1 + "*");
System.out.println("*" + greeting2 + "*");

*   Hello   *
*Hello*
```

##### Static valueOf Methods

String valueOf(boolean b)
If the boolean argument passed to b is true, the method returns the string "true". If the argument is false, the method returns the string "false".


String valueOf(char c)
This method returns a String containing the character passed into c.


String valueOf(char[] array)
This method returns a String that contains all of the elements in the char array passed into array.


String valueOf(char[] array,  int subscript,  int count)
This method returns a String that contains part of the elements in the char array passed into array. The argument passed into subscript is the starting subscript and the argument passed into count is the number of elements.


String valueOf(double number)
This method returns the String representation of the double argument passed into number.


String valueOf(float number)
This method returns the String representation of the float argument passed into number.


String valueOf(int number)
This method returns the String representation of the int argument passed into number.


String valueOf(long number)
This method returns the String representation of the long argument passed into number.

# 9.4 The StringBuilder Class

**CONCEPT**: The stringbuilder class is similar to the string class, except that you may change the contents of stringbuilder objects. the stringbuilder class also prived several useful methods the string class does not have. 

String objects are immutable
StringBuilder objects can be changed.

##### StringBuilder Constructors

StringBuilder()
This constructor accepts no arguments. It gives the object enough storage space to hold 16 characters, but no characters are stored in it.


StringBuilder(int length)
This constructor gives the object enough storage space to hold length characters, but no characters are stored in it.


StringBuilder(String str)
This constructor initializes the object with the string in str. The object’s initial storage space will be the length of the string plus 16.

```java
StringBuilder city = new StringBuilder("Charleston");
System.out.println(city);
```

This code creates a StringBuilder object and assigns its address to the city variable. The object is initialized with the string “Charleston”. As demonstrated by this code, you can pass a StringBuilder object to the println and print methods.

##### Other StringBuilder Methods

``` java
char charAt(int  position)
void getChars(int  start, int  end, char[]  array, int  arrayStart)
int indexOf(String  str)
int indexOf(String  str, int  start)
int lastIndexOf(String  str)
int lastIndexOf(String  str, int  start)
int length()
String substring(int  start)
String substring(int  start, int  end)
```

##### the append methods

```java
StringBuilder str = new StringBuilder();
// Append values to the object.
str.append("We sold ");           // Append a String object.
str.append(12);                   // Append an int.
str.append(" doughnuts for $");   // Append another String.
str.append(15.95);                // Append a double.

// Display the object's contents.
System.out.println(str);

We sold 12 doughnuts for $15.95
```

##### the insert methods

``` java
object.insert(start, item);

StringBuilder str = new StringBuilder("New City");
str.insert(4, "York ");
System.out.println(str);

char cArray[] =  { '2', '0', ' ' };
StringBuilder str = new StringBuilder("In July we sold cars.");
str.insert(16, cArray);
System.out.println(str);
```

##### the replace method

```java
object.replace(start, end, str);

StringBuilder str =
     new StringBuilder("We moved from Chicago to Atlanta.");
str.replace(14, 21, "New York");
System.out.println(str);

We moved from New York to Atlanta.
```

##### Delete, deleteCharAt, setCharAt methods
StringBuilder delete(int start, int end)
The start parameter is an int that specifies the starting position of a substring in the calling object, and the end parameter is an int that specifies the ending position of the substring. (The starting position is included in the substring, but the ending position is not.) The method will delete the substring.


StringBuilder deleteCharAt (int position)
The position parameter specifies the location of a character that will be deleted.


void setCharAt(int position, char ch)
This method changes the character at position to the value passed into ch.

```java
StringBuilder str =
      new StringBuilder("I ate 100 blueberries!");

// Display the StringBuilder object.
System.out.println(str);

// Delete the '0'.
str.deleteCharAt(8);

// Delete "blue".
str.delete(9, 13);

// Display the StringBuilder object.
System.out.println(str);

// Change the '1' to '5'
str.setCharAt(6, '5');

// Display the StringBuilder object.
System.out.println(str);

I ate 100 blueberries!
I ate 10 berries!
I ate 50 berries!
```

##### toStringMethod

```java
StringBuilder strb = new StringBuilder("This is a test.");
String str = strb.toString();
```

Telephone.java
```java
/**
  2     The Telephone class provides static methods
  3     for formatting and unformatting U.S. telephone
  4     numbers.
  5  */
  6
  7  public class Telephone
  8  {
  9     // These constant fields hold the valid lengths of
 10     // strings that are formatted and unformatted.
 11     public final static int FORMATTED_LENGTH = 13;
 12     public final static int UNFORMATTED_LENGTH = 10;
 13
 14     /**
 15        The isFormatted method determines whether a
 16        string is properly formatted as a U.S. telephone
 17        number in the following manner:
 18        (XXX)XXX-XXXX
 19        @param str The string to test.
 20        @return true if the string is properly formatted,
 21                or false otherwise.
 22     */
 23
 24     public static boolean isFormatted(String str)
 25     {
 26        boolean valid;   // Flag to indicate valid format
 27
 28        // Determine whether str is properly formatted.
 29        if (str.length() == FORMATTED_LENGTH &&
 30            str.charAt(0) == '(' &&
 31            str.charAt(4) == ')' &&
 32            str.charAt(8) == '-')
 33            valid = true;
 34        else
 35           valid = false;
 36
 37        // Return the value of the valid flag.
 38        return valid;
 39     }
 40
 41     /**
 42        The unformat method accepts a string containing
 43        a telephone number formatted as:
 44        (XXX)XXX-XXXX.
 45        If the argument is formatted in this way, the
 46        method returns an unformatted string where the
 47        parentheses and hyphen have been removed. Otherwise,
 48        it returns the original argument.
 49        @param str The string to unformat.
 50        @return An unformatted string.
 51     */
 52
 53     public static String unformat(String str)
 54     {
 55        // Create a StringBuilder initialized with str.
 56        StringBuilder strb = new StringBuilder(str);
 57
 58        // If the argument is properly formatted, then
 59        // unformat it.
 60        if (isFormatted(str))
 61        {
 62           // First, delete the left paren at position 0.
 63           strb.deleteCharAt(0);
 64
 65           // Next, delete the right paren. Because of the
 66           // previous deletion it is now located at
 67           // position 3.
 68           strb.deleteCharAt(3);
 69
 70           // Next, delete the hyphen. Because of the
 71           // previous deletions it is now located at
 72           // position 6.
 73           strb.deleteCharAt(6);
 74       }
 75
 76        // Return the unformatted string.
 77        return strb.toString();
 78     }
 79
 80     /**
 81        The format method formats a string as:
 82        (XXX)XXX-XXXX.
 83        If the length of the argument is UNFORMATTED_LENGTH
 84        the method returns the formatted string. Otherwise,
 85        it returns the original argument.
 86        @param str The string to format.
 87        @return A string formatted as a U.S. telephone number.
 88     */
 89
 90     public static String format(String str)
 91     {
 92        // Create a StringBuilder initialized with str.
 93        StringBuilder strb = new StringBuilder(str);
 94
 95        // If the argument is the correct length, then
 96        // format it.
 97        if (str.length() == UNFORMATTED_LENGTH)
 98        {
 99           // First, insert the left paren at position 0.
100           strb.insert(0, "(");
101
102           // Next, insert the right paren at position 4.
103           strb.insert(4, ")");
104
105           // Next, insert the hyphen at position 8.
106           strb.insert(8, "-");
107        }
108
109        // Return the formatted string.
110        return strb.toString();
111     }
112  }
```

TelephoneTester.java
```java
 1  import java.util.Scanner;
 2
 3  /**
 4     This program demonstrates the Telephone
 5     class's static methods.
 6  */
 7
 8  public class TelephoneTester
 9  {
10     public static void main(String[] args)
11     {
12        String phoneNumber;  // To hold a phone number
13
14        // Create a Scanner object for keyboard input.
15        Scanner keyboard = new Scanner(System.in);
16
17        // Get an unformatted telephone number.
18        System.out.print("Enter an unformatted telephone number: ");
19        phoneNumber = keyboard.nextLine();
20
21        // Format the telephone number.
22        System.out.println("Formatted: " +
23               Telephone.format(phoneNumber));
24
25        // Get a formatted telephone number.
26        System.out.println("Enter a telephone number formatted as");
27        System.out.print("(XXX)XXX-XXXX : ");
28        phoneNumber = keyboard.nextLine();
29
30        // Unformat the telephone number.
31        System.out.println("Unformatted: " +
32               Telephone.unformat(phoneNumber));
33     }
34  }


Enter an unformatted telephone number: 9195551212 [Enter]
Formatted: (919)555-1212
Enter a telephone number formatted as
(XXX)XXX-XXXX: (828)555-1212 [Enter]
Unformatted: 8285551212
```

**NOTE**:The Java API provides a class named StringBuffer, which is essentially the same as the StringBuilder class, with the same constructors and the same methods. The difference is that the methods in the StringBuffer class are synchronized. This means that the StringBuffer class is safe to use in a multithreaded application. Multithreaded programming is beyond the scope of this book, but in a nutshell, a multithreaded application is one that concurrently runs multiple threads of execution. In such an application, it is possible for more than one thread to access the same objects in memory at the same time. In multithreaded applications, it is important that the methods be synchronized, to prevent the possibility of data corruption.
Because synchronization requires extra steps to be performed, the StringBuffer class is slower than the StringBuilder class. In an application where the object will not be accessed by multiple threads, you should use the StringBuilder class to get the best performance. In an application where multiple threads will be accessing the object, you should use the StringBuffer class to ensure that its data does not become corrupted.

# 9.5 Tokenizing Strings

**CONCEPT**: Tokenizing a string is a process of breaking a string down into its componets, which are called tokens. The String class's split method can be used to tokeinze strings.

Sometimes a string will contain a series of words or other items of data separated by spaces or other characters. For example, look at the following string:
"peach raspberry strawberry vanilla"
This string contains the following four items of data: peach, raspberry, strawberry, and vanilla. In programming terms, items such as these are known as tokens. Notice that a space appears between the items. The character that separates tokens is known as a delimiter. Here is another example:
"17;92;81;12;46;5"
This string contains the following tokens: 17, 92, 81, 12, 46, and 5. Notice that a semicolon appears between each item. In this example the semicolon is used as a delimiter. Some programming problems require you to read a string that contains a list of items and then extract all of the tokens from the string for processing. For example, look at the following string that contains a date:
"3-22-2018"
The tokens in this string are 3, 22, and 2018, and the delimiter is the hyphen character. Perhaps a program needs to extract the month, day, and year from such a string. Another example is an operating system pathname, such as the following:
/home/rsullivan/data
The tokens in this string are home, rsullivan, and data, and the delimiter is the / character. Perhaps a program needs to extract all of the directory names from such a pathname.
The process of breaking a string into tokens is known as tokenizing. In this section, we will discuss the String class’s split method, a tool that you can use to tokenize strings.

The string class has a method named split, which tokenizes a string and returns an array of String objects. Each element in the array is one of the tokens. 

```java
1  /**
 2     This program demonstrates the String class’s
 3     split method.
 4  */
 5
 6  public class SplitDemo1
 7  {
 8     public static void main(String[] args)
 9     {
10        // Create a string to tokenize.
11        String str = "one two three four";
12
13        // Get the tokens, using a space delimiter.
14        String[] tokens = str.split(" ");
15
16        // Display the tokens.
17        for (String s : tokens)
18           System.out.println(s);
19    }
20  }

one
two
three
four
```

In the previous example, we passed a string containing a single space to the split method. This specified that the space character was the delimiter. The split method also allows you to use multi-character delimiters. This means you are not limited to a single character as a delimiter. Your delimiters can be entire words, if you wish. The following code, which is taken from the program SplitDemo2.java in this chapter’s source code, demonstrates:

```java
// Create a string to tokenize.
String str = "one and two and three and four";

// Get the tokens, using " and " as the delimiter.
String[] tokens = str.split(" and ");

// Display the tokens.
for (String s : tokens)
   System.out.println(s);

one
two
three
four
```

The previous code demonstrates multi-character delimiters (delimiters containing multiple characters). You can also specify a series of characters where each individual character is a delimiter. For example, look at the following email address:
joe@gaddisbooks.com
This string uses two delimiters: @ (the “at” character) and . (the period). To specify that both the @ character and the . character are delimiters, we must enclose them in brackets inside our regular expression. The regular expression will look like this:
"[@.]"
Because the @ and . characters are enclosed in brackets, they will each be considered as a delimiter. The following code, which is taken from the program SplitDemo3.java in this chapter’s source code, demonstrates:
```java
// Create a string to tokenize.
String str = "joe@gaddisbooks.com";

// Get the tokens, using @ and . as delimiters.
String[] tokens = str.split("[@.]");

// Display the tokens.
for (String s : tokens)
   System.out.println(s);
This code will produce the following output:
joe
gaddisbooks
com
```

##### Trimming a String before Tokenizing
When you are tokenizing a string that was entered by the user, and you are using characters other than whitespaces as delimiters, you will probably want to trim the string before tokenizing it. Otherwise, if the user enters leading whitespace characters, they will become part of the first token. Likewise, if the user enters trailing whitespace characters, they will become part of the last token. For example, look at the following code:
``` java
// Create a string with leading and trailing whitespaces.
String str = " one;two;three ";

// Tokenize the string using the semicolon as a delimiter.
String[] tokens = str.split(";");

// Display the tokens.
for (String s : tokens)
{
   System.out.println("*" + s + "*");
}
Notice that the string referenced by str contains a leading and a trailing space. This code will produce the following output:
* one*
*two*
*three *
```
Notice in the output that the first token contains the leading space and the last token contains the trailing space. To prevent leading and/or trailing whitespace characters from being included in the tokens, use the String class's trim method to remove them. Here is the same code, modified to use the trim method:
```java
// Create a string with leading and trailing whitespaces.
String str = " one;two;three ";

// Trim leading and trailing whitespace.
str = str.trim();

// Tokenize the string using the semicolon as a delimiter.
String[] tokens = str.split(";");

// Display the tokens.
for (String s : tokens)
{
   System.out.println("*" + s + "*");
}
This code will produce the following output:
*one*
*two*
*three*
```

# 9.6 Wrapper Classes for the Numeric Data Types

**CONCEPT**: The Java API provides wrapper classes for each of the numeric data types. These classes have methods that perform useful operations involving primitive numerical values.

**Wrapper Class | Primitive Type It Applies To**

Byte                   byte

Double              double

Float                   float

Integer               int

Long                  long

Short                 short


##### The Static toStringMethods

```java
int i = 12;
double d = 14.95;
String str1 = Integer.toString(i);
String str2 = Double.toString(d);
```

##### The toBinaryString, toHexString, and toOctalString Methods

```java
int number = 14;
System.out.println(Integer.toBinaryString(number));
System.out.println(Integer.toHexString(number));
System.out.println(Integer.toOctalString(number));

1110
e
16
```

##### the MIN_VALUE and MAX_VALUE Constants

The numeric wrapper classes each have a set of static final variables named MIN_VALUE and MAX_VALUE. These variables hold the minimum and maximum values for a particular data type. For example, Integer.MAX_VALUE holds the maximum value that an int can hold. For example, the following code displays the minimum and maximum values for an int:

```java
System.out.println("The minimum value for an " +
                   "int is " + Integer.MIN_VALUE);
System.out.println("The maximum value for an " +
                   "int is " + Integer.MAX_VALUE);
```

##### Autoboxing and Unboxing

It is possible to create objects from the wrapper classes. One way is to pass an initial value to the constructor, as shown here:
```java
Integer number = new Integer(7);
```
This creates an Integer object initialized with the value 7, referenced by the variable number. Another way is to simply declare a wrapper class variable, and then assign a primitive value to it. For example, look at the following code:
```java
Integer number;
number = 7;
```
The first statement in this code declares an Integer variable named number. It does not create an Integer object, just a variable. The second statement is a simple assignment statement. It assigns the primitive value 7 to the variable. You might suspect that this will cause an error. After all, number is a reference variable, not a primitive variable. However, because number is a wrapper class variable, Java performs an autoboxing operation. Autoboxing is Java’s process of automatically “boxing up” a value inside an object. When this assignment statement executes, Java boxes up the value 7 inside an Integer object, and then assigns the address of that object to the number variable.

Unboxing is the opposite of boxing. It is the process of converting a wrapper class object to a primitive type. The following code demonstrates an unboxing operation:
```java
Integer myInt = 5;         // Autoboxes the value 5
int primitiveNumber;
primitiveNumber = myInt;   // Unboxes the object
```

The first statement in this code declares myInt as an Integer reference variable. The primitive value 5 is autoboxed, and the address of the resulting object is assigned to the myInt variable. The second statement declares primitiveNumber as an int variable. Then, the third statement assigns the myInt object to primitiveNumber. When this statement executes, Java automatically unboxes the myInt wrapper class object and stores the resulting value, which is 5, in primitiveNumber.

Although you rarely need to create an instance of a wrapper class, Java’s autoboxing and unboxing features make some operations more convenient. Occasionally, you will find yourself in a situation where you want to perform an operation using a primitive variable, but the operation can only be used with an object. For example, recall the ArrayList class that we discussed in Chapter 7. An ArrayList is an array-like object that can be used to store other objects. You cannot, however, store primitive values in an ArrayList. It is intended for objects only. If you try to compile the following statement, an error will occur:
```java
ArrayList<int> list = new ArrayList<int>();  // ERROR!
```

However, you can store wrapper class objects in an ArrayList. If we need to store int values in an ArrayList, we have to specify that the ArrayList will hold Integer objects. Here is an example:
```java
ArrayList<Integer> list = new ArrayList<Integer>(); // Okay.
```

This statement declares that list references an ArrayList that can hold Integer objects. One way to store an int value in the ArrayList is to instantiate an Integer object, initialize it with the desired int value, and then pass the Integer object to the ArrayList’s add method. Here is an example:
```java
ArrayList<Integer> list = new ArrayList<Integer>();
Integer myInt = 5;
list.add(myInt);
```

When the value 5 is passed to the add method, Java boxes the value up in an Integer object. When necessary, Java also unboxes values that are retrieved from the ArrayList. The following code demonstrates this:
```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(5);
int primitiveNumber = list.get(0);
```

The last statement in this code retrieves the item at index 0. Because the item is being assigned to an int variable, Java unboxes it and stores the primitive value in the int variable.

# 9.7 Focus on Problem Solving: The TestScoreReader Class

A professor keeps students' test scores in Excel. Each column holds a test score and each row represents the scores for one student.

In addition to manipulating the scores in Excel, Dr. Harrison wants to write a Java application that accesses them. Excel, like many commercial applications, has the ability to export data to a text file. When the data in a spreadsheet is exported, each row is written to a line, and the values in the cells are separated by commas. For example, when the data shown in Figure 9-7 is exported, it will be written to a text file in the following format:

```java
87,79,91,82,94
72,79,81,74,88
94,92,81,89,96
77,56,67,81,79
79,82,85,81,90
```

This is called the comma separated value file format. When you save a spreadsheet in this format, Excel saves it to a file with the .csv extension. Dr. Harrison decides to export her spreadsheet to a .csv file, and then write a Java program that reads the file. The program will use the String class’s split method to extract the test scores from each line, and a wrapper class to convert the tokens to numeric values. As an experiment, she writes the TestScoreReader class shown in Code Listing 9-9.

TestScoreReader.java
```java
 1  import java.io.*;
 2  import java.util.Scanner;
 3
 4  /**
 5     The TestScoreReader class reads test scores as
 6     tokens from a file and calculates the average
 7     of each line of scores.
 8  */
 9
10  public class TestScoreReader
11  {
12     private Scanner inputFile;
13     private String line;
14
15     /**
16        The constructor opens a file to read
17        the grades from.
18        @param filename The file to open.
19     */
20
21     public TestScoreReader(String filename)
22                            throws IOException
23     {
24        File file = new File(filename);
25        inputFile = new Scanner(file);
26     }
27
28     /**
29        The readNextLine method reads the next line
30        from the file.
31        @return true if the line was read, false
32        otherwise.
33     */
34
35     public boolean readNextLine() throws IOException
36     {
37        boolean lineRead; // Flag variable
38
39        // Determine whether there is more to read.
40        lineRead = inputFile.hasNext();
41
42        // If so, read the next line.
43        if (lineRead)
44          line = inputFile.nextLine();
45
46        return lineRead;
47     }
48
49     /**
50        The getAverage method calculates the average
51        of the last set of test scores read from the file.
52        @return The average.
53     */
54
55     public double getAverage()
56     {
57        int total = 0;  // Accumulator
58        double average; // The average test score
59
60        // Tokenize the last line read from the file.
61        String[] tokens = line.split(",");
62
63        // Calculate the total of the test scores.
64        for (String str : tokens)
65        {
66           total += Integer.parseInt(str);
67        }
68
69        // Calculate the average of the scores.
70        // Use a cast to avoid integer division.
71        average = (double) total / tokens.length;
72
73        // Return the average.
74        return average;
75     }
76
77     /**
78        The close method closes the file.
79     */
80
81     public void close() throws IOException
82     {
83        inputFile.close();
84     }
85  }
```

The constructor accepts the name of a file as an argument and opens the file. The readNextLine method reads a line from the file and stores it in the line field. The method returns true if a line was successfully read from the file, or false if there are no more lines to read. The getAverage method tokenizes the last line read from the file, converts the tokens to int values, and calculates the average of the values. The average is returned. The program in Code Listing 9-10 uses the TestScoreReader class to open the file Grades.csv and get the averages of the test scores it contains.

TestAverages.java
```java
 1  import java.io.*; // Needed for IOException
 2
 3  /**
 4     This program uses the TestScoreReader class
 5     to read test scores from a file and get
 6     their averages.
 7  */
 8
 9  public class TestAverages
10  {
11     public static void main(String[] args)
12                         throws IOException
13     {
14        double average;         // Test average
15        int studentNumber = 1;  // Control variable
16
17        // Create a TestScoreReader object.
18        TestScoreReader scoreReader =
19                     new TestScoreReader("Grades.csv");
20
21        // Display the averages.
22        while (scoreReader.readNextLine())
23        {
24           // Get the average from the TestScoreReader.
25           average = scoreReader.getAverage();
26
27           // Display the student’s average.
28           System.out.println("Average for student " +
29                              studentNumber + " is " +
30                              average);
31
32          // Increment the student number.
33          studentNumber++;
34        }
35
36        // Close the TestScoreReader.
37        scoreReader.close();
38        System.out.println("No more scores.");
39    }
40  }

Average for student 1 is 86.6
Average for student 2 is 78.8
Average for student 3 is 90.4
Average for student 4 is 72.0
Average for student 5 is 83.4
No more scores.
```

# 9.8 Common Errors to Avoid
- The following list describes several errors that are commonly committed when learning this chapter’s topics:
- Using static wrapper class methods as if they were instance methods. Many of the most useful wrapper class methods are static, and you should call them directly from the class.
- Trying to use String comparison methods such as startsWith and endsWith for case-insensitive comparisons. Most of the String comparison methods are case-sensitive. Only the regionMatches method performs a case-insensitive comparison.
- Thinking of the first position of a string as 1. Many of the String and StringBuilder methods accept a character position within a string as an argument. Remember, the position numbers in a string start at zero. If you think of the first position in a string as 1, you will cause an off-by-one error.
- Thinking of the ending position of a substring as part of the substring. Methods such as getChars accept the starting and ending position of a substring as arguments. The character at the start position is included in the substring, but the character at the end position is not included. (The last character in the substring ends at end – 1.)
- Forgetting to trim a string before tokenizing it. When tokenizing a string, and using characters other than whitespaces as delimiters, you will probably want to trim the string before tokenizing it. Otherwise, if the string contains leading and/or trailing whitespace characters, they will become part of the first and last tokens.


# Challenge Problems

1, 2, 4, 14

## Backward String
Write a method that accepts a String object as an argument and displays its contents backward. For instance, if the string argument is “gravity” the method should display -“ytivarg”. Demonstrate the method in a program that asks the user to input a string and then passes it to the method.

## Word Counter
Write a method that accepts a String object as an argument and returns the number of words it contains. For instance, if the argument is “Four score and seven years ago” the method should return the number 6. Demonstrate the method in a program that asks the user to input a string and then passes it to the method. The number of words in the string should be displayed on the screen.

## Vowels and Consonants
Write a class with a constructor that accepts a String object as its argument. The class should have a method that returns the number of vowels in the string, and another method that returns the number of consonants in the string. Demonstrate the class in a program that performs the following steps:
	1. The user is asked to enter a string.
	2. The program displays the following menu:
		Count the number of vowels in the string
		Count the number of consonants in the string
		Count both the vowels and consonants in the string
		Enter another string
		Exit the program
	3. The program performs the operation selected by the user and repeats until the user selects e, to exit the program.

## Word Separator
Write a program that accepts as input a sentence in which all of the words are run together, but the first character of each word is uppercase. Convert the sentence to a string in which the words are separated by spaces and only the first word starts with an uppercase letter. For example, the string “StopAndSmellTheRoses.” would be converted to “Stop and smell the roses.”