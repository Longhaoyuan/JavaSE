package day13.checkpoint01;

import day13.checkpoint01.entities.Person;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
* 定义人类,包含姓名和年龄属性.创建4个人
* 存储到HashSet中.姓名和年龄相同的人只存储一个。
* */
public class Test07 {
  public static void main(String[] args) {
    Set<Person> personSet = new HashSet<>();
    Person p1 = new Person("麻花腾",45);
    Person p2 = new Person("甲克金",12);
    Person p3 = new Person("腾旭风",28);
    Person p4 = new Person("麻花腾",45);

    Collections.addAll(personSet,p1,p2,p3,p4);
    personSet.stream().forEach(System.out::println);
  }
}
