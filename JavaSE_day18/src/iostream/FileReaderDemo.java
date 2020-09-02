package iostream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("a.txt");

    System.out.println((char)fr.read());

    char[] chars = new char[1025];
    while (fr.read(chars)!=-1){
      System.out.println(new String(chars));
    }
    fr.close();
  }
}
