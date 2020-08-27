package exceptiondemo;

public class ExceptionDemo {
  public static void main(String[] args) {
    String str="";
//    String str=null;
//    String str="3";
    try {
      charAt(str,0);
      System.out.println("加风");
      return;
    } catch (Exception e) {
      e.printStackTrace();
    }finally {
      System.out.println("hfghfd");
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
