public class Date {
   // fields
   int year;
   int month;
   int day;
   
   // constructors - initialize the state of created objects
   
   public Date(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }
   
   public Date(Date other) {
      this(other.year, other.month, other.day);
   }
   
   // methods
   // Mutator Methods - changes the state of the object
   
   public void nextDay() {
      day++;
      if (day > getDaysInMonth()) {
         month++;
         day = 1;
         if (month == 13) {
            month = 1;
            year++;
         }
      }
   }
   
   public int daysBetween(Date other) {
      int count = 0;
      if (before(other)) {
         Date temp = new Date(this);
         while (temp.year != other.year || temp.month != other.month
                || temp.day != other.day) {
            temp.nextDay();
            count++;
         }
      } else {
         Date temp = new Date(other);
         while (temp.year != year || temp.month != month
                || temp.day != day) {
            temp.nextDay();
            count++;
         }
      }
      return count;
   }
   
   public boolean before(Date other) {
      return year < other.year ||
               (year == other.year && (month < other.month ||
                month == other.month && day < other.day));
   }
   
   // Accessor Methods - return information about the state of object
   
   public int getDaysInMonth() {
      // runs "in the context" of an object
      // 31, 30, 28/29
      if (month == 9 || month == 4 || month == 6 || month == 11) {
         return 30;
      } else if (month == 2) {
         if (isLeapYear()) {
            return 29;
         } else {
            return 28;
         }
      } else {
         return 31;
      }
   }
   
   public boolean isLeapYear() {
      return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
   }
   
   public int getDaysInYear() {
      if (isLeapYear()) {
         return 366;
      } else {
         return 365;
      }
   }
}