package day14.homeworkException.checkpoint01.com.xiaomi.level1_6;

public class Test06 {
  public static void main(String[] args) {
    String str="";
//    String str=null;
//    String str="3";
    try {
      charAt(str,1);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static char charAt(String str,int index) throws Exception {
    if (str==null){
      throw new Exception("字符串不能为null");
    }else if(str==""){
      throw new Exception("字符串不能为空");
    }else if (index>=str.length()){
      throw new Exception("索引越界");
    }else
      return str.charAt(index);
  }
}
