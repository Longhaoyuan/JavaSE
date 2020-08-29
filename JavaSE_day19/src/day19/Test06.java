package day19;

import java.io.*;

/*
* 1. 创建文件字节输出流关联目标文件
* 2. 根据文件字节输出流创建转换输出流对象，并指定编码字符集为：gbk
  3. 调用流对象的方法将字符串写出到文件中。
  4. 关闭流并释放资源。
* */
public class Test06 {
  public static void main(String[] args) {
    FileInputStream fis = null;
    InputStreamReader isr = null;
    try {
      //创建文件字节流对象
      fis = new FileInputStream("c.txt");
      //创建转换输出流对象
      isr = new InputStreamReader(fis, "gbk");
      char[] chars = new char[1024];
      int len = 0;
      while (true) {
        len = isr.read(chars);
        if (len == -1)
          break;
        System.out.print(new String(chars));
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {

        if (isr != null)
          isr.close();
      } catch (IOException e) {
        e.printStackTrace();
        if (fis != null) {
          try {
            fis.close();
          } catch (IOException e1) {
            e1.printStackTrace();
          }
        }
      }
    }
  }
}
