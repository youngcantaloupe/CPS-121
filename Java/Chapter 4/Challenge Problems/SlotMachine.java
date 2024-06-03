import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
   public static void main(String[] args) {
      
      Random random = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      int slotOne;
      String slotOneStr = "null";
      int slotTwo;
      String slotTwoStr = "null";
      int slotThree;
      String slotThreeStr = "null";
      
      int userMoney;
      
      System.out.print("Enter $ to bet: ");
         userMoney = keyboard.nextInt();
      
      slotOne = random.nextInt(6) + 1;
      slotTwo = random.nextInt(6) + 1;
      slotThree = random.nextInt(6) + 1;
      
      switch (slotOne) {
         case 1:
            slotOneStr = "Cherries";
            break;
         case 2:
            slotOneStr = "Oranges";
            break;
         case 3:
            slotOneStr = "Plums";
            break;
         case 4:
            slotOneStr = "Bells";
            break;
         case 5:
            slotOneStr = "Melons";
            break;
         case 6:
            slotOneStr = "Bars";
            break;
         default:
            System.out.println("Something's wrong.");
            break;
      }
            switch (slotTwo) {
         case 1:
            slotTwoStr = "Cherries";
            break;
         case 2:
            slotTwoStr = "Oranges";
            break;
         case 3:
            slotTwoStr = "Plums";
            break;
         case 4:
            slotTwoStr = "Bells";
            break;
         case 5:
            slotTwoStr = "Melons";
            break;
         case 6:
            slotTwoStr = "Bars";
            break;
         default:
            System.out.println("Something's wrong.");
            break;
      }
            switch (slotThree) {
         case 1:
            slotThreeStr = "Cherries";
            break;
         case 2:
            slotThreeStr = "Oranges";
            break;
         case 3:
            slotThreeStr = "Plums";
            break;
         case 4:
            slotThreeStr = "Bells";
            break;
         case 5:
            slotThreeStr = "Melons";
            break;
         case 6:
            slotThreeStr = "Bars";
            break;
         default:
            System.out.println("Something's wrong.");
            break;
      }
      System.out.println("| " + slotOneStr + " | " + slotTwoStr + " | " + slotThreeStr + " |");
      
      if (slotOneStr.equals(slotTwoStr)) {
         System.out.println("2/3 1,2");
         userMoney = userMoney * 2;
         System.out.println("Total: " + userMoney);
      }
      if (slotOneStr.equals(slotThreeStr)) {
         System.out.println("2/3 1,3");
         userMoney = userMoney * 2;
         System.out.println("Total: " + userMoney);
      }
      if (slotTwoStr.equals(slotThreeStr)) {
         System.out.println("2/3 2,3");
         userMoney = userMoney * 2;
         System.out.println("Total: " + userMoney);
      }
      if (slotOneStr.equals(slotTwoStr)) {
         if (slotOneStr.equals(slotThreeStr)) {
            System.out.println("3/3");
            userMoney = userMoney * 3;
            System.out.println("Total: " + userMoney);
         }      
      }
      
   }
}