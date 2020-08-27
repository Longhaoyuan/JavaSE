package interfacedemo;

import interfacedemo.impl.InterFaceDemoImpl;
import interfacedemo.impl.InterFaceDemoImpl2;

/*
 * 接口不能实例化（new）
 * */
public class Test01 {
  public static void main(String[] args) {
    InterFaceDemo itf = new InterFaceDemoImpl();
    itf.eat();
    //可以调用默认方法
    itf.defaultMethod();
    //静态方法只能用接口名调用
    InterFaceDemo.staticMethod();
    /*
     *
     * 父类类型 变量名 = new 子类对象;
     * 变量名.方法名();
     * 好处：
     *     实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，
     *     进行方法的调用，更能体现出多态的扩展 性与便利。
     *     多态规定，执行的是子类重写的方法
     *
     * 向上转型：无法使用子类特有的属性
     * 向下转型：父类强制转换子类
     * */
    InterFaceDemo itf1 = new InterFaceDemoImpl();
    showEat(itf1);
    showEat(new InterFaceDemoImpl2());
  }

  public static void showEat(InterFaceDemo interFaceDemo) {
    interFaceDemo.eat();
  }
}
