package day13.checkpoint02;

import day13.checkpoint02.entity.Student;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,
 * 生成get/set方法.创建5个学生放到 HashSet中(姓名和年龄相同的认为是同一学
 * 生).使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输 出
 * */
public class Test10 {
  public static void main(String[] args) {
    Set<Student> studentSet = new HashSet<>();
    Student stu1 = new Student("蒋科杰", 16, 89.5);
    Student stu2 = new Student("墨客夫", 17, 78.0);
    Student stu3 = new Student("蒋科杰", 16, 78.0);
    Student stu4 = new Student("信贾格", 14, 84.0);
    Student stu5 = new Student("刘易斯", 17, 81.5);

    Collections.addAll(studentSet, stu1, stu2, stu3, stu4, stu5);
    Double sum=0D;
    Double avg=0D;
    int i = 0;
    Student hightestStu = new Student();
    Student lowerestStu = new Student();
    Iterator<Student> iterator = studentSet.iterator();
    System.out.println("每个学生的信息：");
    while (iterator.hasNext()){
      Student student = iterator.next();
      System.out.println("姓名："+student.getName()+" 年龄："+student.getAge()+" 成绩："+student.getScore());
      if (i==0){
        hightestStu = student;
        lowerestStu = student;
        i++;
      }
      sum+=student.getScore();
      if (hightestStu.getScore()<student.getScore()){
        hightestStu=student;
      }else  if (lowerestStu.getScore()>student.getScore()){
        lowerestStu=student;
      }
    }
    avg = sum/studentSet.size();
    System.out.println("总分："+sum);
    System.out.println("平均分："+avg);
    System.out.println("最高分的是：");
    System.out.println("姓名："+hightestStu.getName()+" 年龄："+hightestStu.getAge()+" 成绩："+hightestStu.getScore());
    System.out.println("最低分的是：");
    System.out.println("姓名："+lowerestStu.getName()+" 年龄："+lowerestStu.getAge()+" 成绩："+lowerestStu.getScore());
  }
}
