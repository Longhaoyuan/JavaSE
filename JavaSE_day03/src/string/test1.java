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
public class test1 {
  public static void main(String[] args) {
    int week = 9;
    switch (week) {
      case 1:
        System.out.println("周一");
        break;
      case 2:
        System.out.println("周二");
        break;
      case 3:
        System.out.println("周三");
        break;
      case 4:
        System.out.println("周四");
        break;
      case 5:
        System.out.println("周五");
        break;
      case 6:
        System.out.println("周六");
        break;
      case 7:
        System.out.println("周日");
        break;
      default:
        System.out.println("当前的星期不存在");
        break;
    }
  }
}
