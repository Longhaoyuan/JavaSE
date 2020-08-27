package day17.checkpoint03;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数 注意:用文件类型(后缀名,不包含.(点),
 * 如："java","txt")作为key, 用个数作为value,放入到map集合中,并用两种方式遍历map集合
 * 例如： doc 的类型的文件有 3 个 java 的类型的文件有 5 个 txt 的类型的文件有 7 个
 * */
public class Test03 {
  public static void main(String[] args) {
    System.out.println("请输入您需要统计的文件夹的文件数：");
    String str = new Scanner(System.in).next();
    File file = new File(str);
//    Map<String,Integer> map = new HashMap<>();
    System.out.println(file.exists());
    Map<String, Integer> map = countFile(file);
    map.forEach((k,v)->{
      System.out.println(k+"的文件有："+v+"个");
    });
  }

  public static Map<String,Integer> countFile(File dor) {
    Map<String,Integer> map =new HashMap<>();
    map.put("java",0);
    map.put("txt",0);
    //筛选出是java和txt结尾和文件夹
    File[] files = dor.listFiles(n -> {
      return n.getName().endsWith("java")||n.isDirectory()||n.getName().endsWith("txt");
    });

    for (File file : files) {
      //如果是文件夹则遍历文件夹
      if (file.isDirectory()){
        Map<String, Integer> map1 = countFile(file);
        //筛选java结尾的文件
        map.put("java",map1.get("java")+map.get("java"));
        map.put("txt",map1.get("txt")+map.get("txt"));
      }else if(file.isFile()&&file.getName().endsWith("java")){
        map.put("java",map.get("java")+1);
      }
      else if(file.isFile()&&file.getName().endsWith("txt")){
        map.put("txt",map.get("txt")+1);
      }
    }
    return map;
  }
}
