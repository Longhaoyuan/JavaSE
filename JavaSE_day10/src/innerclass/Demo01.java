package innerclass;

public class Demo01 {
  public static void main(String[] args) {
    Body.Heart h = new Body().new Heart();
    h.jump();
  }
}

class Body {
  private int num = 10;

  class Heart {
    private int num = 20;

    public void jump() {
      int num = 30;
      System.out.println("心脏在跳动 " + Body.this.num); //10
      System.out.println("心脏在跳动 " + this.num); //20
      System.out.println("心脏在跳动 " + num); //30
    }

  }
}



