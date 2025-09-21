package practiceSep9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hset {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10,20,20));
		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
		System.out.println(datas);
		
		
		
	}
}
