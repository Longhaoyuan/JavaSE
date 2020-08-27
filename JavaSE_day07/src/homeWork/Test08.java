package homeWork;

public class Test08 {
  public static void main(String[] args) {
    //方法1
    String str1="javajfiewjavajfiowfjavagkljjava";
    String str = "javajfiewjavajfiowfjavagkljjava";
    str=str.replace("java","4");
    int index = str.indexOf("4");
    int count = 0;
    while (index!=-1){
      count++;
      str=str.replace("java","4");
      str= str.substring(index+1);
      index = str.indexOf("4");
      /*if (index==-1)
        break;*/
    }
    System.out.println(str1+"字符串中java的数量："+count);
    //方法二
   /* str1.split("java", 2);
    int count = 0;
    while (str1.contains("java")){
      count++;
      str1 = str1.split("java", 2)[1];
    }
    System.out.println("javajfiewjavajfiowfjavagkljjava中的Java的个数为:"+count);*/
  }
}
