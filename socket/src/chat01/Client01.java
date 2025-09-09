package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Client01 {
	public static void main(String[] args) {
		// IO exception 중요
		// 서버 서캣
		ServerSocket serverSocket = null;
		//클라이언트 소캣
		Socket socket = null;
		
		//입력 스크피을 읽기 위한 BufferedReader
		BufferedReader reader = null;
		
		String message = null;
		
		try {
			serverSocket = new ServerSocket(1200);
			System.out.println("서버가 시작되었습니다. 클라이언트 기더라는 중");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트가 연결되었습니다.");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			message = reader.readLine();
			System.out.println("클라이언트로부터 받은 메시지:");
			System.out.println(message);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
