import java.util.*;
public class W10_P2 {  
    public static void main(String[] args) { 
       try{	
       byte barr[]={'N','P','T','E','L','-','J','A','V','A','J','U',
       'L','-','N','O','C','C', 'S','\n'};
          Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();

      String s2 = new String(barr,n,1);
System.out.println(barr[n]);
System.out.print(s2);
}// End of try block
catch (Exception e){
// print the required message here
  System.out.print("Error: Exception occoured");
        }

    }
}
