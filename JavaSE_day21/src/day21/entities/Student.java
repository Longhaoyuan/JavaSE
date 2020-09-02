package day21.entities;

public class Student {
  private String neme;
  private String sex;
  private int age;

  public Student() {
  }

  public Student(String neme, String sex, int age) {
    this.neme = neme;
    this.sex = sex;
    this.age = age;
  }

  public String getNeme() {
    return neme;
  }

  public void setNeme(String neme) {
    this.neme = neme;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
      "neme='" + neme + '\'' +
      ", sex='" + sex + '\'' +
      ", age=" + age +
      '}';
  }
}
