package day18.checkpoint01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 利用字节输出流对象往C盘下c.txt文件输出5句：”i love java” 要求：
* 1.不能覆盖文件中原有的内容
* 2.每一句输出各占一行
* */
public class Test03 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("c.txt",true);
    fos.write("i\r\n".getBytes());
    fos.write("love\r\n".getBytes());
    fos.write("java\r\n".getBytes());
    fos.close();
  }
}
