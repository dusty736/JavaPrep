// This client program uses the Date class.

public class DateMain {
   public static void main(String[] args) {
      Date d1 = new Date(2008, 7, 11);
      Date d2 = new Date(2008, 7, 28);
      Date d3 = new Date(d1);
      Date d4 = new Date(1, 11, 2);
      //d4.setMonth(14);
      
      System.out.println(d1.getDaysInMonth());
      System.out.println(d1.isLeapYear());
      System.out.println(d1.getDaysInYear());
      System.out.println(d1.getYear() + "/" + d1.getMonth() + "/" + d1.getDay());
      d1.nextDay();
      System.out.println(d1.getYear() + "/" + d1.getMonth() + "/" + d1.getDay());
      System.out.println();
      
      System.out.println(d2.getDaysInMonth());
      System.out.println(d2.isLeapYear());
      System.out.println(d2.getDaysInYear());
      System.out.println(d2.getYear() + "/" + d2.getMonth() + "/" + d2.getDay());
      d2.nextDay();
      System.out.println(d2.getYear() + "/" + d2.getMonth() + "/" + d2.getDay());
   }
}