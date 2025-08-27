package castingTask4;

public class Product {
//  Product 상품
//  - 필드: 이름, 가격, 재고
	private String nameProduct;
	private int priceProduct;
	private int countProduct;
	public Product() {;}
	public Product(String nameProduct, int priceProduct, int countProduct) {
		super();
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.countProduct = countProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public int getPriceProduct() {
		return priceProduct;
	}
	public void setPriceProduct(int priceProduct) {
		this.priceProduct = priceProduct;
	}
	public int getCountProduct() {
		return countProduct;
	}
	public void setCountProduct(int countProduct) {
		this.countProduct = countProduct;
	}
	
	
	
}
