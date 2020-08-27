package day12.checkpoint02.entities;

public class Student {
  private String name;
  private int age;

  public void setScore(double score) {
    this.score = score;
  }

  private double score;

  public Student() {
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

  public double getScore() {
    return score;
  }

  public Student(String name, int age, double score) {
    this.name = name;
    this.age = age;
    this.score = score;
  }
}
