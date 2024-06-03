import java.util.Scanner;

public class TestScoresDemo {
   public static void main(String[] args) {
      
      double scores;
               
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter three test scores to be averaged.\n");
      System.out.print("Test score 1: ");
         scores = keyboard.nextDouble();
         
      TestScores student = new TestScores(scores);
      
      System.out.print("Test score 2: ");
         scores = keyboard.nextDouble();
         student.setTest2(scores);
      System.out.print("Test score 3: ");
         scores = keyboard.nextDouble();
         student.setTest3(scores);
      System.out.println();
      
      System.out.printf("Average: %.2f%%", student.getAverage());

   }
}