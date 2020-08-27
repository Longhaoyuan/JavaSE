package day17.checkpoint03;

import java.io.File;

/*
*
* 使用文件过滤器筛选将指定文件夹下的小于200K的小文件获取并打印(包括所有子文件夹的文件)
* */
public class Test01 {
  public static void main(String[] args) {
    File file = new File("D:\\Test");
    takePackage(file);
  }
  public static void takePackage(File file){
    //筛选200k一下的文件
    File[] files = file.listFiles(n -> {
      return (n.length()<200*1024);
    });
    for (File f : files) {
      if (f.isFile()){
        System.out.println(f.getName()+"小于200k");
      }else if (f.isDirectory()){
        takePackage(f);
      }
    }
  }
}
