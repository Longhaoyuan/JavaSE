package day11;

import java.util.ArrayList;

//测试类
public class Test02 {
  public static void main(String[] args) {
    Teacher teacher = new Teacher("张老师");
    ArrayList<Student> list = new ArrayList<>();
    Student xiaoHong = new Student("小红", "");
    Student xiaoLiang = new Student("小亮", "");
    Student xiaoMing = new Student("小明", "");

    list.add(xiaoHong);
    list.add(xiaoLiang);
    list.add(xiaoMing);
    //1为正常上课  其他是旷课
    for (int i = 0; i < list.size(); i++) {
      if (i < 2)
        teacher.setAttendance(list.get(i), 1);
      else
        teacher.setAttendance(list.get(i), 0);

    }
    Course course = new Course("Java",teacher,list);
    course.show();
  }
}

//学生类
class Student {
  private String name;
  private String attendance;

  public Student(String name, String attendance) {
    this.name = name;
    this.attendance = attendance;
  }

  public Student() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAttendance() {
    return attendance;
  }

  public void setAttendance(String attendance) {
    this.attendance = attendance;
  }
}

//教师类
class Teacher {
  private String name;

  public Teacher(String name) {
    this.name = name;
  }

  public void setAttendance(Student student, int num) {
    //1为上课  其他为旷课
    if (num == 1)
      student.setAttendance("上课");
    else
      student.setAttendance("旷课");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

//课程类
class Course {
  private String courseName;//课程名
  private Teacher teacher;//教师
  private ArrayList<Student> list;

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public ArrayList<Student> getList() {
    return list;
  }

  public void setList(ArrayList<Student> list) {
    this.list = list;
  }

  public Course(String courseName, Teacher teacher, ArrayList<Student> list) {
    this.courseName = courseName;
    this.teacher = teacher;
    this.list = list;
  }

  public void show() {
    System.out.println("课程名称：" + courseName);
    System.out.println("授课老师：" + teacher.getName());
    for (Student student : list) {
      System.out.println(student.getAttendance() + ":" + student.getName());
    }
  }
}
