import java.util.*;

public class DeansList {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      System.out.print("What is your GPA? ");
      double gpa = console.nextDouble();
      
      if (gpa >= 3.5) {
         System.out.println("Congrats, you made the honor roll.");
      }
      if (gpa >= 3.8) {
         System.out.println("Congrats, you made the Dean's list.");
      }
   }
}