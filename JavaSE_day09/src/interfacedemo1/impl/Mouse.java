package interfacedemo1.impl;

import interfacedemo1.Usb;

public class Mouse implements Usb {
  @Override
  public void run() {
    System.out.println("鼠标已连接");
  }

  @Override
  public void close() {
    System.out.println("鼠标已关闭");
  }

  public void move() {
    System.out.println("鼠标移动中....");
  }
}
