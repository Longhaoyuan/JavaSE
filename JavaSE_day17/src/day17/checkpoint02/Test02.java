package day17.checkpoint02;

import java.io.File;
import java.util.Scanner;

/*
* 键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
* 如果是文件，则输出文件的大小
* 如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
* */
public class Test02 {
  public static void main(String[] args) {
    System.out.println("请输入您需要统计的文件夹大小：");
    Scanner scanner = new Scanner(System.in);
    //键盘输入文件路径
    String s = scanner.nextLine();
    //创建文件对象
    File file = new File(s);
    if (file.isFile()){
      System.out.println(file.getName()+"是文件，大小为："+file.length());
    }else if(file.isDirectory()){
      File[] files = file.listFiles();
      long countSize = 0;
      for (File f : files) {
        if (f.isFile()){
          countSize += f.length();
        }
      }
      System.out.println(file+"是文件夹，其下的所有文件大小是："+countSize+"字节");
    }
  }
}
