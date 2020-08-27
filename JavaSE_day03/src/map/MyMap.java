package map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
*   Map
* */
public class MyMap {
  public static void main(String[] args) {
    ConcurrentHashMap<String,Integer> map1 = new ConcurrentHashMap<>();
    Map<String,Integer> map = new HashMap<String, Integer>();
    map.put("key",1);
    map.put("key3",2);
    System.out.println(map.values());
  }
}
