package day18.checkpoint02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 创建一个空的Properties集合
 * 2. 读取数据到集合中
 * 3. 遍历集合，获取到每一个key
 * 4. 判断 当前的key 是否为 "lisi"，如果是就把"lisi"的值 设置为100
 * 5. 把集合中所有的信息 ，重新存储到文件中
 * */
public class Test04 {
  public static void main(String[] args) throws IOException {
    Properties properties =new Properties();
    FileInputStream fis = new FileInputStream("score.txt");
    //获取文件里面的属性键值对
    properties.load(fis);
    Set<String> set = properties.stringPropertyNames();
    for (String key : set) {
//      System.out.println(key+"="+properties.get(key));
      if (key.equals("lisi")){
        System.out.println("存在lisi的key，修改文件");
        //设置lisha
        properties.setProperty(key,"100");

        set=properties.stringPropertyNames();
        //重写写入文件
        FileOutputStream fileOutputStream = new FileOutputStream("score.txt");
        for (String s : set) {
          fileOutputStream.write((s+"="+properties.get(s)+"\r\n").getBytes());
        }
      }
    }
  }
}
