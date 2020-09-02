package day20.serverandclient02;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
* Test08
* */
public class Client {
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("127.0.0.1", 8888);
    //线程池分别做接收和发送的功能
    ExecutorService service = Executors.newFixedThreadPool(2);
    Scanner scanner = new Scanner(System.in);
    if (socket.isConnected()) {
      System.out.println("服务端连接成功");
    }
    OutputStream outputStream = socket.getOutputStream();
    InputStream inputStream = socket.getInputStream();
    //使用bufferedWirter读取信息
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
    String msg = null;
    boolean flag = true;
    //发送信息线程
    Future<?> submit = service.submit(new Runnable() {
      @Override
      public void run() {
        String s;
        while (true) {
          try {
             s= scanner.nextLine();
            bw.write(s );
            bw.newLine();
            bw.flush();
            if ("exit".equals(s.trim())) {
              System.out.println("退出");
              break;
            }
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
        service.shutdown();
      }
    });
    //接收信息的线程
    service.submit(new Runnable() {
      String str = null;

      @Override
      public void run() {
        while (true) {
          try {
            if ((str = br.readLine()) != null) {
              //接收到exit直接退出
              if ("exit".equals(str)) {
                System.out.println("客户端断开连接");
                br.close();
                bw.close();
                inputStream.close();
                outputStream.close();
                service.shutdown();
                socket.close();
                System.exit(1);
                break;
              }
              System.out.println("客户端说："+str);
            }
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    });
  }
}
