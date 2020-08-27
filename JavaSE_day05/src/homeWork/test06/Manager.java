package homeWork.test06;

public class Manager {
  private String name;
  private int id;
  private double salary;
  private double prize;

  public Manager() {
  }

  public Manager(String name, int id, double salary, double prize) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.prize = prize;
  }

  public void intro(){
    System.out.println("经理名字："+name);
    System.out.println("工号："+id);
  }
  public void showSalary(){
    System.out.println("基本工资为："+name+"奖金为："+(prize!=0?prize:"无"));
  }
  public void work(){
    System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getPrize() {
    return prize;
  }

  public void setPrize(double prize) {
    this.prize = prize;
  }
}
