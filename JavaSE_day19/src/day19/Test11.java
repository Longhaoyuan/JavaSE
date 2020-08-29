package day19;

import day19.entities.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
 * 定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件 中。
 * */
public class Test11 {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    Student stu1 = new Student("夹克", 25, "男");
    Student stu2 = new Student("里克", 21, "男");
    Student stu3 = new Student("扈雅", 20, "女");
    Student stu4 = new Student("李佳薇", 26, "女");

    //添加所有参数到集合
    Collections.addAll(list, stu1, stu2, stu3, stu4);

    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;

    try {
      oos = new ObjectOutputStream(new FileOutputStream("stus.txt"));
      ois = new ObjectInputStream(new FileInputStream("stus.txt"));
      oos.writeObject(list);
      List<Student> lists = (List<Student>) ois.readObject();
      System.out.println(lists);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      //关闭流
      try {
        if (oos!=null){
          oos.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (ois!=null){
          ois.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
