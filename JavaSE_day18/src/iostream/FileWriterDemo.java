package iostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("a.txt");

//    fw.write(97);
//    fw.write("你就是大憨批");
//    fw.write("你就是大憨批",3,2);
//    fw.write("你们就是算了吧".toCharArray(),2,3);
    fw.write("你们就是算了吧".toCharArray());
    //刷新缓冲区，写入数据，不需要等到close在刷新缓冲区，写数据
    fw.flush();
    //未调用close方法，数据只是保存到了缓冲区，并未写出到文件中。
    //不close，不会写入文件，只会在内存中
    fw.close();
  }
}
