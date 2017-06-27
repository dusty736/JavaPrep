// This program finds the minimum number typed
// until the user types 0.

import java.util.*;

public class SentinelValues {
   public static void main(String[] args) {
      Intro();
      minInt();      
   }
   
   // Gives an intro to the program
   public static void Intro() {
      System.out.println("Welcom to sentinel loops!");
      System.out.println("Type desired values, and");
      System.out.println("we'll find the minimum.");
      System.out.println("Type 0 to exit program.");
   }
   
   // Allows for user input while keeping 
   public static void minInt () {
      Scanner console = new Scanner(System.in);
            
      // read initial numer (place a "post")
      System.out.print("Enter a numer (0 to quit) : ");
      int input = console.nextInt();
      int min = input;
      
      while (input != 0) {
         //System.out.println(input);
         if (input < min) {
            min = input; 
         }
         // Have input last to avoid 0 becoming minimum upon exit.
         // Solution to fence post problem.
         System.out.print("Enter a numer (0 to quit) : ");
         input = console.nextInt();
      }
      System.out.printf("The minimum is %d\n", min);
   }        
}