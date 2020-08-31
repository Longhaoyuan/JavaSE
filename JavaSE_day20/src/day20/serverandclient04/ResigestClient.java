package day20.serverandclient04;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ResigestClient {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      Socket socket = new Socket("127.0.0.1", 9999);
      //获取流
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      System.out.println("请输入您的用户名：");
      String str = scanner.nextLine();
      bw.write(str);
      bw.newLine();
      bw.flush();
      System.out.println(br.readLine());
      br.close();
      bw.close();
    }
  }
}
