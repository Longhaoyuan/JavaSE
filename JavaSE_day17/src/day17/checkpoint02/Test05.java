package day17.checkpoint02;

import java.io.File;
import java.util.Scanner;

/*
 * 键盘录入一个文件夹路径，删除该路径下的文件夹。
 *   要求：
 *     录入的文件夹里面要有多个文件，不能包含有子文件夹。
 *   提示：
 *     如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
 * */
public class Test05 {
  public static void main(String[] args) {
//    File file = new File("D://Test");
    System.out.println("请输入您需要删除的文件夹下的所有文件夹：");
    String str = new Scanner(System.in).next();
    File file = new File(str);
    deleteFiles(file);
  }

  public static void deleteFiles(File dir) {
    File[] files = dir.listFiles();
    //循环打印
    for (File file : files) {
      if (file.isFile()) {
        System.out.println("删除文件：" + file.getName());
        file.delete();
      } else {
        deleteFiles(file);
        System.out.println("删除文件夹：" + file.getName());
        file.delete();
      }
    }
  }
}
