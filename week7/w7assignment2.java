import java.util.Scanner;  
class W07_P2  
{  
    // main() method start  
    public static void main (String[] args)  
    {  
        int rows, cols;  
        Scanner sc = new Scanner(System.in);  
     //   System.out.println("Please enter odd numbers for rows and colums to get perfect Swastika.");  
       // System.out.println("Enter total rows");  
        rows = sc.nextInt();  
       //System.out.println("Enter total colums");  
        cols = sc.nextInt();  
          
        // close Scanner class  
        sc.close();  
          
        // call swastika() method that will design Swastika for the specified rows and cols  
        swastika(rows, cols);  
    }  
static void swastika(int rows, int cols)  
{

  int rmid = rows/2 +1;
int cmid = cols/2 +1;
for ( int i = 1; i <= rows ; i++)
{
  for ( int j = 1; j <= cols ; j++ )
  {
    if ( i == rmid )
      System.out.print("*");
    else if ( j == cmid )
      System.out.print("*");
    else if ( j == 1 && i < rmid || j == cols && i > rmid)
      System.out.print("*");
    else if ( i == 1 && j > cmid || i == rows && j < cmid )
      System.out.print("*");
    else if ( i > 1 && i < rmid && j > cmid )
      continue;
    else
      System.out.print(" ");
  }
  System.out.print("\n");

}
}
}
