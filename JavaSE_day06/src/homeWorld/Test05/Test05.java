package homeWorld.Test05;

import java.util.ArrayList;

public class Test05 {
  public static void main(String[] args) {
    Student s1 = new Student("it001", "黄渤", 1.72);
    Student s2 = new Student("it002", "孙红雷", 1.78);
    Student s3 = new Student("it003", "章子怡", 1.64);
    Student s4 = new Student("it004", "杨颖", 1.68);

    ArrayList<Student> list = new ArrayList<>();
    list.add(s1);
    list.add(s2);
    list.add(s3);
    list.add(s4);
    System.out.println("集合的大小："+list.size());
    for (Student student : list) {
      System.out.println(student.getId()+","+student.getName()+","+student.getHeight());
    }
    System.out.println("--------------------------------");
    System.out.println("身高1.70以上的学员：");
    for (Student student : list) {
      if (student.getHeight()>1.70)
        System.out.println(student.getId()+","+student.getName()+","+student.getHeight());
    }
  }
}
