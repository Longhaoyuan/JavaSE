package day19;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*
* 项目根路径下有text.txt文件，内容如下：
我爱小米科技
123456
利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
123456
我爱小米科技
* */
public class Test10 {
  public static void main(String[] args) {
    BufferedReader br =null;
    BufferedWriter bw = null;

    List<String> list = new ArrayList<>(); //存储每一行的信息

    try {
      br = new BufferedReader(new FileReader("text.txt"));
      bw = new BufferedWriter(new FileWriter("text1.txt"));

      //读取文本的每一行信息
      String str = null;
      while ((str=br.readLine())!=null){
        list.add(str);
      }
      //反转list集合
      Collections.reverse(list);
      //写入文本text1.txt
      for (String s : list) {
        bw.write(s+"\r\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      //关闭流
      try {
        if (bw!=null)
          bw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (br!=null)
          br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
