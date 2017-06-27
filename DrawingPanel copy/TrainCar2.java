import java.awt.*; // For Graphics

public class TrainCar2 {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(350,150);
      Graphics g = panel.getGraphics();
      //drawTrainCar(g, 40, 10, 100, 50, Color.BLACK);
      //drawTrainCar(g, 110, 20, 30, 20, Color.CYAN);
      //drawTrainWheels(5, g, 40, 50, 20, 20, Color.RED);
      drawTrainCar1(g, 40, 10, 100);
      drawTrainCar1(g, 150, 50, 20);
      drawTrainCar1(g, 80, 100, 200);

   }
   
   public static void drawTrainCar(Graphics g, int x, int y, int width, int height, Color color) {
      g.setColor(color);
      g.fillRect(x, y, width, height);
   }
   
   public static void drawTrainWheels(int numWheels, Graphics g, int x, int y, int width, int height, Color color) {
      g.setColor(color);
      for (int i = 0; i <= numWheels - 1; i++) {
         g.fillOval(x + (width * i), y, width, height);
      }
   }
   
   public static void drawTrainCar1(Graphics g, int x, int y, int size) {
      g.setColor(Color.BLACK);
      g.fillRect(x, y, size, size / 2);
      
      g.setColor(Color.CYAN);
      g.fillRect(x + (7 * size / 10), y + (size / 10), (3 * size / 10), (2 * size / 10));
      
      g.setColor(Color.RED);
      for (int i = 0; i < 5; i++) {
         g.fillOval((2 * size / 10) * i + x, y + (4 * size / 10), size / 5, size / 5);
      }
   }
}