package day17.checkpoint03;

import java.io.File;
import java.util.Scanner;

/*
 * 键盘录入一个文件夹路径，删除该路径下的文件夹。
 * 要求：文件夹中包含有子文件夹
 * */
public class Test02 {
  public static void main(String[] args) {
    System.out.println("请输入您需要删除的文件夹下的文件夹下：");
    String s = new Scanner(System.in).nextLine();
    File file = new File(s);
    deleteDir(file);
  }

  public static void deleteDir(File dir) {
    File[] files = dir.listFiles();
    for (File file : files) {
      if (file.isDirectory()) {
        deleteDir(file);
        System.out.println("开始删除" + file.getName());
        file.delete();
      }
    }
  }
}
