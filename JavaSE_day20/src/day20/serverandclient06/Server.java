package day20.serverandclient06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
* Test09
* 编写一个TCP的服务端，可以接受多个客户端的连接，当接收到用户的连接请求以后，就要把一张图片传回给客户 端。
* */
public class Server {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(7777);
    System.out.println("服务器端已上线，等待连接...");
    while (true){
      Socket accept = serverSocket.accept();
      //获取流对象
      BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy_img.png"));
      BufferedOutputStream bos = new BufferedOutputStream(accept.getOutputStream());
      if (accept.isConnected()){
        System.out.println("用户已连接");
        System.out.println("开始上传文件");
        int len;
        byte[] bytes = new byte[1024*8];
        while ((len=bis.read(bytes))!=-1){
          bos.write(bytes,0,len);
          bos.flush();
        }
        //通知上传完毕
        accept.shutdownOutput();
      }
      bos.close();
      bis.close();
      accept.close();
      System.out.println("文件上传完毕");
    }
  }
}
