public class VariableExample {
   public static void main(String[] args) {
      int x = 2 + 2; // x = 4
      int y = 2 * x; // y = 8
      int z = y - x - 1; // z = 3
      y--; // y = 7
      x++; // x = 5
      System.out.println("x = " + x); // x = 5
      System.out.println("y = " + y); // y = 7
      System.out.println("z = " + z); // z = 3
      x *= y; // x = 35
      x *= z; // x = 105
      y = x / y / z; // y = 5
      z = x / y / z; // z = 7
      x = x / y / z; // x = 3
      System.out.println("x = " + x); // x = 3
      System.out.println("y = " + y); // y = 5
      System.out.println("z = " + z); // z = 7
   }
}