package classdemo;

import classdemo.entities.Student;

/*
* 获取类的方法
* */
public class GetClass {
  public static void main(String[] args) throws ClassNotFoundException {
    //通过.class获取
    Class<Student> studentClass = Student.class;
    System.out.println(studentClass);

    //通过Object类的成员方法获取
    Student stu1 = new Student();
    Class<? extends Student> aClass = stu1.getClass();
    System.out.println(aClass);

    //使用Class.forName(全限定类名)获取
    Class<?> stuClass = Class.forName("classdemo.entities.Student");
    System.out.println(stuClass);
  }
}
