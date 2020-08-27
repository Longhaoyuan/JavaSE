package homeWork.test08;

public class Maintainer extends AdminStaff {
  public Maintainer() {
  }

  public Maintainer(int id, String name) {
    super(id, name);
  }

  @Override
  public void work() {
    System.out.println("工号为 "+super.getId()+" 的维护专员 "+super.getName()+" 在解决不能共享屏幕问题");
  }
}
