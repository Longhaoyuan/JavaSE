package arrayLIstDemo;

import java.util.ArrayList;
import java.util.Random;

/*
 *
 * 集合里存储基本数据类型，泛型为基本类型的包装类
 * */
public class Demo3 {
  public static void main(String[] args) {
    Random rd = new Random();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(rd.nextInt(100));
    }
    System.out.print("{");
    for (int i = 0; i < list.size(); i++) {
      if (i == list.size() - 1) {
        System.out.println(list.get(i) + "}");
      } else
        System.out.print(list.get(i) + "·");
    }
  }
}
