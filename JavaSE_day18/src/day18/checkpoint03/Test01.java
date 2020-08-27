package day18.checkpoint03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 *从控制台获取输入的文件目录然后将该目录(包含子目录)下的.java文件复制到D:/java文件夹中,
 * 并统计java文件的个数.zhangsan = 90 lisi = 80 wangwu = 85
 * 提示:如果有相同的名称的文件,如果两个Test01.java,则拷贝到目标文件夹时
 * 只能有一个Test01.java,另一个 Test01.java要修改为另一个名称:该名称可随机生成,只要不重复即可
 * */
public class Test01 {
  public static void main(String[] args) throws IOException {
    System.out.println("请输入您需要被拷贝的目录：");
    String str = new Scanner(System.in).next();
    //需要被拷贝的目录
    File oldfile = new File(str);
    File targt = new File("D:\\Test\\java");
    //开始拷贝文件
    System.out.println("开始拷贝文件");
    //调用文件拷贝的方法
    forEachFile(oldfile, targt);
  }

  public static void forEachFile(File dir1, File dir2) throws IOException {
    //文件过滤
    File[] files = dir1.listFiles(n -> {
      return n.getName().endsWith("java") || n.isDirectory();
    });
    int len = 0;
    byte[] b = new byte[1024];
    int i = 1;
    //遍历文件夹
    for (File file : files) {
      if (file.isFile()) {
        System.out.println("开始拷贝" + file.getName() + "到" + dir2.getAbsolutePath());
        //拷贝文件
        FileInputStream fis = new FileInputStream(file);
        File f = new File(dir2.getAbsolutePath() + "\\" + file.getName());

        FileOutputStream fos;
        //文件存在
        if (f.exists()) {
          if (i <= 1)
            fos = new FileOutputStream(dir2.getAbsolutePath() + "\\" +
              file.getName().split(".java")[0] + "-副本.java");
          else
            fos = new FileOutputStream(dir2.getAbsolutePath() + "\\" +
              file.getName().split(".java")[0] + "-副本(" + i + ").java");
          i++;
        } else {
          //文件不存在，则直接创建
          fos = new FileOutputStream(f);
        }
        while ((len = fis.read(b)) != -1) {
          fos.write(b, 0, len);
        }
        //关闭IO流
        fis.close();
        fos.close();
      } else if (file.isDirectory()) {
        //递归遍历文件夹和拷贝
        forEachFile(file, dir2);
      }
    }
  }
}
