package day17.checkpoint02;

import java.io.File;

/*
 * 1. 创建一个类实现文件过滤器FileFilter接口并重新accept方法，在该方法根据传入的
 *   文件判断是否文件Java文 件，如果是则返回true，否则返回false。
 * 2. 根据文件夹路径字符串创建文件对象和创建文件过滤器接口实现类对象
 * 3. 调用文件对象的listFiles(FileFilterf) 方法，传递文件过滤器实现类对象。
 * 4. 遍历文件数组，输入每一个文件对象
 * */
public class Test04 {
  public static void main(String[] args) {
    File file = new File("D:\\作业\\第四组-20200813\\周罗校\\homeWorld");
    printDir(file);
  }

  public static void printDir(File dir) {
    // 匿名内部类方式,创建过滤器子类对象
    File[] files = dir.listFiles(n -> {
      return n.getName().endsWith(".java");
    });
    //循环打印
    for (File file : files) {
      if (file.isFile()) {
        System.out.println(file + "文件是java文件");
      } else {
        printDir(file);
      }
    }
  }
}
