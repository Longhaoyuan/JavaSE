package abstractDemo;
/*
* 抽象方法定义的格式
*     public abstract 返回值类型 返回值类型 方法名（）；
* 抽象类的命名方法
*     public abstract   类名{}
*
* 注意事项：
*     1、抽象方法所在的类必须是抽象类，抽象类不一定有抽象方法
*     2、抽象类不能直接创建对象，必须要有一个子类来继承实现父类，创建子类对象进行使用
*     3、子类必须覆盖抽象父类的所有抽象方法
*         覆盖重写：去掉abstract   加上方法
* */
public class AbstractDemo01 {
  public static void main(String[] args) {
    Manager manager = new Manager(123,"Jack",546.156);
    Cooker cooker = new Cooker(464,"Tomy",456.21);
    Waiter waiter = new Waiter(546,"Edward",341.123);

    manager.printMessage();
    manager.work();
    cooker.printMessage();
    cooker.work();
    waiter.printMessage();
    waiter.work();
  }
}
