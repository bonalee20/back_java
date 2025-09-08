package objectTask1;

import java.util.Objects;


public class ObjectTask1 {
	
	
	//같은 상품
	public static void main(String[] args) {
		Fruit pineApple = new Fruit(1,"파인애플",2000,15,"필리핀");
		Fruit product2 = new Fruit(2,"바나나",2000,15,"필리핀");
		
		System.out.println(pineApple.equals(product2));
		
		
	}
}
