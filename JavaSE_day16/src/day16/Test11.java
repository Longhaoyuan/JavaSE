package day16;

import day16.utils.DoubleColorBallUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 某公司组织年会，会议入场时有两个入口，在入场时每位员工都能获取一张双色球彩票，假设公司有100个员工，
 * 利用多线程模拟年会入场过程，并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。
 * */
public class Test11 {
  public static void main(String[] args) {
    MyRunnable myRunnable = new MyRunnable();
    new Thread(myRunnable, "后门").start();
    new Thread(myRunnable, "前门").start();
  }
}

class MyRunnable implements Runnable {
  public static int i = 0;
  public static int prevDoorNum = 0;
  public static int RearDoorNum = 0;
  public static List<Integer> list = new ArrayList<>();
  //生成员工的id，并打乱
  static {
    for (int j = 1; j < 101; j++) {
      list.add(j);
  }
    Collections.shuffle(list);
  }

  @Override
  public void run() {
    DoubleColorBallUtil doubleColorBallUtil = new DoubleColorBallUtil();
    while (true) {
      synchronized (list) {
        if (i>=list.size()) {
          if (Thread.currentThread().getName().equals("后门"))
            System.out.println("从后门入场的员工总共: " + RearDoorNum + "位员工");
          else if (Thread.currentThread().getName().equals("前门"))
            System.out.println("从前门入场的员工总共: " + prevDoorNum + "位员工");
          break;
        }else {
          Thread.currentThread().getName();
          if (Thread.currentThread().getName().equals("后门")) {
            System.out.println("编号为:" + list.get(i) + "的员工 从后门 入场! 拿到的双色球彩票号码是:" + doubleColorBallUtil.create());
            prevDoorNum++;
          } else if (Thread.currentThread().getName().equals("前门")) {
            System.out.println("编号为:" + list.get(i) + "的员工 从前门 入场! 拿到的双色球彩票号码是:" + doubleColorBallUtil.create());
            RearDoorNum++;
          }
          try {
            Thread.sleep(50);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          i++;
        }
      }
    }
  }
}
