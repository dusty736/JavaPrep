import java.awt.*; // For Graphics

public class TrainCar {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(200,100);
      Graphics g = panel.getGraphics();
      
      // Train Body
      g.setColor(Color.BLACK);
      g.fillRect(40, 10, 100, 50);
      
      // Windshield
      g.setColor(Color.CYAN);
      g.fillRect(110, 20, 30, 20);
      
      // Wheels
      g.setColor(Color.RED);
      for (int i = 40; i <= 120; i += 20) {
         g.fillOval(i, 50, 20, 20);
      }
   }
}