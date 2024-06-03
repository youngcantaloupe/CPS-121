/*
write a program that calculates and displays a person's body mass index. 
BMI = Weight * 703/Height^2
the program should display a message indicating whether the person has optimal weight, is underweight, or overweight. 
18.5 < = underweight
25 > = overweight
*/

import java.util.Scanner;

public class BodyMassIndex
{
   public static void main(String[] args)
   {
      double weight;
      double height;
      double bmi;
      
      Scanner keyboard = new Scanner(System.in);
      
      //get person's weight and height
         System.out.print("What is your weight in lbs? ");
            weight = keyboard.nextDouble();
         System.out.print("What is your height in inches? ");
            height = keyboard.nextDouble();
            
      //calculate BMI
      bmi = weight * 703/(height * height);
      
      System.out.printf("Your BMI is: %.2f. ",bmi);
      
      if (bmi < 25 && bmi > 18.5)
         System.out.print("You are at optimal weight.");
         
      else if (bmi > 25)
         System.out.print("You are overweight.");
         
      else if (bmi < 18.5)
         System.out.print("You are underweight.");
         
         
      
   }
}