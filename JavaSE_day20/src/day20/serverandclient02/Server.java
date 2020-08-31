package day20.serverandclient02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;
/*
*
* Test08
* */
public class Server {
  public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
    System.out.println("服务端开启，等待连接....");
    ServerSocket serverSocket = new ServerSocket(8888);
    //线程池分别做接收和发送的功能
    ExecutorService service = Executors.newFixedThreadPool(2);
    Socket accept = serverSocket.accept();
    Scanner scanner = new Scanner(System.in);
    if (accept.isConnected()) {
      System.out.println("客户端已连接");
    }
    OutputStream outputStream = accept.getOutputStream();
    InputStream inputStream = accept.getInputStream();
    //使用bufferedWirter读取信息
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
    String str = null;
    String msg = null;
    boolean flag = true;
    //接收信息的线程
    service.submit(new Runnable() {
      @Override
      public void run() {
        String str = null;
        while (true) {
          try {
            if ((str = br.readLine()) != null) {
              //接收到exit直接退出
              if ("exit".equals(str.trim())) {
                System.out.println("客户端断开连接");
                //发送给客户端使，接收线程结束其结束
                bw.write("exit\n");
                bw.flush();
                /*br.close();
                bw.close();
                serverSocket.close();
                inputStream.close();
                accept.close();*/
              } else {
                System.out.println(str);
              }
            }
          } catch (IOException e) {
            try {
              br.close();
              bw.close();
              serverSocket.close();
              inputStream.close();
              accept.close();
              service.shutdown();
            } catch (IOException e1) {
              e1.printStackTrace();
            }
            e.printStackTrace();
          }
        }
      }
    });
    //发送信息线程
    Future<?> submit = service.submit(new Runnable() {
      @Override
      public void run() {
        while (true) {
          try {
            String s = scanner.nextLine();
            bw.write(s + "\n");
            //必须刷新，否则数据写不过去
            bw.flush();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    });
    /*while (true) {
      bw.write(scanner.nextLine()+"\n");
      bw.flush();
//      if ((str = br.readLine()) != null)
        System.out.println(br.readLine());
    }*/
  }
}
