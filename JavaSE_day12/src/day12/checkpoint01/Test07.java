package day12.checkpoint01;

import day12.checkpoint01.impl.InterImpl;
import day12.checkpoint01.impl.InterImpl2;

public class Test07 {
  public static void main(String[] args) {
    InterImpl inter = new InterImpl();
    inter.show("法克斯");

    InterImpl2 impl2 = new InterImpl2<>();
    impl2.show((Integer) 1456);
  }
}
