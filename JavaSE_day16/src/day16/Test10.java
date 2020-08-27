package day16;

import day16.entities.Person;

import java.util.Random;

/*
* 1. 使用等待唤醒,实现一个线程给共享对象Person的属性(姓名,性别)赋值,
* 一个线程打印共享对象的属性,要求赋值- >打印->赋值->打印 ... 不允许出现人妖
* */
public class Test10 {
  public static void main(String[] args) {
    EditAndPrint editAndPrint = new EditAndPrint();
    new Thread(()->{
      try {
        editAndPrint.addPerson();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();
    new Thread(()->{
      try {
        editAndPrint.printPerson();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();
  }
}
class EditAndPrint {
  public static String[] sexs = {"男", "女", "人妖"};
  public static String[] names = {"马格果", "李子棋", "黄洁平","李瑶东"};
  Person person = new Person();
  int i = 1;
  public static Object object = new Object();

  public void addPerson() throws InterruptedException {
    Random random = new Random();
    while (true) {
      synchronized (object) {
        if ("人妖".equals(person.getSex())) {
          break;
        }
        if (i != 1)
          object.wait();
        System.out.println("添加属性:");
        person.setName(names[random.nextInt(4)]);
        person.setSex(sexs[random.nextInt(3)]);
        i = 2;
        Thread.sleep(800);
        object.notify();
      }
    }
  }

  public void printPerson() throws InterruptedException {
    while (true) {
      synchronized (object) {
        if (i != 2)
          object.wait();
        System.out.println("该位兄弟为：" + person.getName() + "，性别：" + person.getSex());
        i = 1;
        if ("人妖".equals(person.getSex())) {
          System.out.println(person.getName()+"性别不能为人妖");
          break;
        }
        Thread.sleep(800);
        object.notify();
      }
    }
  }
}
