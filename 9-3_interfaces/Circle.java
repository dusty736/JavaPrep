// represents cirlce shapes.

public class Circle implements Shape {
   private double radius;
   
   // constructs a new circle with the given radius.
   public Circle(double radius) {
      this.radius = radius;
   }
   
   // returns the area of this circle.
   public double getArea() {
      return Math.PI * radius * radius;
   }
   
   public double getPerimeter() {
      return 2.0 * Math.PI * radius;
   }
}