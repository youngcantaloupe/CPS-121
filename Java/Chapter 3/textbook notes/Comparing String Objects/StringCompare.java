//this program correctly comares two string objects using the equals method
public class StringCompare
{
   public static void main(String[] args)
   {
   
   String name1 = "Mark",
          name2 = "Mark",
          name3 = "Mary";
          
          //compare "Mark" and "Mark"
          if (name1.equals(name2))
          {
            System.out.println(name1 + " and " + name2 +
                              " are the same.");
          }
          else
          {
            System.out.println(name1 + " and " + name2 +
                              " are NOT the same.");
          }
          
          //compare "Mark" and "Mary"
          if (name1.equals(name3))
          {
            System.out.println(name1 + " and " + name3 +
                              " are the same.");
          }
          else
          {
            System.out.println(name1 + " and " + name3 + 
                              " are NOT the same.");
          }
   
   }
}