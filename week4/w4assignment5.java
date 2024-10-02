import java.util.Scanner;

public class W04_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

  for(int i=0; i<2*n; i=i+2)
  if(i%3==0)
    sum+=i;

  System.out.print("Sum: "+sum);// Suffixed Fixed Code:
        sc.close();
    }
}
