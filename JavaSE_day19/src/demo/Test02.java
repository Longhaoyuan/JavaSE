package demo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Test02 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("b.txt"));

    Map<Integer,String> map = new HashMap<>();
    String str = null;
    while ((str = br.readLine())!=null){
      //不读.
      String[] split = str.split("\\.");
      map.put(Integer.valueOf(split[0]),split[1]);
    }
    //读完关闭，防止写回去源文本时的空白
    br.close();
    BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
    //重新写并排序
    for (Integer i = 1; i <10 ; i++) {
      bw.write(i+"."+map.get(i));
      bw.newLine();
      bw.flush();
    }
    bw.close();
  }
}
