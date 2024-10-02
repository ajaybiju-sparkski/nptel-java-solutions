import java.util.Scanner;

class Circle{
  private double radius;
  Circle(double radius){
    this.radius = radius;
  }
  public double calculateArea(){
    return( Math.PI * radius * radius);
  }
  public double calculateCircumference(){
    return( 2 * Math.PI * radius);
  }
}

public class W02_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        // Create circle object
        Circle circle = new Circle(radius);

        // Calculate and print area
        double area = circle.calculateArea();
        // Print area to 2 decimal places
        System.out.printf("Area: %.2f\n", area);

        // Calculate and print circumference
        double circumference = circle.calculateCircumference();
        // Print circumference to 2 decimal places
        System.out.printf("Circumference: %.2f", circumference);
        scanner.close();
    }
}
