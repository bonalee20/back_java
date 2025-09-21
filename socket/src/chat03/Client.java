package chat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	// 
	//ip=192.168.161.21
	public static void main(String[] args) {
		String name = "young";
		String ip ="192.168.5.254";
		
	
			try (
					Socket socket = new Socket(ip, 7777); // 소캣 연결 try catch 필수
					PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
					// 클라이언트가 쓸 것을 가지고 온다. autoflash true
					BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					// 쓰면서도 받기, 
					BufferedReader keyInput = new BufferedReader(new InputStreamReader(System.in));
					// 보낼 준비 InputStreamReader
					) {
				
				
				System.out.println("서버와 연결 되었습니다.");
				
				
				ClientThread clientThread = new ClientThread(input);
				// 클라이언트 스레드 생성
				clientThread.start();
				// 클라이언트 스레드 시작
				String message = null; //메세지 넣을 곳
				while((message = keyInput.readLine()) != null) { // 반복 횟수 몰라 읽을 게 없을 떄 까지 돌기
					output.println(name + ": " + message); // 접속한 사람과  메세지 출력
				}
				
				
				
				
			} catch (IOException e) {
				System.out.println("오류당");
				e.printStackTrace();
			}
		
		
	}
}


class ClientThread extends Thread{
	private BufferedReader input; 
	public ClientThread() {;} // 기본생성자

	public ClientThread(BufferedReader input) { // 초기화
		this.input = input;
	}
	
	
	@Override
	public void run() { // 스레드 실생 run 메세드 
		String message = null; // 메세지 저장 공간
		try {
			while((message = input.readLine()) !=null) { //반복 횟수 몰라 읽을 줄이 없을 때 까지
				
			}
		} catch (IOException e) { // 예외 처리
			e.printStackTrace();
		}finally {
			try {
				if(input !=null) { 
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}