package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream01 {
  public static void main(String[] args) throws IOException {
    //使用File对象创建流对象
//    File file = new File("a.txt");
//    FileOutputStream fos = new FileOutputStream(file);

    //使用文件名称创建对象
    /*FileOutputStream fos1  = new FileOutputStream("b.txt");//默认不追加，每次写入覆盖就的内容，false*/
    FileOutputStream fos1  = new FileOutputStream("b.txt",true);
    //写字节数据
    /*fos1.write(66);
    fos1.write(67);
    fos1.write(68);*/
    //写入字节数组数据
   /* byte[] bytes = "猪笼草".getBytes();
    fos1.write(bytes);
    fos1.write("\r\n".getBytes());*/
    FileInputStream fis = new FileInputStream("b.txt");
    byte[] data = new byte[1024 * 4];
    /*StringBuilder sb = new StringBuilder();*/
    while(fis.read(data) > 0) {
      System.out.println(new String(data,"UTF8"));
      /*sb.append(new String(data,"utf-8")); */// 指定编码格式，避免乱码
    }
   /* System.out.println(sb.toString());*/
    fos1.close();
    fis.close();
  }
}
