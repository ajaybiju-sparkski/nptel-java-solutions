import java.util.Scanner;

class QuestionScope {

  public int sum(int n1, int n2) {
  return n1+n2;
}
public static int multiply(int n1, int n2) {
  return n1*n2;
}

}

public class W04_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0, prod = 0;
        QuestionScope st = new QuestionScope(); // Create an object to call non-
                                                // static method
        sum = st.sum(n1, n2); // Call the method
        prod = QuestionScope.multiply(n1, n2);  // Create an object to call
                                                 // static method
        System.out.println("Sum: "+sum);
        System.out.print("Product: "+prod);
        sc.close();
    }
}
