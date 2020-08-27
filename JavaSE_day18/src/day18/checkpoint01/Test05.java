package day18.checkpoint01;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 利用字节输入流读取C盘文件b.txt的内容，使用循环读取，一次读取一个字节数组，
 * 直到读取到文件末尾，将读取 到的字节数组转换成字符串输出到控制台。
 * */
public class Test05 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("b.txt");
    int len;
    byte[] bytes = new byte[2];
    while ((len = fis.read(bytes)) != -1) {
      System.out.print(new String(bytes));
    }
    //必须关闭输入流
    fis.close();
  }
}
