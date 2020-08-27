package day17.checkpoint01;

import java.io.File;

/*
* 1. 创建文件对象关联到指定文件夹，比如：c:/aaa
* 2. 调用文件对象的listFiles方法获得文件数组
* 3. 遍历文件数组将每一个文件的名字输出到控制台
* */
public class Test08 {
  public static void main(String[] args) {
    File file = new File("C:\\aaa");
    File[] files = file.listFiles();
    for (File f : files) {
      System.out.println("里面包含的文件有："+f.getName());
    }
  }
}
