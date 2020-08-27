package extendsDemo;

public class Fu {
  public String name = "华盛顿";
  private int age;
  public void eat(){
    System.out.println(name+"正在吃饭。");
  }
  public void sleep(){
    System.out.println(name+"正在睡觉。");

  }

  public Fu() {
    System.out.println("父类无参构造");
  }

  public Fu(String name, int age) {
    System.out.println("父类有参构造");
    this.name = name;
    this.age = age;
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
}
