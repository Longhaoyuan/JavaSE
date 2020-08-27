package day09.work04;

public class NewPhone extends OldPhone implements Play{
  public void sendMessage(){
    System.out.println("新手机发信息");
  }
  public void call(){
    System.out.println("新手机打电话");
  }

  @Override
  public void playGame() {
    System.out.println("新手机打游戏");
  }
}
