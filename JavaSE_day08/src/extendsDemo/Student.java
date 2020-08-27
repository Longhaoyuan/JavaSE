package extendsDemo;

public class Student extends Fu{
  int a = 100;

  public Student(int a) {
    this("fafa",45,456);
    System.out.println("子类构造方法一");
    this.a = a;
  }

  public Student(String name, int age, int a) {
    super(name, age);
    System.out.println("父类构造方法二");
    this.a = a;
  }
}
