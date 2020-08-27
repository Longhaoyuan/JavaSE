package abstractDemo;

public class Cooker extends Employee{

  @Override
  public void work() {
    System.out.println("正在炒菜...");
  }

  public Cooker(int id, String name, double salary) {
    super(id, name, salary);
  }
}
