import java.util.Scanner;
class PrintNumbers implements Runnable {

int start;
int end;
 
PrintNumbers(int start, int end){
  this.start = start;
  this.end = end;
}
 
public void run() {
  for (int i = start; i <= end; i= i+2) {
    System.out.println(Thread.currentThread().getName() + ": " + i);
  }
}

}
class W07_P5{
    //Code to create two threads, one printing even numbers and the other printing odd numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the starting value for even numbers: ");
        int evenStart = scanner.nextInt();
       // System.out.print("Enter the ending value for even numbers: ");
        int evenEnd = scanner.nextInt();
       // System.out.print("Enter the starting value for odd numbers: ");
        int oddStart = scanner.nextInt();
       // System.out.print("Enter the ending value for odd numbers: ");
        int oddEnd = scanner.nextInt();
        Thread evenThread = new Thread(new PrintNumbers(evenStart, evenEnd), "EvenThread");
        Thread oddThread = new Thread(new PrintNumbers(oddStart, oddEnd), "OddThread");

        evenThread.start();
try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();
        scanner.close();
    }
}
