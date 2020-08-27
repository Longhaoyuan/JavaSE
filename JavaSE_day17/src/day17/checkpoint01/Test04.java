package day17.checkpoint01;

import java.io.File;

/*
* 在C盘下创建一个名为ccc的文件夹，要求如下：
* 1.ccc文件夹中要求包含bbb子文件夹
* 2.bbb子文件夹要求包含aaa文件夹
* */
public class Test04 {
  public static void main(String[] args) {
    File file = new File("C:\\ccc\\bbb\\aaa");
    if (!file.exists()){
      file.mkdirs();//创建多个文件夹
    }
  }
}
