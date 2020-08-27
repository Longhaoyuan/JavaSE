package 周罗校.zy_02;

public class Test2_8 {
  public static int getChengJi(String[] socre){
    String[] daAn ={"A","D","B","C","D"};
    int Count = 0;
    for (int i = 0; i < daAn.length; i++) {
      if (daAn[i]==socre[i]){
        Count+=2;
      }
    }
    return Count;
  }

  public static void main(String[] args) {
    String[] xiaoMing = {"D","C","B","A","D"};
    String[] xiaoHong = {"A","D","B","C","D"};
    String[] xiaoHuang = {"A","D","B","C","A"};
    String[] xiaoQiang = {"A","B","C","D","D"};

    System.out.println("满分10分，小明：得分："+getChengJi(xiaoMing)+"分");
    System.out.println("满分10分，小红：得分："+getChengJi(xiaoHong)+"分");
    System.out.println("满分10分，小黄：得分："+getChengJi(xiaoHuang)+"分");
    System.out.println("满分10分，小强：得分："+getChengJi(xiaoQiang)+"分");
  }
}
