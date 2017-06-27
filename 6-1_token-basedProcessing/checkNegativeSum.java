// This program takes a Scanner as a prameter containing
// a series of integers and that determines wheter or not
// the sum starting from the first number is ever negative.

import java.util.*;
import java.io.*;

public class checkNegativeSum {
   public static void main(String[] args) 
          throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      Scanner input = getInput(console);
      checkNegativeSum(input);
   }
   
   // This method does a cumulative sum of integers in a text file,
   // and stops if the cumulative sum becomes negative.
   // Can also use boolean flags to disclose if a negative was found.
   public static void checkNegativeSum(Scanner input) {
      int sum = input.nextInt();
      int stepNumber = 1;
      
      while (input.hasNextInt() && sum >= 0) {
         sum += input.nextInt();
         stepNumber++;
      }
      negativeTest(sum, stepNumber);
   }
   
   // This method produces a text display of the cumulative sum based
   // on if the sum ever went negative.
   public static void negativeTest(int sum, int stepNumber) {
      if (sum >= 0) {
         System.out.println("No negative sum");
      } else {
         System.out.printf("Negative sum after %d steps\nsum = %d", stepNumber, sum);
      }
   }

   // This method reads in a scanner input, and makes it so
   // if the file is not found, the user can try again.  Robust.
   public static Scanner getInput(Scanner console) 
          throws FileNotFoundException {
      System.out.print("Input file name? ");
      File f = new File(console.nextLine());
      while (!f.canRead()) {
         System.out.println("File not found.  Try again.");
         System.out.print("Input file name? ");
         f = new File(console.nextLine());
      }
      return new Scanner(f);
   }
}