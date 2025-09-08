package practiceSep2;

import java.util.Objects;

public class ProductSep {
	private Long id;
	private String name;
	private int stock;
	
	public ProductSep() {;}

	public ProductSep(Long id, String name, int stock) {
		super();
		this.id = id;
		this.name = name;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "ProductSep [id=" + id + ", name=" + name + ", stock=" + stock + "]";
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
		ProductSep other = (ProductSep) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
