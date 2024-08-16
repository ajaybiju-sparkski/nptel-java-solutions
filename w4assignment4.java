interface ExtraLarge{
	String extra = "This is extra-large";
	
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
    	  super.Print();  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print(); 
        System.out.println("This is small");
  }
}

class W04_P4 implements ExtraLarge{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
		W04_P4 q = new W04_P4();
		q.display();
    }
	public void display(){
		System.out.print(extra);
	}
}
