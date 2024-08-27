import java.util.Scanner;
interface Searchable {
    // Declare the abstract method "search" that classes implementing this interface must provide
    boolean search(String keyword);
}

class Document implements Searchable{
  public boolean search(String keyword){
    return true; // dummy statement
  }
}
class WebPage implements Searchable{
  
  String url;
  String title;
  
  WebPage(String url, String title){
    this.url = url;
    this.title = title;
  }
  public boolean search(String keyword){
    return title.contains(keyword);
  }
}

public class W05_P2 {
    public static void main(String[] args) {
        // Create an instance of the Document class with a sample content
   Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String document = text;
        String str = in.nextLine();

        // Search for a keyword in the document and store the result
        boolean documentContainsKeyword = document.contains(str);

        // Print whether the document contains the keyword
System.out.println("Document contains keyword: " +str+ " "+documentContainsKeyword);
// Create an instance of the WebPage class with a sample URL and HTML content
        WebPage webPage = new WebPage("https://onlinecourses.nptel.ac.in", "This is a NPTEL online course webpage.");

        // Search for a keyword in the webpage and store the result
        boolean webPageContainsKeyword = webPage.search("webpage");

        // Print whether the webpage contains the keyword
        System.out.print("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
    }
}
