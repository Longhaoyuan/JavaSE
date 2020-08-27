package homeWork.test02;

public class Person {
  public String name;
  public int age;
  public void eat(){
    System.out.println(name+"吃饭");
  }
  public void sleep(){
    System.out.println(name+"睡觉");
  }

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
