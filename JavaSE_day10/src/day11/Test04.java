package day11;

//测试类
public class Test04 {
  public static void main(String[] args) {
    Apple a1 = new Apple("青色", 5.0);
    Apple a2 = new Apple("红色", 3.0);

    //默认比较方法
    Worker worker = new Worker();
    Apple pickAppleBySize = worker.pickApple(new Compare(), a1, a2);
    System.out.println("默认挑大的：");
    System.out.println(pickAppleBySize.getSize() + "-" + pickAppleBySize.getColor());

    //根据颜色挑,使用Lambda表达式
    Apple pickAppleByColor = worker.pickApple((Apple a, Apple b) -> {
      if (a.getColor() == "红色") {
        return a;
      } else if (b.getColor() == "红色")
        return b;
      else
        return null;
//      return a1.getColor()=="红色"?a1:a2;
    }, a1, a2);
    System.out.println("挑红的：");
    if (pickAppleByColor != null)
      System.out.println(pickAppleByColor.getSize() + "-" + pickAppleByColor.getColor());
    else
      System.out.println("苹果都还没熟...");
  }
}

//苹果类
class Apple {
  private String color;
  private double size;

  public Apple() {
  }

  public Apple(String color, double size) {
    this.color = color;
    this.size = size;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }
}

//比较接口
interface CompareAble {
  Apple compare(Apple a1, Apple a2);

}

//接口实现类
class Compare implements CompareAble {
  //按照大小比较
  @Override
  public Apple compare(Apple a1, Apple a2) {
    /*if (a1.getSize() > a2.getSize())
      return a1;
    else
      return a2;*/
    return a1.getSize()>a2.getSize()?a1:a2;
  }
}

class Worker {
  public Apple pickApple(CompareAble compareAble, Apple a1, Apple a2) {
    return compareAble.compare(a1, a2);
  }

  ;
}
