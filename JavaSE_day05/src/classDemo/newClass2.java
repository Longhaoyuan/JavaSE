package classDemo;
/*
*
* 构造方法：
*   1、类默认具有一个无参构造方法
*   2、构造方法名必须和类名一致
*   3、没返回值，但是可以写return用来结束方法  不能写返回的具体值
*   4、构造方法可以重载
*
* 一个完整的JavaBean：
*   成员变量和成员方法
*   getter和setter
*   无参数和有参数构造方法
* */
public class newClass2 {
  public static void main(String[] args) {
    //明星
    Star caiXuKun = new Star();
    caiXuKun.name = "蔡徐坤";
    caiXuKun.sex = "女";
    caiXuKun.works = "鸡你太美";
    caiXuKun.acting();
    caiXuKun.sing();

    //学生类
    Student maYun = new Student();
    maYun.age = 45;
    maYun.name = "马云";
    maYun.sex = "男";
    maYun.study();
    maYun.sleep();

    //讲师类
    Teacher ziYi = new Teacher();
    ziYi.setName("紫怡");
    ziYi.setAge(18);
    ziYi.getSubject("JAVA开发");
    ziYi.lecture();
    ziYi.addHomework();
  }
}
