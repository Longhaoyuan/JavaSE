package extendsDemo;

/*
 * 方法重写：(Override)
 *     特点：创建的是子类对象优先使用子类，子类没找父类
 *     注意事项：
 *       1、注解：@Override：检查重写是否正确
 *       2、子类的方法返回值必须小于等于父类返回值的范围
 *           Object类是所有类的最高父类
 *       3、子类方法的全修饰符必须大于等于父类方法的权限修饰符
 *           public protected  (defalut) private
 *覆盖重写（Override）：方法名相同，参数相同
 * 方法重载（Overload：方法名相同，参数列表不一样
 *
 * 覆盖重写的使用场景：
 *      再修改一个类的源码时，想对一些功能进行加强时，就可以继承某一方法覆盖重写
 * */
public class TestExtends {
}
