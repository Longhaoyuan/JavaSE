package setdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("aaa");
    set.add("bbb");
    set.add("ccc");
    set.add("ddd");
    set.stream().forEach(System.out::println);
  }
}
