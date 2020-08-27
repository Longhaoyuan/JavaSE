package stringDemo;

public class StringPritect02 {
  public static void main(String[] args) {
    String str1="javajfiewjavajfiowfjavagkljjava";
    str1.split("java", 2);
    int count = 0;
    while (str1.contains("java")){
      count++;
      str1 = str1.split("java", 2)[1];
    }
    System.out.println("javajfiewjavajfiowfjavagkljjava中的Java的个数为:"+count);
//    System.out.println(javas[1]);
  }
   /* Scanner sc  = new Scanner(System.in);
    System.out.println("请输入字符串：");
    String userStr = sc.next();
    System.out.println("请输入字符你需要查找的字符的个数：");
    String chr =sc.next();
    int count = 0;
    for (int i = 0; i <userStr.length() ; i++) {
      if (userStr.charAt(i)==chr.charAt(0)){
        count++;
      }
    }
    System.out.println("字符a的个数为："+count);
  }*/
}
