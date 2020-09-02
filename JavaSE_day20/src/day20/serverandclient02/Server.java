package day20.serverandclient02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

/*
 *
 * Test06
 *   使用TCP协议实现客户端和服务端互相发送消息。 客户端发送一条消息，服务器读取之后，
 *   返回一条消息给客户端，客户端读取服务器返回的消息之后，又发送一条 消息…循环执行，直到输入exit。
 * */
public class Server {
  static Integer num = 1;

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
    Future<Object> future = service.submit(new Callable<Object>() {
      @Override
      public Object call() throws Exception {
        String str = null;
        while (true) {
          try {
            if ((str = br.readLine()) != null) {
              //接收到exit直接退出
              if ("exit".equals(str.trim())) {
                System.out.println("客户端断开连接");
                //发送给客户端,使其接收线程结束
                bw.write("exit\n");
                bw.flush();
                /*System.exit(1);*/
                br.close();
                bw.close();
                serverSocket.close();
                inputStream.close();
                accept.close();
                break;
              } else {
                System.out.println("客户端说：" + str);
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
        num = 2;
        return 2;
      }
    });
    //发送信息线程
    Future<?> submit = service.submit(new Runnable() {
      @Override
      public void run() {
        while (true) {
          try {
            if (num == 2) {
              System.out.println("写线程结束");
              break;
            }
            String s = scanner.nextLine();
            if ("exit".equals(s.trim())) {
              bw.close();
              br.close();
              accept.close();
            }
            bw.write(s + "\n");
            //必须刷新，否则数据写不过去
            bw.flush();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    });
    if ((Integer) future.get() == 2) {
      System.out.println("结束");
      System.exit(1);
      num = 2;
      bw.close();
      br.close();
      accept.close();
      service.shutdown();
      serverSocket.close();
    }
    /*while (true) {
      bw.write(scanner.nextLine()+"\n");
      bw.flush();
//      if ((str = br.readLine()) != null)
        System.out.println(br.readLine());
    }*/
  }
}
