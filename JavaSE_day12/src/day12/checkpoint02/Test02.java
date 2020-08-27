package day12.checkpoint02;

import day12.checkpoint02.entities.Person;

import java.util.ArrayList;
/*
* 身高
* */
public class Test02 {
  public static void main(String[] args) {
    ArrayList<Person> list = new ArrayList<>();
    Person p1 = new Person("张三",18,1.80);
    Person p2 = new Person("李四",19,1.60);
    Person p3 = new Person("王五",17,1.75);
    Person p4 = new Person("姜武",18,1.70);
    Person p5 = new Person("陈俊",20,1.65);
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);
    Person highestStu =list.get(0);
    Person ShortestStu =list.get(0);
    for (Person person : list) {
      if (highestStu.getHight()<person.getHight()){
        highestStu = person;
      }else if(ShortestStu.getHight()>person.getHight()){
        ShortestStu = person;
      }
    }
    System.out.println("最高的是"+highestStu.getName()+",年龄："+highestStu.getAge()+"岁，身高："+highestStu.getHight()+"米");
    System.out.println("最矮的是"+ShortestStu.getName()+",年龄："+ShortestStu.getAge()+"岁，身高："+ShortestStu.getHight()+"米");
  }
}
