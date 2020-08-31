package day20.serverandclient06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.UUID;

public class Client {
  public static void main(String[] args) throws IOException {
    for (int i = 0; i <5 ; i++) {
      Socket socket = new Socket("127.0.0.1",7777);
      //获取流
      BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
      BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Test\\test\\" + UUID.randomUUID().toString() + ".png"));
      if (socket.isConnected()){
        System.out.println("连接服务器端成功");
        System.out.println("开始下载文件....");
        int len ;
        byte[] bytes= new byte[1024*8];
        while ((len=bis.read(bytes))!=-1){
          bos.write(bytes,0,len);
        }
        System.out.println("文件下载完成");
      }
      bos.close();
      bis.close();
      socket.close();
    }
  }
}
