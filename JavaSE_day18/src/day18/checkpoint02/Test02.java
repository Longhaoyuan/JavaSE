package day18.checkpoint02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 在C盘下创建一个目录d1,在目录d1下创建创建若干个文本文件，并在每
 * 一个文本文件中添加若干内容。利用字节流 将该目录下的所有文件复制到C盘下的d2目录下。
 * */
public class Test02 {
  public static void main(String[] args) throws IOException {
    File file = new File("D:\\Test\\test02");
    File file2 = new File("D:\\Test\\test");
    //开始拷贝文件
    System.out.println("开始拷贝文件");
    forEachFile(file,file2);
  }

  public static void forEachFile(File dir1, File dir2) throws IOException {
    File[] files = dir1.listFiles();
    int len = 0;
    byte[] b = new byte[1024];
    //遍历文件夹
    for (File file : files) {
      if (file.isFile()) {
        System.out.println("开始拷贝"+file.getName()+"到"+dir2.getAbsolutePath());
        //拷贝文件
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(dir2.getAbsolutePath() + "\\" + file.getName());
        while ((len = fis.read(b)) != -1) {
          fos.write(b, 0, len);
        }
        //关闭IO流
        fis.close();
        fos.close();
      } else if (file.isDirectory()) {
        //递归遍历文件夹和拷贝
        forEachFile(file,dir2);
      }
    }
  }
}
