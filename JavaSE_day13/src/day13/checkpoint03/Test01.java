package day13.checkpoint03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；蓝色球号 码从1—16中选择.请随机生成一注双色球号码
 * */
public class Test01 {
  public static void main(String[] args) {
    Set<Integer> redBallSet = new HashSet<>();
    Set<Integer> buleBallSet = new HashSet<>();
    Random random = new Random();
    for (; redBallSet.size() < 6; ) {
      redBallSet.add(random.nextInt(33) + 1);
    }
    buleBallSet.add(random.nextInt(16) + 1);

    System.out.println("红色球：");
    for (Integer integer : redBallSet) {
      System.out.print(integer+" ");
    }
    System.out.println();
    System.out.println("蓝色球");
    for (Integer integer : buleBallSet) {
      System.out.print(integer);
    }
  }
}
