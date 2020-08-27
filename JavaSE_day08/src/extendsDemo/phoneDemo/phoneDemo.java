package extendsDemo.phoneDemo;

public class phoneDemo {
  public static void main(String[] args) {
    Phone p = new Phone();
    NewPhone np = new NewPhone();

    p.call();
    p.sellMsg();
    p.show();

    np.call();
    np.sellMsg();
    np.show();
  }
}
