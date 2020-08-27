package day14.homeworkException.checkpoint02.com.xiaomi.level2_02;

import day14.homeworkException.checkpoint02.com.xiaomi.level2_02.entities.Person;


public class Test02 {
  public static void main(String[] args) {
    Person p1 = new Person("哈斯奇",100);
    System.out.println(p1);
    Person p2 = new Person();
    p2.setName("哈斯奇");
//    p2.setLifeVaule(80);
    p2.setLifeVaule(-10);

  }
}
