package day19;

import java.io.*;
/*
* 利用高效字节输入流和高效字节输出流完成文件的复制。
要求：
1.将C盘下的c.png文件复制到D盘下
2.一次读写一个字节数组方式复制
* */
public class Test03 {
  public static void main(String[] args) {
    BufferedInputStream bis = null;
    BufferedOutputStream bos = null;
    try {
      bis = new BufferedInputStream(new FileInputStream("D:\\Test\\1.png"));
      bos = new BufferedOutputStream(new FileOutputStream("copy_img.png"));
      byte[] bytes =new  byte[1024*3];
      int len = 0;
      while ((len=bis.read(bytes))!=-1){
        bos.write(bytes,0,len);
      }
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
      if (bis!=null) {
        try {
          bos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
