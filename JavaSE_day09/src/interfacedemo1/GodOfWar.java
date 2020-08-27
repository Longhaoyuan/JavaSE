package interfacedemo1;

import interfacedemo1.impl.KeyBoard;
import interfacedemo1.impl.Mouse;

public class GodOfWar {
  public void start() throws InterruptedException {
    System.out.println("笔记本正在开机");
    Thread.sleep(1000);
    System.out.println("开机成功，耗时1秒");
  }
  public void useUsb(Usb usb){
    usb.run();
    if (usb instanceof KeyBoard){
      ((KeyBoard) usb).type();
    }
    else if (usb instanceof Mouse){
      ((Mouse) usb).move();
    }
    usb.close();
  }
  public void close(){
    System.out.println("笔记本已关机");
  }
}
