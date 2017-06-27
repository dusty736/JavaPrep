import java.util.*;

public class Bonus {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("How much money did you earn? ");
      int money = console.nextInt();
      int BONUS_OR_TAX = 10;
      
      if (money > BONUS_OR_TAX) {
         money -= BONUS_OR_TAX;
         System.out.println("You were taxed $" + BONUS_OR_TAX);
      } else if (money < BONUS_OR_TAX) {
         money += BONUS_OR_TAX;
         System.out.println("You got a bonus of $" + BONUS_OR_TAX);
      }
      
      System.out.println("Final money: $" + money);
   }
}