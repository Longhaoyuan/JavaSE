package day09.work06;

public class SportTeacher extends Teacher implements Sport {
  public SportTeacher(String name, int age) {
    super(name, age);
  }

  @Override
  public void playBasketball() {
    System.out.println("年龄为"+super.getAge()+"岁 "+super.getName()+" 的老师打篮球");
  }
}
