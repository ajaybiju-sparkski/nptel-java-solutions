class W06_P5 extends Thread{  
  public void run(){  
    System.out.print("Thread is running.");  
  }  
 public static void main(String args[]){  
    W06_P5 t=new W06_P5();  
    System.out.println("Name of thread 't':"+ t.getName());

t.setName("NPTEL");
t.start();

System.out.println("New name of thread 't':"+ t.getName());  
 }  
}
