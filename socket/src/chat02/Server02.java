package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버 소캣 만들기 
		Socket socket = null; // 클라이언트 소캣 만들기
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(7777); // 서버 소캣 생성
			System.out.println("서버가 시작되었습니다. 연결 대기중..."); // 서버 시작 알리기
			
			socket = serverSocket.accept(); // 서버 쪽의 요청 수락
			System.out.println("연결되었습니다."); // 연결 확인 알리기
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //소캣에서 들어온 것을 리더가 반환하고 그 것을 버퍼리더가 읽음
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 소캣에서 보낸 것을 라이터가 반환하고 그 것을 버터 라이터가 보냄
			while(true) { // 반복 회수를 몰라서 while 문
				String inMessage = in.readLine();  // inMessage에 클라이언트가 보낸 메세지 넣음
				System.out.println("클라이언트 > " + inMessage); // 콘솔에 나타내기
				
				System.out.println("서버에서 클라이언트로 메세지 전송>>");
				String outMessage = sc.nextLine(); // 서버에서 보낼 메세지 입력
				out.write(outMessage + "\n"); // 메세지 클라이언트 전송 ,write의 종료 = \n
				out.flush();// 버퍼 비우기
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null) { // 서버 소캣 열려 있으면 닫기
					serverSocket.close();
				}
				
				if(socket != null) { //소캣 열려 있으면 닫기
					socket.close();
				}
				
				if(in != null) { // in 열려 있으면 닫기
					in.close();
				}
				
				if(out != null) { // out 열려 있으면 닫기
					out.close();
				}
				
				if(sc != null){ // scanner 열려 있으면 닫기
					sc.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}







