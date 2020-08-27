package homeWork;

import java.util.ArrayList;

public class Test09 {
  public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<>();
    list.add("bca");
    list.add("dadfa");
    list.add("dddaaaa");
    list.add("你好啊");
    list.add("我来啦你干嘛呢");
    list.add("别跑啊");
    System.out.println("源ArrayList"+list.toString());
    for(int i=0;i<list.size();i++){
      if(list.get(i).length()>4){
        list.remove(i);
        i--;
      }
    }
    System.out.println("删除后ArrayList:"+list.toString());
  }
}
