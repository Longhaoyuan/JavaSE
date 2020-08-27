package day16;

import day16.entities.Student;

import java.util.*;

/*
* 1. 使用lambda表达式对List，Set，Map集合进行遍历。
* */
public class Test09 {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    Set<Student> set = new HashSet<>();
    Map<Integer,Student> map = new HashMap<>();
    Student stu1 = new Student("马云波",87);
    Student stu2 = new Student("路波",75);
    Student stu3 = new Student("杰克森",98);
    Student stu4 = new Student("李允禄",65);

    //添加数据到list
    Collections.addAll(list,stu1,stu2,stu3,stu4);
    //添加数据到set
    Collections.addAll(set,stu1,stu2,stu3,stu4);
    //添加数据到map
    map.put(1,stu1);
    map.put(2,stu2);
    map.put(3,stu3);
    map.put(4,stu4);
    //遍历list
    System.out.println("遍历list:");
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    //遍历set
    System.out.println("\n遍历set:");
    set.stream().forEach(n->{
      System.out.print(n+" ");
    });
    //遍历map
    System.out.println("\n遍历map:");
    map.forEach((k,v)->{
      System.out.print("key:"+k+",value:"+v);
    });
  }
}
