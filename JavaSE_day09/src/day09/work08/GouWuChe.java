package day09.work08;

import java.util.ArrayList;

public class GouWuChe {
  ArrayList<Goods> list=new ArrayList<Goods>();

  public void addGoods(Goods goods){
    list.add(goods);
    System.out.println("加入    "+goods.getName()+"  成功" );
  }
  public void showGoods(){
    System.out.println("============打印商品===========");
    System.out.println("您选购的商品为：");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).getId()+","+list.get(i).getName()+","+list.get(i).getPrice());
    }
  }
  public void tatal(){
    System.out.println("--------------------------");
    double count = 0;
    for (int i = 0; i < list.size(); i++) {
     count+=list.get(i).getPrice();
    }
    System.out.println("原  价为："+count+"元");
    System.out.println("原  价为："+count*0.8+"元");
  }

}
