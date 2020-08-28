package day18.checkpoint03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *从控制台获取输入的文件目录然后将该目录(包含子目录)下的.java文件复制到D:/java文件夹中,
 * 并统计java文件的个数.zhangsan = 90 lisi = 80 wangwu = 85
 * 提示:如果有相同的名称的文件,如果两个Test01.java,则拷贝到目标文件夹时
 * 只能有一个Test01.java,另一个 Test01.java要修改为另一个名称:该名称可随机生成,只要不重复即可
 * */
public class Test01 {
  static int i = 1;

  public static void main(String[] args) throws IOException {
    System.out.println("请输入您需要被拷贝的目录：");
    String str = new Scanner(System.in).next();
    //需要被拷贝的目录
    File oldfile = new File(str);
    File targt = new File("D:\\Test\\java");
    //开始拷贝文件
    System.out.println("开始拷贝文件");
    //调用文件拷贝的方法
    Map<String, Integer> map = forEachFile(oldfile, targt);
    System.out.println("每个未见出现的次数：");
    map.forEach((k, v) -> {
      System.out.println(k + ":" + v);
    });
  }

  public static Map<String, Integer> forEachFile(File dir1, File dir2) {
    //文件过滤
    File[] files = dir1.listFiles(n -> {
      return n.getName().endsWith("java") || n.isDirectory();
    });
    Map<String, Integer> map = new HashMap<>();
    int len = 0;
    byte[] b = new byte[1024];
    Integer integer = null;
    //遍历文件夹
    for (File file : files) {
      if (file.isFile()) {
        map = countFile(map, file);
//        System.out.println("开始拷贝" + file.getName() + "到" + dir2.getAbsolutePath());
        //拷贝文件
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File f = new File(dir2.getAbsolutePath() + "\\" + file.getName());
        try {
          fis = new FileInputStream(file);
          //文件存在
          if (f.exists()) {
            fos = new FileOutputStream(dir2.getAbsolutePath() + "\\" +
              file.getName().split(".java")[0] + "(" + i + ").java");
            i++;
          } else {
            //文件不存在，则直接创建
            fos = new FileOutputStream(f);
          }
          while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
          }
        } catch (IOException e) {
          e.printStackTrace();
        } finally {
          //关闭IO流
          try {
            if (fos != null)
              fos.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
          try {
            if (fis != null)
              fis.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      } else if (file.isDirectory()) {
        //递归遍历文件夹和拷贝
        Map<String, Integer> map1 = forEachFile(file, dir2);
        map = addMapToMap(map, map1);
      }
    }
    return map;
  }

  //计算文件出现的次数
  public static Map<String, Integer> countFile(Map<String, Integer> map, File file) {
    String[] split = file.getName().split(".java");
    if (!map.containsKey(split[0])) {
      map.put(split[0], 1);
    } else {
      map.put(split[0], map.get(split[0]) + 1);
    }
    return map;
  }

  //递归文件重复次数的处理方法
  public static Map<String, Integer> addMapToMap(Map<String, Integer> map, Map<String, Integer> oldMap) {
    for (Map.Entry<String, Integer> stringIntegerEntry : oldMap.entrySet()) {
      if (map.containsKey(stringIntegerEntry.getKey())) {
        map.put(stringIntegerEntry.getKey(), map.get(stringIntegerEntry.getKey()) + stringIntegerEntry.getValue());
      } else {
        map.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
      }
    }
    return map;
  }
}
