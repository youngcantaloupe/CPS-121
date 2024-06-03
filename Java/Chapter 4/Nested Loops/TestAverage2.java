import java.util.Scanner;

//this program demonstrates a nested loop

public class TestAverage2
{
   public static void main(String[] args)
   {
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
      for (int student = 1; student <= numStudents; student++)
      {
            total = 0; // set accumulator to 0
         
         //get test scores for a student.
         System.out.println("Student number " + student);
         System.out.println("-----------------");
         for (int test = 1; test <= numTests; test++)
         {
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