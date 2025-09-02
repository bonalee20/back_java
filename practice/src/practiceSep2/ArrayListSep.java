package practiceSep2;

import java.util.ArrayList;

import collectionTest.arrayList.Product;

public class ArrayListSep {
	public static void main(String[] args) {
		ArrayList<ProductSep> products = new ArrayList<ProductSep>();
		products.add(new ProductSep(1L, "computer", 920));
		products.add(new ProductSep(2L, "desk", 2));
		products.add(new ProductSep(3L, "mouse", 880));
		products.add(new ProductSep(4L, "computer", 920));
		
		// 1. 재고가 100개 이상인 상품만 출력
		for(ProductSep product1:products) {
			if(product1.getStock()>=100) {
				System.out.println(product1);
			}
		}
		// 2. 마우스 재고를 0으로 변경 
		ProductSep foundProduct = null;
		for(ProductSep product2:products) {
			if(product2.getId() ==3L) {
				foundProduct = product2;
			}
		}
		foundProduct.setStock(0);
		System.out.println(products);
		
		System.out.println("\n 3");
		// 3. 재고가 100개 이상인 상품만 출력
		for(ProductSep product3:products) {
			if(product3.getStock()>=100) {
				System.out.println(product3);
			}
		}
		System.out.println("\n 4");
		 //4. 상품이름이 마우스인 상품 삭제
		for(ProductSep product4:products) {
			if(product4.getName().equals("mouse")) {
				
				//products.remove(0)
			}
		}
		
		
		System.out.println("\n 4");
		
		
		
		
	}
}
