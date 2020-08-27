package day12.checkpoint02;

import day12.checkpoint02.entities.Student;

import java.util.ArrayList;
import java.util.Collections;

/*
* 学生成绩管理
* */
public class Test01 {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
    Student stu1 = new Student("张三",18,98);
    Student stu2 = new Student("李四",19,78);
    Student stu3 = new Student("王五",17,87);
    Student stu4 = new Student("姜武",16,65);
    Student stu5 = new Student("陈俊",20,80);
    /*list.add(stu1);
    list.add(stu2);
    list.add(stu3);
    list.add(stu4);
    list.add(stu5);*/
    Collections.addAll(list,stu1,stu2,stu3,stu4,stu5);

    //总分
    double sum = 0;
    //最高分
    Student hightestScore = list.get(0);
    //最低分
    Student lowerestScore = list.get(0);

    for (Student student : list) {
      sum +=student.getScore();
      if (hightestScore.getScore()<student.getScore()){
        hightestScore = student;
      }else if(lowerestScore.getScore()>student.getScore()){
        lowerestScore = student;
      }
    }
    //平均分
    System.out.println("总分是："+sum);
    System.out.println("平均分是："+(sum/list.size()));
    System.out.println("最高分是："+hightestScore.getName()+",年龄："+hightestScore.getAge()+",分数是："+hightestScore.getScore());
    System.out.println("最低分是："+lowerestScore.getName()+",年龄："+lowerestScore.getAge()+",分数是："+lowerestScore.getScore());
  }
}
