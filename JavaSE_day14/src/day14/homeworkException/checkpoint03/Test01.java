package day14.homeworkException.checkpoint03;

import day14.homeworkException.checkpoint03.exceptiontag.NoMoneyException;

/*
* 请使用代码描述: 每一张借记卡(DebitCard)都有账号(accountNumber)和余额(money);
* 余额永远不能为负数
* 要求：当借记卡的余额为负数的时候需要抛出自定的异常
* */
public class Test01 {
  public static void main(String[] args) {
    String accountNumber = "456461315464";
//    double money = 14500;
    double money = -14500;

    DebitCard(accountNumber,money);
  }
  public static void DebitCard(String accountNumber,double money){
    if (money<0){
      throw new NoMoneyException(accountNumber+"的余额不能为负数"+money);
    }else
      System.out.println(accountNumber+"的用户，您的余额为："+money);
  }
}
