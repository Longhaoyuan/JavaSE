package day13.checkpoint03;

import day13.checkpoint03.entities.Student;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
* 一个学科中有若干班级，每一个班级又有若干学生。整个学科一个大集合，若干个班级分为每一个小集合(集合嵌 套之HashSet嵌套HashSet)。要求如下
* 1、学生类有两个属性，姓名和年龄，并定义有参构造、无参构造和getter/setter方法.姓名和年龄相同的视为同一 学生
* 2、向班级集合中添加若干个学生（至少两个学生）。
* 2、向学科集合中添加所有班级(至少创建两个班级)。
* 3、使用两种方法遍历学科集合，并打印出所有学生。
* */
public class Test02 {
  public static void main(String[] args) {
    Student student1 = new Student("马甲云",18);
    Student student2 = new Student("川家刚",17);
    Student student3 = new Student("刘易斯",18);
    Student student4 = new Student("虎烈甲",16);
    //班级
    Set<Student> class1 = new HashSet<>();
    Collections.addAll(class1,student1,student2,student4);
    Set<Student> class2 = new HashSet<>();
    Collections.addAll(class2,student4,student2,student3);
    Set<Student> class3 = new HashSet<>();
    Collections.addAll(class3,student1,student4,student3);
    //学科
    Set<Set<Student>> subject = new HashSet<>();
    Collections.addAll(subject,class1,class2,class3);
    System.out.println("该学科学生有：");
    int classId = 1;
    for (Set<Student> students : subject) {
      System.out.println("第"+classId+"班的学生有：");
      for (Student student : students) {
        System.out.println("姓名："+student.getName()+",年龄："+student.getAge());
      }
      classId++;
    }
    //使用lambda表达式遍历
    System.out.println();
    System.out.println("该学科学生有：");
    subject.stream().forEach(n->{
      System.out.println("该班级的学生有：");
      n.stream().forEach(s->{
        System.out.println("姓名："+s.getName()+",年龄："+s.getAge());
      });
    });
  }
}
