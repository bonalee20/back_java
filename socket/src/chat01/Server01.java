package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server01 {
	
	public static void main(String[] args) {
		// 아웃
		// 포트 번호 1200
		//192.168.161.21
		Socket socket = null;
		PrintWriter writer = null;
		
		String serverIp  = "192.168.161.21", message = null;
		
		try {
			socket = new Socket(serverIp,1200);
			System.out.println("서버에 연결되었습니다.");
			writer = new PrintWriter(socket.getOutputStream(),true);
			// auto flash
			message = "hello";
			writer.println(message);
			System.out.println("서버로 ["+ message + "]를 전송했습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(writer != null) {
					writer.close();
				}
				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
	
	
	
}
