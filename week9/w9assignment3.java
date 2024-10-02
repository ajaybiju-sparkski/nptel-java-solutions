import java.util.Scanner;
abstract class Shape {
    public abstract void draw();
  
    public abstract double calculateArea();
  }

class Circle extends Shape {
  private double radius;
  
  Circle(double radius){
    this.radius = radius;
  }
  
  public double calculateArea(){
    return( Math.PI * radius * radius);
  }
  
  public void draw(){
    System.out.println("Drawing a circle");
  }
}
class Cylinder extends Shape {
  private double radius;
  private double height;
  
  
  Cylinder(double radius, double height){
    this.radius = radius;
    this.height = height;
  }
  
  public double calculateArea(){
    return( 2 * Math.PI * radius * ( radius + height) );
  }
  
  public void draw(){
    System.out.println("Drawing a cylinder");
  }
}

public class W09_P3{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int radius = in.nextInt();
      int height = in.nextInt();

      Shape circle = new Circle(radius);
      Shape cylinder = new Cylinder(radius, height);
  
      drawShapeAndCalculateArea(circle);
      drawShapeAndCalculateArea(cylinder);
    }
  
    public static void drawShapeAndCalculateArea(Shape shape) {
      shape.draw();
      double area = shape.calculateArea();
      System.out.printf("Area: %.4f%n", area);
    }
  }
