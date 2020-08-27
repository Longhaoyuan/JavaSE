package day16.entities;

public class Person {
  private String name;
  private String sex;

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Person(String name, String sex) {
    this.name = name;
    this.sex = sex;
  }
}
