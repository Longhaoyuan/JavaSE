package day20.serverandclient03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/*
*Test07
* TCP的服务端可以接受多个客户端的连接
* 文件保存到 c:/java/file 文件下，文件名随机生成，只要不出现文件覆盖即可。
* 服务器端需要反馈上传状态(成功或失败)给客户端。
* */
public class FileUpLoadServer {
  public static void main(String[] args) throws IOException {
    System.out.println("服务器已开启，等待连接...");
    ServerSocket serverSocket = new ServerSocket(6666);
    while (true){
      Socket accept = serverSocket.accept();
      if (accept.isConnected()){
        System.out.println("客户端连接成功...");
      }

      new Thread(()->{
        try {
          //获取输入流
          BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Test\\test\\"+UUID.randomUUID().toString()+".png"));
          int len=0;
          byte[] bytes = new byte[1024];
          System.out.println("文件开始接收并保存");
          while ((len = bis.read(bytes))!=-1){
            bos.write(bytes);
          }
          //写回去,上传的结果
          System.out.println("文件保存成功");
          OutputStream outputStream = accept.getOutputStream();
          outputStream.write("文件上传成功".getBytes());
          outputStream.close();
          bos.close();
          bis.close();
          accept.close();
        } catch (IOException e) {
          System.out.println("文件保存失败");
          try {
            OutputStream outputStream = accept.getOutputStream();
            outputStream.write("文件上传失败".getBytes());
            outputStream.close();
          } catch (IOException e1) {
            e1.printStackTrace();
          }
          e.printStackTrace();
        }
      }).start();
    }
  }
}
