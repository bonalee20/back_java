package chat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. 입력을 하는 동안 동시에 메세지를 읽어올 수 없다.
// 2. 서버는 접속한 웹 소켓을 모두 가지고 있어야한다.


public class Server {

   public static void main(String[] args) {
      List<PrintWriter> outputList = Collections.synchronizedList(new ArrayList<>());// arrayList를 동기화로 만들기 
      ServerSocket serverSocket = null; // 서버소캣 쓸 예정
      
      try {
         serverSocket = new ServerSocket(7777); // 서버 소캣 접속,  클라이언트와 연결 
         System.out.println("[서버 실행: 클라이언트 대기중]"); // 확인차 알리기
         
//         서버에 입력을 처리하는 쓰레드
         ServerInputThread serverInputThread = new ServerInputThread(outputList); // 서버 받은 것을 보내기 준비?
         serverInputThread.start(); // 서버 시작
         
         while(true) { // 얼마나 들어올 줄 모르게 때문에 
            Socket clientSocket = serverSocket.accept(); // 클라이언트에게 서버소켓 추가하기
            System.out.println("[접속: " + clientSocket + "]"); // 접속 
            
            ServerThread serverThread = new ServerThread(clientSocket, outputList); // ?클라이언트 스레드 만들기
            serverThread.start();
         }
         
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if(serverSocket != null) {  //serverSocket 닫기, 예외 발생해서 try-catch
               serverSocket.close();
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      
   }
}

class ServerInputThread extends Thread {// 서버에서 직접 메세지를 입력받아서 클라이언트들에게 전송
   private final List<PrintWriter> outputList; // 참조 값을 바뀌면 안되서 final 
   
   public ServerInputThread(List<PrintWriter> outputList) { // outputList 초기화
      this.outputList = outputList;
   }
   
   @Override
   public void run() { // thread 가 사용할 수 있는 메서드
      try( // close 생략 가능한 
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
      ){
         String message = null; // 받을 메세지 준비
         while((message = bufferedReader.readLine()) != null) { // 글자가 없을 때까지 반복
            System.out.println("서버: " + message);
            synchronized (outputList) { //건더뜀 방지로 outputList 다 가지고 오기
               for(PrintWriter out :outputList) { // 모든 outputList를 읽기 위한 반복문
                  out.write("서버: " + message + "\n"); // 서버에서 받은 메세지 보내기
               }
            }
         }
         
      }catch (IOException e) { // BufferedReader 예외 처리
         System.err.println("ServerInputThread run 오류");
         e.printStackTrace();
      }
      
   }
}

class ServerThread extends Thread {
   private final Socket socket; // socket 가지고 오기
   private final List<PrintWriter> outputList; //List<PrintWriter> 가지고 오기
   private PrintWriter output;//PrintWriter 가지고 오기
   private BufferedReader input;//BufferedReader 가지고 오기
   
   public ServerThread(Socket socket, List<PrintWriter> outputList) { //socket,outputList 가지고 오기
      this.socket = socket;
      this.outputList = outputList;
      
      try {
         output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true); // 보낸 것 가지고 오고 autoflash true
         input = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 받은 거 가지고 오기
         
         synchronized (outputList) {
            outputList.add(output); //빠짐 없이 하기 위해 동기화를 하고 outputList 넣기
         }
         
      } catch (IOException e) { //예외
         e.printStackTrace();
         closeResources();// 닫는 메서드
      }
      
   }
   
   @Override 
   public void run() {
      String message = null; // 가지고올 메세지
      try {
         
         while((message = input.readLine()) != null) { // 반복횟수 몰라 while
            System.out.println(message); // 받은 메세지 출력
            for(PrintWriter out: outputList) { //모든 것을 한 줄 씩 출력
               out.println(message);
            }
         }
         
      } catch (IOException e) {
         e.printStackTrace();
         closeResources(); // 닫는 메서드, 닫을 resources 한 번에 처리하기
      }
      
   }
   
   private void closeResources() { // 닫는 메서드
      try {
         if(input != null) { // 다 쓰면 닫기
            input.close();
         }
         
         if(output != null) {  // 다 쓰면 닫기
            output.close();
         }
         
         if(socket != null) {  // 다 쓰면 닫기
            socket.close();
         }
      } catch (IOException e) {
         System.out.println("자원 해제중 오류 발생!");
      }
   }
   
   
   
}























