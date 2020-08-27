package day12.checkpoint02;

import java.util.ArrayList;
import java.util.Collections;

public class Test04 {
  public static void main(String[] args) {
    ArrayList<String> strList = new ArrayList<>();
    Collections.addAll(strList,"王","无","天","下","路","无","尽");
    swap(strList,4,2);
    ArrayList<Integer> integerList = new ArrayList<>();
    System.out.println();
    Collections.addAll(integerList,1,2,3,4,5,6,7,8);
    swap(integerList,3,5);
  }
  public static void swap(ArrayList list,int oldIndex,int newIndex){
    if (oldIndex<list.size()&&oldIndex>=0&&newIndex<list.size()
      &&newIndex>=0&&oldIndex!=newIndex){
      Object temp = list.get(oldIndex);
      list.set(oldIndex,list.get(newIndex));
      list.set(newIndex,temp);
    }
    for (Object o : list) {
      System.out.print(o+" ");
    }
  }
}
