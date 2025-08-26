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
	//2. 상품 등록
	//- 상품 등록은 최대 5개까지만 할 수 있다.
	//(즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
	//- 마트에 같은 이름의 상품은 등록할 수 없다.
	
	void listupProduct() {
		System.out.println("룰루");
	}
	
	
	
}
