package day19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 利用高效字节输出流往C盘下的e.txt文件写出
* 一个字节数组数据，如写出：”i love java”
* */
public class Test02 {
  public static void main(String[] args) {
    BufferedOutputStream bos = null;
    try {
      bos= new BufferedOutputStream(new FileOutputStream("e.txt"));
      bos.write("i love you".getBytes());
    } catch (Exception e) {
      e.printStackTrace();
    }finally {
      try {
        if (bos!=null){
          bos.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
