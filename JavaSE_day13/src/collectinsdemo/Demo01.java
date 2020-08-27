package collectinsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {
  public static void main(String[] args) {
    List<Integer> list=new ArrayList();
    Collections.addAll(list,1001,546,101,44,11,555,56);
//    Collections.sort(list);默认升序
    Collections.sort(list,(o1,o2)->{
      return o2-o1;
    });//重写比较器可以实现降序
    System.out.println(list);
  }
}
