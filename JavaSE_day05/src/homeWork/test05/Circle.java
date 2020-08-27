package homeWork.test05;

public class Circle {
  private int  r;

  public Circle(int r) {
    this.r = r;
  }

  public Circle() {
  }

  public void showArea(){
    System.out.println("半径为："+r+"面积为："+(3.14*r*r));
  }

  public void showPerimeter(){
    System.out.println("半径为："+r+"面积为："+(2*3.14*r));
  }

  public int getR() {
    return r;
  }

  public void setR(int r) {
    this.r = r;
  }
}
