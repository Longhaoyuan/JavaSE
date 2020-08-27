package day13.checkpoint02.entity;

import java.util.Objects;

/*
* 姓名,年龄,成绩属性.私有成员变量
* */
public class Student {
  private String name;
  private Integer age;
  private Double score;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return Objects.equals(name, student.name) &&
      Objects.equals(age, student.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Student() {
  }

  public Student(String name, Integer age, Double score) {
    this.name = name;
    this.age = age;
    this.score = score;
  }
}
