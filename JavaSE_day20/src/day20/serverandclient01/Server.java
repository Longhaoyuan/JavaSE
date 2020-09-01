package day20.serverandclient01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *Test04
 * 在项目下创建TCP 服务器端 端口号为8888
 *   1：等待客户端连接 如果有客户端连接 获取到客户端对象。
 *   2：获取到客户端对象之后读取数据客户端传送数据并输出到控制台
 * */
public class Server {
  public static void main(String[] args) {
    System.out.println("服务端开启，等待连接....");
    ServerSocket serverSocket = null;
    Socket accept = null;
    InputStream is = null;
    OutputStream os = null;
    try {
      //开启套接字
      serverSocket = new ServerSocket(8888);
      //获取套接字对象
      accept = serverSocket.accept();
      //获取输入流
      is = accept.getInputStream();
      //获取字节输出流
      os = accept.getOutputStream();
      byte[] bytes = new byte[1024];
      while (true) {
        if (is.read(bytes) != -1) {
          System.out.println(new String(bytes));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (os != null) {
        try {
          os.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (is != null) {
        try {
          is.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (accept != null) {
        try {
          accept.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (serverSocket != null) {
        try {
          serverSocket.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
