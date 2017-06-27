// A Point object represents a pair of (x, y) coordinates.
// Fourth Version: Encapsulated

public class Point {
   private int x;
   private int y;
   
   // Constructs a new point at the origin, (0, 0)
   public Point() {
      this(0, 0); // calls Point(int, int) constructor
   }
   
   // Constructs a new point with the given (x, y) location
   public Point(int x, int y) { 
      setLocation(x, y);
   }
   
   // returns the distance between this Point and (0, 0)
   public double distanceFromOrigin() {
      return Math.sqrt(x * x + y * y);
   }
   
   // returns teh x-coordinate of this point
   public int getX() {
      return x;
   }
   
   // returns the y-coordinate of this point
   public int getY() {
      return y;
   }
   
   // sets this point's (x, y) location to the given values
   public void setLocation(int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   // returns a String representation of this point
   public String toString() {
      return "(" + x + ", " + y + ")";
   }
   
   // Shifts this point's location by the given amount
   public void translate(int dx, int dy) {
      setLocation(x + dx, y + dy);
   }
}
   