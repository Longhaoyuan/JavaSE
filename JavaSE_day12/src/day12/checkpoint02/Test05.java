package day12.checkpoint02;

import day12.checkpoint02.entities.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test05 {
  public static void main(String[] args) {
    ArrayList<Person> list = new ArrayList<>();
    Person p1 = new Person("张三",18,1.80);
    Person p2 = new Person("李四",19,1.60);
    Person p3 = new Person("王五",17,1.75);
    Person p4 = new Person("姜武",18,1.70);
    Person p5 = new Person("陈俊",20,1.65);
    //添加到集合
    Collections.addAll(list,p1,p2,p3,p4,p5);

    Iterator<Person> iterator = list.iterator();
    while (iterator.hasNext()){
      Person next = iterator.next();
      next.setAge(next.getAge()+2);
    }
    for (Person person : list) {
      System.out.println("姓名："+person.getName()+" 年龄:"+person.getAge()+" 身高："+person.getHight());
      person.setAge(person.getAge()-2);
    }
  }
}
