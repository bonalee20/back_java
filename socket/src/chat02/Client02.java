package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) {
		
		Socket socket = null; // 소캣 연결
		BufferedReader in = null; // 클라이언트가 받는 스크림 사용 예정
		BufferedWriter out = null; // 클라이언트가 보내는 스크림 사용 예정
		Scanner sc = new Scanner(System.in); // 스캐너 사용 예정
		
		try {
			socket = new Socket("localhost", 7777); // 포트 서버 7777 생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 서버에서 들어오는 getinputstream 을 반환하는 inputstreamReader 을 읽기
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				// 서버가 보낼 출력 스크림을 얻어 반환하고 쓰기
			while(true) { // 반복 횟수 몰라서 while
				System.out.println("클라이언트에서 서버로 보내기>>"); // 보낼 문자 알리기
				String outMessage = sc.nextLine(); //클라이언트가 보낼 문자 저장
				out.write(outMessage + "\n"); //메세지 전송(문자 종료= \n)
				out.flush(); // 버퍼 비우기
				String inMessage = in.readLine(); // 서버쪽으로부터 들어온 메세지 담기
				System.out.println("서버 >>" + inMessage); // 서버 메세지 알리기
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) {// 소켓 열려 있으면 닫기 
					socket.close();
				}
				if(in != null) {  // in 열려 있으면 닫기
					in.close();
				}
				if(out != null) {// out 열려 있으면 닫기
					out.close();
				}
				if(sc != null) { // scanner 열려 있으면 닫기
					sc.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}







