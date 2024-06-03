/*
   Occupancy rate = number of rooms occupied / total number of rooms
   write a program that calculates the occupancy rate for each floor of a hotel. the program should start
   by asking for the number of floors in the hotel. a loop should then iterate once for each floor.
   during each iteration, the loop should then display the number of rooms the hotel has, the number of them that a
   are occupied, the number that is vacant, and the occupany rate for the hotel.
   
   INPUT VALIDATION: do not accept values less than one for number of floors
                     do not accept values less than 10 for the number of rooms on a floor
*/
import java.util.Scanner;
public class HotelOccupancy {
   public static void main(String[] args) {
   
      Scanner keyboard = new Scanner(System.in);
     
      int floors,
          rooms,
          occupied,
          vacant;
      double occupancyRate;
      
      System.out.print("Enter number of floors: ");
         floors = keyboard.nextInt();
         while (floors < 1) {
            System.out.print("\nInvalid number of floors, must be at least one floor." +
                             "\nEnter number of floors: ");
            floors = keyboard.nextInt();
         }
      //include rooms in loop, to add variance on floors. 
      System.out.print("Enter number of rooms per floor: ");
         rooms = keyboard.nextInt();
                  
         while (rooms < 10) {
            System.out.print("\nInvalid number of rooms, must have at least 10 rooms." +
                             "\nEnter number of rooms: ");
            rooms = keyboard.nextInt();
         }
      
      int count = 1;
      
      while (count < floors) {
         System.out.print("How many rooms are occupied for floor " + count + ": ");
         occupied = keyboard.nextInt();
         ++count;
      }
      vacant = rooms - occupied;
      occupancyRate = 
      
   }
}