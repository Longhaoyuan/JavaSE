package day13.checkpoint02.entities;

import java.util.Objects;

/*
* Student类,包含名称,年龄,性别
* */
public class Student {
  private String name;
  private int age;
  private String sex;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return age == student.age &&
      Objects.equals(name, student.name) &&
      Objects.equals(sex, student.sex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, sex);
  }

  public Student() {
  }

  public Student(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
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

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}
