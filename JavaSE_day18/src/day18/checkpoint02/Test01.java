package day18.checkpoint02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 *
 * 从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
 * 将学生信息保存到C盘下面的stu.txt文件中，一个学生信息占据一行数据。
 * 当用户输入end时停止输入。
 * 要求使用字节输出流写出数据
 * */
public class Test01 {
  public static void main(String[] args) throws IOException {
    System.out.println("请输入学生信息(输入格式：学号-学生名字)：");
    FileOutputStream fos = new FileOutputStream("stu.txt");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    while (true) {
      if ("end".equals(str)) {
        System.out.println("学生信息输入完毕！");
        break;
      } else {
        fos.write((str + "\r\n").getBytes());
        System.out.println("请输入学生信息(输入格式：学号-学生名字)：");
        str = scanner.next();
      }
    }
    if (fos!=null)
      fos.close();
  }
}
