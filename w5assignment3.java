import java.util.Scanner;

class NoVowelsException extends Exception {
  public NoVowelsException(String message) {
    super(message);
  }
}

public class W05_P3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      try {
        String text = input.nextLine();

        System.out.println("Original string: " + text);
        checkVowels(text);
        System.out.print("String contains vowels.");
      } catch (NoVowelsException e) {
        System.out.print("Error: " + e.getMessage());
      }
    }

public static void checkVowels(String a) throws NoVowelsException {
  boolean flag = false;
  for ( int i = 0 ; i < a.length() ; i++){
        char c = a.charAt(i);
        if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
          flag = true;
      }
  if ( flag == false )
    throw new NoVowelsException("String does not contain any vowels.");
}

}
