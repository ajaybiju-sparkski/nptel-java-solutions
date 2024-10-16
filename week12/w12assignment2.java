import java.util.Scanner;
public class W12_P2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

  String arr[]=new String[5];
    for(int i=0;i<5;i++)
        arr[i]=sc.nextLine();
    
char matrix[][]=new char[5][5];
for(int i=0;i<5;i++){
    char[] chararray=arr[i].toCharArray();
  for(int j=0;j<5;j++){
    matrix[i][j]=chararray[j];
  }
}
for(int i=0;i<5;i++){
  for(int j=0;j<5;j++){
    if(matrix[i][j]=='0')
      System.out.print('1');
    else
      System.out.print('0');
   
  }
  System.out.println();
}

  } // The main() ends here
} // The main class ends here
