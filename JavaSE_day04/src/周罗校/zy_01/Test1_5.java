package 周罗校.zy_01;

public class Test1_5 {
  public static void showColor(String color) {
    switch (color) {
      case "red":
        System.out.println("red是红色");
        break;
      case "green":
        System.out.println("green是红色");
        break;
      case "blue":
        System.out.println("blue是红色");
        break;
      default:
        System.out.println("未知颜色");
    }
  }

  public static void main(String[] args) {
    showColor("red");
  }
}
