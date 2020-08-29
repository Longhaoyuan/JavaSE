package day19;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 *请将其内容复制到b.txt文本文件中。然后读取b.txt文本文件中的内容并在控制台打印输出。
 * */
public class Test12 {
  public static void main(String[] args) {
    Path path = Paths.get("text", "a.txt");
    Path path2 = Paths.get("text", "b.txt");
    System.out.println(path.toAbsolutePath());
    BufferedReader br = null;
    try {
      //复制文件,文件存在将会报错
      if (!path2.toFile().exists())//文件不存在才能复制
        Files.copy(path, path2);
      br = Files.newBufferedReader(path2);
      String str = null;
      //读取文件
      while ((str = br.readLine()) != null) {
        System.out.println(str);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null)
          br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
