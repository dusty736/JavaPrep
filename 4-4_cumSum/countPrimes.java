import java.util.*;

public class CountPrimes {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Maximum number? ");
      int max = console.nextInt();
      int count = countFactors(max);
      countPrimes(max);
   }
   
   public static int countFactors(int number) {
      int factCount = 0;
      for (int i = 1; i <= number; i++) {
         if (number % i == 0) {
            factCount += 1;
         }
      }
      return factCount;
   }
   
   public static void countPrimes(int number) {
      int primeCount = 0;
      for (int i = 2; i < number; i++) {
         //System.out.print(" number: " + i + ", factors: " + countFactors(i) + " | ");
         if (countFactors(i) == 2) {
            primeCount++;
            System.out.print(i + " ");
         }
      }
      System.out.println();
      System.out.println("prime count: " + primeCount);
      double primePercent = primeCount * 100.0 / number;
      //System.out.println(primeCount + " primes (" + primePercent + "%)");
      System.out.printf("%d primes (%f%%)", primeCount, primePercent);
   }
}