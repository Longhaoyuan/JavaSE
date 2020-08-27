package day14.homeworldmap.checkpoint01;

import day14.homeworldmap.checkpoint01.entities.Student;

import java.util.HashMap;
import java.util.Map;

/*
* 每位学生（姓名，年龄）都有自己的家庭住址。
* 那么，既然有对应关系，则将学生对象和家庭住址
* 存储到Map集合 中。家庭住址作为键, 学生作为值。
* 并使用keySet和entrySet方式遍历Map集合
* */
public class Test06 {
  public static void main(String[] args) {
    Map<String, Student> map = new HashMap<>();
    map.put("京东路8号",new Student("杰克云",16));
    map.put("棠东路15号",new Student("路易菲",17));
    map.put("路易路78号",new Student("段遮云",18));
    map.put("上镜路17号",new Student("吴柯菲",17));
    System.out.println("学生信息：");
    for (Map.Entry<String, Student> stringStudentEntry : map.entrySet()) {
      System.out.println("姓名："+stringStudentEntry.getValue().getName()+"，年龄："+stringStudentEntry.getValue().getAge()+"，地址："+stringStudentEntry.getKey());
    }
    System.out.println("学生信息：");
    for (String s : map.keySet()) {
      System.out.println("姓名："+map.get(s).getName()+"，年龄："+map.get(s).getAge()+"，地址："+s);

    }
  }
}
