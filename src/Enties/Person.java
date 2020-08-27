package Enties;

public class Person {
  private String name;
  private Integer sex;

  public Person(String name, Integer sex) {
    this.name = name;
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", sex=" + sex +
      '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }
}
