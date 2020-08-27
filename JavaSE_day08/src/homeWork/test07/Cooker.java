package homeWork.test07;

public class Cooker extends Employee{
  public Cooker(String id, String name, double salary) {
    super(id, name, salary);
  }

  @Override
  public void work() {
    System.out.println("工号为："+super.getId()+",姓名为："+super.getName()+"工资为："+super.getSalary()+"的厨师在工作，炒菜");
  }

  @Override
  public void eat() {
    System.out.println("工号为："+super.getId()+",姓名为："+super.getName()+"工资为："+super.getSalary()+"的厨师在吃肉");
  }
}
