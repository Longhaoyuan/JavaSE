package day20.serverandclient03;

import java.io.*;
import java.net.Socket;

/*
 *Test07
 * TCP的客户端上传文件到服务器端
 * */
public class FileUpLoadClient {
  public static void main(String[] args) throws IOException {
    Object obj = new Object();
    for (int i = 0; i < 5; i++) {
      synchronized (obj) {
        Socket socket = new Socket("127.0.0.1", 6666);
        if (socket.isConnected()) {
          System.out.println("已成功连接到服务端");
        }
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy_img.png"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        new Thread(() -> {
          int len = 0;
          byte[] bytes = new byte[1024 * 8];
          try {
            while ((len = bis.read(bytes)) != -1) {
              bos.write(bytes, 0, len);
              bos.flush();
            }
            //通知上传完毕
            socket.shutdownOutput();//关闭上传
            //读取上传的结果
            InputStream inputStream = socket.getInputStream();
            byte[] bytes1 = new byte[20];
           inputStream.read(bytes1);
            System.out.println("上传的结果是："+new String(bytes1));
            bos.close();
            bis.close();
            socket.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }).start();
      }
    }
  }
}
