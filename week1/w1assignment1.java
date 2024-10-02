import java.util.Scanner;
public class W01_P1 { 
   public static void main(String[] strings) {
       double width ;
       double height;

       Scanner in = new Scanner(System.in);
       width = in.nextDouble();
       height = in.nextDouble();
       
     
       double perimeter = 2 * (width + height);
       double area = width * height;
      
     
     // Print the calculated perimeter using placeholders for values
       System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height, width, perimeter);

      // Print the calculated area using placeholders for values
       System.out.printf("Area is %.1f * %.1f = %.2f", width, height, area);    
   }
}
