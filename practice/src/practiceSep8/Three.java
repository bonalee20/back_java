package practiceSep8;

import java.util.ArrayList;
import java.util.Arrays;

public class Three {
	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(
				new Product(1L, "computer", 80, 20),
				new Product(2L, "desk", 10, 200),
				new Product(3L, "mouse", 80, 200),
				new Product(4L, "monitor", 10, 20)
				));
		
		System.out.println(products);
		// 1. 재고가 100개 이상인 상품만 출력
		for(Product product:products) {
			if(product.getStock()>100) {
				System.out.println(product);
			}
		}
		
		//2. 
		Product foundProduct = null;
		for(Product product:products) {
			if(product.getName().equals("mouse")) {
				foundProduct=product;
			}
		}
		foundProduct.setPrice(1000000);
		products.set(products.indexOf(foundProduct), foundProduct);
		
		
		
		//3.
		for(Product pro:products) {
			if(pro.getStock()<100) {
				foundProduct = pro;
			}
		}
		products.remove(products.indexOf(foundProduct));
		System.out.println(products.remove();
		
		
		
		
		
	}
}
