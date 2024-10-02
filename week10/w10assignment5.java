import java.util.Scanner;

public class W10_P5 {

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        // Read any two values for a and b.
        // Get the result of a/b;
        int result;

        a = input.nextInt();
        b = input.nextInt();
        input.close();
        // try block to divide two numbers and display the result
        try {
            result = a / b;
            System.out.print(result);
        }

catch (ArithmeticException e) {
            System.out.print("Cannot Divide by ZERO");
        }

catch (Exception e) {
            System.out.println("Exception Occoured");
   }
  }
}

