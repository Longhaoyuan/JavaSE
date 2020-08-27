package day14.homeworldmap.checkpoint01;

import day14.homeworldmap.checkpoint01.entities.Student;

import java.util.HashMap;
import java.util.Map;

/*
* 每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，
* 则将学生对象和家庭住址存储到map集合 中。学生作为键, 家庭住址
* 作为值，并使用keySet和entrySet方式遍历Map集合.注意，学生姓
* 名相同并且年龄相 同视为同一名学生
* */
public class Test07 {
  public static void main(String[] args) {
    Map<Student, String> map = new HashMap<>();
    map.put(new Student("杰克云",16),"京东路8号");
    map.put(new Student("路易菲",17),"棠东路15号");
    map.put(new Student("段遮云",18),"路易路78号");
    map.put(new Student("路易菲",17),"上镜路17号");


    System.out.println("学生信息：");
    for (Student student : map.keySet()) {
      System.out.println("姓名："+student.getName()+"，年龄："+student.getAge()+"，地址："+map.get(student));
    }
    System.out.println("学生信息：");
    for (Map.Entry<Student, String> studentStringEntry : map.entrySet()) {
      System.out.println("姓名："+studentStringEntry.getKey().getName()+"，年龄："+studentStringEntry.getKey().getAge()+"，地址："+studentStringEntry.getValue());

    }
  }
}
