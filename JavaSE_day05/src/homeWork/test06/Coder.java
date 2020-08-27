package homeWork.test06;

public class Coder {
  private String name;
  private int id;
  private double salary;
  private double prize;

  public Coder() {
  }

  public Coder(String name, int id, double salary, double prize) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.prize = prize;
  }

  public void intro(){
    System.out.println("程序员名字："+name);
    System.out.println("工号：00"+id);
  }
  public void showSalary(){
    System.out.println("基本工资为："+name+"奖金为："+(prize!=0?prize:"无"));
  }
  public void work(){
    System.out.println("正在努力写代码....");
  }
}
