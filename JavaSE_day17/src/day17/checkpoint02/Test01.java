package day17.checkpoint02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
*键盘录入一个文件路径，根据文件路径创建File对象 如果输入的文件路径对应的文件不存在，则创建该文件。
* 如果输入的文件路径对应的文件已经存在了，则获得文件大小并输出
* */
public class Test01 {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    //键盘输入文件路径
    String s = scanner.nextLine();
    //创建文件对象
    File file = new File(s);
    if (file.exists()){
      System.out.println(file.getName()+"的文件大小："+ file.length()+"字节");
    }else {
      System.out.println("文件不存在，创建文件....");
      file.createNewFile();
      System.out.println(file.getName()+"创建情况，是否创建成功："+file.exists());
    }
  }
}
