package day17.checkpoint01;

import java.io.File;

/*
* 1.判断File对象是否文件,是文件则输出：xxx是一个文件，否则输出：xxx是不是一个文件。
* 2.判断File对象是否文 件夹,是文件夹则输出：xxx是一个文件夹，否则输出：xxx是不是一个文件夹。(xxx是文件名或文件夹名)
* */
public class Test07 {
  public static void main(String[] args) {
    File f1 = new File("C:\\aaa");
    File f2 = new File("C:\\a.txt");

    System.out.println(f1.getName()+"是否是文件夹："+f1.isDirectory());
    System.out.println(f1.getName()+"是否是文件："+f1.isFile());
    System.out.println(f2.getName()+"是否是文件夹："+f2.isDirectory());
    System.out.println(f2.getName()+"是否是文件："+f2.isFile());
  }
}
