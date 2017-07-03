public class RecursiveFunction {
   public static void main(String[] args) {
      System.out.println(parenthesize("Joe Bloe", 2));
      System.out.println(parenthesize("hello", 5));
      System.out.println(parenthesize("fun", 0));
      System.out.println(parenthesize("weird science", 1));
      System.out.println(parenthesize("stuff", -3));
   }
   
   public static String parenthesize(String text, int n) {
      if (n < 0) {
         throw new IllegalArgumentException();
      } else if (n == 0) {
         return text;
      } else {
         return "(" + parenthesize(text, n - 1) + ")";
      }
   }
}