package EqualsDemo;

import java.util.Objects;

/*
* ==比较：
*     1、基本类型比较的是内容
*     2、引用类型比较的是地址hashcode
* equals:
*     1、没有重写toString方法的话只能比较地址值
*     2、重写toString方法后比较的就是内容
*
* */
public class EqualDemo01 {
  public static void main(String[] args) {
    String a= "abc";
    String b= "abc";

//    System.out.println(a==b);
//    System.out.println(a.equals(b));
    //避免空指针异常
    System.out.println(Objects.equals(a, b));
    if (a!=null){
//      System.out.println(a.equals(b));
    }
  }
}
