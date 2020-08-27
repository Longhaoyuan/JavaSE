package classDemo;
/*
* 成员变量和局部变量的区别：
*   成员变量：
*     1、定义在类中方法外，这个类都可以使用
*     2、存在堆内存的对象中
*     3、有默认值，不赋值也可以使用
*     4、随着对象的创建而创建，随着对象的销毁而销毁
*   局部变量：
*     1、定义在方法中，局部代码块中，只有再方法内或者局部的代码块中可以使用
*     2、存在栈内存的方法中
*     3、没有默认值 不赋值不能使用
*     4、随着方法的调用而存在，随着方法的结束而释放
* */
public class newClass1 {
  public static void main(String[] args) {
    GirlFried girlFried = new GirlFried();
    girlFried.name = "未知";
    girlFried.sex="女";
    girlFried.fiveSenses="五官端正";
    girlFried.money="经济独立";

    System.out.println("名字:"+girlFried.name+"\t性别："+girlFried.sex+
      "\n五官:"+girlFried.fiveSenses+"\t收入："+girlFried.money);
    girlFried.cook();

  }
}
