package day20.serverandclient01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
 *Test06
  *  创建TCP 客户端，访问上一题创建的服务器端,服务器端ip：127.0.0.1 端口号：8888
 * 1: 客户端连接服务器,并发送 hello.服务器,我是客户端。
 * 2: 开启上一题服务器,等待客户端连接,客户端连接并发送数据。
 * */
public class Client {
  public static void main(String[] args) {
    Socket socket = null;
    OutputStream outputStream = null;
    try {
      socket = new Socket("127.0.0.1", 8888);
      outputStream = socket.getOutputStream();
      outputStream.write("hello.服务器,我是客户端".getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (outputStream != null) {
        try {
          outputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (socket != null) {
        try {
          socket.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
