package day19.entities;

import java.io.Serializable;

public class Student implements Serializable {
  private static final long serialVersionUID = 4077008245793718295L;
  private String name;
  private int age;

  public Student(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  private String sex;

  public String getSex() {
    return sex;
  }

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", sex='" + sex + '\'' +
      '}';
  }

  public void setSex(String sex) {
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

  public Student() {
  }
}
