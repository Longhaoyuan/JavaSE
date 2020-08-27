package day17.checkpoint02;

import java.io.File;
import java.util.Scanner;

/*
 * 1. 创建键盘录入对象Scanner
 * 2. 定义字符串接收用户输入的文件夹路径
 * 3. 根据文件夹路径创建文件对象
 * 4. 定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，返回long类型数值表示文件夹的大小。
 * 5. 调用calculate方法传入文件夹对象，在该方法内部获得文件夹中所有文件，得到一个文件数组，定义一个变
 * 量size累加每一个文件的大小，遍历文件数组，判断是否是文件，如果是文件则获得文件大小并累加到变量
 * size中，如果是文件夹，继续递归调用当前方法。
 * */
public class Test06 {
  public static void main(String[] args) {
    System.out.println("请输入你所需要统计的文件夹大小：");
    String str = new Scanner(System.in).nextLine();
    File file = new File(str);
    System.out.println(file.exists());
    long calculate = calculate(file);
    System.out.println("您所需要统计的文件夹大小为：" + calculate + "字节");
  }

  public static long calculate(File dor) {
    long size = 0;
    File[] files = dor.listFiles();
    for (File file : files) {
      if (file.isFile())
        size+=file.length();
      else if(file.isDirectory())
        //递归子文件夹的大小
        size+=calculate(file);
    }
    return size;
  }
}
