package day19;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
 * */
public class Test01 {
  public static void main(String[] args) {
    BufferedOutputStream bos = null;
    try {
      bos = new BufferedOutputStream(new FileOutputStream("d.txt"));
      bos.write(97);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bos!=null)
        bos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
