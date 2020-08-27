package classDemo;

public class Dog {
  private String name;
  private int age;
  private String color;

  public Dog() {
  }

  public Dog(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public void tailwagging(){
    System.out.println(name+"，今年"+age+"岁,是"+color+",正在向主人摇尾巴");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
