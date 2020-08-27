package homeWork.test05;

public class Student extends Person{
  private int fraction;

  public Student() {
    super();
  }

  public Student(String name, int age, int fraction) {
    super(name, age);
    this.fraction = fraction;
  }

  public int getFraction() {
    return fraction;
  }

  public void setFraction(int fraction) {
    this.fraction = fraction;
  }
}
