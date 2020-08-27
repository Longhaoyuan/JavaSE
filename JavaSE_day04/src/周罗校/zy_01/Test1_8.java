package 周罗校.zy_01;

public class Test1_8 {
  public static double toSheShiDu(double temple){
    double newTeple = (temple-32)/(9.0/5);
    return newTeple;
  }
  public static double toHuaShiDu(double temple){
    double newTeple = (9.0/5)*temple+32;
    return newTeple;
  }

  public static void main(String[] args) {
    System.out.println("摄氏度为：30.0°--华氏度为："+toHuaShiDu(30.0)+"°");
    System.out.println("华氏度为：86.0°--摄氏度为："+toSheShiDu(86.0)+"°");
  }
}
