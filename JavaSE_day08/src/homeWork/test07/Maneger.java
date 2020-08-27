package homeWork.test07;
//经理
public class Maneger extends Employee{
  public Maneger(String id, String name, double salary) {
    super(id, name, salary);
  }

  @Override
  public void work() {
    System.out.println("工号为："+super.getId()+",姓名为："+super.getName()+"工资为："+super.getSalary()+"的经理在工作，管理其他人");
  }

  @Override
  public void eat() {
    System.out.println("工号为："+super.getId()+",姓名为："+super.getName()+"工资为："+super.getSalary()+"的经理在吃鱼");
  }
}
