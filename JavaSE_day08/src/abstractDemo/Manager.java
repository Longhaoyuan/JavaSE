package abstractDemo;
//经理
public class Manager extends Employee{

  public Manager(int id, String name, double salary) {
    super(id, name, salary);
  }

  @Override
  public void work() {
    System.out.println("正在管理...");
  }
}
