package day12.checkpoint03;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 斗地主案例
 * */
public class Test01 {
  public static void main(String[] args) {
    /*
     * 1: 准备牌操作
     */
    //1.1 创建牌盒 将来存储牌面的
    ArrayList<String> pokerBox = new ArrayList<String>();
    //1.2 创建花色集合
    ArrayList<String> colors = new ArrayList<String>();

    //1.3 创建数字集合
    ArrayList<String> numbers = new ArrayList<String>();

    //1.4 分别给花色 以及 数字集合添加元素
    colors.add("♥");
    colors.add("♦");
    colors.add("♠");
    colors.add("♣");

    for (int i = 2; i <= 10; i++) {
      numbers.add(i + "");
    }
    numbers.add("J");
    numbers.add("Q");
    numbers.add("K");
    numbers.add("A");
    //1.5 创造牌  拼接牌操作
    // 拿出每一个花色  然后跟每一个数字 进行结合  存储到牌盒中
    for (String color : colors) {
      //color每一个花色
      //遍历数字集合
      for (String number : numbers) {
        //结合
        String card = color + number;
        //存储到牌盒中
        pokerBox.add(card);
      }
    }
    //1.6大王小王
    pokerBox.add("小☺");
    pokerBox.add("大☠");
    // shuffer方法
    //2:洗牌
    Collections.shuffle(pokerBox);
    //3 发牌
    //3.1 创建 三个 玩家集合  创建一个底牌集合
    ArrayList<String> player1 = new ArrayList<String>();
    ArrayList<String> player2 = new ArrayList<String>();
    ArrayList<String> player3 = new ArrayList<String>();
    ArrayList<String> dipai = new ArrayList<String>();

    //遍历 牌盒  必须知道索引
    for (int i = 0; i < pokerBox.size(); i++) {
      //获取 牌面
      String card = pokerBox.get(i);
      //留出三张底牌 存到 底牌集合中
      if (i <3) {//存到底牌集合中
        dipai.add(card);
      } else {
        //玩家1   %3  ==0
        if (i % 3 == 0) {
          player1.add(card);
        } else if (i % 3 == 1) {//玩家2
          player2.add(card);
          //大王的话直接就是地主拿底牌
        } else {//玩家3
          player3.add(card);
          //大王的话直接就是地主拿底牌
        }
      }
    }
    //发牌完毕
    System.out.println("发牌完毕");
    System.out.println("令狐冲：" + player1);
    System.out.println("田伯光：" + player2);
    System.out.println("绿竹翁：" + player3);
    //抢地主
//    System.out.println(player1.contains("大☠")+" "+player2.contains("大☠")+" "+player3.contains("大☠"));
    if (player1.contains("大☠")){
      System.out.println("令狐冲拿到大王，做地主");
      player1.addAll(dipai);
    }else if (player2.contains("大☠")){
      System.out.println("田伯光拿到大王，做地主");
      //添加地主牌
      player2.addAll(dipai);
    }else if (player3.contains("大☠")){
      System.out.println("绿竹翁拿到大王，做地主");
      player3.addAll(dipai);
    }else {
      System.out.println("无默认做地主，请抢地主");
    }
    //看看
    System.out.println("令狐冲：" + player1);
    System.out.println("田伯光：" + player2);
    System.out.println("绿竹翁：" + player3);
    System.out.println("底牌：" + dipai);
  }
}
