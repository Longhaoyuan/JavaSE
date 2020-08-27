package staticDemo;

import staticDemo.entities.Student;

/*
 *  static关键字：静态   优先于所有的对象执行
 *   可以修饰成员变量和成员方法，一旦使用static修饰的成
 * 员方法和成员变量就只属于类的
 *   static修饰的变量叫做静态变量
 *   static修饰的方法叫做静态方法
 *       对象名.静态变量/静态方法   不推荐
 *       类名.静态变量/静态方法
 * 静态方法：
 *   1、在本类内访问本类可以不需要写类名
 *   解释：优先于所有的对象执行{
 *   2、只能访问静态方法，不能访问非静态
 *   3、不能使用this关键字
 *   }
 * 非静态成员方法：
 *   可以访问静态方法和非静态方法
 *
 * 静态代码块
 *    static{
 *
 *   }
 *   特点：
 *      1、类内方法外
 *      2、优先于构造方法前执行
 *      3、再第一次创建对象的时候调用，仅执行一次
 * */
public class StaticDemo01 {
  public static void main(String[] args) {
    Student stu1 = new Student("luck", 15);
    System.out.println((stu1.sid = 2)+","+Student.count);
    Student stu2 = new Student("Moerben", 45);

    System.out.println(stu2.sid+","+Student.count);
    Student.print();
    System.out.println(Student.sid);
  }
}
