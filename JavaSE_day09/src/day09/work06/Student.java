package day09.work06;

public class Student extends Person{

  public Student(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println("年龄为"+super.getAge()+"岁 "+super.getName()+" 的学生吃饭(学生餐)和讲课");
  }
}
