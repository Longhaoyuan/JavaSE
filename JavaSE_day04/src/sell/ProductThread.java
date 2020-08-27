package sell;

import sell.entry.BaoZi;

public class ProductThread implements Runnable{
  private BaoZi bz;

  public ProductThread(BaoZi bz) {
    this.bz = bz;
  }

  @Override
  public void run() {
    while (true){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      synchronized (bz){
        if (bz.getFlag()%2==1){
          bz.setFlag(bz.getFlag()+1);

          System.out.println("消费线程正在消费："+bz.getName()+";价格为："+bz.getPrice());
          try {
            bz.notify();
            bz.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
