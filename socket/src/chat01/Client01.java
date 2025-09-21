package chat01;

import java.io.IOException; 
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) {
//		포트번호 1100
//		"192.168.161.21"
		Socket socket = null; // 소캣 연결
		PrintWriter writer = null; // 출력 스트림 
		
		String serverIp = "192.168.161.21"; // IP 문자열에 담기
		String message = null; // 전송할 메세지
		try {
			socket = new Socket(serverIp, 1100); // socket 서버와 포트1100 연결 , try-catch 필수 
			System.out.println("서버에 연결 되었습니다."); // 연결 확인 
			writer = new PrintWriter(socket.getOutputStream(), true); // 
			// socket에서 OutputStream 꺼내고 autoflash을 true로 해서 버퍼가 자동으로 비워집니다. 
			
			message = "안녕! 나는 최준서야! 나에게 무서운건 없지!"; //보낼 메세지
			writer.println(message);  // 문자열 서버로 전송
			System.out.println("서버로 [" + message + "]를 전송했습니다.");
			
		} catch (UnknownHostException e) { // host 알 수 없을 경우
			e.printStackTrace(); // 예외가 어디서 발생했는지 콘솔에 출력
		} catch (IOException e) { // 입출력 오류
			e.printStackTrace();// 예외가 어디서 발생했는지 콘솔에 출력
		} finally {
			try {
				if(writer != null) { // writer 닫기
					writer.close();
				}
				if(socket != null) { // 소켓 닫기
					socket.close();
				}
			} catch (IOException e) { // 입출력 오류
				e.printStackTrace();// 예외가 어디서 발생했는지 콘솔에 출력
			}
		}
		
		
		
		
		
	}
}
