package day19;

import day19.entities.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 1. 定义学生类并实现序列化接口和测试类
 * 2. 在测试类中创建学生对象
 * 3. 创建文件字节输出流对象并关联目标文件
 * 4. 根据文件字节输出流对象创建对象输出流对象
 * 5. 调用对象输出流对象的方法将学生对象保存到文件中
 * 6. 关闭流释放资源
 * */
public class Test07 {
  public static void main(String[] args) {
    Student student = new Student("Jack", 28, "男");
    ObjectOutputStream oos = null;
    FileOutputStream fos = null;
    try {
      fos = new FileOutputStream("stu.txt");
      oos = new ObjectOutputStream(fos);
      oos.writeObject(student);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (oos != null) {
          oos.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (fos != null) {
          fos.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
