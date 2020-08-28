package day18.checkpoint01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 用字节流将C盘下的a.png图片复制到D盘下(文件名保存一致)
 * 要求：一次读写一个字节数组的方式进行复制
 * */
public class Test07 {
  public static void main(String[] args) {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      fis = new FileInputStream("D:\\Test\\1.png");
      fos = new FileOutputStream("a.png");
      //读取文件字节大小a
      int len;
      //每次读取字节数组
      byte[] b = new byte[1024];
      while ((len = fis.read(b)) != -1) {
        fos.write(b, 0, len);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fos != null)
          fos.close();
        if (fis != null)
          fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
