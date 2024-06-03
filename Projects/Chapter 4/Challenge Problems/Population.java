/* 
   write a program that will predict the size of a population of organisms. the program should
   ask for the starting number of organisms, thier average daily population increase (as a %)
   and the number of days they will multiply. the program should use a loop to display the size 
   of the population for each day.
   
   INPUT VALIDATION: do not accept <2 for population.
                     do not accept negative population % increase.
                     do not accept <1 for days. 
*/
import java.util.Scanner;

public class Population {
   
   public static void main(String[] args) {
      
      double growthPercentage,
             growthRate,
             population,
             populationIncrease;
      int days;
      
      Scanner keyboard = new Scanner(System.in);
      
      do {
         System.out.print("Enter starting number of people: ");
            population = keyboard.nextInt();
      } while(population < 2);

      do {
         System.out.print("Enter daily population increase as a percentage: ");
            growthPercentage= keyboard.nextDouble();
      } while (growthPercentage < 0 || growthPercentage > 100);   
      
      do {
         System.out.print("Enter number of days: ");
            days = keyboard.nextInt();
      } while (days < 1);   

         growthRate = growthPercentage / 100;
         populationIncrease = population * growthRate;          

      for (double count = 1; count <= days; count++) {
         
         System.out.printf("Day %.0f the population is: %.0f\n", count, population);
         
         population += populationIncrease;
         
      }
   }
}