package extendsDemo;

/*
* 面向对象的三大特征：继承、多态、封装
*   继承性：（共性抽取）
*       将多个子类（派生类）相同的属性和行为抽取出来形成一个单独的父类
*       （超类/基类），子类继承父类，可以拥有父类所有得私有的属性和方法
* 定义父类的格式：一个普通类
*     public class 父类的名字{}
* 定义子类继承的格式：
*   public class 子类名字 extends 父类名字{}
* */
public class TestExtends01 {
  public static void main(String[] args) {
    Student stu = new Student(12);
//    Teacher tc  = new Teacher();

//    tc.eat();
    stu.sleep();

    System.out.println("");
  }
}
