package day13.checkpoint02;

import day13.checkpoint02.entities.Student;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
* 定义一个Student类,包含名称,年龄,性别(姓名,年龄,性别完全相同视为同一学生)
 * 创建10个Student对象,至少有两个学生姓名,年龄,性别完全相同.
 * 把这10个学生添加到Set集合中,不可以重复,遍历 Set集合打印学生信息,使用两种方式
* */
public class Test04 {
  public static void main(String[] args) {
    Set<Student> set = new HashSet<>();

    Student stu1 = new Student("马云宝",18,"男");
    Student stu2 = new Student("云宝",19,"男");
    Student stu3 = new Student("蒋丽袁",18,"女");
    Student stu4 = new Student("冯嘉堡",16,"女");
    Student stu5 = new Student("马云宝",18,"男");
    Student stu6 = new Student("秋栗原",17,"男");
    Student stu7 = new Student("冯嘉堡",18,"女");
    Student stu8 = new Student("蒋丽袁",18,"女");
    Student stu9 = new Student("金丽叶",17,"男");
    Student stu10 = new Student("姜鹫峰",17,"男");

    Collections.addAll(set,stu1,stu2,stu3,stu4,stu5,stu6,stu7,stu8,stu9,stu10);
    System.out.println("全部学生有"+set.size()+"位：");
    set.stream().forEach(s->{
      System.out.println("姓名："+s.getName()+" 年龄："+s.getAge()+" 性别:"+s.getSex());
    });
    System.out.println("全部学生有"+set.size()+"位：");
    for (Student student : set) {
      System.out.println("姓名："+student.getName()+" 年龄："+student.getAge()+" 性别:"+student.getSex());
    }
  }
}
