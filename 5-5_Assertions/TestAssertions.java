// This is an assert mystery program

public class TestAssertions {
   public static void main(String[] args) {
      for (int i = 1; i <= 100; i++) {
         int result = mystery(i);
         System.out.println("mystery(" + i ") returns " + result);
      }
   }
   
   // Finds the amount of factors that go into n
   // Stop to diagnose what code does for simple solutions
   public static int mystery(int n) {
      int x = 0;
      // point A
      while (n % 2 == 0) {
         // point B
         n = n / 2;
         // point C
         x++;
         // Point D
      }
      // Point E
      return x;
   }
} 

/* 

n = 16
        |  x == 0  |  n % 2 == 0 
Point A |   always |    sometimes
Point B | sometimes|    always
Point C | sometimes|    sometimes
Point D |   never  |    sometimes
Point E | sometimes|    never

n = 6
        |  x == 0  |  n % 2 == 0 
Point A |          |    
Point B |          |
Point C |          |
Point D |          |
Point E |          |


*/