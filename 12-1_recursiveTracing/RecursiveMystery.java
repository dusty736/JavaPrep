public class RecursiveMystery {
   public static void main(String[] args) {
      test(7);
      test(38);
      test(749);
      test(-6842);
      test(954023);
   }
   
   public static void test(int n) {
      System.out.print("mystery(" + n + ") = ");
      mystery(n);
      System.out.println();
   }
   
   public static void mystery(int n) {
      if (n < 0) {
         mystery(-n);
      } else if (n < 10) {
         System.out.print(n);
      } else {
         mystery(n/10);
         int digit = n % 10;
         System.out.print(", " + digit % 3);
      }
   }
   
   /*
   m(-6842):
      m(6842):
         m(684):
            m(68):
               m(6):
                  print 6
               print , 2 (8 mod 3)
            print , 1 (4 mod 3)
         print , 2 (2 mod 3)
   */
}