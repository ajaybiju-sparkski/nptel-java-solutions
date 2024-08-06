// This is the class named Former
class Former {
    // This is a method in class Former
    public void display() {
        System.out.println("This is Former Class.");
    }
}

// This is the class named Latter
class Latter {
    // This is a method in class Latter
    public void display() {
        System.out.print("This is Latter Class.");
    }
}

public class W02_P1 {
    public static void main(String[] args) {

  Former f = new Former();
f.display();
Latter l = new Latter();
l.display();

}
}
