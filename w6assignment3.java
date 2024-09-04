class W06_P3 extends Thread{
  public void run(){
        System.out.print("Thread is Running.");
    }

public static void main(String args[]){  

		// Creating object of thread class
		W06_P3 thread=new W06_P3();  

                // Start the thread
		thread.start();
	}  
}
