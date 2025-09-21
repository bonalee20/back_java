package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
	
		//    서버소켓 만들기, 포트 번호를 만들기 위해 아직은 null 값으로 가정
		ServerSocket serverSocket = null; 
		//		클라이언트 소켓, 클라이언트와 연결된 소캣
		Socket socket = null;
		
    //		입력 스트림(클라이언트의 채팅을 읽기 위한 BufferedReader)
		BufferedReader reader = null;
		
		String message = null; //reader.readline 들어와야해서 null
		
		try {
			serverSocket = new ServerSocket(1100); // 서버 소캣 생성, try-catch 반드시 잡아야
			System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중...");
			
			socket = serverSocket.accept(); // 서버 쪽의 요청을 수락
			System.out.println("클라이언트가 연결되었습니다.");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//읽어야 해서 reader, 나(서버) 쪽으로 들어와서 inputStream, 서버가 가지고 있는 inputStream을 buffer 가 읽
			message = reader.readLine(); // 읽은 것을 문자열에 저장
		
			
			System.out.println("클라이언트로부터 받은 메세지:");
			System.out.println(message);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 오류가 발생하더라도 연결 통로 것들 닫아야 함 -> 동기 멀티스트림이기 때문에 밑의 작업 안 됨
			try {
				if(serverSocket != null) {
					serverSocket.close(); // serverSocket 닫기, 예외 발생해서 try-catch
				}
				if(socket != null) {
					socket.close();  // socket 닫기, 예외 발생해서 try-catch
				}
				if(reader != null) {
					reader.close(); // 예외 발생해서 try-catch
				}
				
			} catch (IOException e) { // 입출력 오류
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}




