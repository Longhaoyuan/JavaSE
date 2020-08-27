package day17.checkpoint01;

import java.io.File;

/*
*   1.绝对路径创建文件对象：使用File类一个参数的构造方法。
 * 2.相对路径创建文件对象：使用File类两个参数的构造方法。
* */
public class Test01 {
  public static void main(String[] args) {
    File file1 = new File("D:\\aaa.txt");
    System.out.println(file1);

    File file = new File("D:\\");
    File file2 = new File(file,"bbb.txt");
    System.out.println(file2);
  }
}
