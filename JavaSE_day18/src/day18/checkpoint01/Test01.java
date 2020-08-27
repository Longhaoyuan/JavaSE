package day18.checkpoint01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *利用字节输出流一次写一个字节的方式向C盘的a.txt文件输出内容。
 *  1.创建字节输出流FileOutputStream对象并指定文件路径。
 * 2.调用字节输出流的write(int byte)方法写出数据
 * */
public class Test01 {
  public static void main(String[] args) throws IOException {
   /* File file = new File("a.txt");
    System.out.println(file.getAbsolutePath());*/
    FileOutputStream fos = new FileOutputStream("a.txt");
    fos.write(97);
    fos.close();
  }
}
