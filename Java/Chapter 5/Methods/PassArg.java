public class PassArg {

   public static void main(String[] args) {
   
      int x = 10;
      
      System.out.println("I am passing values to displayValue.");
      
      displayValue(5);
      displayValue(x);
      displayValue(x * 4);
      displayValue(Integer.parseInt("700"));
      System.out.println("That's all!");
   }
   
   public static void displayValue(int num) {
   
      System.out.println("The value is " + num);
   }
}