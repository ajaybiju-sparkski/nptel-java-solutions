import java.util.Scanner;

class Rectangle {
  double length;
  double width; 
  Rectangle(){
    length = 1;
    width = 1;
  }
  Rectangle( double length, double width){
    this.length = length;
    this.width = width;
  }
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
  public double getArea(){
    return length*width;
  }
}

class W02_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        // System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        // System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Create Rectangle objects
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(length, width);

        // Print rectangle dimensions
        System.out.print("Default Rectangle: L, W, A : ");
        System.out.println(rect1.getLength() + ", " + rect1.getWidth() + ", " + rect1.getArea());
        System.out.print("Parameterised Rectangle: L, W, A : ");
        System.out.print(rect2.getLength() + ", " + rect2.getWidth() + ", " + rect2.getArea());

        scanner.close();
    }
}
