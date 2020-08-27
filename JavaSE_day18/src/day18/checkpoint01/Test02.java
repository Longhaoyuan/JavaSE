package day18.checkpoint01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 利用字节输出流一次写一个字节数组的方式向C盘的b.txt文件输出内容。
* */
public class Test02 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("b.txt");
    String str = "大憨批";
    byte[] bytes = str.getBytes();
    fos.write(bytes);
    fos.close();
  }
}
