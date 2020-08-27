package collectinsdemo;

import collectinsdemo.entities.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo02 {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<Student>();
    Student stu1 = new Student("蒋科杰", 16, 89);
    Student stu2 = new Student("墨客夫", 17, 78);
    Student stu3 = new Student("蒋杰", 16, 78);
    Student stu4 = new Student("信贾格", 14, 84);
    Student stu5 = new Student("刘易斯", 17, 81);
    Collections.addAll(list, stu1, stu2, stu3, stu4, stu5);

    Collections.sort(list, (Student o1, Student o2) -> {
      if (o1.getAge()-o2.getAge()==0)
        return o1.getScore() - o2.getScore();
      else
        return o2.getScore() - o1.getScore();
//     return o1.getScore()-o2.getScore();
    });
    for (Student student : list) {
      System.out.println(student);
    }
//    Collections.sort(studentSet);
  }
}
