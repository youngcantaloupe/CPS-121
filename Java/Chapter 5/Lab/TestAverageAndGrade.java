import java.util.Scanner;
public class TestAverageAndGrade {

   public static void main(String[] args) {

      double average;   //to store average score
  
      average = calcAverage();   //calls method to get scores and calculate average
      determineGrade(average);   //calls method to determine grade
   }
   
   //calculates average of 5 test scores entered by user
   //references method isValid which validates user input with boolean value
   public static double calcAverage() {
      Scanner keyboard = new Scanner(System.in);

      final int numScores = 5;   //set number of test scores to enter
      double input,              //holds user input in each iteration of loop
             scores = 0,         //sentinel value stores total scores
             average;            //stores average
      
      //loop runs 5 times and calculates average of test scores entered
      for (int i = 1; i <= numScores; i++) {
         System.out.print("Enter test score " + i + ": ");
             input = keyboard.nextDouble();
             
         //loop runs if user input is below 0 or above 100, skipped if valid
         while (!isValid(input)) {
             System.out.print("Invalid input. Enter test score " + i + ": ");
               input = keyboard.nextDouble();
         } 
         scores += input;
      }
      average = scores / numScores;

      return average;
   }
   //determines validity of user input
   public static boolean isValid(double input) {
      
      boolean valid = true;   //user input is default valid, only false if < 0 or > 100
      
      if (input < 0 || input > 100)
         valid = false;
         
      return valid;
   }
   //determines grade, 
   public static String determineGrade(double average) {
   
      String letterGrade = "Your letter grade is: ";  //using string as sort of a sentinel value, 
                                                      //adds letter grade if average meets else-if requirements.
      if (average < 60) 
         letterGrade += "F";
      else if (average < 70)
         letterGrade += "D";
      else if (average < 80)
         letterGrade += "C";
      else if (average < 90)
         letterGrade += "B";
      else if (average <= 100)
         letterGrade += "A";
      
      System.out.println("Your average test score is " + average + "%." + 
                          "\n" + letterGrade + ".");
      
      return letterGrade;   
   }
}