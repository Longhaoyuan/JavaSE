package day16.entities;

public class Student {
  private String name;
  private double scorce;

  public Student() {
  }

  public Student(String name, double scorce) {
    this.name = name;
    this.scorce = scorce;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", scorce=" + scorce +
      '}';
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getScorce() {
    return scorce;
  }

  public void setScorce(double scorce) {
    this.scorce = scorce;
  }
}
