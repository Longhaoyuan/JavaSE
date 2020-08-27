package day14.homeworldmap.checkpoint02;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
 * 通过键盘录入五个人的姓名,每当录入一个人的姓名,随机给出一个成绩0, 100. 将姓名和成绩存储到Map集合中,姓名作为key,
 * 成绩作为value 统计五个学生的总分,最高分,最低分,平均分,并将总分,最高分,最低分,平均分 将结果输出到控制台格式为:
 * 总分=xxx,最高分=xxx,最低分=xxx,平均分=xxx
 * */
public class Test08 {
  public static void main(String[] args) {
    System.out.println("请输入学生名字：");
    Map<String, Integer> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    Random r = new Random();
    String name = "";
    Integer score = 0;
    for (int i = 1; i <= 5; i++) {
      System.out.println("第" + i + "位学生的名字:");
      name = scanner.nextLine();
      score = r.nextInt(101);
      map.put(name, score);
    }
    System.out.println(map);
    countScore(map);
  }

  public static void countScore(Map<String, Integer> map) {
    Integer sum = 0;
    Integer avg = 0;
    Integer hightScore = 0;
    String hightName = "";
    Integer lowerScore = 0;
    String lowerName = "";
    int i = 0;
    for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
      if (i == 0) {
        hightScore = stringIntegerEntry.getValue();
        lowerScore = stringIntegerEntry.getValue();
        i++;
      }
      sum += stringIntegerEntry.getValue();
      if (hightScore < stringIntegerEntry.getValue()) {
        hightScore = stringIntegerEntry.getValue();
        hightName = stringIntegerEntry.getKey();
      }else if (lowerScore > stringIntegerEntry.getValue()) {
        lowerScore = stringIntegerEntry.getValue();
        lowerName = stringIntegerEntry.getKey();
      }
    }
    avg=sum/map.size();
    System.out.println("总分："+sum);
    System.out.println("平均分："+avg);
    System.out.println("最高分：\n姓名:"+hightName+",成绩："+hightScore);
    System.out.println("最低分：\n姓名:"+lowerName+",成绩："+lowerScore);
  }
}
