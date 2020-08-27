package day11.Checkpoint03;

import day11.Checkpoint03.goods.Goods;
import day11.Checkpoint03.goods.ShoppingCart;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    //添加商品
    ArrayList<Goods> list = new ArrayList<>();//商品列表
    ArrayList<ShoppingCart> shopCart = new ArrayList<>();//购物车
    Goods g1 = new Goods("001", "少林核桃", 15.5, "斤");
    Goods g2 = new Goods("002", "尚康饼干", 14.5, "包");
    Goods g3 = new Goods("003", "移动硬盘", 345.0, "个");
    Goods g4 = new Goods("004", "富康苹果", 20.0, "斤");
    list.add(g1);
    list.add(g2);
    list.add(g3);
    list.add(g4);
    System.out.println("\t\t欢迎使用超市购物系统");
    System.out.println("请输入您需要的操作：");
    System.out.println("1、购买商品\t\t2、结算并打印小票\t\t3、退出系统");
    Scanner scanner = new Scanner(System.in);
    int selectId = scanner.nextInt();
    while (true) {
      //购买界面
      if (selectId == 1) {
        System.out.println("------------------------------------");
        System.out.println("\t\t商品列表");
        System.out.println("商品id\t  名称\t    单价  计价单位");
        for (Goods good : list) {
          System.out.println(" " + good.getId() + "\t" + good.getName() + "\t" + good.getPrice() + "\t" + good.getUnit());
        }
        System.out.println("------------------------------------");
        System.out.println("请输入你需要购买的商品项（输入格式：商品id-购买数量），输入end表示结束。");
        String payGood = scanner.next();
        //购买商品操作
        while (true) {
//          System.out.println(payGood.substring(3, 3));
          if (payGood.length() > 4 && "-".equals(payGood.substring(3, 4))) {//输入正确，添加都购物车
            String id = payGood.substring(0, 3);
            Integer num = Integer.parseInt(payGood.substring(4, payGood.length()));
//            System.out.println(id + "," + num);
            //添加商品到购物车
            int flag = 0;
            int flagGood = 0;
            for (Goods goods : list) {
              if (id.equals(goods.getId())) {
                //判断商品是否已经在购物车上
                for (ShoppingCart shoppingCart : shopCart) {
                  if (id.equals(shoppingCart.getGood().getId())) {
                    flag++;
                    flagGood++;
                    shoppingCart.setNum(shoppingCart.getNum() + num);
                  }
                }
                if (flagGood == 0) {
                  flag++;
                  ShoppingCart shoppingCart = new ShoppingCart(goods, num, goods.getPrice() * num);
                  shopCart.add(shoppingCart);
                }
              }
            }
//            System.out.println(shopCart);
            if (flag == 0) {
              System.out.println("您输入的id不存在，请重新输入！！");
            }
          } else if ("end".equals(payGood)) {//退出
            System.out.println("购买结束");
            System.out.println("请输入您需要的操作：");
            System.out.println("1、购买商品\t\t2、结算并打印小票\t\t3、退出系统");
            selectId = scanner.nextInt();
            break;
          } else {
            System.out.println("你输入的姿势不对，请换个姿势再来（输入格式：商品id-购买数量）：");
          }
          payGood = scanner.next();

        }
      } else if (selectId == 2) {//结算并打印小票
        double sum = 0;
        int count = 0;
        System.out.println("   名称\t    售价   数量  金额");
        System.out.println("------------------------------------");
        for (ShoppingCart shoppingCart : shopCart) {
          System.out.println(" " + shoppingCart.getGood().getName() + "\t" + shoppingCart.getGood().getPrice() + "\t" +
            shoppingCart.getNum() + "\t " + shoppingCart.getSum());
          sum += shoppingCart.getSum();//总金额
          count += shoppingCart.getNum();//总件数
        }
        System.out.println("------------------------------------");
        System.out.println("共" + shopCart.size() + "项商品");
        System.out.println("共计：" + count + "件");
        System.out.println("共：" + sum + "元");
        System.out.println("1、购买商品\t\t2、结算并打印小票\t\t3、退出系统");
        selectId = scanner.nextInt();
      } else if (selectId == 3) {
        System.out.println("感谢您使用超市购物系统，欢迎下次光临,拜拜");
        break;
      } else {
        System.out.println("您的操作有误请重新选择");
        System.out.println("1、购买商品\t\t2、结算并打印小票\t\t3、退出系统");
        selectId = scanner.nextInt();
      }
    }
  }
}
