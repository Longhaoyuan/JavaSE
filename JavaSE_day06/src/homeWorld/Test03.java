package homeWorld;

import java.util.Random;

public class Test03 {
  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      System.out.println(random.nextInt(10)+1);
    }
  }
}
