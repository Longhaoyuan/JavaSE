package day17.checkpoint01;

import java.io.File;

/*
* 1. 创建文件对象指定路径为c:/bbb
* 2. 调用文件对象创建文件夹的方法
* */
public class Test03 {
  public static void main(String[] args) {
    File file = new File("C:\\bbb");
    if (!file.exists()){
      file.mkdir();//创建文件夹
    }
  }
}
