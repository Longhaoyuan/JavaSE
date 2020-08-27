package lamabaDemo;

import java.util.ArrayList;
import java.util.Random;

public class Romdom {
  public ArrayList<Integer> faHongBao(Integer money, Integer count) { /*** 随机红包规则： ** 随机红包范围：(当前剩余余额/当前剩余红包个数)*2 **/ //用于存储红包
    //
    Random r = new Random();
    int sum=count;
    ArrayList<Integer> redPack = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      int tempMoney = r.nextInt(money / count * 2) + 1;
      redPack.add(tempMoney);
      //最够一次随机红包不能等于总金额
      if (money != tempMoney) {
        //在总余额上减去这次发掉的红包金额
        money -= tempMoney;
        //红包剩余个数减1
        sum--;
      } else
        i--;//在返回循环
    }
    //剩下的钱留给最后一个红包
    redPack.add(money);
    return redPack;
  }
}
