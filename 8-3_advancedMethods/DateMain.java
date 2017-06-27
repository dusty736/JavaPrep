// This client program uses the Date class.

public class DateMain {
   public static void main(String[] args) {
      Date d1 = new Date(2008, 7, 11);
      Date d2 = new Date(2008, 7, 28);
      Date d3 = new Date(d1);
      
      System.out.println(d1.getDaysInMonth());
      System.out.println(d1.isLeapYear());
      System.out.println(d1.getDaysInYear());
      System.out.println(d1.year + "/" + d1.month + "/" + d1.day);
      d1.nextDay();
      System.out.println(d1.year + "/" + d1.month + "/" + d1.day);
      System.out.println();
      
      System.out.println(d2.getDaysInMonth());
      System.out.println(d2.isLeapYear());
      System.out.println(d2.getDaysInYear());
      System.out.println(d2.year + "/" + d2.month + "/" + d2.day);
      d2.nextDay();
      System.out.println(d2.year + "/" + d2.month + "/" + d2.day);
      
      // using days between
      System.out.println(d1.daysBetween(d2));
      System.out.println(d2.daysBetween(d1));

   }
}