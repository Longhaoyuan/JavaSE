package homeWork;

public class Test01 {
  public static void main(String[] args) {
    byte[] bys = {65,67,68,69,70};
    String str1 = new String(bys);
    System.out.println("方式一以创建字符型："+str1);

    String str2 = new String("尼亚");
    System.out.println("方式二以创建字符型："+str2);

    char[] chr = {'e','f','g','j','f'};
    String str3 = new String(chr);
    System.out.println("方式三以创建字符型："+str3);
  }
}
