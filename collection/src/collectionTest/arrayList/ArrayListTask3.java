package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask3 {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1L, "computer", 80, 20));
		products.add(new Product(2L, "desk", 10, 200));
		products.add(new Product(3L, "mouse", 8, 200));
		products.add(new Product(4L, "monitor", 10, 20));
		products.add(new Product(5L, "keybroad", 5, 920));
		
		//System.out.println(products);
		
		
		// 재고가 100개 이상인 상품만 출력
		// stock
		
		for(Product product:products) {
			if(product.getStock()>=100) {
				System.out.println(product);
			}
		}
		// 2. 마우스 가격을 100000원으로 변경 
	      Product foundProduct = null;
	      for(Product product: products) {
	         if(product.getId() == 3L) {
	            foundProduct = product;
	         }
	      }
	      foundProduct.setPrice(100000);
	      
	      
	      System.out.println(products.set(products.indexOf(foundProduct), foundProduct));
	      
	      
	      
	      try {
	         if(products.contains(foundProduct)) {
	            products.set(products.indexOf(foundProduct), foundProduct);
	         }
	      } catch (IndexOutOfBoundsException e) {
	         System.out.println("ArrayListTask3 예외 발생");
	         System.out.println("인덱스 똑바로 입력하세요.");
	      } catch (Exception e) {
	         System.out.println("ArrayListTask3 예외 발생");
	         System.out.println("알 수 없는 예외 발생");
	         e.printStackTrace();
	      }
	      
	 
	      
	   // 3. 재고가 100개 이하인 상품만 삭제
	      System.out.println("\n3번");
;
	      ArrayList<Product> delProduct = new ArrayList<Product>();
	      for(Product product: products) {
	    	  if(product.getStock()<100) {
	    		  delProduct.add(product);
	    	  }
	      }
	      System.out.println(delProduct);
	      
	      
	      System.out.println("\n4번");
	      //////
	      
	      ArrayList<Product> product2 = new ArrayList<Product>();
			
			product2.add(new Product(1L, "computer", 80, 20));
			product2.add(new Product(2L, "desk", 10, 200));
			product2.add(new Product(3L, "mouse", 8, 200));
			product2.add(new Product(4L, "monitor", 10, 20));
			product2.add(new Product(5L, "keybroad", 5, 20));
			
	      
	      
	      
	  //4. 상품이름이 마우스인 상품 삭제
			//.remove()
//	      for(Product product: product2) {
//	    	  //product는 클래스 product2는 ArrayList<Product>
//	    	  //주소 연산자 == 말고 equals 사용
//	    	  
//	    	  if(product.getName().equals("mouse")) {
//	    		  product2.indexOf(product);
//	    		  product2.remove(products.indexOf(product));
//	    		  
//	    		 // product2.remove();
//	    	  }
//	      }
	      
	      for(int i = 0; i <product2.size(); i++) {
	    	  if(product2.get(i).getName().equals("mouse")) {
	    		  product2.remove(i);
	    	  }
	      }
	      
	      System.out.println(product2);

		
	}
}
