package classdemo.entities;

public class Student {
  public String  hobby;

  public Double maney;

  private String name;
  private String sex;
  private Integer age;

  @Override
  public String toString() {
    return "Student{" +
      "hobby='" + hobby + '\'' +
      ", maney=" + maney +
      ", name='" + name + '\'' +
      ", sex='" + sex + '\'' +
      ", age=" + age +
      '}';
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

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Student(String name, String sex, Integer age) {
    System.out.println("公共构造方法");
    this.name = name;
    this.sex = sex;
    this.age = age;
  }

  private Student(String name, String sex) {
    System.out.println("私有构造方法");
    this.name = name;
    this.sex = sex;
  }

  protected Student(String name) {
    System.out.println("保护构造方法");
    this.name = name;
  }

  Student(Integer age) {
    System.out.println("默认构造方法");
    this.age = age;
  }

  public Student() {
  }

  public void eat() {
    System.out.println("吃饭");
  }

  public void sleep(int hour) {
    System.out.println("我每天睡" + hour + "小时");
  }

  private void show() {
    System.out.println("表演");
  }

  public static void study() {
    System.out.println("学习JavaSE");
  }

  private static void studyX() {
    System.out.println("学习JavaEE");
  }

}
