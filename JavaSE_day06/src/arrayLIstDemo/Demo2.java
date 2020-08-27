package arrayLIstDemo;

import arrayLIstDemo.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
  public static void main(String[] args) {
    Student student1 = new Student("王俊凯","男",18);
    Student student2 = new Student("王立国","男",19);
    Student student3 = new Student("刘亦菲","女",38);

    List<Student> list = new ArrayList<>();
    list.add(student1);
    list.add(student2);
    list.add(student3);
    for (Student student : list) {
      System.out.println("姓名："+student.getName()+"  性别："+student.getSex()+"  年龄："+student.getAge());
    }
    System.out.println();
    int index = list.get(0).getAge()>list.get(1).getAge()?
      (list.get(0).getAge()>list.get(2).getAge()?0:2):(list.get(1).getAge()>list.get(2).getAge()?1:2);
    list.get(index).setName("小魔仙");
    for (Student student : list) {
      System.out.println("姓名："+student.getName()+"  性别："+student.getSex()+"  年龄："+student.getAge());
    }
  }
}
