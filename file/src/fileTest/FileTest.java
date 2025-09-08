package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) throws IOException{
//		// new FileWriter("경로", "이어쓰기 여부);
//		// 절대 주소 이건 노출되면 안 되서 안 씀   //상대 
//		
//		try {
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
//			bufferedWriter.write("와우 \n 너무 졸리다  ");
//			//bufferedWriter.flush(); 데이터 비워주는 , 파일 다 씀 -> close 동일
//			bufferedWriter.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
//		// throws IOException, FileNotFoundException
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", false));
//		bufferedWriter.write("와우 \n 너무 졸리다  ");
//		bufferedWriter.close();
//		
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
		
		
		
	}
}
