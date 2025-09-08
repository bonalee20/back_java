package practiceSep2;

import java.util.ArrayList;

public class SepArray {
	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList();
		for(int i = 0; i < 26 ;i++) {
			datas.add(String.valueOf((char)(i+97)));
		}
		System.out.println(datas);
	}
}
