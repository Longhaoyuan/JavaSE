package homeWorld.test06;

import java.util.ArrayList;

public class Test06 {
  public static void main(String[] args) {
    Teacher t1 = new Teacher("姚小明", 23, "打篮球");
    Teacher t2 = new Teacher("景甜", 20, "打羽毛球");
    Teacher t3 = new Teacher("薛之谦", 45, "踢足球");

    ArrayList<Teacher> list = new ArrayList<Teacher>();
    list.add(t1);
    list.add(t2);
    list.add(t3);
    for (Teacher teacher : list) {
      teacher.show();
    }
    System.out.println("--------------------------");
    for (Teacher teacher : list) {
      if (teacher.getAge()>40){
        teacher.show();
      }
    }
  }
}
