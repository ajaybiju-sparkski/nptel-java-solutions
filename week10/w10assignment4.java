import java.util.*;
public class W10_P4 {  
    public static void main(String[] args) { 
       try{
           String s1="NPTELJAVA"; 
            Scanner inr = new Scanner(System.in);
	      int n = inr.nextInt();
	      char c='a';

byte[] barr=s1.getBytes();   
          
                byte b1 = (byte) c;
                barr[n]=b1;
        System.out.print(new String(barr));


}
       catch (Exception e){
          System.out.print("exception occur");
	    }	   
    }  
}
