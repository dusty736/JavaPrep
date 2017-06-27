// A class to respresent layers.

public class Lawyer extends Employee {
   public Lawyer(int years) {
      super(years);
   }

   public int getVacationDays() {
      //return 2 * super.getVacationDays();
      return 10 * getYears();
   }
   
   public double getSalary() {
      return super.getSalary() + 5000;
   }
   
   public void sue() {
      System.out.println("I'll see you in court!");
   }
}