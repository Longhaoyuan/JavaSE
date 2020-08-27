package homeWork.test08;

public class Buyer  extends AdminStaff{
  public Buyer() {
  }

  public Buyer(int id, String name) {
    super(id, name);
  }

  @Override
  public void work() {
    System.out.println("工号为 "+super.getId()+" 的采购专员 "+super.getName()+" 在采购音响设备");
  }
}
