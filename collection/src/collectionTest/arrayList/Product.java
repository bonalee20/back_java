package collectionTest.arrayList;

import java.util.Objects;

public class Product {
	// 이름, 가격,  재고
	//1. 필드(id 필수) + private
	//2. 기본, 
	//3. 초기화 
	//4. getter setter
	//5. toString 재정의
	//6. hash/equals 재정의
	private Long id; // Long으로 하자!!!
	private String name;
	private int price;
	private int stock;
	
	public Product() {;}

	

	public Product(Long id, String name, int price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}



	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}



}
