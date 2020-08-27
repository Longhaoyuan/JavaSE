package day16;

import day16.entities.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 1. 对Java基础班学生的考试成绩进行排序 定义一个学生类，
* 有两个属性。姓名，考试成绩 在测试类中定义一个学生数组，
* 存储学生信息。 使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。
* */
public class Test08 {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    Student stu1 = new Student("马云波",87);
    Student stu2 = new Student("路波",75);
    Student stu3 = new Student("杰克森",98);
    Student stu4 = new Student("李允禄",65);

    Collections.addAll(list,stu1,stu2,stu3,stu4);
    //排序前
    System.out.println(list);
    //进行排序
    Collections.sort(list,(o1,o2)->{
      return (int) (o2.getScorce()-o1.getScorce());
    });
    //排序后
    System.out.println(list);
  }
}
