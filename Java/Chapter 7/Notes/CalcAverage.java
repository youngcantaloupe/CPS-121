	import java.util.Scanner;
   public class CalcAverage {
		public static void main(String[] args) {
		
			int numScores;
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("How many test scores do you have? ");
				numScores = keyboard.nextInt();
				
			double[] scores = new double[numScores];
			
			for (int index = 0; index < numScores; index++) {
				System.out.print("Enter score #" + (index + 1) + ": ");
				scores[index] = keyboard.nextDouble();
			} 
			Grader myGrader = new Grader(scores);
			
			System.out.println("Your adjusted average is " + myGrader.getAverage());
			
			System.out.println("Your lowest score is " + myGrader.getLowestScore());
		}
	}