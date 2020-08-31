package day20.serverandclient04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/*
*Test08
* 1. 服务端可以接收多个用户的请求连接。
* 2. 客户端登录发送用户名和密码，格式： jack=123456 用户名和密码通过键盘录入。
* 3. 服务器端接收到用户名和密码之后，查询本地用来存储注册信息的文件 判断用户名是否存在，
*     如果用户名存在，则判断密码是否正确，如果密码不正确，则提示客端户密码错 误，如果密码正确，则提示客户端登录成功。
      如果用户名不存在，则使用接收到的用户名和密码注册一个账号，注册成功则提示客户端注册成功。
      注册失败则提示客户端注册失败
* */
public class ResigestServer {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(9999);
    Map<String, String> map = new HashMap<>();
    map.put("jack", "123456");
    while (true) {
      System.out.println("等待连接...");
      Socket accept = serverSocket.accept();
      //获取流
      BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
      new Thread(() -> {
        try {
          String str = null;
          while ((str = br.readLine()) != null) {
            String[] split = str.split("\\=");
            if (map.containsKey(split[0])) {
              if (map.containsValue(split[1])) {
                bw.write("用户登陆成功");
                bw.flush();
                bw.close();
                br.close();
                accept.close();
              } else {
                bw.write("用户密码错误");
                bw.flush();
                bw.close();
                br.close();
                accept.close();
              }
            } else {
              map.put(split[0], split[1]);
              bw.write("用户不存在,用户注册成功");
              bw.flush();
              bw.close();
              br.close();
              accept.close();
            }
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
      }).start();
    }
  }
}
