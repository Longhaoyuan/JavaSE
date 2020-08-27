package day17.checkpoint01;

import java.io.File;
import java.io.IOException;

/*
* 1. 使用绝对路径创建对象关联到c盘的a.txt。
* 2. 通过文件对象方法判断文件是否存在。
* 3. 不存在则调用创建文件的方法创建文件。
* */
public class Test02 {
  public static void main(String[] args) throws IOException {
    File file = new File("D:\\a.txt");
    if (!file.exists()){
      System.out.println(file.exists());
      //文件不存在，创建文件
      boolean mkdir = file.createNewFile();
      System.out.println("文件是否存在："+mkdir);
    }
  }
}
