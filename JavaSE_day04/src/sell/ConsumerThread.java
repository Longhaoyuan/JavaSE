package sell;

import sell.entry.BaoZi;

public class ConsumerThread implements Runnable {
  private BaoZi bz;

  public ConsumerThread(BaoZi bz) {
    this.bz = bz;
  }

  @Override
  public void run() {
    Integer index = 0;
    while (true) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }//使用同步代码块保证线程同步
      synchronized (bz) {
        if (bz.getFlag() % 2 == 0) {
          if (index % 3 == 1) { //生产肉包
            bz.setName("肉包");
            bz.setPrice(1.0);
          } else if (index % 3 == 2) {
            //生产咸菜包
            bz.setName("咸菜包");
            bz.setPrice(0.5);
          } else {
            //生产豆沙包
            bz.setName("豆沙包");
            bz.setPrice(0.8);
          }
          index++; //更改标识符
          bz.setFlag(bz.getFlag() + 1);
          System.out.println("生产线程正在生产: " + bz.getName() + ";价格为: " + bz.getPrice());
          try {
            bz.notify();
            //等待之前把消费线程唤醒
            bz.wait();
            //生产完毕之后应该等待,消费线程执行
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
