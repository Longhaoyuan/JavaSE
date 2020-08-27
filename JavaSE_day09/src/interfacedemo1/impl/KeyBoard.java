package interfacedemo1.impl;

import interfacedemo1.Usb;

public class KeyBoard implements Usb {
  @Override
  public void run() {
    System.out.println("键盘已连接");
  }

  @Override
  public void close() {
    System.out.println("键盘已关闭");
  }
  public void type() {
    System.out.println("打字中....");
  }
}
