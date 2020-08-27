package 周罗校.zy_01;

public class Test1_3 {
  public static int gerPerimeter(int length,int width){
    return (length+width)*2;
  }
  public static int getArea(int length,int width){
    return length*width;
  }

  public static void main(String[] args) {
    int length =20,width=8;
    int zc =gerPerimeter(length,width);
    System.out.println("长方形的周长："+zc);
    int area =getArea(length,width);
    System.out.println("长方形的面积："+area);
  }
}
