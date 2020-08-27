package day17.checkpoint03;

import java.io.File;
import java.util.Scanner;

/*
*
* 从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印
* 例如: aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,
* 有eee这样的文件夹,eee中有fff.txt和ggg.txt,
* 打印出层级来 aaa bbb.txt ccc.txt ddd.txt eee fff.txt ggg.txt
* */
public class Test04 {
  public static void main(String[] args) {
    System.out.println("请输入您需要的文件夹中的路径：");
    String next = new Scanner(System.in).next();
    File file = new File(next);
    printDir(file);
  }
  public static void  printDir(File dir){
    File[] files = dir.listFiles();
    for (File file : files) {
      if (file.isDirectory()){
        //先打印文件夹名
        System.out.println(file.getName());
        //在递归遍历文件夹
        printDir(file);
      }else if (file.isFile()){
        System.out.println(file.getName());
      }
    }
  }
}
