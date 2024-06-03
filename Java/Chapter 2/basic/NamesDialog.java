import javax.swing.JOptionPane;

/* 
   This program demonstrates using dialogs with JoptionPane.
*/

public class NamesDialog
{
   public static void main(String[] args)
   {
      String firstName, lastName;
      
      //get users first name.
      firstName =
         JOptionPane.showInputDialog("What is your first name?");
         
      //get users last name.
      lastName =
         JOptionPane.showInputDialog("What is your last name?");
         
      //display greeting.
      JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
      
         System.exit(0);
         }
      }
      