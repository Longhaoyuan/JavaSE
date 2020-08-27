package string;

/*
 *
 * switch的注意事项：
 *   1、case的编号不能重复
 *   2、case事件执行后建议都加上，break结合switch
 *   3、switch 小括号的只可以传：byte、short、char、int、枚举、字符串
 * case穿透：当匹配的的case语句体没有break的时候，则不管下一个case是
 * 否满足都会执行下一个case的语句体指定遇到的break；才会结束整个语句
 * */
public class test2 {
  public static void main(String[] args) {
    int week = 1;

    switch (week) {
      case 1:
      case 2:
        System.out.println("吃包子");
        break;
      case 3:
      case 4:
        System.out.println("吃馒头");
        break;
      case 5:
      case 6:
        System.out.println("吃脚丫子");
        break;
      case 7:
        System.out.println("不吃");
        break;
      default:
        System.out.println("当前的星期不存在");
        break;
    }
  }
}
