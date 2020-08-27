package day12.checkpoint01;

import java.util.ArrayList;

public class Test05 {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.add("xiaomi");
    arrayList.add("xiaomi2");
    arrayList.add("xiaomi3");
    arrayList.add("xiaomi4");
    for (String s : arrayList) {
      System.out.print(s+" ");
    }
  }
}
