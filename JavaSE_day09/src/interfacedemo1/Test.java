package interfacedemo1;

import interfacedemo1.impl.KeyBoard;
import interfacedemo1.impl.Mouse;

public class Test {
  public static void main(String[] args) throws InterruptedException {
    GodOfWar gow =new  GodOfWar();
    gow.start();
    System.out.println("------------------------");
    Thread.sleep(1000);
    gow.useUsb(new Mouse());
    System.out.println("------------------------");
    Thread.sleep(1000);
    gow.useUsb(new KeyBoard());
    System.out.println("------------------------");
    gow.close();
  }
}
