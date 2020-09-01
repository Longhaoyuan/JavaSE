package day20.serverandclient00;

import java.io.IOException;
import java.net.*;

/*
*使用UDP协议实现一个程序(发送端)发送信息给另一个程序(接收端)，接收端将接收到的内容打印输出即可
* */
public class Send {
  public static void main(String[] args) throws IOException {
    System.out.println("正在发送信息....");
    //构建DatagramSocket实例，指定端口
    DatagramSocket socket = new DatagramSocket(8888);
    byte[] bytes = "你好啊".getBytes();
    //构建报文
    DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),9999);
    //设置报文缓冲区
    packet.setData(bytes);
    //发送报文
    socket.send(packet);
    socket.close();
    System.out.println("发送信息完成");
  }
}
