package day09.work06;

public class Teacher extends Person{
  public Teacher(String name, int age) {
    super(name, age);
  }


  @Override
  public void eat() {
    System.out.println("年龄为"+super.getAge()+"岁 "+super.getName()+" 的老师吃饭(工作餐)和讲课");
  }
}
