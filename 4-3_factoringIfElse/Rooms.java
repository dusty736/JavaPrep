import java.util.*;

public class Rooms {
   public static void main(String[] args) {
      System.out.println("This program computes the total charge for a hotel stay.");
      Scanner console = new Scanner(System.in);
      double charge = getRoomTotal(console);
      System.out.println("Total charge will be $" + charge);
   }
   
   public static double getRoomTotal(Scanner console) {
      System.out.print("number of rooms? ");
      int rooms = console.nextInt();
      System.out.print("number of nights? ");
      int nights = console.nextInt();
      System.out.print("guests per room? ");
      int guests = console.nextInt();
      System.out.print("Rate type (AAA, senior, regular)? ");
      String type = console.next();
      double rate;
      if (type.equals("AAA")) {
         rate = 89.75;
      } else if (type.equals("senior")) {
         rate = 94.75;
      } else {
         rate = 99.75;
      }
      if (guests > 2) {
         rate += (guests - 2) * 10;
      }
      double total = rooms * nights * rate;
      return total;
   }
}
      