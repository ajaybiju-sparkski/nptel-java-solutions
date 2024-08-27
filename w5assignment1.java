import java.util.*;

class IllegalArgumentException extends Exception {
  public IllegalArgumentException(String message) {
    super(message);
  }
}

public class W05_P1 {
    public static void main(String[] args) {
     // int n = 18;
      Scanner input = new Scanner(System.in);
      int n=input.nextInt();
      trynumber(n);
    }

  public static void trynumber(int n){
  try {
      checkEvenNumber(n);
    } catch (IllegalArgumentException e) {
      System.out.print(e.getMessage());
    }
}
public static void checkEvenNumber(int number) throws IllegalArgumentException {
  if ( number % 2 == 1)
    throw new IllegalArgumentException("Error: " + number + " is odd.");
  else
    System.out.print(number + " is even.");
}

}
