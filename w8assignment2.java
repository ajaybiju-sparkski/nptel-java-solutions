interface First{ 
    // default method 
    default void show(){ 
        System.out.println("Default method implementation of First interface."); 
    } 
} 
  
interface Second{ 
    // Default method 
    default void show(){ 
        System.out.print("Default method implementation of Second interface."); 
    } 
} 
  
// Implementation class code 
class W08_P2 implements First, Second{ 
 // Overriding default show method 
    public void show(){

  First.super.show();
 
Second.super.show();

} 
  
    public static void main(String args[]){ 
        W08_P2 q = new W08_P2(); 
        q.show(); 
    } 
}
