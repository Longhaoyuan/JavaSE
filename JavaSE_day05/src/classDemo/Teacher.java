package classDemo;

public class Teacher {
  private  String name;
  private int age;
  private String subject;

  public Teacher() {
  }

  public Teacher(String name, int age, String subject) {
    this.name = name;
    this.age = age;
    this.subject = subject;
  }

  public String getName(String name){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getAge(int age){
    return age;
  }
  public void getSubject(String subject){
    this.subject = subject;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void lecture(){
    System.out.println(name+"老师正在讲课，说的是"+subject);
  }
  public void addHomework(){
    System.out.println("某某班级加作业！！！");
  }
}
