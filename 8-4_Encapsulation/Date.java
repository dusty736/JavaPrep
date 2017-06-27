public class Date {
   // fields
   private int year;
   private int month;
   private int day;
   
   // constructors - initialize the state of created objects
   
   public Date(int year, int month, int day) {
      setYear(year);
      setMonth(month);
      setDay(day);
   }
   
   public Date(Date other) {
      this(other.year, other.month, other.day);
   }
   
   public int getYear() {
      return year;
   }
   
   public int getMonth() {
      return month;
   }
   
   public int getDay() {
      return day;
   }
   
   // methods
   // Mutator Methods - changes the state of the object
   
   public void setDay(int day) {
      if (day < 1 || day > getDaysInMonth()) {
         throw new IllegalArgumentException("Illegal day: " + day);
      }   
      this.day = day;
   }
   
   public void setMonth(int month) {
      if (month < 1 || month > 12) {
         throw new IllegalArgumentException("Illegal month: " + month);
      }
      this.month = month;
   }
   
   public void setYear(int year) {
      if (year < 0) {
         throw new IllegalArgumentException("Illegal year: " + year);
      }
      this.year = year;
   }
   
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