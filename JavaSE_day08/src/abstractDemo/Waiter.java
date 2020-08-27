package abstractDemo;

public class Waiter extends Employee{
  public Waiter(int id, String name, double salary) {
    super(id, name, salary);
  }

  @Override
  public void work() {
    System.out.println("正在招待客人...");
  }
}
