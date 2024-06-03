public class PassString {

   public static void main(String[] args) {
   
      String name = "Shakespeare";
      
      System.out.println("In main, the name is " + name);
      
      changeName(name);
      
      System.out.println("Back in main, the name is " + name);
   }
   public static void changeName(String str) {
   
      str = "Dickens";
      
      System.out.println("In changeName, the name is now " + str);
   }
}