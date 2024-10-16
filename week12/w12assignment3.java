import java.util.Scanner;
public class W12_P3 {
  public static void main(String[] args) {
      //  int n = 7; // Number of rows (should be odd for symmetry)
       Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

  for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
           
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
 
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
 
        
        for (int i = n; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
           
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
 
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
 
       
        sc.close();

  }
}
