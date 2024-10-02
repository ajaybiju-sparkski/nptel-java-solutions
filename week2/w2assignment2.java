import java.util.Scanner;


class Student{
  String name;
  int age;
  Student(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
}

class W02_P2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read input
    // System.out.print("Enter name: ");
    String name = scanner.nextLine();
    // System.out.print("Enter age: ");
    int age = scanner.nextInt();

    // Create Student object
    Student student = new Student(name, age);

    // Print student details
    System.out.println("Student Name: " + student.getName());
    System.out.print("Student Age: " + student.getAge());

    scanner.close();
  }
}
