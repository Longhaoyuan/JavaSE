package day17.checkpoint01;

import java.io.File;

/*
* 获取C盘aaa文件夹中b.txt文件的文件名，文件大小，
* 文件的绝对路径和父路径等信息，并将信息输出在控制台
* */
public class Test06 {
  public static void main(String[] args) {
    File file = new File("C:\\aaa\\b.txt");
    System.out.println("文件名："+file.getName());
    System.out.println("文件的大小："+file.length());
    System.out.println("文件的绝对路径:"+file.getAbsolutePath());
    System.out.println("文件的父路径:"+file.getParent());
    System.out.println("文件的绝对路径"+file.getAbsoluteFile());

  }
}
