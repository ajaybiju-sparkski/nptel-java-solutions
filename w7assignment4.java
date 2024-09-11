import java.util.Scanner;

public class W07_P4{

public static int primeSum(int x, int y){
    int sum = 0;
  for(int n=x;n<=y;n++){
    int r = 1;
    for(int i=n/2;i>1;i--){
      r=n%i;
      if(r==0)
        break;
    }
    if(r!=0)
      sum+=n;
  }
  return sum;
}

public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
		
	    System.out.print(primeSum(x, y));
	}
}
