package day13.checkpoint02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* 编写一个程序，键盘录入多个数字,直到录入-1结束.将录入的重复数据去除,
* 计算这些不重复数据的总和和平均值
* */
public class Test08 {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入多个数字：");
    Integer num=scanner.nextInt();
    while (num!=-1){
      set.add(num);
      num=scanner.nextInt();
    }
    System.out.println("这些数字分别为：");
    Integer sum=new Integer(0);
    Integer avg;
    for (Integer integer : set) {
      System.out.print(integer+" ");
      sum+=integer;
    }
    avg = sum/set.size();
    System.out.println("\n总和："+sum);
    System.out.println("平均数："+avg);
  }
}
