package staticDemo.entities;

public class Student {
  private String name;
  private int age;
  public static int sid;

  public static int count;

  static {
    System.out.println("在座各位都是弟弟");
  }

  public static void print(){
    System.out.println("你好我执行了");
    System.out.println(sid);
  }

  public static int getSid() {
    return sid;
  }

  public static void setSid(int sid) {
    Student.sid = sid;
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    count++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
