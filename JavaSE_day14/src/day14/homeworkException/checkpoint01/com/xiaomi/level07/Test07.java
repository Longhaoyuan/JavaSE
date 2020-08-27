package day14.homeworkException.checkpoint01.com.xiaomi.level07;

import day14.homeworkException.checkpoint01.com.xiaomi.level07.entities.Student;

/*
* 请使用代码实现
1. 每一个学生(Student)都有学号,姓名和分数,分数永远不能为为负数。
2. 如果试图给学生赋值一个负数,抛出一个自定异常 。
* */
public class Test07 {
  public static void main(String[] args) {
//    Student student = new Student("01011","公孙离",99);
    Student student1 = new Student("01011","公孙离",-99);
  }
}
