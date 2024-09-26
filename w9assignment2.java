abstract class Person {
    public abstract void eat();
    public abstract void sleep();
    public abstract void exercise();
  }

class Athlete extends Person {
  public void eat() {
    System.out.println("Athlete: Include foods full of calcium, iron, potassium, and fiber.");
  }
  public void sleep() {
    System.out.println("Athlete: sleeps for 8 hours.");
  }
  public void exercise() {
    System.out.println("Athlete: Training allows the body to gradually build up strength and endurance, improve skill levels and build motivation, ambition and confidence.");
  }
}
class LazyPerson extends Person {
  public void eat() {
    System.out.println("Couch Potato: Eating while watching TV also prolongs the time period that we're eating.");
  }
  public void sleep() {
    System.out.println("Couch Potato: sleeps for 12 hours.");
  }
  public void exercise() {
    System.out.println("Couch Potato: Rarely exercising or being physically active.");
  }
}

public class W09_P2 {
    public static void main(String[] args) {
      Person athlete = new Athlete();
      Person lazyPerson = new LazyPerson();
      athlete.eat();
      athlete.exercise();
      athlete.sleep();
      lazyPerson.eat();
      lazyPerson.exercise();
      lazyPerson.sleep();
    }
  }
