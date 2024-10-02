import java.util.Scanner;

interface Number {
    int findSqr(int i);  // Returns the square of n
}

class A implements Number{
  public int findSqr(int i){
    return i*i;
  }
}

public class W06_P1{ 
        public static void main (String[] args){ 
	      A a = new A();   //Create an object of class A
           // Read a number from the keyboard
           Scanner sc = new Scanner(System.in);  
           int i = sc.nextInt();
           System.out.print(a.findSqr(i)); 
    } 
}
