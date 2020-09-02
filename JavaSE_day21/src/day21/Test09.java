package day21;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
* 有一个用于记录程序运行次数的属性文件，运行次数保存在一个count属性中，当到达指定次数3次时，则提示:"程序使
用次数已满，请续费"
1. 开发思路：
1). 判断属性文件是否存在，如果不存在则创建一个。
2). 使用load()方法加载文件中所有的属性到Properties集合中。
3). 取得count属性，如果count属性为null，则设置count属性为0。
4). 将取得的字符串转成整型，并判断是否大于等于3次，大于3次则到期，退出。
5). 小于3则输出运行次数，并加1。
6). 将整数转成字符串后存到Properties集合中。
7). 创建输出流，并用store方法保存到文件中。
* */
public class Test09 {
  @Test
  public  void test(){
    File file = new File("./src/day21/count.txt");
    System.out.println(file.getAbsolutePath());
    Integer count;
    if (!file.exists()) {//文件不存在
      try {
        file.createNewFile();//创建文件
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    Properties properties = new Properties();
    try {
      properties.load(new FileReader(file));
      if (properties.get("count") == null) {
        System.out.println("程序没运行过...");
        properties.setProperty("count", "0");
        store(properties, file);
      }
      if ((count = Integer.parseInt((String) properties.get("count"))) <= 3) {
        count++;
        properties.setProperty("count", "" + count);
        store(properties, file);
      } else if ((count = Integer.parseInt((String) properties.get("count"))) > 3) {
        System.out.println("序使用次数已满，请续费");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void store(Properties properties, File file) {
    FileWriter fw = null;
    try {
      fw = new FileWriter(file);
      Set<String> set = properties.stringPropertyNames();
      for (String s : set) {
        fw.write(s + "=" + properties.getProperty(s) + "\r\n");
        fw.flush();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
