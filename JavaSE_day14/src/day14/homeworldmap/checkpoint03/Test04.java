package day14.homeworldmap.checkpoint03;

import java.util.*;

/*
 * 完成课上斗地主洗牌发牌案例(牌需要排序)
 * */
public class Test04 {
  public static void main(String[] args) {
    /*
     * 1: 准备牌操作
     */
    //1.1 创建牌盒 将来存储牌面的
    Map<Integer, String> pokerBox = new HashMap<>();
    //1.2 创建花色集合
    ArrayList<String> colors = new ArrayList<String>();

    //1.3 创建数字集合
    ArrayList<String> numbers = new ArrayList<String>();

    //1.4 分别给花色 以及 数字集合添加元素
    colors.add("♦");
    colors.add("♣");
    colors.add("♥");
    colors.add("♠");

    for (int i = 3; i <= 10; i++) {
      numbers.add(i + "");
    }
    numbers.add("J");
    numbers.add("Q");
    numbers.add("K");
    numbers.add("A");
    numbers.add("2");
    //1.5 创造牌  拼接牌操作
    // 拿出每一个花色  然后跟每一个数字 进行结合  存储到牌盒中
    int index = 0;
    for (int i = 0; i < numbers.size(); i++) {
      for (int j = 0; j < colors.size(); j++) {
        String card = colors.get(j) + numbers.get(i);
        pokerBox.put(index, card);
        index++;
      }
    }
    //1.6大王小王
    pokerBox.put(53, "小☺");
    pokerBox.put(54, "大☠");
    //生成底牌随机数
    int i = 1;
    //获取所有key
    Set<Integer> integers = pokerBox.keySet();
    List<Integer> list = new ArrayList<>(integers);
    //生成随机的牌的键
    Collections.shuffle(list);
    //牌的键
    List<Integer> p1Keys = new ArrayList<>();
    List<Integer> p2Keys = new ArrayList<>();
    List<Integer> p3Keys = new ArrayList<>();
    List<Integer> DipaiKeys = new ArrayList<>();
    //发牌
    for (Integer integer : list) {
      if (i <= 3) {
        DipaiKeys.add(integer);
      } else if (i % 3 == 0) {
        p1Keys.add(integer);
      } else if (i % 3 == 1) {
        p2Keys.add(integer);
      } else if (i % 3 == 2) {
        p3Keys.add(integer);
      } else {
        System.out.println("出错了");
      }
      i++;
    }
    //根据key获取map集合
    Map<Integer, String> player1 = getMap(p1Keys, pokerBox);
    Map<Integer, String> player2 = getMap(p2Keys, pokerBox);
    Map<Integer, String> player3 = getMap(p3Keys, pokerBox);
    Map<Integer, String> dipai = getMap(DipaiKeys, pokerBox);
    //发牌完毕
    System.out.println("发牌完毕");
    //排序,返回list集合
    List<String> p1 = sortPoker(player1);
    List<String> p2 = sortPoker(player2);
    List<String> p3 = sortPoker(player3);
    System.out.println("令狐冲：" + p1);
    System.out.println("田伯光：" + p2);
    System.out.println("绿竹翁：" + p3);
    //抢地主
//    System.out.println(player1.contains("大☠")+" "+player2.contains("大☠")+" "+player3.contains("大☠"));
    if (player1.containsValue("大☠")) {
      System.out.println("令狐冲拿到大王，做地主");
      player1.putAll(dipai);
      p1 = sortPoker(player1);
    } else if (player2.containsValue("大☠")) {
      System.out.println("田伯光拿到大王，做地主");
      //添加地主牌
      player2.putAll(dipai);
      p2 = sortPoker(player2);
    } else if (player3.containsValue("大☠")) {
      System.out.println("绿竹翁拿到大王，做地主");
      player3.putAll(dipai);
      p3 = sortPoker(player3);
    } else {
      System.out.println("无默认做地主，请抢地主");
    }
    //看看
    System.out.println("令狐冲：" + p1 );
    System.out.println("田伯光：" + p2 );
    System.out.println("绿竹翁：" + p3 );
    System.out.println("底牌：" + sortPoker(dipai));
  }

  //牌子排序的方法
  public static List<String> sortPoker(Map<Integer, String> map) {
    Set<Integer> integers = map.keySet();
    List<Integer> list = new ArrayList<>();
    list.addAll(integers);
    Collections.sort(list);
    //排序
    List<String> player = new ArrayList<>();
    for (Integer integer : list) {
      player.add(map.get(integer));
    }
    return player;
  }
  //根据key获取value的方法
  public static Map<Integer, String> getMap(List<Integer> list, Map<Integer, String> pokers) {
    Map<Integer, String> map = new HashMap<>();
    for (Integer integer : list) {
      map.put(integer, pokers.get(integer));
    }
    return map;
  }
}
