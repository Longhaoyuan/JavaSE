package day09.work04;

public class Test04 {
  public static void main(String[] args) {
    OldPhone oldPhone = new OldPhone();
    oldPhone.call();
    oldPhone.sendMessage();

    NewPhone newPhone = new NewPhone();
    newPhone.call();
    newPhone.sendMessage();
    newPhone.sendMessage();
  }
}
