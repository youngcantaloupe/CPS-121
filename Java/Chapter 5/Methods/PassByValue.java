public class PassByValue {

   public static void main(String[] args) {
   
      int number = 99;
      
      System.out.println("Number is " + number);
      
      changeMe(number);
      
      System.out.println("Number is " + number);
   }
   
   public static void changeMe(int myValue) {
   
      System.out.println("I am changing the value.");
      
      myValue = 0;
      System.out.println("Now the value is " + myValue);
   }
}