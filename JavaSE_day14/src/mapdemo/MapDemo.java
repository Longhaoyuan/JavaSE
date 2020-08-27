package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Map<String,String> map = new HashMap<>();
    //键值对允许是空
    map.put("","");
    //键值对允许是null
    map.put(null,null);
    System.out.println(map);

  }
}
