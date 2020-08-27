package day18.checkpoint01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 利用字节流将C盘下的a.png图片复制到D盘下(文件名保存一致)
  要求： 1.一次读写一个字节的方式
* */
public class Test06 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("D:\\Test\\1.png");
    FileOutputStream fos = new FileOutputStream("copy_img.png");
    int read;
    //一个字节的操作
    while ((read = fis.read()) != -1) {
      fos.write(read);
    }
    //关闭流
    fis.close();
    fos.close();
  }
}
