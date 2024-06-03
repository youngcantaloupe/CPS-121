
public class ShowChar {

   public static void main(String[] args) {
   
   String testString = "New York";
   
   showChar(testString, 4);
   }
   public static void showChar(String str, int pos) {
   
      System.out.println(str.charAt(pos));
   }
}