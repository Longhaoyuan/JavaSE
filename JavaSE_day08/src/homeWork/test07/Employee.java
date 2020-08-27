package homeWork.test07;
//员工类
public abstract class Employee {
  private String id;
  private String name;
  private double salary;

  public abstract void work();
  public abstract void eat();

  public void printMessage(){
    System.out.println("工号为："+id+",姓名为："+name+"工资为："+salary);
  }

  public Employee() {
  }

  public Employee(String id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
