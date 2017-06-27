// This program uses the random class to simulate the 
// rolling of a dice, until 3 odd numbers have been
// rolled in a row.

import java.util.*;

public class RandomDice {
   public static void main(String[] args) {
   manyRolls();
   }
   
   // This method simulates a number of dice rolls until 3 odd are rolled 
   // in a row.
   public static void manyRolls() {
      int oddCount = 0;
      int rollCount = 0;
      int roll;
      System.out.println("Let's roll some dice!");
      while (oddCount != 3) {
         roll = randomRoll();
         rollCount++;
         if (oddRollTest(roll).equals("True")) {
            oddCount++;
         } else {
            oddCount = 0;
         }
      }
      System.out.printf("Three in a row after %d rolls.\n", rollCount);
   }
         
   // This method simulates a single dice roll.
   public static int randomRoll() {
      Random rand = new Random();
      int newRoll = rand.nextInt(6) + 1;
      System.out.printf("You rolled a %d\n", newRoll);
      return newRoll;
   }
   
   // This method tests a roll to see if odd or even.
   public static String oddRollTest(int roll) {
      if (roll % 2 == 1) {
         return "True";
      } else {
         return "False";
      }
   }
}  