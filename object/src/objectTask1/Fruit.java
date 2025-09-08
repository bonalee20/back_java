package objectTask1;

import java.util.Objects;

public class Fruit{
	private int id;
	private String name;
	private int price;
	private int stock;
	private String mou;
	
	public Fruit() {;}
	
	public Fruit(int id, String name, int price, int stock, String mou) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.mou = mou;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getMou() {
		return mou;
	}

	public void setMou(String mou) {
		this.mou = mou;
	}

	public void sameProduct() {
		if(name.equals(name)) {
			stock--;
			System.out.println(stock);
		}else {
			System.out.println("not same");
		}
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", mou=" + mou + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	

	
	
}
