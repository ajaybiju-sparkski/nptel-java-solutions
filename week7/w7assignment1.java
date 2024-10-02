import java.util.Scanner;

public class W07_P1 {

public static String findLongestWord(String text) {
  String longest = "";
  String[] arrOfStr = text.split(" ");
  for (String a : arrOfStr)
      if ( a.length() >= longest.length() )
        longest = a;
  return longest;
}

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter text
       // System.out.println("Enter some text:");
        String text = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Call the method to find the longest word
        String longestWord = findLongestWord(text);

        // Print the longest word found
        System.out.print("The longest word in the text is: " + longestWord);
    }
}
