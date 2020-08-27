package day12.checkpoint02;

import java.util.ArrayList;
import java.util.Collections;

public class Test03 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    //"a", "b", "c", "c", "a", "b", "b", "b", "a"
    boolean b = Collections.addAll(list, "a", "b", "c", "c", "a", "b", "b", "b", "a");
    System.out.println("b的出现的次数："+frequency(list,"b"));
  }
  public static int frequency(ArrayList<String> arr, String key){
    int count = 0;
    for (String str : arr) {
      if (str.equals(key)){
        count++;
      }
    }
    return count;
  }
}
