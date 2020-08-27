package day12.checkpoint01;

import day12.checkpoint01.entities.Person;

import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
  public static void main(String[] args) {
    Collection<Person> collection = new ArrayList<>();
    Person p1 = new Person("马化腾",45);
    Person p2 = new Person("马云",57);
    Person p3 = new Person("许家印",45);
    Person p4 = new Person("王健林",54);
    //添加元素
    collection.add(p1);
    collection.add(p2);
    collection.add(p3);
    collection.add(p4);
    System.out.println(collection);
    //删除元素
    collection.remove(p2);
    //打印集合
    System.out.println(collection);
    //获取集合大小
    System.out.println("集合的大小为："+collection.size());
    //清空集合
    collection.clear();
    System.out.println(collection);
  }
}
