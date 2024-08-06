import java.util.*;

public class W03_P4{
public static void main(String[] args) {

String choice = "";
Scanner input = new Scanner(System.in);

  int x;
int product = 1;
float avg = 0;
int count = 0;
do{
  if(input.hasNextInt()) {
    x = input.nextInt();
    product*=x;
    avg +=x;
    count++;
  }
  else
    choice="q";
}while(choice!="q");
System.out.println("Product is: " + product);
System.out.print("Average is: " + avg/count);

}
}
