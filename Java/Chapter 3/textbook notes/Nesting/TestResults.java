import javax.swing.JOptionPane;

/*
   this program asks the user to enter a numeric test score and displays 
   a letter grade for the score. the program uses an if-else-if statement
   to determine the letter grade.
*/
public class TestResults
{
   public static void main(String[] args)
   {
   
   int testScore;    //numeric test score
   String input;     //to hold user's input
   
   //get the numeric test score
   input = JOptionPane.showInputDialog("Enter your numeric test score " +
                                       "and I will tell you the grade: ");
   testScore = Integer.parseInt(input);
   
   //display the grade
   if (testScore < 60)
      JOptionPane.showMessageDialog(null, "Your grade is F.");
   else if (testScore < 70)
      JOptionPane.showMessageDialog(null, "Your grade is D.");
    else if (testScore < 80)
      JOptionPane.showMessageDialog(null, "Your grade is C.");
    else if (testScore < 90)
      JOptionPane.showMessageDialog(null, "Your grade is B.");
    else if (testScore < 100)
      JOptionPane.showMessageDialog(null, "Your grade is A.");
    //trailing else used to catch errors
    else
      JOptionPane.showMessageDialog(null, "Invalid score.");
      
   System.exit(0);
   
   }
}