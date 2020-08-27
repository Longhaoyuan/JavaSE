package day17.checkpoint01;

import java.io.File;

/*
 * 将C盘下a.txt文件删除
 * 将C盘下aaa文件夹删除,
 * 要求文件夹aaa是一个空文件夹。
 * */
public class Test05 {
  public static void main(String[] args) {
    File deleteA = new File("C:\\a.txt");
    File deleteAAA = new File("C:\\aaa");
    System.out.println("a.txt是否存在"+deleteA.exists());
    deleteA.delete();
    System.out.println("aaa文件夹是否存在"+deleteA.exists());
    deleteAAA.delete();

  }
}
