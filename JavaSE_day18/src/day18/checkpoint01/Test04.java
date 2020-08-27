package day18.checkpoint01;

import java.io.FileInputStream;
import java.io.IOException;

/*
*
* 利用字节输入流读取C盘文件a.txt的内容，使用循环读取，
* 一次读取一个字节，直到读取到文件末尾。将读取的字 节输出到控制台
* */
public class Test04 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("c.txt");
    int read;
    while ((read=fis.read())!=-1){
      System.out.print((char) read);
    }
    fis.close();
  }
}
