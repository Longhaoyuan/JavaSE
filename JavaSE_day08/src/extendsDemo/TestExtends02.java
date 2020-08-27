package extendsDemo;
/*
* 在继承的关系中，成员变量重名时，创建子类成员变量：
*     1、直接访问    子类.成员变量
*         等号左边是谁优先用谁，没有则向上找父类，父类没有就编译报错
*     2、间接访问    子类.成员变量
*         这个方法属于谁，就优先用谁，没有则向上找父类，父类没有就编译报错
* 区分子类方法中重名的三种变量：
*     局部变量            直接写变量名    通过就近原则查找
*     子类的成员变量       this.成员变量
*     父类的成员变量       super.成员变量
* 在继承关系中，成员变量重名时，创建子访问方法：
*     创建的对象是谁优先用谁，没有则向上找父类，父类没有就编译报错
* */
public class TestExtends02 {
  public static void main(String[] args) {
    Teacher t = new Teacher();
    Coder coder = new Coder();
    /*t.name = "马云";*/
    t.eat();
    t.sleep();
    t.teach();

    /*coder.name="合家欢";*/
    coder.sleep();
    coder.eat();
    coder.typeCode();
  }
}
