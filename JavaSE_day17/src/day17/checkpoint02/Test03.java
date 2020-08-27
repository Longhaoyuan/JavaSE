package day17.checkpoint02;

import java.io.File;

/*
 * 递归遍历将指定文件夹的所有文件(包括所有子文件夹的文件)的全路径输出在控制台。
 * */
public class Test03 {
  public static void main(String[] args) {
    File file = new File("D:\\作业\\第四组-20200813\\周罗校\\homeWorld");
    forEachFiles(file);
  }

  //遍历所有的文件路径
  public static void forEachFiles(File file) {
    File[] files = file.listFiles();
    for (File f : files) {
      if (f.isFile()) {
        System.out.println(f.getName() + "的路径是：" + f.getAbsolutePath());
      } else if (f.isDirectory()) {
        System.out.println(f.getName() + "的路径是：" + f.getAbsolutePath());
        forEachFiles(f);
      }
    }
  }
}
