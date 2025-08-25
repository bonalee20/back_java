package practiceAugust;

import java.util.Random;

public class Practice24 {
	
	int [] getLottos() {
		Random random = new Random();
		int[] numbers = new int [6];
		for(int i = 0; i <6; i++) {
			numbers[i] = random.nextInt(46);
		}
		return numbers;
	}

	public static void main(String[] args) {
		Practice24 mt1 = new Practice24();
		int [] number = mt1.getLottos();
		for(int i = 0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}
	
}
	
	
	

