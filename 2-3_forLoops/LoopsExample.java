public class LoopsExample {
   public static void main(String[] args) {
      for (int i = 1; i<=6; i++) {
         System.out.println(i + " squared is " + (i * i));
      }
      for (int line = 5; line >= 1; line--) {
         for (int j = 1; j <= (line - 1); j++) {
            System.out.print(" ");
         }
         for (int k = 1; k <= (11 - 2 * line); k++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}