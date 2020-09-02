package iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutSrewa {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("a.txt");

//    fos.write(98);
//    fos.write("你失望了吧".getBytes());
    fos.write("013145".getBytes(),0,5);
  }
}
