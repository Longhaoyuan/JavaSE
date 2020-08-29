package day19;

import day19.entities.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
*将上一题保存到stu.txt文件中的学生对象读取出来。
* */
public class Test08 {
  public static void main(String[] args) {
    ObjectInputStream ois = null;

    try {
      ois=new ObjectInputStream(new FileInputStream("stu.txt"));
      Student student = (Student) ois.readObject();
      System.out.println(student);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
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
