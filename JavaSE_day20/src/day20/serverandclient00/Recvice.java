package day20.serverandclient00;

import java.io.IOException;
import java.net.*;

public class Recvice {
  public static void main(String[] args) throws IOException {
    System.out.println("正在等待接收信息...");
    //构建字节接收信息
    byte[] bytes = new byte[1024];
    //创建报文对象
    DatagramPacket datagramPacket =new DatagramPacket(bytes,bytes.length);
    //创建套接字
    DatagramSocket socket = new DatagramSocket(9999);
    socket.receive(datagramPacket);

    System.out.println("接收到的信息为："+new String(datagramPacket.getData()));
  }
}
