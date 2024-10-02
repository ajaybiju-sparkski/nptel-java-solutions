import java.util.Scanner;
class W03_P3{

static long factorial(int x){
  if(x == 0 || x == 1 )
    return 1;
  else 
    return x * factorial(x -1);
}

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.print(factorial(x));   
  }
}
