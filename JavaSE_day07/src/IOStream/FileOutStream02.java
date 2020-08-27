package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream02 {
  public static void main(String[] args) throws IOException {
    //获取数据源
    FileInputStream fis = new FileInputStream("2.gif");
    //写入git图名字和路径
    FileOutputStream fos = new FileOutputStream("copy_2.gif");

    byte[] bytes = new byte[1024];
    int len;
    while ((len=fis.read(bytes))>0){
      fos.write(bytes,0,len);
    }
    fis.close();
    fos.close();
  }
}
