package day14.homeworldmap.checkpoint03;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
*
* 有四种水果(苹果，香蕉，西瓜，橘子)
* 1. 给每种水果设定一个商品号，商品号是8个0-9的随机数，商品号码不能重复。
* 2. 根据商品号查询对应的商品。 如果查不到输出：“查无此商品”
*    如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”
* */
public class Test03 {
  public static void main(String[] args) {
    Map<String,String> fruitMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    String[] fruit = {"苹果","香蕉","西瓜","橘子"};
    int index = 0;
    String fruitId = createFruitId();
    while (fruitMap.size()<4){
      if (!fruitMap.containsKey(fruitId)){
        fruitMap.put(fruitId,fruit[index]);
        index++;
      }else
        fruitId = createFruitId();
    }
    System.out.println(fruitMap);
    System.out.println("请输入您需要查询的商品");
    String str = scanner.nextLine();
    while (true){
      if (fruitMap.containsKey(str)){
        System.out.println("商品号："+str+"，查询到对应的商品为："+fruitMap.get(str));
        break;
      }else{
        System.out.println("您查询的商品Id不存在，请重新输入：");
        str = scanner.nextLine();
      }
    }
  }
  public static String createFruitId(){
    Random random = new Random();
    String fruitId= "";
    for (int i = 0; i < 8; i++) {
      fruitId+=random.nextInt(10);
    }
    return fruitId;
  }
}
